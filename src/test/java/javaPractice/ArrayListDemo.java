package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> il = new <Integer>ArrayList(); // Homogeneous data - integer
		ArrayList<String> sl = new <String>ArrayList(); // Homogeneous data - string
		// Parent can follow child
		List l = new ArrayList();
		ArrayList al = new ArrayList(); // hetrogeneous data
		// add new elements to Arraylist
		al.add(100);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println(al);
		// Size
		System.out.println(al.size());
		// remove
		al.remove(1);
		al.remove("Welcome");
		System.out.println(al);

		// Adding new element
		al.add(2, "Pyhton");
		System.out.println(al);

		// retrieve specific element
		System.out.println(al.get(2));

		// Change/Replace
		al.set(2, "C#");
		System.out.println(al);

		// Search Contains
		System.out.println(al.contains("C#"));

		// Is Empty
		System.out.println(al.isEmpty());

		// Read all Datas
		// Using for loop
		for (int i = 0; i < al.size(); i++) {

			System.out.println(al.get(i));
		}
		System.out.println("==================");

		for (Object e : al) {
			System.out.println(e);
		}
		System.out.println("==================");
		
		//Reading elements using Iterator
		Iterator i = al.iterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			System.out.println(object);
		}
	}

}
