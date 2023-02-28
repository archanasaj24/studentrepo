package Assignment1;

public class RecursiveFact
{
	public int recursive(int num)
	{
		int fact=1;
		if(num==1)
			return 1;
		else
		{
			fact=num*recursive(num-1);//5*4! 
			//fact=num*num-1;// 5*4
		}
		return fact;
	}
    public static void main(String args[])
    {
    	RecursiveFact recursiveFact=new RecursiveFact();
    	System.out.println(recursiveFact.recursive(3));
    	/*for(int i=1;i<5;i++)
    	{
    		System.out.println("Main method");
        	RecursiveFact.main(null);
    	}*/
    	
        
    }
}
