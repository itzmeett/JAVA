//package com.Controller;
//
//import jakarta.servlet.ServletException;
//import jakarta.servlet.annotation.WebServlet;
//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import java.io.IOException;
////
//import com.bean.User;
//import com.dao.UserDao;
//
//public class UserController extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    public UserController() {
//        super();
//    }
//
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String action = request.getParameter("action"); 
////		System.out.println(action);
//		if(action.equalsIgnoreCase("action")) {			
//			if(request.getParameter("pswd").equals(request.getParameter("cpswd"))) {
//				User u= new User();
//			u.setFname(request.getParameter("fname"));
//			u.setLname(request.getParameter("lname"));
//			u.setEmail(request.getParameter("email"));
//			u.setMobile(Long.parseLong(request.getParameter("mobile")));
//			u.setPassword(request.getParameter("pswd"));
//			System.out.println("passed");
//			UserDao.insertUser(u);
//			System.out.println("Data Inserted Succefuully");
//		}else {
//			System.out.println("Password and confirm Password does not match");
//		}
//		}
//	}
//}	
//

//package com.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import com.bean.User;
import com.dao.UserDao;

@WebServlet("/UserController")
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UserController() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null && action.equals("Submit")) {
            // Log form data
            System.out.println("Received form data:");

            String fname = request.getParameter("fname");
            System.out.println("First Name: " + fname);

            String lname = request.getParameter("lname");
            System.out.println("Last Name: " + lname);

            String email = request.getParameter("email");
            System.out.println("Email: " + email);

            String mobileStr = request.getParameter("mobile");
            System.out.println("Mobile: " + mobileStr);

            String pswd = request.getParameter("pswd");
            System.out.println("Password: " + pswd);

            String cpswd = request.getParameter("cpswd");
            System.out.println("Confirm Password: " + cpswd);

            // Convert mobile to long
            long mobile = Long.parseLong(mobileStr);

            if (pswd.equals(cpswd)) {
                User u = new User();
                u.setFname(fname);
                u.setLname(lname);
                u.setEmail(email);
                u.setMobile(mobile);
                u.setPassword(pswd);

                try {
                    UserDao.insertUser(u);
                    System.out.println("Data Inserted Successfully");
                    response.sendRedirect("success.jsp"); // Redirect to success page
                } catch (Exception e) {
                    e.printStackTrace();
                    response.getWriter().println("Error: " + e.getMessage());
                }
            } else {
                System.out.println("Password and Confirm Password do not match");
                response.sendRedirect("error.jsp"); // Redirect to error page
            }
        } else {
            System.out.println("Action is null or does not match 'Submit'");
        }
    }
}
