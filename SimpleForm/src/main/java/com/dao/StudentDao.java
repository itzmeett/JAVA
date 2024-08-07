package com.dao;

import com.bean.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Student;
import com.util.StudentUtil;

public class StudentDao {
	public static void insertStudent(Student s) {
		try {
			Connection conn = StudentUtil.create_Conn();
			String sql = "insert into student(fname, lname, email, mobile) values(?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Student> getAllStudent() {
		List<Student> list = new ArrayList<Student>();
		try {
			Connection conn = StudentUtil.create_Conn();
			String sql = "select * from student";
			PreparedStatement pst = conn.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Student s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getLong("mobile"));
				list.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static Student getStudent(int id) {
		Student s = null;
		try {
			Connection conn = StudentUtil.create_Conn();
			String sql = "select * from student where id = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				s = new Student();
				s.setId(rs.getInt("id"));
				s.setFname(rs.getString("fname"));
				s.setLname(rs.getString("lname"));
				s.setEmail(rs.getString("email"));
				s.setMobile(rs.getLong("mobile"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
	}
	public static void updateStudent(Student s) {
		try {
			Connection conn = StudentUtil.create_Conn();
			String sql = "update student set fname=?,lname=?,email=?,mobile=? where id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, s.getFname());
			pst.setString(2, s.getLname());
			pst.setString(3, s.getEmail());
			pst.setLong(4, s.getMobile());
			pst.setInt(5, s.getId());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
		public static void deleteStudent(int id) {
			try {
				Connection conn = StudentUtil.create_Conn();
				String sql = "delete from student where id=?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setInt(1, id);
				pst.executeUpdate();
			} catch (Exception e) {
				e.printStackTrace();
			}
	}
}
