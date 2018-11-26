package pojo;

public class Boy {
	private String sex;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "boy [sex=" + sex + "]";
	}

	public Boy(String sex) {
		super();
		this.sex = sex;
	}

	public Boy() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
