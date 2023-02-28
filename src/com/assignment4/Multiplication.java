package com.assignment4;

public class Multiplication 
{
    public int multiNumber(int no1,int no2)
    {
    	int multi=no1*no2;
    	return multi;
    }
	public static void main(String[] args)
	{
		Multiplication multiplication=new Multiplication();
		int multi=multiplication.multiNumber(24,9);
		System.out.println("Muliplication: "+multi);

	}

}
