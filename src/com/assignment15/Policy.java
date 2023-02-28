/*1.1 Design the Policy class that contain policy id, policy name, policy type, premium amount etc. 
1.2 Design the below method into Policy class and which return the policy object
public Policy getPolicyDetails() 
1.3 Input should be taken from user and print that data into getPolicyDetails () method.
*/
package com.assignment15;

import java.util.Scanner;

public class Policy 
{
      int policyId;
      String policyName;
      String policyType;
      long premiumAmount;
      //setter and getter method for variables
      public int getPolicyId() {
		return policyId;
	}
	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public long getPremiumAmount() {
		return premiumAmount;
	}
	public void setPremiumAmount(long premiumAmount) {
		this.premiumAmount = premiumAmount;
	}
	
	public Policy getPolicyDetails()//method return Policy class object
      {
    	  Scanner scanner=new Scanner(System.in);
    	  Policy policy=new Policy(); //Policy class object is created
    	  
    	  System.out.println("Enter policy id: ");
    	  policyId=scanner.nextInt();//take input for id and assign to policyId
    	  System.out.println("Enter palicy name: ");
    	  policyName=scanner.next();//take input for name and assign to policyName
    	  System.out.println("Enter policy type: ");
    	  policyType=scanner.next();//take input for type and assign to policyType
    	  System.out.println("Enter premium amount: ");
    	  premiumAmount=scanner.nextLong();//take input for amount and assign to premium amount
    	  //inputed values set to class variables
    	  policy.setPolicyId(policyId);
    	  policy.setPolicyName(policyName);
    	  policy.setPolicyType(policyType);
    	  policy.setPremiumAmount(premiumAmount);
    	  return policy;//return policy
     }
	//override toString method to display data
	@Override
	public String toString() {
		return "Policy [policyId=" + policyId + ", policyName=" + policyName + ", policyType=" + policyType
				+ ", primiumAmount=" + premiumAmount + "]";
	}
     public static void main(String[] args)
     {
    	 Policy policy=new Policy();//policy class object created
    	 Policy policy1=policy.getPolicyDetails();//calling policy class method and to policy1
    	 System.out.println("Policy Details:\n"+policy1); //print data
     }
      
}
