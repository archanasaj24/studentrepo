package com.assignment4;

public class Addition
{
    public int addNumbers(int no1,int no2)
    {
    	int addition=no1+no2;
    	return addition;
    }
	public static void main(String[] args)
	{
		Addition addition=new Addition();
		int sum=addition.addNumbers(20, 30);
		System.out.println("Addition: "+sum);

	}

}
