package Assignment1;

public class Constructor2 {
    private int rollno;
    private String name;
    private String subject;
    
    Constructor2(int rno,String nm,String sub)
    {
    	rollno=rno;
    	name=nm;
    	subject=sub;
    }
    
	public static void main(String[] args) {
		Constructor2 constructor=new Constructor2(2,"Ram","Maths");
		System.out.println(constructor.rollno);
		System.out.println(constructor.name);
		System.out.println(constructor.subject);
	}

}
