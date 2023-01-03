package Inheritance;

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParentClass Ramesh = new ParentClass();
		ChildClass Amit = new ChildClass();
		
		System.out.println("Ramesh.FirstName :: "+Ramesh.FirstName);
		System.out.println("Ramesh.LastName :: "+Ramesh.LastName);
		
		
		System.out.println("Amit.FirstName :: "+Amit.FirstName);
		System.out.println("Amit.LastName :: "+Amit.LastName);
	}

}
