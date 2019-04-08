package com.cg.dao;
import com.cg.util.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.cg.bean.Author;
public class AuthorDaoImpl implements AuthorDao {
	/**
	 * @author SHUBHAM KUMAR GUPTA
	 */
	Connection con=MyConnection.getConnection();
	@Override
	public String createAuthor(Author a) {
		String res="";
		try {
			PreparedStatement ps=con.prepareStatement("insert into Author values(?,?,?,?)");
			ps.setString(1, a.getAuthorId());
			ps.setString(2, a.getFirstName());
			ps.setString(3, a.getMiddleName());
			ps.setString(4, a.getLastName());
			ps.setLong(5, a.getPhoneNo());
			int x=ps.executeUpdate();
			if(x>0)
				res="Author Created";
		}
		catch(SQLException e1) {
			res="Author Not Created";
			e1.printStackTrace();
		}
		return null;
	}
	@Override
	public List<Author> readAllAuthor() {
		List<Author> li=new ArrayList<Author>();
		try {
			Statement stat=con.createStatement();
			ResultSet rs=stat.executeQuery("select * from Author");
			while(rs.next()) {
				Author au=new Author(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getLong(5));
				li.add(au);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String deleteAuthor(String aid) {
		String sql="delete from Author where authorId=? ";
		try {
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setString(1, aid);
			int rowsDeleted=stat.executeUpdate();
			if(rowsDeleted>0)
			{
				System.out.println("A user was deleted successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public String updateAuthor(Author a) {
		String sql="update Author set authorId=?, firstName=?, middleName=?, lastName=?, phoneNo=?";
		try {
			PreparedStatement stat=con.prepareStatement(sql);
			stat.setString(1, a.getAuthorId());
			stat.setString(2, a.getFirstName());
			stat.setString(3, a.getMiddleName());
			stat.setString(4, a.getLastName());
			stat.setLong(5, a.getPhoneNo());
			int rowUpdated=stat.executeUpdate();
			if(rowUpdated>0)
			{
				System.out.println("updated successfully");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	
}
