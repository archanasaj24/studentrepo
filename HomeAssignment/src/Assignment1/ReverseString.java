package Assignment1;

public class ReverseString {

	public static void main(String[] args) {
		String s="Pune";
		int len=s.length();
		System.out.println(len);
		String reverse="";
		for(int i=len-1;i>=0;i--)
		{
			reverse=reverse+s.charAt(i);
			
		}
		System.out.print(reverse);
	}

}
