//Design the method for ArrayList<Employee> which returns the list of employee and print that data.
package com.assignment20;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee 
{
	int id;
	String name;
	String city;
    public Employee getEmployee()//create method to assign values to employee class variables and return employee object
    {
    	Employee emp=new Employee();//create object
    	//assign values
    	emp.id=1;
    	emp.name="Raj";
    	emp.city="Pune";
    	return emp;//return object
    }
    //override toString method to display values
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + "]";
	}

	public static void main(String[] args)
	{
		Employee employee=new Employee();//create Employee class object
		ArrayList<Employee> emp=new ArrayList();//create ArrayList object
		Employee emp1=employee.getEmployee();//calling getEmployee method nad assign to Employee object
		emp.add(emp1);//add employee object in ArrayListnemp
		for(Employee e:emp)//iterate ArrayList using for each
		System.out.println(e);//print values of ArrayList emp

	}

}
