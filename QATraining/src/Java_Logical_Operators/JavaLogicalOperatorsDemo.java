package Java_Logical_Operators;

public class JavaLogicalOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		boolean b1 = 12>3 ; //true
		boolean b2 = 12<=3; // false
		
		System.out.println(" logical AND :: ");
		System.out.println(b1&&b2);
		
		System.out.println(" logical OR :: ");
		System.out.println(b1||b2);
		
		System.out.println(" logical NOT :: ");
		System.out.println(!b1);
		
		
		System.out.println(" below is the o/p  for (b1&&b2)||(!b1) ");
		System.out.println((b1&&b2)||(!b1));
		
		
	}

}
