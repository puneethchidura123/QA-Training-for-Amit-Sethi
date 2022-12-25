package Java_Conditional_Statements;

public class JavaSwitchConditianalStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char gender = 'g';
		switch(gender)
		{
		case 'm':
			System.out.println("male");
			break;
		case 'f':
			System.out.println("fe male");
			break;
		case 't':
			System.out.println("trans gender");
			break;
			default:
				System.out.println("entered input is invalid");
		}
		
	}

}
