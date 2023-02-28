//Design method to check whether the character is alphabet, digit and special symbol.
package com.assignment7;

public class CharCheck 
{
    public void checkChar(char ch)
    {
    	if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z'))
    		System.out.println("It is an alphabet");
    	else if(ch>='0'&&ch<='9')
    		System.out.println("It is a number");
    	else
    		System.out.println("It is a special symbol");
    }
	public static void main(String[] args) 
	{
		CharCheck check=new CharCheck();
		check.checkChar('9');

	}

}
