package com.cts.academy1.model;

public class Login {
	private String fname;
	private String lname;
	private int age;
	private String gender;
	private String contnum;
	private String eid;
	private String password;
	private String assid;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContnum() {
		return contnum;
	}
	public void setContnum(String contnum) {
		this.contnum = contnum;
	}
	public String getEid() {
		return eid;
	}
	public void setEid(String eid) {
		this.eid = eid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAssid() {
		return assid;
	}
	public void setAssid(String assid) {
		this.assid = assid;
	}
	public Login(String fname, String lname, int age, String gender, String contnum, String eid, String password,
			String assid) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
		this.contnum = contnum;
		this.eid = eid;
		this.password = password;
		this.assid = assid;
	}
	public Login() {
		super();
	}
	@Override
	public String toString() {
		return "login [fname=" + fname + ", lname=" + lname + ", age=" + age + ", gender=" + gender + ", contnum="
				+ contnum + ", eid=" + eid + ", password=" + password + ", assid=" + assid + "]";
	}
	

	

}
