package com.testyantra.thread.test;

public class User extends Thread {
	PVR P;

	public User(PVR ref)
	{
		this.P=ref;

	}
	public void run()
	{
		P.confirm();
	}

}
