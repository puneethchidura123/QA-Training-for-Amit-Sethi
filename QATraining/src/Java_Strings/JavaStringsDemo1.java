package Java_Strings;

public class JavaStringsDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// <data type> <variable name> = <value>;
		
		String my_name = "amit sethi";
		int lengthofmyname = my_name.length();
		System.out.println(lengthofmyname);
		
		System.out.println("my name converted to upper case is :: "+my_name.toUpperCase());
		String my_name_uppercase = my_name.toUpperCase();
		System.out.println("my name converted back to lower case is :: "+my_name_uppercase.toLowerCase());
		
		System.out.println("index of letter i is :: "+my_name.indexOf('i'));;
		
	}

}
