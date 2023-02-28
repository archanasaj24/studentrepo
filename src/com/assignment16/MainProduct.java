package com.assignment16;

import java.util.Scanner;

public class MainProduct
{
	public static void main(String[] args)
	{
		try
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter weight: ");
			int weight=scanner.nextInt();//take input for weight from user and assign to weight
			Product product=new Product();//create object of Product class
			product.productCheck(weight);//calling product class method and value 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
