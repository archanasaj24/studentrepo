package Assignment1;
import java.util.Scanner;
import java.lang.Math;
public class Armstrong {
	
	  public static void main(String args[])
	{     
	Scanner scanner=new Scanner(System.in);
	     System.out.println("Enter number:");
	     int number=scanner.nextInt();
	      int temp=number;
	      int no=number;
	     int last=0,sum=0,digit=0;
	      while(temp!=0)//153//15//1
	     {
	    	 temp=temp/10;//15//1//0
	    	 digit++;//1//2//3
	     }
	     System.out.println("digit "+digit);//3
	     System.out.println("value of temp "+temp);
	     while(no>0)//(n!=0)
	{
	    last=no%10;//153=3//15=5//1
	     sum+=Math.pow(last,digit);//(3,3)=27  //(5,3)=125//(1,3)=1//27+125+1=153
	    no=no/10;//15//1//0
	     
	}
	     System.out.println("Result: "+sum);
	if(number==sum)
	{
	 System.out.println("number is Armstring");
	}
	else
	{
	System.out.println("number not Armstring");
	}
	     
	}
	  
	

}
