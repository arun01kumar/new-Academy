package com.cts.academy1.model;

public class Module1 {
	private String skillid;
	private String skillname;
	private String certification;
	public String getSkillid() {
		return skillid;
	}
	public void setSkillid(String skillid) {
		this.skillid = skillid;
	}
	public String getSkillname() {
		return skillname;
	}
	public void setSkillname(String skillname) {
		this.skillname = skillname;
	}
	public String getCertification() {
		return certification;
	}
	public void setCertification(String certification) {
		this.certification = certification;
	}
	public Module1(String skillid, String skillname, String certification) {
		super();
		this.skillid = skillid;
		this.skillname = skillname;
		this.certification = certification;
	}
	public Module1() {
		super();
	}
	@Override
	public String toString() {
		return "Module1 [skillid=" + skillid + ", skillname=" + skillname + ", certification=" + certification + "]";
	}
	
	
}
