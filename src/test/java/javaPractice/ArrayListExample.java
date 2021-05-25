package javaPractice;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creating a simple array
		ArrayList al = new ArrayList();
		al.add("Mango");
		al.add("Chiku");
		al.add("Peru");
		al.add("Apple");
		al.add("Litchi");
		System.out.println(al);
		System.out.println("==================");
		
		//Using a Iterator
		Iterator i = al.iterator();
		while (i.hasNext()) {
			Object values = (Object) i.next();
			System.out.println(values);
			
		}
		System.out.println("==================");
		
		//Using ForEach Loop
		for (Object v1 : al) {
			System.out.println(v1);
		}
		System.out.println("==================");
		
		
		//Using get & set
		//Getting
		System.out.println(al.get(1));
		System.out.println(al);
		//Setting - Replaces the element
		al.set(1, "Kiwi");
		System.out.println(al);
		System.out.println("==================");
		
		//Sorting List
		Collections.sort(al);
		System.out.println(al);
		System.out.println("==================");
		
		
	}

}
