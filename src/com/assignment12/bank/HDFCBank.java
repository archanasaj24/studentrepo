package com.assignment12.bank;

import java.util.Scanner;

public class HDFCBank extends Bank
{
	public void getHDFCBankDetails()
    {   
		System.out.println("------HDFC Bank------");
       	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter principle amount: ");
    	principleAmount=scanner.nextDouble();
    	System.out.println("Enter time periad: ");
    	tenure=scanner.nextInt();
    	System.out.println("Enter rate of interest: ");
    	rateOfInterest=scanner.nextFloat();
    	double finalAmount=getCalculateInterest(principleAmount,tenure,rateOfInterest);
    	System.out.println("Simple Interest: "+finalAmount);
    }
    public double getCalculateInterest(double principleAmount,int tenure,float rateOfInterest)
    {
    	double si=principleAmount*tenure*rateOfInterest/100;
    	return si;
    }
}
