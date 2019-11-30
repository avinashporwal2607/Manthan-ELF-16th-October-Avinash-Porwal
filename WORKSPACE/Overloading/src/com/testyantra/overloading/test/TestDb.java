package com.testyantra.overloading.test;

public class TestDb {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setName("avinash");
		e.setGender('m');
		e.setHeight(5.9);
		e.setId(302);
		DataBase d=new DataBase();
		d.save(e);
		
	}

}
