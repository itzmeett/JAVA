package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.bean.Cart;
import com.bean.Wishlist;
import com.util.DButil;

public class CartDao {

	public static void addToCart(Cart c)
	{
		try {
			Connection conn = DButil.createConnection();
			String sql = "insert into webcart(uid, pid, product_price, product_qty, total_price) values (?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, c.getUid());
			pst.setInt(2, c.getPid());
			pst.setInt(3, c.getProduct_price());
			pst.setInt(4, c.getProduct_qty());
			pst.setInt(5, c.getTotal_price());
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void removeFromCart(int uid, int pid)
	{
		try {
			Connection conn = DButil.createConnection();
			String sql = "delete from webcart where uid = ? and pid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			pst.setInt(2, pid);
			pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static List<Cart> getCartByUser(int uid)
	{
		List<Cart> list = new ArrayList<Cart>();
		try {
			Connection conn = DButil.createConnection();
			String sql = "select * from webcart where uid = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, uid);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				Cart c = new Cart();
				c.setCid(rs.getInt("cid"));
				c.setUid(rs.getInt("uid"));
				c.setPid(rs.getInt("pid"));
				c.setProduct_price(rs.getInt("product_price"));
				c.setProduct_qty(rs.getInt("product_qty"));
				c.setTotal_price(rs.getInt("total_price"));
				c.setPayment_status(rs.getBoolean("payment_status"));
				list.add(c);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	

public static boolean checkCart(int uid, int pid)
{
	boolean flag = false;
	try {
		Connection conn = DButil.createConnection();
		String sql = "select * from webcart where uid=? and pid=?";
		PreparedStatement pst = conn.prepareStatement(sql);
		pst.setInt(1, uid);
		pst.setInt(2, pid);
		ResultSet rs = pst.executeQuery();
		if(rs.next())
		{
			flag = true;
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	return flag;
}
}
