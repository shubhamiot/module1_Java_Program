package com.capg.bean;

public class Employee1 {
	int id;
	String name;
	int salary;
	String designation;
	String ins_scheme;
	public Employee1(int id, String name, int salary, String designation, String ins_scheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.ins_scheme = ins_scheme;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getIns_scheme() {
		return ins_scheme;
	}
	public void setIns_scheme(String ins_scheme) {
		this.ins_scheme = ins_scheme;
	}
	public String toString()
	{
		return id+"\t"+name+"\t"+salary+"\t"+designation+"\t"+ins_scheme+"\t";
	}
	
}
