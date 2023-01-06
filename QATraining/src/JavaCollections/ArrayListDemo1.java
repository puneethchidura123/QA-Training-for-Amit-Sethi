package JavaCollections;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("Amit");
		al.add("Sethi");
		al.add(342.098);
		al.add(true);
		al.add('a');
		
		System.out.println(al);
		System.out.println(al.size());
		
		System.out.println(al.get(0));
		
		al.remove(0);
		
		System.out.println(al);
		
		System.out.println(al.size());
	}

}
