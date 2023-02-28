//Write program to add the five students mobile number into arraylist and iterate that elements using iterator. 
package com.assignment20;

import java.util.ArrayList;
import java.util.Iterator;

public class MobileArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> mobile=new ArrayList();//create ArrayList object
		//add elements into ArrayList using add method
		mobile.add("9579692076");
		mobile.add("9881907252");
		mobile.add("9890662750");
		mobile.add("9970171158");
		mobile.add("9595707025");
		System.out.println("ArrayList elements: ");
		Iterator<String> no=mobile.iterator();//create Iterator object 
		while(no.hasNext())//iterating ArrayList
		{
			System.out.println(no.next());//print ArrayList elements
		}
		

	}

}
