/*Design the method which return the list that contain the element as Ram, Sohan, Ashok, Ajay, Prasanna 
 * now I want to sort that element based on descending order.*/
package com.assignment21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescList
{
    public List<String> getList()//create method with return type List
    {
    	List<String> nameList=new ArrayList();//create object of list
    	//add elements in list
    	nameList.add("Ram");
    	nameList.add("Sohan");
    	nameList.add("Ashok");
    	nameList.add("Ajay");
    	nameList.add("Prasanna");
    	
    	return nameList;//return list object
    }
	public static void main(String[] args)
	{
		DescList desc=new DescList();//class object created
		List<String> sortList=desc.getList();//calling getList method and assign return value to sortList
		System.out.println("List Before Sorting\n"+sortList);
		Collections.sort(sortList);//sorting list in ascending order using Collections sort method
		System.out.println("\nList After sorting");
		for(int i=sortList.size()-1;i>=0;i--)//loop to iterate list in descending order
		{
			System.out.print(sortList.get(i)+", ");//print elements using get method from list
		}
		
	}

}
