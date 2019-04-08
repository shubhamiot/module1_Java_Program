package com.cg.dao;
import java.util.List;
import com.cg.bean.Author;
public interface AuthorDao {
	/**
	 * @author SHUBHAM KUMAR GUPTA
	 */
	public String createAuthor(Author a);
	public List<Author> readAllAuthor();
	public String deleteAuthor(String aid);
	public String updateAuthor(Author a);
}
