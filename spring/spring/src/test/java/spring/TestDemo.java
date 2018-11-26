package spring;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pojo.Site;
import pojo.User;
import servies.HelloUserServies;

/**
 * 注解功能测试
 */

public class TestDemo {

	// 传统方式
	private ApplicationContext context;

	// 注解的方式创建
	private AnnotationConfigApplicationContext context2;

	@Test
	public void test1() {

		context = new ClassPathXmlApplicationContext("classpath:applicationcontext.xml");
		Site site = (Site) context.getBean("site");
		System.out.println(site);
	}

	@Test
	public void test2() {
		context2 = new AnnotationConfigApplicationContext();
		context2.scan("pojo");
		context2.refresh();
		context2.registerShutdownHook();
		// Site site=(Site)context2.getAutowireCapableBeanFactory();
		// System.out.println(site);
		int count = context2.getBeanDefinitionCount();
		System.out.println("Bean的个数" + count);
		String[] names = context2.getBeanDefinitionNames();
		System.out.println(names);
		for (String string : names) {
			System.out.println(string);
		}
	}

	@Test
	public void test3() {
		context2 = new AnnotationConfigApplicationContext(HelloUserServies.class);
//		User user = (User) context2.getBean(User.class);
		User user = (User) context2.getBean("user");
		System.out.println(user);
	}

}
