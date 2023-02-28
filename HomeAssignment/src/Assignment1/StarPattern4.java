package Assignment1;

public class StarPattern4 {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)//row
		  {
			  for(int j=5;j>=i;j--)
			  {
				  System.out.print("#");
			  }
			  for(int j=0;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			  for(int j=1;j<=i;j++)
			  {System.out.print("*");
			  
			  }
			  
			 System.out.println(); 
		  }
         
	}

}
