package com.velocity;

import java.util.Scanner;

public class EmpDetail {

	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int e_Id=scanner.nextInt();
		System.out.println("Enter employee name: ");
		String e_Name=scanner.next();
		System.out.println("Enter employee salary: ");
		int e_Salary=scanner.nextInt();
		System.out.println("Enter street no: ");
		int street_no=scanner.nextInt();
		System.out.println("Enter city: ");
		String e_City=scanner.next();
		System.out.println("Enter state: ");
		String e_State=scanner.next();
		System.out.println("Enter country: ");
		String e_Country=scanner.next();
		//creating object
		Address address=new Address();
		Employee employee=new Employee();
		
		//initialize address object
		address.setStreetNo(street_no);
		address.setCity(e_City);
		address.setState(e_State);
		address.setCountry(e_Country);
		 
		//initialize employee object
		employee.setEmpId(e_Id);
		employee.setEmpName(e_Name);
		employee.setEmpSalary(e_Salary);
        employee.setAddress(address);
		
        //display employee detail
        System.out.println("---------------Employee Detail---------------");
        System.out.println("Employee Id: "+employee.getEmpId());
        System.out.println("Employee Name: "+employee.getEmpName());
        System.out.println("Emloyee Salary: "+employee.getEmpSalary());
//        System.out.println("Employee Street No: "+employee.getAddress().getStreetNo());
//        System.out.println("Employee city: "+employee.getAddress().getCity());
//        System.out.println("Enter state: "+employee.getAddress().getState());
//        System.out.println("Enter country: "+employee.getAddress().getCountry());
        Address ad=employee.getAddress();
        System.out.println("Employee Street No: "+ad.getStreetNo());
      System.out.println("Employee city: "+ad.getCity());
      System.out.println("Enter state: "+ad.getState());
      System.out.println("Enter country: "+ad.getCountry());
        
        
	}

}
