package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.db.connection.Connection;
import com.db.connection.GetConnection;

import beans.beans;

public class DaoClass implements DaoInterface {

	@Override
	public void storeLibrary(beans b) {
		// TODO Auto-generated method stub
		int authorid=b.getAuthorid();
		String firstName=b.getFirstName();
		String middleName=b.getMiddleName();
		String lastName=b.getLastName();
		int phoneNumber=b.getPhoneNumber();
		String insertQry="insert into library values(?,?,?,?,?)";
		try {
			
			new GetConnection();
			PreparedStatement pstmt = GetConnection.dbCon.prepareStatement(insertQry);
			
			//Inject values into the query
			pstmt.setInt(1, authorid);
			
			pstmt.setString(2,firstName);
			
			pstmt.setString(3, middleName);
			
			pstmt.setString(4, lastName);
			pstmt.setInt(5, phoneNumber);
			
			//Execute the query
			pstmt.executeUpdate();
			
			System.out.println("Registered successfully...");
		}
		catch(Exception e)
		{
			System.out.println("Error occured" + e);
		}
	}
	public void deleteData(int n) {
		//System.out.println("naem is" + n);
				Statement stmt;
				String deleteQry = "delete from library where authorId = ?" ;
				try {
					new GetConnection();
					stmt = GetConnection.dbCon.createStatement();
				
				

				
				PreparedStatement pstmt = GetConnection.dbCon.prepareStatement(deleteQry);
				
				//Inject values into the query
				pstmt.setLong(1,n);
				pstmt.executeUpdate();
				
				if(pstmt.executeUpdate(deleteQry) > 0) {
					System.out.println("Row deleted successfully...");
				}
				else
					System.out.println("Some issues while deleting...");
				
				
				} catch (SQLException e) {
					System.out.println("Exception while deleting" + e.getMessage());
				}
				
			}

			public void displayData() {
				Statement stmt;
				String fetchQry = "select * from library";
				
				//PreparedStatement pstmt;
				try {
					new GetConnection();
					stmt = GetConnection.dbCon.createStatement();
//					pstmt = dbCon.prepareStatement(fetchQry);
				
				
				//pstmt.setString(1, "Mayank");
				
				ResultSet rs = stmt.executeQuery(fetchQry);
				
				while(rs.next())
				{
					System.out.println("Author Id : " + rs.getInt("authorId"));
					System.out.println("FirstName: " + rs.getString("firstName"));
					System.out.println("MiddleName: " + rs.getString("middleName"));
					System.out.println("LastName: " + rs.getString("lastName"));
					System.out.println("Phonenumber : " +rs.getInt("phoneNumber"));
				}
				
				} catch (SQLException e) {
				
					e.printStackTrace();
				}}
				public void displayAccordingData() {
					Statement stmt;
					String fetchQry = "SELECT library.firstName, library.middleName, library.lastname, innerlibrarydata.Title, library.phoneNumber FROM library INNER JOIN innerlibrarydata ON library.firstName=innerlibrarydata.firstName";
					
					//PreparedStatement pstmt;
					try {
						new GetConnection();
						stmt = GetConnection.dbCon.createStatement();
//						pstmt = dbCon.prepareStatement(fetchQry);
					
					
					//pstmt.setString(1, "Mayank");
					
					ResultSet rs = stmt.executeQuery(fetchQry);
					
					while(rs.next())
					{
//						System.out.println("Author Id : " + rs.getInt("authorId"));
						System.out.println("FirstName: " + rs.getString("firstName"));
						System.out.println("Items: " + rs.getString("Title"));
//						System.out.println("MiddleName: " + rs.getString("middleName"));
//						System.out.println("LastName: " + rs.getString("lastName"));
//						System.out.println("Phonenumber : " +rs.getInt("phoneNumber"));
					}
					
					} catch (SQLException e) {
					
						e.printStackTrace();
					}
		
			}


	
	}
