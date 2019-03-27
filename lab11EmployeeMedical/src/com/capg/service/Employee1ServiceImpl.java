package com.capg.service;

import java.util.List;

import com.capg.bean.Employee1;
import com.capg.dao.Employee1Dao;
import com.capg.dao.Employee1DaoImple;

public class Employee1ServiceImpl implements Employee1service {
	Employee1Dao edao=new Employee1DaoImple();
	@Override
	public String addEmployee1(Employee1 e) {
			return edao.addEmployee1(e);
	}

	@Override
	public Employee1 searchInsurance(int salary) {
		if((salary>=5000 && salary<20000)||(salary>=20000 && salary<40000)||(salary>=40000)||(salary<5000)) {
			return edao.searchInsurance(salary);
		}
		
		else
		{
			return null;
		}
	}

	@Override
	public List<Employee1> allEmployee1() {
		return edao.allEmployee1();
	}

}
