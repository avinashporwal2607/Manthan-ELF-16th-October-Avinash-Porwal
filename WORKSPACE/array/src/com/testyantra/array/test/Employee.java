package com.testyantra.array.test;

public class Employee {
	String empname;
	int eid;
	int sallery;
	public Employee(String empname, int eid, int sallery) {

		this.empname = empname;
		this.eid = eid;
		this.sallery = sallery;
	}
	@Override
	public String toString() {
	
		return " EMPLOYEE NAME "+empname+" employee id "+eid+" employee sallery "+sallery;
	}

}
