package com.assignment3;

public class Student 
{
     public String getStudentName(String name)
     {
       	 return name;
     }
     public static void main(String args[])
     {
    	 Student student=new Student();
    	 String name=student.getStudentName("Reva");
    	 System.out.println("Student name: "+name);
     }
}
