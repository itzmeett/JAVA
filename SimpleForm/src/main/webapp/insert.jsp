<%@page import="com.dao.StudentDao"%>
<%@page import="com.bean.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<meta charset="UTF-8">
<title>Student Management</title>
</head>
<body>
<%
    // Retrieve student from request attribute if exists
    Student s1 = new Student();
    if (request.getAttribute("s") != null) {
        s1 = (Student) request.getAttribute("s");
    }

    // Retrieve and display message if exists
    if (request.getAttribute("msg") != null) {
        out.println(request.getAttribute("msg"));
    }
%>

<form name="insert" method="post" action="StudentController">
    <table cellpadding="10px" cellspacing="10px">
        <tr>
            <% if (s1.getId() != 0) { %>
                <td><input type="hidden" name="id" value="<%= s1.getId() %>"></td>
            <% } else { %>
                <td><input type="hidden" name="id"></td>
            <% } %>
        </tr>
        <tr>
            <th>First Name:</th>
            <% if (s1.getFname() != null) { %>
                <td><input type="text" name="fname" placeholder="Enter your first name" value="<%= s1.getFname() %>"></td>
            <% } else { %>
                <td><input type="text" name="fname" placeholder="Enter your first name"></td>
            <% } %>
        </tr>
        <tr>
            <th>Last Name:</th>
            <% if (s1.getLname() != null) { %>
                <td><input type="text" name="lname" placeholder="Enter your last name" value="<%= s1.getLname() %>"></td>
            <% } else { %>
                <td><input type="text" name="lname" placeholder="Enter your last name"></td>
            <% } %>
        </tr>
        <tr align="left">
            <th>Email:</th>
            <% if (s1.getEmail() != null) { %>
                <td><input type="text" name="email" placeholder="abc@gmail.com" value="<%= s1.getEmail() %>"></td>
            <% } else { %>
                <td><input type="text" name="email" placeholder="abc@gmail.com"></td>
            <% } %>
        </tr>
        <tr align="left">
            <th>Mobile:</th>
            <% if (s1!= null) { %>
                <td><input type="text" name="mobile" placeholder="Enter 10-digit Number" value="<%= s1.getMobile()%>"></td>
            <% } else { %>
                <td><input type="text" name="mobile" placeholder="Enter 10-digit Number"></td>
            <% } %>
        </tr>
        <tr>
            <td colspan="2" align="center">
                <% if (s1.getId() != 0) { %>
                    <input type="submit" name="action" value="Update" class="btn btn-primary">
                <% } else { %>
                    <input type="submit" name="action" value="Insert" class="btn btn-primary">
                <% } %>
            </td>
        </tr>
    </table>
</form>

<%
    // Retrieve and display list of students if exists
    List<Student> list = StudentDao.getAllStudent();
    if (list.size() > 0) {
%>
    <table border="1" width="100%" cellpadding="10px" cellspacing="10px">
        <tr>
            <th>Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Mobile</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>
        <% for (Student s : list) { %>
        <tr>
            <td><%= s.getId() %></td>
            <td><%= s.getFname() %></td>
            <td><%= s.getLname() %></td>
            <td><%= s.getEmail() %></td>
            <td><%= s.getMobile() %></td>
            <td>
                <form name="edit" method="post" action="StudentController">
                    <input type="hidden" name="id" value="<%= s.getId() %>">
                    <input type="submit" name="action" value="Edit" class="btn btn-success">
                </form>
            </td>
            <td>
                <form name="delete" method="post" action="StudentController">
                    <input type="hidden" name="id" value="<%= s.getId() %>">
                    <input type="submit" name="action" value="Delete" class="btn btn-danger">
                </form>
            </td>
        </tr>
        <% } %>
    </table>
<% } %>
</body>
</html>
