package com.example3.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import com.example3.bean.Student1;
import com.example3.bean.User1;

@Controller
public class HelloService {

	@Bean
	public User1 user() {
		User1 user =new User1();
		user.setName("李四");
		user.setAge(18);
		return user;
	}
	@Bean
	public Student1 student(){
		Student1 student =new Student1();
		student.setDemoName("太极计算机有限公司");
		return student;
	}
}
