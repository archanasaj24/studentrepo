package com.velocity;

public class Address 
{
   int streetNo;
   String city;
   String state;
   String country;
   
   //setter method
   public void setStreetNo(int streetNo)
   {
	   this.streetNo=streetNo;
   }
   public void setCity(String city)
   {
	   this.city=city;
   }
   public void setState(String state)
   {
	   this.state=state;
   }
   public void setCountry(String country)
   {
	   this.country=country;
   }
   
   //getter method
   public int getStreetNo()
   {
	   return this.streetNo;
   }
   public String getCity()
   {
	   return this.city;
   }
   public String getState()
   {
	   return this.state;
   }
   public String getCountry()
   {
	   return this.country;
   }
}
