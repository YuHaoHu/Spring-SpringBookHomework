package springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import pojo.Stuent;

public class test {

	public static void main(String[] args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("applicationcontext.xml");
		ApplicationContext context2 = new FileSystemXmlApplicationContext("classpath:applicationcontext.xml");
		
		Stuent stuent =(Stuent)context.getBean("stuent");
		System.out.println(stuent);
	}
}
