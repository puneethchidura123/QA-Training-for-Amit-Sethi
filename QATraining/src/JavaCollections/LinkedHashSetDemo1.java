package JavaCollections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Amit");
		lhs.add("Sethi");
		lhs.add(342.098);
		lhs.add(true);
		lhs.add('a');
		
		System.out.println(lhs);
		
		lhs.add("Amit");
	}

}
