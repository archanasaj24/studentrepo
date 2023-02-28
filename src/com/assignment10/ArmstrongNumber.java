//Write java program to check whether number is Armstrong or not.
package com.assignment10;

import java.util.Scanner;

public class ArmstrongNumber 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=scanner.nextInt();//take number from user and assign to number
        int temp=number;
        int num=number;
        int count=0;
        int sum=0;
        //get the count of digits in number
        while(num>0)
        {
        	num=num/10;
        	count++;
        }
        
        while(temp!=0)//iterate loop until tem>0
        {
        	int remd=temp%10;//get last digit
        	sum+=Math.pow(remd,count);//sum of power of number
        	temp=temp/10;
        }
        if(sum==number)//check condition
        	System.out.println("Number is armstrong");
        else
        	System.out.println("Number is not armstrong");
	}

}
