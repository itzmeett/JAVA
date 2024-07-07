package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.User;
import com.dao.UserDao;

//@WebServlet("/UserController")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equalsIgnoreCase("Register")) {
            boolean flag = UserDao.checkEmail(request.getParameter("email"));

            if (!flag) {
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
                    request.setAttribute("msg", "User signed up successfully");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "Your Password and Confirm Password do not match");
                    request.getRequestDispatcher("index.jsp").forward(request, response);
                }
            } else {
                request.setAttribute("msg", "Email already registered");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
    }
}
