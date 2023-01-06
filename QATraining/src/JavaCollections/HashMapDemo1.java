package JavaCollections;

import java.util.HashMap;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap hm = new HashMap();
		hm.put("first name ","amit");
		hm.put("last name ","sethi");
		hm.put("is currently in india",false);
		
		System.out.println(hm);
		
		System.out.println(hm.get("first name "));
	}

}
