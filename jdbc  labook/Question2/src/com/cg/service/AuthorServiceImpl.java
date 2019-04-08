package com.cg.service;

import java.util.List;

import com.cg.bean.Author;
import com.cg.dao.AuthorDao;
import com.cg.dao.AuthorDaoImpl;

public class AuthorServiceImpl implements AuthorService {
	AuthorDao  adao=new AuthorDaoImpl();
	@Override
	public String createAuthor(Author a) {
		if(a.getAuthorId().length()>3 && a.getFirstName().length()>2)
			return adao.createAuthor(a);
		return null;
	}
	@Override
	public List<Author> readAllAuthor() {
		return adao.readAllAuthor();
	}
	@Override
	public String deleteAuthor(String aid) {
		
		return adao.deleteAuthor(aid);
	}
	@Override
	public String updateAuthor(Author a) {
		return adao.updateAuthor(a);
	}

}
