package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import com.bean.User;
import com.dao.UserDao;

public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equalsIgnoreCase("Register")) {
            boolean flag = UserDao.checkEmail(request.getParameter("email"));

            if (flag==false) {
                if (request.getParameter("password").equals(request.getParameter("cpassword"))) {
	                    User u = new User();
	                    u.setFname(request.getParameter("fname"));
	                    u.setLname(request.getParameter("lname"));
	                    u.setEmail(request.getParameter("email"));
	                    u.setPhone(Long.parseLong(request.getParameter("phone")));
	                    u.setBirthday(request.getParameter("birthday"));
	                    u.setGender(request.getParameter("gender"));
	                    u.setPassword(request.getParameter("password"));
	                    UserDao.signup(u);
	                    request.setAttribute("msg", "User sign up successfully");
	                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } 
                else 
                {
                    request.setAttribute("msg", "Your Password and Confirm Password does not matched");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            }else 
            {
                request.setAttribute("msg", "Email is already registered");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
        else if(action.equalsIgnoreCase("Login")) {
        	User u=UserDao.loginUser(request.getParameter("email"));
        	if(u!=null) {
        		if(u.getPassword().equals(request.getParameter("password"))) {
        			HttpSession session = request.getSession();
        			session.setAttribute("u",u);
        			request.getRequestDispatcher("home.jsp").forward(request, response);
        		}
        		else {
        			request.setAttribute("msg", "Incorrect Password");
        			request.getRequestDispatcher("login.jsp").forward(request, response);
        		}
        	}
        	else
        	{
        		request.setAttribute("msg", "Email not Registered");
    			request.getRequestDispatcher("login.jsp").forward(request, response);
        	}
        		
        }
        else if(action.equalsIgnoreCase("Change Password")) {
        	HttpSession session = request.getSession();
        	User u = (User)session.getAttribute("u");
        	if(u.getPassword().equals(request.getParameter("oldPassword")))
        	{
        		if(request.getParameter("newPassword").equals(request.getParameter("cnewPassword"))) {
        			UserDao.changePassword(u.getEmail(), request.getParameter("newPassword"));
        			response.sendRedirect("logout.jsp");
        		}
        		else
        		{
        			request.setAttribute("msg", "New Password and Confirm password does not matched");
        			request.getRequestDispatcher("changePassword.jsp").forward(request, response);
        		}
        	}
        	else
        	{
        		request.setAttribute("msg", "Old password does not matched");
    			request.getRequestDispatcher("changePassword.jsp").forward(request, response);
        	}
        }
    }
}
