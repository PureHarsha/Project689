package com.database.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;



@Entity(name = "student")
public class Student {

	@Id
	@Column(name = "roll")
	private int rollNum;
	@Column(name = "name")
	private String stName;
	@Column(name = "mail")
	private String stMail;
	@Column(name = "jn_datee")
	private Date joiningDate;

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStName() {
		return stName;
	}

	public void setStName(String stName) {
		this.stName = stName;
	}

	public String getStMail() {
		return stMail;
	}

	public void setStMail(String stMail) {
		this.stMail = stMail;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", stName=" + stName + ", stMail=" + stMail + ", joiningDate="
				+ joiningDate + "]";
	}
	
	
	
	
}
