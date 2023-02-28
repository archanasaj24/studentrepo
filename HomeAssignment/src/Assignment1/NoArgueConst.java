package Assignment1;

public class NoArgueConst 
{
     public int rollno;
     public String name;
     
     NoArgueConst()
     {
    	 rollno=1;
    	 name="Arpit";
        }
     public static void main(String args[])
     {
    	 NoArgueConst nac=new NoArgueConst();
         System.out.println("Rollno: "+nac.rollno);
    	 System.out.println("Nmae: "+nac.name);
     }
}
