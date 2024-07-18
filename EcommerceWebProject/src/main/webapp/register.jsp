<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
 <div id="wrapper" class="homepage-1"> <!-- wrapper -->
	<div id="content"> <!-- Content -->
              <div class="page-title">
                  <div class="container">
                      <div class="page-title-inner">
                          <h3>Register</h3>
                          <div class="breadcumb"> <a href="">Home</a><span> / </span><span>Register</span></div>
                          <div class="clearfix"></div>
                      </div>
                  </div>
              </div>
		<div class="about-page">
                  <div class="container">
                      <div class="row">
                          <div class="col-md-8 ct-form">
                              <h3>Registration Form</h3>
                              <strong style="color:blue; font-size:14px;" >
                              <%
                              	if(request.getAttribute("msg")!=null){
                              		 out.print(request.getAttribute("msg"));
                              	}
                              %>
                              </strong>
                              <form class="contact-form" action="UserController" method="post">
                                  <div class="form-group">
                                      <label for="cf_name">First Name*</label>
                                      <input type="text" class="form-control" name="fname" id="cf_name" placeholder="">
                                  </div>
                                  
                                  <div class="form-group">
                                      <label for="cf_name">Last Name*</label>
                                      <input type="text" class="form-control" name="lname" id="cf_name" placeholder="">
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_email">Your E-mail*</label>
                                      <input type="email" class="form-control" name="email" id="cf_email" placeholder="">
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_subject">Mobile*</label>
                                      <input type="text" class="form-control" name="mobile" id="cf_subject" placeholder="">
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_message">Address*</label>
                                      <textarea type="text" class="form-control" name="address" id="cf_message"></textarea>
                                  </div>
                                  
                                  <div class="form-group">
                                      <label for="cf_subject">Password*</label>
                                      <input type="password" class="form-control" name="password" id="cf_subject" placeholder="">
                                  </div>
                                  
                                  <div class="form-group">
                                      <label for="cf_subject">Confirm Password*</label>
                                      <input type="password" class="form-control" name="cpassword" id="cf_subject" placeholder="">
                                  </div>

                                  <button type="submit" name="action" value="register" class="btn btn-blue">Register</button>
                              </form>
                          </div>
                      </div>
      			</div>
      	  </div>
     </div>
</div>      	  
</body>
</html>
