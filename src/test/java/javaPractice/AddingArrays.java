package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class AddingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al1 = new ArrayList();
		al1.add("Siddhant");
		al1.add("Mandar");
		al1.add("Nikhil");
		al1.add("Sanman");
		System.out.println(al1);
		System.out.println("=========");

		ArrayList al2 = new ArrayList();
		al2.add("Tanmay");
		al2.add("Mahesh");
		al2.add("Vishal");
		System.out.println(al2);
		System.out.println("=========");
		// Adding 2nd Array to 1st.

		al1.addAll(al2);
		System.out.println(al1);
		System.out.println("=========");

		ArrayList al3 = new ArrayList();
		al3.add("Sonia");
		al3.add("Mukull");

		// Adding 3rd array to 1st at specific position
		al1.addAll(3, al3);
		System.out.println(al1);
		System.out.println("=========");

		// Removing 2nd from 1st
		al1.removeAll(al2);
		System.out.println(al1);
		System.out.println("=========");
		
		//Retain all
		System.out.println(al1.retainAll(al3));
		Iterator i1 = al1.iterator();
		while (i1.hasNext()) {
			Object o1 = (Object) i1.next();
			System.out.println(o1);
		}
		 
	}

}
