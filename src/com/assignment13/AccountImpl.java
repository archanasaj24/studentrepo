package com.assignment13;

import java.util.Scanner;

public class AccountImpl implements Account//implement interface
{
	String name;
	float balance;
    public void getSavingAccount()//implementing method to take input from user
    {
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter name: ");
    	name=scanner.next();
    	System.out.println("Enter balance: ");
    	balance=scanner.nextFloat();
    	getUserDetails(name,balance);//calling getUserDetails method and pass values to method
    }
    public void getUserDetails(String name,float balance)//implementing method
    {
    	System.out.println("Name: "+name);
    	System.out.println("Balance: "+balance);
    }
    public static void main(String[] args)
    {
    	Account account=new AccountImpl();
    	account.getSavingAccount();
    }
}
