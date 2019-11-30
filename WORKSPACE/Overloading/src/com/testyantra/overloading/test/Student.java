package com.testyantra.overloading.test;

import java.io.Serializable;

public class Student implements Serializable {
private String name;
private int id;
public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
	
}
public void setId(int id)
{
	this.id=id;
}
public int getId()
{
	return id;
}
}
