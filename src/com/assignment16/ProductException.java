package com.assignment16;

public class ProductException extends RuntimeException //custom exception class
{
     public ProductException(String message)
     {
    	 super(message);//call constructor from parent class
     }
}
