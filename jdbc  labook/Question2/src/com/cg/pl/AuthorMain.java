package com.cg.pl;
import com.cg.bean.Author;
import com.cg.service.AuthorService;
import com.cg.service.AuthorServiceImpl;
public class AuthorMain {
	public static void main(String args[])
	{
		/**
		 * @author SHUBHAM KUMAR GUPTA
		 */
		AuthorService as=new AuthorServiceImpl();
		Author au=new Author("A1011","shubham","kumar","gupta",7888);
		Author au1=new Author("A1012","harsh","kumar","gupta",454545);
		Author au2=new Author("A1013","vikas","vansh","raj",155454);
		Author au3=new Author("A1014","shyam","kumar","sinha",74111);;
		System.out.println(as.createAuthor(au));
		System.out.println(as.createAuthor(au1));
		System.out.println(as.createAuthor(au2));
		System.out.println(as.createAuthor(au3));
	}
}
