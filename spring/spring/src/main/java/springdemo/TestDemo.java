package springdemo;

import java.security.KeyStore.PrivateKeyEntry;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import pojo.Stuent;

public class TestDemo {

	private static ApplicationContext context;

	@Before
	public void testdemo1() {
		System.out.println("start demo");
	}

	@Test
	public void testdemo2() {

		context = new FileSystemXmlApplicationContext("classpath:applicationcontext.xml");

		Stuent stuent = (Stuent) context.getBean("stuent");
		System.out.println(stuent);
	}
}