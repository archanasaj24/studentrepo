package Assignment1;

public class Factorial 
{
	
   public static void main(String args[])
   {
	   
	   int number;
	   number=5;
	   int fact=1;
	   for(int i=number;i>=1;i--)//4 3 2 1
	   {
		   fact=fact*i;//5*4 =20*3=60 60*2=120 120*1
	   }
	   System.out.println(fact);
   }
}
