package JavaCollections;

import java.util.HashSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashSet hs = new HashSet();
		hs.add("Amit");
		hs.add("Sethi");
		hs.add(342.098);
		hs.add(true);
		hs.add('a');
		
		System.out.println(hs);
		
		System.out.println("size of hash set is :: "+hs.size());
		hs.add("Amit");
		System.out.println(hs);
		
		
		
		
	}

}
