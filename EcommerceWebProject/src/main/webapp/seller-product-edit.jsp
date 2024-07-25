<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@include file="seller-header.jsp" %>    
<%@ page import="com.dao.ProductDao" %> 
<%@ page import="com.bean.Product" %> 
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
                          <h3>Add Product</h3>
                          <div class="breadcumb"> <a href="">Home</a><span> / </span><span>Add Product</span></div>
                          <div class="clearfix"></div>
                      </div>
                  </div>
              </div>
		<div class="about-page">
                  <div class="container">
                      <div class="row">
                          <div class="col-md-8 ct-form">
                              <h3>Edit Product</h3>
                              <strong style="color:blue; font-size:14px;" >
                              <%
                              	if(request.getAttribute("msg")!=null){
                              		 out.print(request.getAttribute("msg"));
                              	}
                              	
                              	Product p= ProductDao.getProduct(Integer.parseInt(request.getParameter("pid")));
                              %>
                              </strong>
                              <form class="contact-form" action="ProductController" method="post" enctype="multipart/form-data">
                                  <div class="form-group">
                                  <input type="hidden" name="pid" value="<%=p.getPid() %>">;
                                      <label for="cf_name">Product Name*</label>
                                      <input type="text" class="form-control" name="product_name" id="cf_name" value="<%=p.getProduct_name()%>">
                                  </div>
                                  
                                  <div class="form-group">
                                      <label for="cf_name">Product Price*</label>
                                      <input type="text" class="form-control" name="product_price" id="cf_name" value="<%=p.getProduct_price()%>">
                                  </div>

                                  <!--<div class="form-group">
                                      <label for="cf_subject">Product Image*</label>
                                      <input type="file" class="form-control" name="product_image" id="cf_subject">
                                  </div>  -->

                                  <div class="form-group">
                                      <label for="cf_message">Product Description*</label>
                                      <textarea type="text" class="form-control" name="product_desc" id="cf_message"><%=p.getProduct_desc()%></textarea>
                                  </div>
                                  
                                  
                                  <div class="form-group">
                                      <label for="cf_subject">Category*</label>
                                  	  <select name="product_category" class="form-control">
                                  	  <%
                                  	  	if(p.getProduct_category().equals("men"))
                                  	  	{
                                  	  %>
											<option>---Select Product Category---</option>
	                                  	  	<option value="men" selected="selected">Men</option>
	                                  	  	<option value="women">Women</option>
	                                  	  	<option value="kids">Kids</option>
									  <%
                                  	  	}
                                  	  	else if(p.getProduct_category().equals("women"))
                                  	  	{
									  %>
										  	<option>---Select Product Category---</option>
	                                  	  	<option value="men">Men</option>
	                                  	  	<option value="women" selected="selected">Women</option>
	                                  	  	<option value="kids">Kids</option>
									  <%
                                  	  	}
                                  	  	else if(p.getProduct_category().equals("kids"))
                                  	  	{
                                  	  		
									  %>
										  	<option>---Select Product Category---</option>
	                                  	  	<option value="men">Men</option>
	                                  	  	<option value="women">Women</option>
	                                  	  	<option value="kids" selected="selected">Kids</option>
									  
									  <%
                                  	  	}
									  %>                                  	  		
                                  	  </select>
                                  </div>
                                  <button type="submit" name="action" value="Update product" class="btn btn-blue">Update Product</button>
                              </form>
                          </div>
                      </div>
      			</div>
      	  </div>
     </div>
</div>      	  
</body>
</html>
