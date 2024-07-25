<%@page import="com.dao.WishlistDao" %>
<%@page import="com.bean.Wishlist" %>
<%@ page import="java.util.List" %>
<%
	int uid = Integer.parseInt(request.getParameter("uid"));
	int pid = Integer.parseInt(request.getParameter("pid"));
	WishlistDao.removeFromWishlist(uid, pid);
	List<Wishlist> list = WishlistDao.getWishlistByUser(uid);
	session.setAttribute("wishlist_count", list.size());
	response.sendRedirect("wishlist.jsp");
	
%>