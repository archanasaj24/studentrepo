/*Suppose You have given an integer array containing 1 to n but one of the number from 1 to n in the array 
 * is missing. You need to provide optimum solution to find the missing number. Number can not be repeated 
 * in the array.*/
package com.assignment18;

public class MissingNumber {

	public static void main(String[] args)
	{
		int size=15;
		int arr[]= {1,2,3,6,7,9,10,11,12,15};	//create array and initialize it
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]+" ");//print array of elements
		System.out.println("\nMissing numbers are :");
		for(int i=1;i<=size;i++)
		{
			int count=0;///take count 
			for(int j=0;j<arr.length;j++)
			{
				if(i==arr[j])//check condition 
					count++;//increase count if condition true
			}
			if(count==0)//if count is 0 
				System.out.println(i);//print missing number
		}
		

	}

}
