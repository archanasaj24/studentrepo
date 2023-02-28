package com.assignment12;

public class Account 
{
     int accountNumber;
     String accountName;
      public void getAccountDetails()
      {
    	  accountNumber=10001;
    	  accountName="Akshay";
    	  getAccountInformation(accountNumber,accountName);
      }
      public void getAccountInformation(int acnumber,String name)
      {
    	  System.out.println("Account Number: "+accountNumber);
    	  System.out.println("Account Name: "+accountName);
      }
}
