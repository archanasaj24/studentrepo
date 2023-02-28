package com.assignment12.bank;

public class MainClass
{
	public static void main(String[] args)
	{
		ICICIBank iciciBank=new ICICIBank();
		iciciBank.getICICIBankDetails();
		SBIBank sbiBank=new SBIBank();
		sbiBank.getSBIBankDetails();
		HDFCBank hdfcBank=new HDFCBank();
		hdfcBank.getHDFCBankDetails();

	}

}
