package com.cts.academy1.model;

public class SkillSet {

	private String facultyid;
	private String skill;
	private String certification;
	public String getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public SkillSet(String facultyid, String skill, String certification) {
		super();
		this.facultyid = facultyid;
		this.skill = skill;
		this.certification = certification;
	}
	public SkillSet() {
		super();
	}
	@Override
	public String toString() {
		return "SkillSet [facultyid=" + facultyid + ", skill=" + skill + ", certification=" + certification + "]";
	}
	
	
	
}
