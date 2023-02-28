package com.assignment4;

public class Subtraction
{
    public int subtractNumber(int no1,int no2)
    {
    	int subtract=no1-no2;
    	return subtract;
    }
	public static void main(String[] args) 
	{
		Subtraction subtraction=new Subtraction();
		int subtract=subtraction.subtractNumber(120,60);
		System.out.println("Subtraction: "+subtract);

	}

}
