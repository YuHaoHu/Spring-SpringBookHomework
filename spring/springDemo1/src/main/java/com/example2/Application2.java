package com.example2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Controller;

import com.example.bean.User;
import com.example2.bean.Student;

@Controller
public class Application2 {

	public static void main(String[] args) {
		
	}
	@Test
	public void test1() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-context.xml");
		ApplicationContext context = new FileSystemXmlApplicationContext("classpath:application-context.xml");
		Student student =(Student)context.getBean("student");
		
		System.out.println(student);
	}
	
}
