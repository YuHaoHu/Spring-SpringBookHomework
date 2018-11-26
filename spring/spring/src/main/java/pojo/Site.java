package pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Site {

	@Value("望京")
	private String homeSite;
	@Value("中国石油大学")
	private String classSite;

	public String getHomeSite() {
		return homeSite;
	}

	public void setHomeSite(String homeSite) {
		this.homeSite = homeSite;
	}

	public String getClassSite() {
		return classSite;
	}

	public void setClassSite(String classSite) {
		this.classSite = classSite;
	}

	@Override
	public String toString() {
		return "Site [homeSite=" + homeSite + ", classSite=" + classSite + "]";
	}

	public Site(String homeSite, String classSite) {
		super();
		this.homeSite = homeSite;
		this.classSite = classSite;
	}

	public Site() {
		super();
		// TODO Auto-generated constructor stub
	}

}