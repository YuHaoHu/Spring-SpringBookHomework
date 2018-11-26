package pojo;

import org.springframework.stereotype.Service;


public class Stuent {

	private String name;
	private String age;
	
	private Site site;
	
	
	public Site getSite() {
		return site;
	}
	public void setSite(Site site) {
		this.site = site;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public Stuent(String name, String age, Site site) {
		super();
		this.name = name;
		this.age = age;
		this.site = site;
	}
	public Stuent() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Stuent [name=" + name + ", age=" + age + ", site=" + site + "]";
	}
	
	
}
