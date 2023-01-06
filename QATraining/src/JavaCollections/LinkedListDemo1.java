package JavaCollections;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList ll = new LinkedList();
		ll.add("Amit");
		ll.add("Sethi");
		ll.add(342.098);
		ll.add(true);
		ll.add('a');
		
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.add("abz"));
		System.out.println(ll.remove(2));
		System.out.println(ll);
		
		System.out.println(ll.remove(ll.size()-1));  // abz
		System.out.println(ll);
		
		
	}

}
