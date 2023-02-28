package com.assignment4;

public class Division
{
    public int divideNumbers(int no1,int no2)
    {
    	int divide=no1/no2;
    	return divide;
    }
	public static void main(String[] args)
	{
		Division division=new Division();
		int divide=division.divideNumbers(114,7);
		System.out.println("Division: "+divide);

	}

}
