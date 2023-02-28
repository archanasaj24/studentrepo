package com.assignment12.insurance;

import java.util.Scanner;

public class LifeInsurance extends Insurance
{
    int premiumAmount;
    public void getLifeInsuranceDetail()
    {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter premium amount: ");
    	premiumAmount=scanner.nextInt();
    }
    public void getLifeInsuranceInformation()
    {  
    	int amount=premiumAmount;
    	System.out.println("Premium amount: "+amount);
    }
}
