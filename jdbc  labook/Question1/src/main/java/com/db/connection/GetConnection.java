package com.db.connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GetConnection {
	public static Connection dbCon;
	public GetConnection() {
	

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Try establishing the connection
			dbCon = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydatabase", "root", "");
			
			if(dbCon != null)
			System.out.println("Connection established...");
			
			//Call fetchResults()
			//().fetchResults();
			
			//new DBConnect().fetchResultsByPrep();
			
			//Call insertNewRow
		
			
			//Call deleteRow()
			//new DBConnect().deleteRow();
			
			//Call insertRowThroughPrep
			//new DBConnect().insertRowThroughPrep();
			
			
			
		}catch(Exception e)
		{
			System.out.println("Error occured" + e);
		}
	}
	
}
