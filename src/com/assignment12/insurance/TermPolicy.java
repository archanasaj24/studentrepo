package com.assignment12.insurance;

import java.util.Scanner;

public class TermPolicy extends LifeInsurance
{
	int duration;
    public void getTermPolicyDetail()
    {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter duration: ");
    	duration=scanner.nextInt();
    }
    public void getTermPolicyInformation()
    {
    	int period=duration;
    	System.out.println("Premium amount: "+period);
    }
}
