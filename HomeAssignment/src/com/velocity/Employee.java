package com.velocity;

public class Employee
{
  int empId;
  String empName;
  int empSalary;
  Address address;//aggregation
  
  //getter and setter method
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

public int getEmpSalary() {
	return empSalary;
}

public void setEmpSalary(int empSalary) {
	this.empSalary = empSalary;
}
  
  //setter and getter method for address
  public void setAddress(Address address)
  {
	  this.address=address;
  }
  public Address getAddress()
  {
	  return this.address;
  }
}
