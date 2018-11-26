package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("goodbye")
public class GoodbyeWorldService implements MessageService{

	@Value("${name:World}")
	private String name;
	
	@Override
	public String getmessageService() {
		// TODO Auto-generated method stub
		return "Goodbye"+":  "+this.name;
	}

	
}
