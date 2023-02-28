package com.assignment15;

import java.util.Scanner;

public class AccountDetails extends SavingAccount // AccontDetalis inherited from SavingAccount and Account
{ 
	Scanner scanner=new Scanner(System.in);
     public void getAccountDetails()
     {   
    	 Account account=new Account();
    	 SavingAccount saving=new SavingAccount();
       	 System.out.println("Enter account id: ");
    	 accountId=scanner.nextInt(); //take input from user for id and set it to accountId
    	 System.out.println("Enter account number: ");
    	 accountNumber=scanner.nextLong();//take input from user and set it to accountNumber
    	 System.out.println("Enter account balance: ");
    	 accountBalance=scanner.nextInt();//take input from user and set it to accountBalance
    	 System.out.println("Enter withdraw amount: ");
    	 withdrawAmount=scanner.nextInt();//take input from user and set it to withdrawAmount
    	 //setter method called to set the values to the variables of account class
    	 account.setAccountId(accountId);
    	 account.setAccountNumber(accountNumber);
    	 account.setAccountBalance(accountBalance);	
    	 saving.setWithdrawAmount(withdrawAmount);//call setter method to set the values to withdrawAmount
    	 getWithdrawDetails(account);//calling method
     }
     public static int getWithdrawDetails(Account account) 
     {      	 
    	 SavingAccount savingAccount=new SavingAccount();
       	 int balance=account.getAccountBalance();//get values of accountBalance and set to balance
       	 int withdraw=savingAccount.getWithdrawAmount();//get values of withdrawAmount and set to withdraw
    	 int totalBalance=balance-withdraw;//withdraw amount deducted from balance and saved to totalBalance
    	 System.out.println("Total Balance: "+totalBalance);//print totalBalnce
    	 return totalBalance;
     }
}
