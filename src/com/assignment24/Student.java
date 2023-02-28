/*2. Suppose I have Student class containing I'd, name and salary now I want to sort the data based on 
 * comparator interface by using salary.*/
package com.assignment24;

public class Student
{
    int studId;
    String studName;
    int studSalary;
	public Student(int studId, String studName, int studSalary) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studSalary = studSalary;
	}
	/**
	 * @return the studId
	 */
	public int getStudId() {
		return studId;
	}
	/**
	 * @param studId the studId to set
	 */
	public void setStudId(int studId) {
		this.studId = studId;
	}
	/**
	 * @return the studName
	 */
	public String getStudName() {
		return studName;
	}
	/**
	 * @param studName the studName to set
	 */
	public void setStudName(String studName) {
		this.studName = studName;
	}
	/**
	 * @return the studSalary
	 */
	public int getStudSalary() {
		return studSalary;
	}
	/**
	 * @param studSalary the studSalary to set
	 */
	public void setStudSalary(int studSalary) {
		this.studSalary = studSalary;
	}
	@Override
	public String toString() {
		return "Student [studId=" + studId + ", studName=" + studName + ", studSalary=" + studSalary + "]";
	}
    
    
}


