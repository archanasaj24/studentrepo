/*Suppose I have arraylist which contain elements as [mumbai, pune, Bangalore, Hyderabad, mumbai], 
 * now I want to remove the mumbai from list and print that data.*/
package com.assignment20;

import java.util.ArrayList;
import java.util.Iterator;


public class RemoveValues
{
	public static void main(String[] args)
	{
		ArrayList<String> city=new ArrayList();//create ArrayList object
		//add elements in ArrayList
		city.add("Mumbai");
		city.add("Pune");
		city.add("Bangalore");
		city.add("Hyderabad");
		city.add("Mumbai");
		
		System.out.println("ArrayList before removing element");
		for(String arrayValue:city)//print ArrayList elements
			System.out.println(arrayValue);
		
		System.out.println("ArrayList after removing element");
		Iterator<String> str=city.iterator();//iterating string
		while(str.hasNext())//check condition
		{
			String str1=str.next();//declare another string assign value of str
			if(str1.equals("Mumbai"))//check condition 
				str.remove();//if condition true remove string
		}
		
		for(String value:city)//loop to iterate ArrayList
			System.out.println(value);//print ArrayList elements

	}

}
