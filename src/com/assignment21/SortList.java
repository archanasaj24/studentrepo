/*Suppose I have one container that contain  different colors of balloons such as Red, Blue, Green, Red,Blue,Red, 
 * Blue, Green in this order, now sort that balloon in such manner so Red balloon will be added first then Blue 
 * balloon and last is Green balloons. Use the proper collection.*/
package com.assignment21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SortList 
{
	public List<String> getBalloon()//create method with List return type
	{
		List balloon=new LinkedList();//create object of LinkedList
		//add elements in LinkedList using add method
		balloon.add("Red");
		balloon.add("Blue");
		balloon.add("Green");
		balloon.add("Red");
		balloon.add("Blue");
		balloon.add("REd");
		balloon.add("Blue");
		balloon.add("Green");
		return balloon;//return List object
	}
	public static void main(String[] args)
	{
		SortList sortList=new SortList();//class object created
		 List<String> sortedList=sortList.getBalloon();//calling method and assign return values to List object
		System.out.println("List\n"+sortedList);//print elements from List object
       LinkedList<String> addList=new LinkedList();//new LinkedList Object is created
        for(String color:sortedList)//itrate list using for each
        {
        	if(color.equals("Red"))//check condition if color is red
        		addList.addFirst("Red");//if condition is true add first element in addList object
        	else if(color.equals("Blue"))//check condition if color is blue
        		addList.add("Blue");//if condition is true add element in addList object
        }
        for(String color1:sortedList)//loop to add last element
        {
        	if(color1.equals("Green"))//check condition if color is Green
        		addList.addLast("Green");//add last element in addList object
        }
        System.out.println("Sorted List");
        System.out.print(addList+", ");//print new sorted list 
        	
	}

}
