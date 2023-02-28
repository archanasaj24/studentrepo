package Assignment1;

public class Example1
{
  int x;
  int changThem(int a,int b)
  {
	  a=10;
	  b=20;
	  return b;
  }
  
  public static void main(String args[])
  {
	  Example1 e=new Example1();
	  
	  int x=100,y=200;
	  y=e.changThem(x, y);
	  System.out.println(x+" "+y);
  }
}
