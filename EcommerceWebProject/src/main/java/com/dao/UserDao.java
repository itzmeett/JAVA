package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bean.User;
import com.util.DButil;

public class UserDao {
		
	public static void registerUser(User u) {
		try {
			Connection conn=DButil.createConnection();
			String sql = "insert into webuser(fname, lname, email, address, mobile, password, usertype) value(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setString(4, u.getAddress());
			pst.setLong(5, u.getMobile());
			pst.setString(6, u.getPassword());
			pst.setString(7, u.getUsertype());
			pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean checkEmail(String email) {
		boolean flag=false;
			try {
				Connection conn=DButil.createConnection();
				String sql = "select * from webuser where email = ?";
				PreparedStatement pst = conn.prepareStatement(sql);
				pst.setString(1, email);
				ResultSet rs = pst.executeQuery();
				if(rs.next())
				{
					flag=true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		return flag;
		
	}
	
	public static User loginUser(String email) {
		User u = null;
		try {
			Connection conn=DButil.createConnection();
			String sql = "select * from webuser where email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, email);
			ResultSet rs = pst.executeQuery();
			if(rs.next())
			{
				u = new User();
				u.setUid(rs.getInt("uid"));
				u.setFname(rs.getString("fname"));
				u.setLname(rs.getString("lname"));
				u.setEmail(rs.getString("email"));
				u.setAddress(rs.getString("address"));
				u.setMobile(rs.getLong("mobile"));
				u.setPassword(rs.getString("password"));
				u.setUsertype(rs.getString("usertype"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return u;
		
	}
	
	public static void changePassword(String email, String Password)
	{
		try {
			Connection conn=DButil.createConnection();
			String sql = "update webuser set password=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, Password);
			pst.setString(2, email);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateProfile(User u)
	{
		try {
			Connection conn=DButil.createConnection();
			String sql = "update webuser set fname=?, lname=?, mobile=?, address=? where email=?";
			PreparedStatement pst=conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setLong(3, u.getMobile());
			pst.setString(4, u.getAddress());
			pst.setString(5, u.getEmail());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}	
