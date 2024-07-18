<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
</head>
<body>
 <div id="wrapper" class="homepage-1"> <!-- wrapper -->
	<div id="content"> <!-- Content -->
              <div class="page-title">
                  <div class="container">
                      <div class="page-title-inner">
                          <h3>Login</h3>
                          <div class="breadcumb"> <a href="">Home</a><span> / </span><span>Login</span></div>
                          <div class="clearfix"></div>
                      </div>
                  </div>
              </div>
		<div class="about-page">
                  <div class="container">
                      <div class="row">
                          <div class="col-md-8 ct-form">
                              <h3>Login Form</h3>
                               <strong style="color:blue; font-size:14px;" >
                              <%
                              	if(request.getAttribute("msg")!=null){
                              		 out.print(request.getAttribute("msg"));
                              	}
                              %>
                              </strong>
                              <br>
                              <br>
                              <form class="contact-form" action="UserController" method="post">

                                  <div class="form-group">
                                      <label for="cf_email">E-mail*</label>
                                      <input type="email" class="form-control" name="email" id="cf_email" placeholder="">
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_subject">Password*</label>
                                      <input type="password" class="form-control" name="password" id="cf_subject" placeholder="">
                                  </div>
                                  
                                  <button type="submit" name="action" value="login" class="btn btn-blue">Login</button>
                              </form>
                          </div>
                      </div>
      			</div>
      	  </div>
     </div>
</div>      	  
</body>
</html>
