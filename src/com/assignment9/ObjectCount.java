package com.assignment9;

class Student
{
	int rollNo;
	String name;
	String division;
	static int count=0;//count the number of object
	public Student(int rollNo, String name, String division)//constructor to create object
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.division = division;
		count++;//increase counter
	}
	
}
public class ObjectCount
{    
	public static void main(String[] args) 
	{
		//number of object created
		Student student1=new Student(1,"Raj","A");
		Student student2=new Student(2,"Ajit","B");
		Student student3=new Student(3,"Geeta","C");
		System.out.println("Number of object created: "+Student.count);//display number of objects created
	}

}
