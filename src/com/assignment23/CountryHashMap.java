package com.assignment23;

import java.util.ArrayList;
import java.util.HashMap;

public class CountryHashMap
{
	public static void main(String[] args)
	{
		ArrayList<String> maharashtra=new ArrayList();//create ArrayList of maharashtra
		//add cities in maharashtra ArrayList
		maharashtra.add("Mumbai");
		maharashtra.add("Pune");
		maharashtra.add("Nagpur");
		
		ArrayList<String> karnataka=new ArrayList();//create ArrayList of karnataka
		//add cities in karnataka ArrayList
		karnataka.add("Bangalor");
		karnataka.add("Mysore");
		
		ArrayList<String> madhyaPradesh=new ArrayList();//create ArrayList of Madhya Pradesh
		//add cities in madhyaPradesh  
		madhyaPradesh.add("Bhopal");
		madhyaPradesh.add("Indore");

		HashMap<String,ArrayList<String>> states=new HashMap();//create HashMap object to store key and value
		//add key and value as ArrayList objects using put method in states HashMap
		states.put("Maharashtra",maharashtra);
		states.put("Karnataka",karnataka);
		states.put("Madhya Pradesh",madhyaPradesh);
		
		//create HashMap object to store key and HashMap object
		HashMap<String,HashMap<String,ArrayList<String>>> country=new HashMap();
		//put key as India and Value as HashMap object
		country.put("India", states);
		System.out.println(country);//print HashMap country

	}

}
