//Design the generics arraylist for string and add five cities into it and iterate that using for each loop.
package com.assignment20;

import java.util.ArrayList;

public class CityArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<String> city=new ArrayList();//create object of ArrayList
		//add elements in ArrayList city
		city.add("Kolhapur");
		city.add("Sangli");
		city.add("Ichalkaranji");
		city.add("Pune");
		city.add("Mumbai");
		System.out.println("Elements in City ArrayList");
		for(String str:city)//for each loop to iterate ArrayList
		{
			System.out.println(str);//print elements of ArrayList
		}
		

	}

}
