package com.manthan.exception.test;

public class InvalidAgeException extends Exception{
	public String message="sorry you are too young";
	public InvalidAgeException()
	{
		
	}
	public InvalidAgeException(String message) {
		
		this.message = message;
	}
	public String getMessage()//we are overriding parent class getMessage here
	{
		return message;
	}
}
