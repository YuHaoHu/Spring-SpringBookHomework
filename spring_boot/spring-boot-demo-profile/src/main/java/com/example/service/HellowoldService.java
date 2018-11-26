package com.example.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile({"hello","default","dev"})
public class HellowoldService implements MessageService{

	@Value("${name:huyuhao}")
	private String name;
	
	@Override
	public String getmessageService() {
		// TODO Auto-generated method stub
		return "Hello:"+this.name ;
	}
}
