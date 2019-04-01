package com.cts.academy1.model;

public class Faculty {
	private String faculty_id;
	private String faculty_name;
	private String qualification;
	
	public String getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(String faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	
	
	
	public Faculty(String faculty_id, String faculty_name, String qualification) {
		super();
		this.faculty_id = faculty_id;
		this.faculty_name = faculty_name;
		this.qualification = qualification;
	}
	public Faculty() {
		super();
	}
	@Override
	public String toString() {
		return "Faculty [faculty_id=" + faculty_id + ", faculty_name=" + faculty_name + ", qualification="
				+ qualification + "]";
	}
	
	

}
