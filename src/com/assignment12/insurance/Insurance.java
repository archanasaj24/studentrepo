package com.assignment12.insurance;

import java.util.Scanner;

public class Insurance
{
	int id;
	String personName;
	String insuranceCompany;
	public void getInsuranceDetail()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter id: ");
		id=scanner.nextInt();
		System.out.println("Enter person name: ");
		personName=scanner.next();
		System.out.println("Enter insurance company: ");
		insuranceCompany=scanner.next();
	}
	void getInsuranceInformation()
	{
		int id1=id;
		String name=personName;
		String company=insuranceCompany;
		System.out.println("Id: "+id);
		System.out.println("Person Name: "+name);
		System.out.println("Insurance company: "+company);
	}

}
