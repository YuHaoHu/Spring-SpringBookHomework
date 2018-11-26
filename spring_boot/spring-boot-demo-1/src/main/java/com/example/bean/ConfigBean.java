package com.example.bean;
/**
 * @Data 
 * 
 */
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;


@ConfigurationProperties(prefix="user")
@Configuration
//@Component
@Data
@ToString
public class ConfigBean {
	private String name;
	private String age;
	private int number;
	private String greeting;
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getAge() {
//		return age;
//	}
//	public void setAge(String age) {
//		this.age = age;
//	}
//	public int getNumber() {
//		return number;
//	}
//	public void setNumber(int number) {
//		this.number = number;
//	}
//	public String getGreeting() {
//		return greeting;
//	}
//	public void setGreeting(String greeting) {
//		this.greeting = greeting;
//	}
//	@Override
//	public String toString() {
//		return "ConfigBean [name=" + name + ", age=" + age + ", number=" + number + ", greeting=" + greeting + "]";
//	}
//	
	
	  
}
