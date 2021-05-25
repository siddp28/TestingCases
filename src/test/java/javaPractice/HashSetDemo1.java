package javaPractice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();
		//Adding
		hs.add("Welcome");
		hs.add(100);
		hs.add(null);
		hs.add(0.5);
		hs.add('A');
		hs.add(true);
		System.out.println(hs);
		
		//Remove
		hs.remove(100);
		System.out.println(hs);
		
		//Contains
		System.out.println(hs.contains("Welcome"));
		
		//isEmpty
		System.out.println(hs.isEmpty());
		
		//using foreach loop
		for (Object e : hs) {
			System.out.println(e);
		}
		System.out.println("===========");
		
		
		//Using iterator
		Iterator i = hs.iterator();
		while (i.hasNext()) {
			Object value = (Object) i.next();
			System.out.println(value);
		}
		
		
	}

}
