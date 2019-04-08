package service;

import beans.beans;
import dao.DaoClass;

public class Serviceclass implements ServiceInterface {

	DaoClass dao=new DaoClass();
public void storeLibrary(beans emp) {
		
		// TODO Auto-generated method stub
		dao.storeLibrary(emp);
		
	}
	public void deleteData(int authorId) {
		// TODO Auto-generated method stub
		dao.deleteData(authorId);
		
	}
	public void displayData() {
		// TODO Auto-generated method stub
		dao.displayData();
		
	}
	public void displayAccordingData()
	{
		dao.displayAccordingData();
	}
	@Override
	public beans storeInn() {
		// TODO Auto-generated method stub
		return null;
	}

}
