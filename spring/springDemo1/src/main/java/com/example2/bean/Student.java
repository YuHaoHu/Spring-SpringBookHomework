package com.example2.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

	@Autowired
	private User user;
	@Value("中国石油大学胜利学院")
	private String demoName;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
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
	public Student(User user, String demoName) {
		super();
		this.user = user;
		this.demoName = demoName;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}