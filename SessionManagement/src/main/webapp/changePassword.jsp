<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Password</title>
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
  					<h2 class="mb-4" style=" color: #007bff;">Chage Password</h2>
  					<h4>
	  						 <%
		                    	if(request.getAttribute("msg")!=null){
		                    		out.println(request.getAttribute("msg"));
		                    	}
	                    	 %>
  					</h4>
  					<form method="post" action="UserController">
  						<div class="mb-3">
							 <label for="password" class="form-label">Old Password</label>
							 <input type="password" class="form-control" name="oldPassword">
						 </div>
  
						 <div class="mb-3">
							<label for="password" class="form-label">New Password</label>
							<input type="password" class="form-control" name="newPassword">
						 </div>
						 
						 <div class="mb-3">
							<label for="password" class="form-label">Confirm New Password</label>
							<input type="password" class="form-control" name="cnewPassword">
						 </div>
	 
						 <a href="home.jsp">Home Page</a>
						 	<br>
						 	<br>
						 <input type="submit" class="btn btn-primary w-100" name="action" value="Change Password">
  					</form>
  				</div>
  			</div>
  		</div>
  	</div>
</body>
</html>