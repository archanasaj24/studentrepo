package com.assignment5;

public class LeapYear {

	public static void main(String[] args) 
	{
        int year=1994;
        if((year%4==0)&&(year%100!=0)||(year%400==0))
        	System.out.println(year+" is leap year");
        else
        	System.out.println(year+" is not leap year");


	}

}
