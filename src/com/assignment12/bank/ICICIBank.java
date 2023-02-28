package com.assignment12.bank;

import java.util.Scanner;

public class ICICIBank extends Bank
{	  
    public void getICICIBankDetails()
    {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("------ICICI Bank------");
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
