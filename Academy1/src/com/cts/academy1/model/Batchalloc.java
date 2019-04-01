package com.cts.academy1.model;

public class Batchalloc {
	private String batchid;
	private String facultyid;
	private String stdate;
	private String endate;
	private String cldate;
	public String getBatchid() {
		return batchid;
	}
	public void setBatchid(String batchid) {
		this.batchid = batchid;
	}
	public String getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(String facultyid) {
		this.facultyid = facultyid;
	}
	public String getStdate() {
		return stdate;
	}
	public void setStdate(String stdate) {
		this.stdate = stdate;
	}
	public String getEndate() {
		return endate;
	}
	public void setEndate(String endate) {
		this.endate = endate;
	}
	public String getCldate() {
		return cldate;
	}
	public void setCldate(String cldate) {
		this.cldate = cldate;
	}
	public Batchalloc(String batchid, String facultyid, String stdate, String endate, String cldate) {
		super();
		this.batchid = batchid;
		this.facultyid = facultyid;
		this.stdate = stdate;
		this.endate = endate;
		this.cldate = cldate;
	}
	
	@Override
	public String toString() {
		return "Batchalloc [batchid=" + batchid + ", facultyid=" + facultyid + ", stdate=" + stdate + ", endate="
				+ endate + ", cldate=" + cldate + "]";
	}
	
	

}
