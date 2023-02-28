package com.assignment5;

public class MaxNumber {

	public static void main(String[] args)
	{
		int num1=45;
		int num2=79;
		int num3=23;
		if(num1>num2&&num1>num3)
			System.out.println(num1+" is maximum number");
		else if(num2>num1&&num2>num3)
			System.out.println(num2+" is maximum number");
		else
			System.out.println(num3+" is maximum number");

	}

}
