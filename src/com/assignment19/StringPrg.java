/*Design a method for counting the alphabet, vowels and numbers from String. Input should be from user into main
 *  method and pass that to methods. And result will print into main method */
package com.assignment19;

import java.util.Scanner;

public class StringPrg {
    public void counting(String str)
    { 
    	int vowCount=0;
    	int alphaCount=0;
    	int numCount=0;
    	for(int i=0;i<str.length();i++)//loop to iterate string
    	{
    		if((str.charAt(i)>='A'&&str.charAt(i)<='Z')||(str.charAt(i)>='a'&&str.charAt(i)<='z'))//condition to check alphabets
    		{
    			alphaCount++;//increase the count of alphabet
    			//condition to check vowels
                  if(str.charAt(i)=='a'||str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
        			vowCount++;	//increase vowel count
    		}    			
    		else if(str.charAt(i)>='0'&&str.charAt(i)<='9')//condition to check numbers
    			numCount++;//increase numbers count
       	}
    	System.out.println("Number of alphabets: "+alphaCount);//print total alphabets in string
    	System.out.println("Number of vowels: "+vowCount);//print total vowels in string
    	System.out.println("Total numbers: "+numCount);//print total numbers in string
    }
	public static void main(String[] args) 
	{
		StringPrg stringPrg=new StringPrg();//create class object
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=scanner.nextLine();//take string from user and assign it to str
		stringPrg.counting(str);//calling counting method from class
		

	}

}
