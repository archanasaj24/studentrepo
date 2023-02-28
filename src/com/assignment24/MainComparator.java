package com.assignment24;

import java.util.ArrayList;
import java.util.Collections;

public class MainComparator {

	public static void main(String[] args) 
	{
		ArrayList<Student> studList=new ArrayList();
		studList.add(new Student(1,"Raj",50000));
		studList.add(new Student(2,"Sushila",35000));
		studList.add(new Student(3,"Praju",60000));
		studList.add(new Student(4,"Aachal",75000));
		studList.add(new Student(5,"Brijesh",5000));
		System.out.println("List before sorting\n"+studList);
		Collections.sort(studList,new CompareSalary());
		System.out.println("List after sorting:\n"+studList);
	}

}
