package Java_Conditional_Statements;

public class JavaElseIfConditionalStatementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int age = 2;
if(age == 18)
{
	System.out.println(" congrats from this year u r eleigible for voting");
}
else if(age>18)
{
	System.out.println(" you are aleady eligible for voting");
}
else if(age<18)
{
	System.out.println(" you are not  eligible for voting");
}
else
{
	System.out.println("please recheck the value of age");
}

	}
}
