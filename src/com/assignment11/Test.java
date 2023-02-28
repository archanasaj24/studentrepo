//I have student class now user restricts to create the object of that class from outside, write the code for it.
package com.assignment11;

class Student
{
	private Student()//private constructor restrict to create object
	{
		
	}
}
public class Test {

	public static void main(String[] args) {
		Student student=new Student();//constructor Student is private so error occur

	}

}
