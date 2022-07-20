package com.cybage.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.User;
import com.cybage.utility.JdbcUtility;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> getAllUsers(){
		List<User>userlist=new ArrayList<User>();
		User user=null;
		String url="select * from user";
		try (Connection cn = JdbcUtility.getConncetion();
		PreparedStatement pst = cn.prepareStatement(url);)
				{
					ResultSet rs = pst.executeQuery();
						while(rs.next()) {
							int id=rs.getInt(1);
							String firstName=rs.getNString(2);
							String lastName=rs.getNString(3);
							String email=rs.getNString(4);
							String password=rs.getNString(5);
							String role=rs.getNString(6);
							user = new User(id, firstName, lastName, email, password,role);
							System.out.println(user);
							userlist.add(user);
							
							}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}
			
		
		return null;
	}

}
