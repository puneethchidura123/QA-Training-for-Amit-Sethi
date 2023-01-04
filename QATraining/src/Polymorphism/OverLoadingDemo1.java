package Polymorphism;

public class OverLoadingDemo1 {

	
	
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverLoadingDemo1 old1 = new OverLoadingDemo1();
		old1.add(1, 2);
		old1.add(1, 2,3);
	}

}
