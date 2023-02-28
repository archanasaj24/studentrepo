package com.assignment12;

public class SavingAccount extends Account
{
    String accountType;
    long balance;
    public void getSavingAccountDetails()
    {
    	accountType="Saving";
    	balance=50000;
    	getSavingAccountInformation(accountType,balance);
    }
    public void getSavingAccountInformation(String type,long balance)
    {
    	System.out.println("Account type: "+accountType);
    	System.out.println("Balance: "+balance);
    }
}

