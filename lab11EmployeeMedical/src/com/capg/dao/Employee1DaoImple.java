package com.capg.dao;
import java.util.ArrayList;
import java.util.List;

import com.capg.bean.Employee1;

public class Employee1DaoImple implements Employee1Dao {
	List<Employee1> li=new ArrayList<Employee1>();
	@Override
	public String addEmployee1(Employee1 e) {
		li.add(e);
		return "Employee added";
	}

	@Override
	public Employee1 searchInsurance(int salary) {
		Employee1 emp=null;
		for(Employee1 e:li)
		{
			if(e.getSalary()>=salary)
			{
				emp=e;
			}
		}
		return emp;
	}

	@Override
	public List<Employee1> allEmployee1() {
		
		return li;
	}

}
