package com.cg.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class MyConnection {
	/**
	 * @author SHUBHAM KUMAR GUPTA
	 */
	private static Connection con;
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","lpu","hr");
			System.out.println("Connected!!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return con;
	}
}
