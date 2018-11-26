package com.example3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example3.bean.Student1;
import com.example3.service.HelloService;

public class Application3 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloService.class);
		Student1 student = (Student1)context.getBean("student");
		System.out.println(student);
	
	}
	

}
