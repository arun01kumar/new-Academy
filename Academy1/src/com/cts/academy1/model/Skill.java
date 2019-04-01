package com.cts.academy1.model;

public class Skill {
	private String skillid;
	private String skill;
	private String certification;
	public String getSkillid() {
		return skillid;
	}
	public void setSkillid(String skillid) {
		this.skillid = skillid;
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
	public Skill(String skillid, String skill, String certification) {
		super();
		this.skillid = skillid;
		this.skill = skill;
		this.certification = certification;
	}
	public Skill() {
		super();
	}
	@Override
	public String toString() {
		return "Skill [skillid=" + skillid + ", skill=" + skill + ", certification=" + certification + "]";
	}
	
	
	

}
