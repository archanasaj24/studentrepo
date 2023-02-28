/*Design method to print factors of given number( Enter no = 6 then factors should be displayed like 1,2,3,6*/

package com.assignment7;

public class FactorsOfNumber
{
    public void factors(int num)
    {
    	for(int i=1;i<=num;i++)
    	{
    		if(num%i==0)
    			System.out.println(i);
    	}
    }
	public static void main(String[] args) 
	{
		FactorsOfNumber factorNumber=new FactorsOfNumber();
		System.out.println("Factor of number");
		factorNumber.factors(6);
		

	}

}
