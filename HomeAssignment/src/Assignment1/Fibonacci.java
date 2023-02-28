package Assignment1;

public class Fibonacci 
{
	public static void main(String args[])
	{
		int fibo=0;
		int t1=0,t2=1;
		System.out.print(+t1+" "+t2);
		//fibo=t1+t2;
		  for(int i=1;i<=10;i++)
		  {
			  fibo=t1+t2;
			   System.out.print(" "+fibo);
			   t1=t2;
			   t2=fibo;
			  
			   
		   }
	}
   
   
}
