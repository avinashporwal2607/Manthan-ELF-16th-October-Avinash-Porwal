package com.testyantra.datetime.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestC {
	public static void main(String[] args) {
		LocalDateTime ltd= LocalDateTime.now();
		DateTimeFormatter dt=DateTimeFormatter.ofPattern("dd-mm-yyyy:k:MM:SS:a");
				System.out.println(dt.format(ltd));
				String res=dt.format(ltd);
				System.out.println(res);
		
	}

}
