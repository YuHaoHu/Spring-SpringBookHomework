package com.example3.bean;

import org.springframework.beans.factory.annotation.Autowired;

public class Student1 {

	@Autowired
	private User1 user;
	private String demoName;
	public User1 getUser() {
		return user;
	}
	public void setUser(User1 user) {
		this.user = user;
	}
	public String getDemoName() {
		return demoName;
	}
	public void setDemoName(String demoName) {
		this.demoName = demoName;
	}
	@Override
	public String toString() {
		return "Student [user=" + user + ", demoName=" + demoName + "]";
	}
	public Student1(User1 user, String demoName) {
		super();
		this.user = user;
		this.demoName = demoName;
	}
	public Student1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
