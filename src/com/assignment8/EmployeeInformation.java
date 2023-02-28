/*Design the class as EmployeeInformation which takes the input for multiple students from user and Design method
 *  public void getUserInput(), country is same for all the students.*/

package com.assignment8;

import java.util.Scanner;

public class EmployeeInformation
{
    public void getUserInput()//method to get input from user
    {
    	Scanner scanner=new Scanner(System.in);//create scanner class object for user input
    	Employee employee=new Employee();//create employee class object
    	System.out.println("Enter first name: ");
    	employee.firstName=scanner.next();//get first name from user assign to employee.firstName
    	System.out.println("Enter last name: ");
    	employee.lastNmae=scanner.next();//get last name from user assign to employee.lastName
    	System.out.println("Enter city: ");
    	employee.city=scanner.next();//get city from user assign to employee.city
    	System.out.println("Enter mobile number: ");
    	employee.mobileNumber=scanner.nextLong();//get mobile number from user assign to employee.mobileNumber
    	employee.country="India";//assign india to country
    	//call getStudentTnformation method to pass values to method
    	getStudentInformation(employee.firstName,employee.lastNmae,employee.city,employee.mobileNumber,employee.country);
    }
    //method to display student information
    public void getStudentInformation(String fName,String lName,String sCity,long mobileNo,String country)
    {
    	System.out.println("Student Information");
    	//display student information on console
    	System.out.println("First Name: "+fName);
    	System.out.println("Last Name: "+lName);
    	System.out.println("City: "+sCity);
    	System.out.println("Mobile No: "+mobileNo);
    	System.out.println("Country: "+country);
    }
	public static void main(String[] args)
	{
		EmployeeInformation empInfo=new EmployeeInformation();//create object on EmployeeInformation
		Scanner scanner=new Scanner(System.in);//create scanner class object
		System.out.println("Enter the number of student: ");
		int count=scanner.nextInt();//get number of student and assign to count
		System.out.println("Enter student detail");
		for(int i=1;i<=count;i++) //
		{
		 empInfo.getUserInput();//call method to get and display information from EmployeeInformation class
		}
	}

}
