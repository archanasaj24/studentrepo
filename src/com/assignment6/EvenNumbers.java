//write a program  to print all even number from 50 to 75.

package com.assignment6;

public class EvenNumbers {

	public static void main(String[] args)
	{   
		System.out.println("Even numbers from 50 to 75");
		for(int i=50;i<=75;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}

	}

}
