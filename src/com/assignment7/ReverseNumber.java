/*Design method public int getReverseNumber(int num) which return int value to that method and
 *  result print into main method.*/

package com.assignment7;

public class ReverseNumber 
{
    public int getReverseNumber(int num)
    { int reverse=0;
    while(num!=0)
    {
    	int remd=num%10;
       	reverse=(reverse*10)+remd;
    	num=num/10;
    }
    	return reverse;
    }
	public static void main(String[] args) 
	{
		ReverseNumber reverseNumber=new ReverseNumber();
		int number=125;
		System.out.println("Number is: "+number);
		int reverse=reverseNumber.getReverseNumber(number);
		System.out.println("Reverse number is: "+reverse);

	}

}
