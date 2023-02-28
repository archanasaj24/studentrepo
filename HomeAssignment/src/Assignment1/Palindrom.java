package Assignment1;

public class Palindrom 
{
    public static void main(String args[])
    {
    	int number;
    	number=121;
    	int temp,remd,sum=0;
    	temp=number;//125
    	while(number>0)
    	{
    		remd=number%10;//125%10=5 remd=5  12%10==2 1%10=1
    		sum=(sum*10)+remd;//sum=5*10+2=52*10+1 =521
    		number=number/10;// 12 12/10 1 0
    	}
    	if(temp==sum)
    	{
    		System.out.println("Number is palindrom");
    	}
    	else
    	{
    		System.out.println("Number is not Palindrom");
    	}
    }
}
