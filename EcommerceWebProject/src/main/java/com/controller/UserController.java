package com.controller;

import java.io.IOException;
import java.util.List;

import com.bean.Cart;
import com.bean.User;
import com.bean.Wishlist;
import com.dao.CartDao;
import com.dao.UserDao;
import com.dao.WishlistDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("register")) {
			boolean flag = UserDao.checkEmail(request.getParameter("email"));
			
			if(flag==false) {
				if(request.getParameter("password").equals(request.getParameter("cpassword")))
				{
					User u = new User();
					u.setUsertype(request.getParameter("usertype"));
					u.setFname(request.getParameter("fname"));
					u.setLname(request.getParameter("lname"));
					u.setEmail(request.getParameter("email"));
					u.setAddress(request.getParameter("address"));
					u.setMobile(Long.parseLong(request.getParameter("mobile")));
					u.setPassword(request.getParameter("password"));
					UserDao.registerUser(u);
					request.setAttribute("msg", "User Registered Successfully");
					request.getRequestDispatcher("login.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password & Confirm Password does not matched");
					request.getRequestDispatcher("register.jsp").forward(request, response);
				}
			}else {
				request.setAttribute("msg", "Email Already Registered");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
		}
		
		else if(action.equalsIgnoreCase("login"))
		{
			User u = UserDao.loginUser(request.getParameter("email"));
			if(u!=null) {
				String userPassword = u.getPassword();
                String inputPassword = request.getParameter("password");
					if(userPassword != null && userPassword.equals(inputPassword)) {
						List<Wishlist> list = WishlistDao.getWishlistByUser(u.getUid());
						List<Cart> list1 = CartDao.getCartByUser(u.getUid());
						HttpSession session = request.getSession();
						session.setAttribute("u", u);
						session.setAttribute("wishlist_count", list.size());
						session.setAttribute("cart_count", list1.size());
						if(u.getUsertype().equals("buyer"))
						{
							request.getRequestDispatcher("index.jsp").forward(request, response);
						}
						else
						{
							request.getRequestDispatcher("seller-index.jsp").forward(request, response);
						}
					}
					else {
						request.setAttribute("msg", "Password Incorrect");
						request.getRequestDispatcher("login.jsp").forward(request, response);
					}
			}else {
				request.setAttribute("msg", "Email is not registered");
				request.getRequestDispatcher("register.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("Change Password"))
		{
			HttpSession session = request.getSession();
			User u=(User)session.getAttribute("u");
			if(u.getPassword().equals(request.getParameter("old_password"))) {
				if(request.getParameter("new_password").equals(request.getParameter("cnew_password")))
				{
					if(!u.getPassword().equals(request.getParameter("new_password")))
					{
						UserDao.changePassword(u.getEmail(), request.getParameter("new_password"));
						response.sendRedirect("logout.jsp");
					}
					else
					{
						request.setAttribute("msg", "Old Password and New Password can not be same");
						request.getRequestDispatcher("changePassword.jsp").forward(request, response);
					}
				}
				else
				{
					request.setAttribute("msg", "New Password and Confirm New Password does not matched");
					request.getRequestDispatcher("changePassword.jsp").forward(request, response);
				}
			}
			else
			{
				request.setAttribute("msg", "Old Password does not matched");
				request.getRequestDispatcher("changePassword.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update profile"))
		{
			HttpSession session = request.getSession();
			User u = (User)session.getAttribute("u");
			u.setFname(request.getParameter("fname"));
			u.setLname(request.getParameter("lname"));
			u.setEmail(request.getParameter("email"));
			u.setMobile(Long.parseLong(request.getParameter("mobile")));
			u.setAddress(request.getParameter("address"));
			UserDao.updateProfile(u);
			session.setAttribute("u", u);
			response.sendRedirect("index.jsp");
		}
		
	}

}
