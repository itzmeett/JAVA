package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.bean.User;
import com.util.UserUtil;

public class UserDao {
	public static void insertUser(User u) {
		try {
			Connection conn = UserUtil.create_conn();
			String sql = "insert into User(fname,lname,email,mobile,password) values (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, u.getFname());
			pst.setString(2, u.getLname());
			pst.setString(3, u.getEmail());
			pst.setLong(4, u.getMobile());
			pst.setString(5, u.getPassword());
			pst.executeUpdate();	
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
