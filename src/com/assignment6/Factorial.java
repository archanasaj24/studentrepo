/*Design method int factorial(int no)  which returns int value to that method. 
 * print the results into main method
 *  (Example enter no as 5, factorial means 5*4*3*2*1 then output is 120)*/

package com.assignment6;

public class Factorial 
{
    public int factorial(int no)
    {    int fact=1;
    	for(int i=no;i>0;i--)
    	{
    		fact=fact*i;
    	}
    	return fact;
    }
	public static void main(String[] args)
	{
		Factorial fact=new Factorial();
		int factNumber=fact.factorial(5);
		System.out.println("Factorial is: "+factNumber);

	}

}
