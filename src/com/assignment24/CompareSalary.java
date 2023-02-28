package com.assignment24;

import java.util.Comparator;

public class CompareSalary implements Comparator<Student>
{
     public int compare(Student stud1,Student stud2)
     {
    	 if(stud1.studSalary>stud2.studSalary)
    		 return 1;
    	 else if(stud1.studSalary<stud2.studSalary)
    		 return -1;
    	 return 0;
    	
    				 
     }
}
