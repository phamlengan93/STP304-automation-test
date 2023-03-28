package data;

public class UserInfo {
	//khai bao thuoc tinh của UserInfo
	private String name;
	private String gender;
	private int age;
	private String job;
	//tao constructor
	public UserInfo(String name, String gender, int age, String job) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.job = job;
	}
	//khai báo phương thức SETTER
	public void setName (String name) {
		this.name = name;
	}
	public void setGender (String gender) {
		this.gender = gender;
	}
	public void setAge (int age) {
		this.age = age;
	}
	public void setJob (String job) {
		this.job = job;
	}
	//khai bao phuong thuc GETTER
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
	public String getJob() {
		return job;
	}
	
}
