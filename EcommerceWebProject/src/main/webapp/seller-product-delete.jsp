<%@page import="com.dao.ProductDao"%>
<%
	int pid = Integer.parseInt(request.getParameter("pid"));
	ProductDao.deleteProduct(pid);
	
	request.setAttribute("msg", "Product deleted succefully");
	request.getRequestDispatcher("seller-product-view.jsp").forward(request, response);
%>