//Suppose I have Employee class that containing I'd, name and city now I want to sort the data based on comparable
//interface by using name.
package com.assignment24;

import java.util.ArrayList;
import java.util.Collections;

public class Employee implements Comparable<Employee>
{    
	int empId;
	String empName;
	String empCity;
	
	
	public Employee(int empId, String empName, String empCity) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empCity = empCity;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpCity() {
		return empCity;
	}

	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}

	public int compareTo(Employee emp)
	{
		return this.empName.compareTo(emp.empName);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empCity=" + empCity + "]";
	}

	public static void main(String[] args)
	{
		ArrayList<Employee> empList=new ArrayList();
		empList.add(new Employee(1,"Rani","Mumbai"));
		empList.add(new Employee(2,"Jayesh","Pune"));
		empList.add(new Employee(3,"Vidya","Kolhapur"));
		empList.add(new Employee(4,"Akash","Pune"));
		empList.add(new Employee(5,"Bina","Sangli"));
		System.out.println("List before sorting:\n"+empList);
		Collections.sort(empList);
		System.out.println("List after sort:\n"+empList);
	}

}
