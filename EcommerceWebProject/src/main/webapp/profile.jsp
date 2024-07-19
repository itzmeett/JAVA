<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	User u1 = null;
	if(session!=null){
		if(session.getAttribute("u")!=null){
			u1=(User)session.getAttribute("u");
		}
	}
	if(u1.getUsertype().equals("buyer")){
		
%>    
<%@include file="header.jsp" %>  
<%
	}
	else
	{
%>
<%@include file="seller-header.jsp" %>  
<%
	}
%>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile</title>
</head>
<body>
 <div id="wrapper" class="homepage-1"> <!-- wrapper -->
	<div id="content"> <!-- Content -->
              <div class="page-title">
                  <div class="container">
                      <div class="page-title-inner">
                          <h3>Profile</h3>
                          <div class="breadcumb"> <a href="">Home</a><span> / </span><span>Profile</span></div>
                          <div class="clearfix"></div>
                      </div>
                  </div>
              </div>
		<div class="about-page">
                  <div class="container">
                      <div class="row">
                          <div class="col-md-8 ct-form">
                              <h3>Edit Profile</h3>
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
                                      <input type="text" class="form-control" name="fname" id="cf_name" value="<%=u1.getFname()%>">
                                  </div>
                                  
                                  <div class="form-group">
                                      <label for="cf_name">Last Name*</label>
                                      <input type="text" class="form-control" name="lname" id="cf_name" value="<%=u1.getLname()%>">
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_email">Your E-mail*</label>
                                      <input type="email" class="form-control" name="email" id="cf_email" value="<%=u1.getEmail()%>" readonly>
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_subject">Mobile*</label>
                                      <input type="text" class="form-control" name="mobile" id="cf_subject" value="<%=u1.getMobile()%>">
                                  </div>

                                  <div class="form-group">
                                      <label for="cf_message">Address*</label>
                                      <textarea type="text" class="form-control" name="address" id="cf_message"><%=u1.getAddress()%></textarea>
                                  </div>
                                  
                                  <button type="submit" name="action" value="update profile" class="btn btn-blue">Update Profile</button>
                              </form>
                          </div>
                      </div>
      			</div>
      	  </div>
     </div>
</div>      	  
</body>
</html>
