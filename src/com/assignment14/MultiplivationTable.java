//Write a java program to print the all multiplication table from * 2, 3, 4.... to 20.
package com.assignment14;

public class MultiplivationTable {

	public static void main(String[] args)
	{
		for(int i=1;i<=10;i++)//loop for row
		{
			for(int j=1;j<=10;j++)//loop for column
			{
				System.out.print((i*j)+" ");
			}
			System.out.println("\n");
		}
	}

}
