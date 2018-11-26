package com.example;

import org.springframework.beans.factory.serviceloader.ServiceFactoryBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ServletApplication2 {

	public static void main(String[] args) {
		SpringApplication.run(ServletApplication2.class, args);
	}

	/**
	 * @return
	 */
	@Bean
	public ServletRegistrationBean getservletRegistrationBean() {
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();

		servletRegistrationBean.addUrlMappings("/servletApplication2");
		return servletRegistrationBean;
	}
	// @Bean
	// public ServletRegistrationBean getServletRegistrationBean() {
	// ServletRegistrationBean bean = new ServletRegistrationBean();
	// bean.addUrlMappings("/second");
	// return bean;
	// }
}
