package interface1;

public class Demo implements calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    calculator c=new Demo();
c.add();
c.sub();
c.mul();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int a=30,b=20;
		System.out.println(a+b);
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		int a=9,b=3;
		System.out.println(a-b);
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		int a=2,b=4;
		System.out.println(a*b);
	}

}
