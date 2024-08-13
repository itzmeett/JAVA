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

<form name="insert" method="post" action="StudentController">
    <table cellpadding="10px" cellspacing="10px">
        <tr>
        </tr>
        <tr>
            <th>First Name:</th>
        </tr>
        <tr>
            <th>Last Name:</th>
        </tr>
        <tr align="left">
            <th>Email:</th>
        </tr>
        <tr align="left">
            <th>Mobile:</th>
        </tr>
        <tr>
            <td colspan="2" align="center">
            </td>
        </tr>
    </table>
</form>

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
        <tr>
            <td>
                <form name="edit" method="post" action="StudentController">
                    <input type="hidden" name="id" value="">
                    <input type="submit" name="action" value="Edit" class="btn btn-success">
                </form>
            </td>
            <td>
                <form name="delete" method="post" action="StudentController">
                    <input type="hidden" name="id" value="">
                    <input type="submit" name="action" value="Delete" class="btn btn-danger">
                </form>
            </td>
        </tr>
    </table>
</body>
</html>
