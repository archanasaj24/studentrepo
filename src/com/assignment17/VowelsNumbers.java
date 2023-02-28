//Write a Java Program for counting the vowels and numbers from file( abc.txt) .
package com.assignment17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class VowelsNumbers 
{

	public static void main(String[] args)
	{
		int vowel=0;
		int number=0;
		try
		{
			FileInputStream fos=new FileInputStream("E:\\My_Java_Programs\\abc.txt");
			Scanner sc=new Scanner(fos);
			String str=sc.nextLine();
			System.out.println(str);
			
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if((ch=='a')||(ch=='A')||(ch=='e')||(ch=='E')||(ch=='i')||(ch=='I')||(ch=='o')||(ch=='O')||(ch=='u')||(ch=='U'))
					vowel++;
				else if(ch>='0'&&ch<='9')
					number++;
			}
			System.out.println("Total vowels: "+vowel);
			System.out.println("Total numbers: "+number);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
