package Assignment1;

public class Prime 
{
	 public void getNumber(int num)
	 {
		 int flag=0;
		 for(int i=1;i<=num;i++)
		 {
			 if(num%i==0)
			 {
				 flag++;
			 }
		 }
		 if(flag==2)
		 {
			 System.out.println("Number is prime");
		 }
		 else
		 {
			 System.out.println("Number is not prime");
		 }
	 }
     public static void main(String args[])
     {
         Prime prime=new Prime();
         prime.getNumber(17);
     }
}
