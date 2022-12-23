package Java_Type_Conversion;

public class JavaNarrowingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float marksindecimals = 12.45f;
		System.out.println("marksindecimals :: "+marksindecimals);
		short marksinwholenumbers = (short)marksindecimals;
		System.out.println("marksinwholenumbers :: "+marksinwholenumbers);
	}

}
