package com.example.student.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int studId;
	String studName;
	String studCity;
	String studMobileNo;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int studId, String studName, String studCity, String studMobileNo) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studCity = studCity;
		this.studMobileNo = studMobileNo;
	}

	public int getStudId() {
		return studId;
	}

	public void setStudId(int studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}

	public String getStudMobileNo() {
		return studMobileNo;
	}

	public void setStudMobileNo(String studMobileNo) {
		this.studMobileNo = studMobileNo;
	}

	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studCity=" + studCity + ", studMobileNo="
				+ studMobileNo + "]";
	}
	
	
	

}
