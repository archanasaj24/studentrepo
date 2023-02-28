/*Design the java method for String getReverseString(String reverse) and take the input from user into main 
 * method and pass to that method. Result will print into main method*/
package com.assignment19;

import java.util.Scanner;

public class ReverseString
{
    public String getReverseString(String input)//create method for reverse string
    {
    	String reverse="";//declare empty string to assign reverse string
    	for(int i=input.length()-1;i>=0;i--)//iterate string
    		reverse=reverse+input.charAt(i);//assign inputed string characters to reverse variable
    	return reverse;//return reverse string;
    }
	public static void main(String[] args) 
	{
		ReverseString reverseString=new ReverseString();//create class object
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string: ");
		String input=scanner.next();//take string from user
		String reverse=reverseString.getReverseString(input);//calling method from class
		System.out.println("Reverse string: "+reverse);//print reverse string

	}

}
