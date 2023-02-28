//Write Java program to check whether number is prime or not. 
package com.assignment10;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");
		int number=scanner.nextInt();//take input from user and assign to number
		int count=0;
		for(int i=1;i<=number;i++)//loop to iterate number
		{
			if(number%i==0)//check condition if number is divisible only by 1 and number itself
				count++;   //increase the counter if condition is true
		}
		if(count==2)//check the count is 2
			System.out.println(number+" is prime number");//display if condition is true
		else
			System.out.println(number+" is not prime number");//display if condition is false

	}

}
