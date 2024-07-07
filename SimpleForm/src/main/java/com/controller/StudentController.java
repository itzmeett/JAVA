package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.bean.Student;
import com.dao.StudentDao;

public class StudentController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if(action.equalsIgnoreCase("Insert")) {
            Student s = new Student();
            s.setFname(request.getParameter("fname"));
            s.setLname(request.getParameter("lname"));
            s.setEmail(request.getParameter("email"));
            s.setMobile(Long.parseLong(request.getParameter("mobile")));
            StudentDao.insertStudent(s);
            request.setAttribute("msg", "Data inserted successfully");
            request.getRequestDispatcher("insert.jsp").forward(request, response);
        } else if(action.equalsIgnoreCase("edit")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Student s = StudentDao.getStudent(id);
            request.setAttribute("s", s);
            request.getRequestDispatcher("insert.jsp").forward(request, response);
        } else if(action.equalsIgnoreCase("Update")) {
            Student s = new Student();
            s.setId(Integer.parseInt(request.getParameter("id")));
            s.setFname(request.getParameter("fname"));
            s.setLname(request.getParameter("lname"));
            s.setEmail(request.getParameter("email"));
            s.setMobile(Long.parseLong(request.getParameter("mobile")));
            StudentDao.updateStudent(s);
            request.setAttribute("msg", "Data updated successfully");
            request.getRequestDispatcher("insert.jsp").forward(request, response);
        } else if(action.equalsIgnoreCase("Delete")) {
            int id = Integer.parseInt(request.getParameter("id"));
            StudentDao.deleteStudent(id);
            request.setAttribute("msg", "Data deleted successfully");
            request.getRequestDispatcher("insert.jsp").forward(request, response);
        }
    }
}
