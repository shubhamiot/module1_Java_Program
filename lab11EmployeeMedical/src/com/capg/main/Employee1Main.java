package com.capg.main;
import com.capg.bean.Employee1;
import com.capg.service.Employee1ServiceImpl;
import com.capg.service.Employee1service;
public class Employee1Main {
	public static void main(String args[])
	{
		Employee1service eservice=new Employee1ServiceImpl();
		Employee1 emp=new Employee1(1,"shubham",5000,"System Associate","Scheme C");
		Employee1 emp1=new Employee1(2,"aakash",30000,"programmer","Scheme B");
		Employee1 emp2=new Employee1(3,"harsh",60000,"manager","Scheme A");
		Employee1 emp3=new Employee1(4,"ram",2000,"clerk","No scheme");
		System.out.println(eservice.addEmployee1(emp));
		System.out.println(eservice.addEmployee1(emp1));
		System.out.println(eservice.addEmployee1(emp2));
		System.out.println(eservice.addEmployee1(emp3));
		System.out.println(eservice.allEmployee1());
		System.out.println(eservice.searchInsurance(30000));
		System.out.println(eservice.searchInsurance(40000));
		System.out.println(eservice.searchInsurance(2000));
		System.out.println(eservice.searchInsurance(5000));
	}
}
