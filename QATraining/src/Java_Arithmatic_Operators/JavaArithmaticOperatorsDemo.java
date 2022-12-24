package Java_Arithmatic_Operators;

public class JavaArithmaticOperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int variable1 = 10,variable2 = 20;
		
		//additon
		int addition_result = variable1+variable2;
		System.out.println("addition_result :: "+ addition_result);
		
		//subtraction
		int substraction_result  = variable1-variable2;
		System.out.println("substraction_result :: "+ substraction_result);
		
		//multiplication
		int multiplication_result = variable1*variable2;
		System.out.println("multiplication_result :: "+ multiplication_result);
		
		//division
		int division_result = variable2/variable1;
		System.out.println("division_result :: "+division_result);
		
		//modulus
		int modulus_result = variable1%variable2;
		System.out.println("modulus_result :: "+modulus_result);
		
		//increment
		System.out.println("increment_result :: "+   ++variable1);
		//System.out.println("increment_result second time:: "+variable1);
		
		
		//decrement 
		System.out.println("decrement result :: "+ variable2--);
	}

}
