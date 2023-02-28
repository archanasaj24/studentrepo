package Assignment1;

import java.util.Scanner;

public class EmployeeInfo {
     private int empId;
     private String empName;
     private int empSalary;
     public void setEmpId(int id)
     {
    	 empId=id;
     }
     public void setEmpName(String name)
     {
    	 empName=name;
     }
     public void setEmpSalary(int salary)
     {
    	 empSalary=salary;
     }
     public int getEmpId()
     {
    	 return empId;
     }
     public String getEmpName()
     {
    	 return empName;
     }
     public int getEmpSalary()
     {
    	 return empSalary;
     }
	public static void main(String[] args)
	{
	      Scanner scanner=new Scanner(System.in);
	      
	      EmployeeInfo employeeInfo=new EmployeeInfo();
	      System.out.println("Enter id: ");
	      int id=scanner.nextInt();
	      System.out.println("Enter name: ");
	      String name=scanner.next();
	      System.out.println("Enter salary: ");
	      int salary=scanner.nextInt();
	      
	      employeeInfo.setEmpId(id);
	      employeeInfo.setEmpName(name);
	      employeeInfo.setEmpSalary(salary);
	      System.out.println("Id: "+employeeInfo.getEmpId());
	      System.out.println("Name: "+employeeInfo.getEmpName());
	      System.out.println("Salary: "+employeeInfo.getEmpSalary());
	      
	  }

}
