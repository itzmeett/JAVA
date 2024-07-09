<%@page import="com.bean.User"%>
<%@include file="header.jsp" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <style>
  .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
 </style>
 
</head>
<%
	User u = null;
	if(session!=null){
		if(session.getAttribute("u") != null)
			{
				u=(User)session.getAttribute("u");
			}
	}
%>
<body>
	<div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
                <div class="form-container">
					<%
						if( u != null){
					%>
                    <h2 class="mb-4 form-title">Welcome to Home Page</h2>
                    <br>
                    <br>
                    <%
                    	if(request.getAttribute("msg")!=null){
                    		out.println(request.getAttribute("msg"));
                    	}
                    %>
                    <h3>
                    <a  href="logout.jsp">Logout</a> || 
                    <a  href="changePassword.jsp">Change Password</a> || 
                    <a  href="home.jsp">Home</a>
                    </h3>
                    
					<%		
						}
						else
						{
							response.sendRedirect("login.jsp");
							
						}
					%>
                </div>
            </div>
        </div>
    </div>
	
</body>
</html>