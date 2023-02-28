package com.assignment12.insurance;

public class InsuranceDetail {

	public static void main(String[] args)
	{
		TermPolicy termPolicy=new TermPolicy();
		termPolicy.getInsuranceDetail();
		termPolicy.getLifeInsuranceDetail();
		termPolicy.getTermPolicyDetail();
		System.out.println("------------Insurance Information-----------");
		termPolicy.getInsuranceInformation();
		termPolicy.getLifeInsuranceInformation();
		termPolicy.getTermPolicyInformation();

	}

}
