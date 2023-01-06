package com.web.test.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.web.test.model.Electric;

public class ConsumerDaoImpl implements ConsumerDao{

	@Override
	public List<Electric> getData() {
		List<Electric> elecList = new ArrayList<>();
		Connection con = null;
		
		 try {
	        	
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				 String url = "jdbc:mysql://localhost:3306/infinite";
				 
			        String user="root";
			        String password = "india@123";
			        
			    con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				
				ResultSet rs = stmt.executeQuery("select * from electric");
				
				
				while(rs.next()) {
					elecList.add(new Electric(rs.getInt(1), rs.getLong(2),rs.getLong(3),rs.getString(4)));
				}
				
			} catch (Exception e) {
				
				e.printStackTrace();
			} 
		 
		 finally {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		return elecList;
	}
	
	

}
