//Suppose you have array that containing elements 10,20,30,10,30,50,60 Find out duplicate elements 
package com.assignment18;

public class DuplicateValue {

	public static void main(String[] args) 
	{
		int arr[]= {10,20,30,10,30,50,60,20,50};//declare array and assign elements
		System.out.println("Duplicate elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])//check condition to find duplicate value
					System.out.println(arr[i]);//if condition true print duplicate element
					
			}
			
		}

	}

}
