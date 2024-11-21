package com.cjc.collegemanagementsystem.model;

public class Batch {

	private int bid;

	private String bname;
	
	private int tot_stu;

	public int getTot_stu() {
		return tot_stu;
	}

	public void setTot_stu(int tot_stu) {
		this.tot_stu = tot_stu;
	}

	private Faculty faculty;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

}
