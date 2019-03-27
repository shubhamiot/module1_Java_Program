package com.capg.service;

import java.util.List;

import com.capg.bean.Employee1;

public interface Employee1service {
	public String addEmployee1(Employee1 e);
	public Employee1 searchInsurance(int salary);
	public List<Employee1> allEmployee1();
}
