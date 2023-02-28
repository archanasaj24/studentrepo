//Write a java program to display the Fibonacci series up to given number. 
package com.assignment10;

import java.util.Scanner;

public class FibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number: ");//take input from user assign to number
		int number=scanner.nextInt();
		int num1=0;
		int num2=1;
		System.out.print(num1+" "+num2);//print first two number
		for(int i=2;i<number;i++)//iterate loop upto given number
		{
			int num3=num1+num2;
			System.out.print(" "+num3);//print addition of previous two number
			num1=num2;
			num2=num3;
		}
		

	}

}
