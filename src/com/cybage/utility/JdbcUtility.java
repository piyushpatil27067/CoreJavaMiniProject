package com.cybage.utility;
  import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtility {
	private static Connection connection=null;
	 public static Connection getConncetion() {
	try
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
	  	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight","root", "root");
	  //	System.out.println("Connection to mysql Database is succesfull....!!");
	}catch(Exception e)
	{
	System.out.println(e);

	}
	return connection;
	 }

}
