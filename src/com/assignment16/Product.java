package com.assignment16;

public class Product
{
    public void productCheck(int weight)
    {
    	if(weight<100)//check condition
    		throw new ProductException("Weight is invalid,Please insert weight >100");//throw custom exception class
    	else
    		System.out.println("Continue");
    	
    }
}
