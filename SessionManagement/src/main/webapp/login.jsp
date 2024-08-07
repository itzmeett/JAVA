<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
 <style>
  .form-container {
            background-color: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
        }
        
   h4{
   		color:red;
   }     
 </style>
 
</head>
<body>
  <div class="container mt-5">
        <div class="row justify-content-center">
            <div class="col-md-6">
  				<div class="form-container">
  					<h2 class="mb-4" style=" color: #007bff;">Login Form</h2>
  					<form method="post" action="UserController">
  						<h4>
	  						 <%
		                    	if(request.getAttribute("msg")!=null){
		                    		out.println(request.getAttribute("msg"));
		                    	}
	                    	 %>
  						</h4>
  						<div class="mb-3">
							 <label for="email" class="form-label">Email</label>
							 <input type="email" class="form-control" name="email" placeholder="Enter your email">
						 </div>
  
						 <div class="mb-3">
							<label for="password" class="form-label">Password</label>
							<input type="password" class="form-control" name="password" placeholder="Enter your password">
						 </div>
	 
						 <a href="login.jsp">Already Registered ?</a>
						 	<br>
						 	<br>
						 <input type="submit" class="btn btn-primary w-100" name="action" value="Login">
  					</form>
  				</div>
  			</div>
  		</div>
  	</div>
</body>
</html>