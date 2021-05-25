package javaPractice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al = new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("A");
		al.add("b");
		al.add("c");
		
		ArrayList bl = new ArrayList();
		bl.add("i");
		bl.add("y");
		bl.add("p");
		bl.add("n");
		bl.add("r");
		bl.add("s");
		
		
		
		ArrayList al_dup = new ArrayList();
		al_dup.addAll(al);
		al_dup.addAll(bl);
		System.out.println(al_dup);
		System.out.println("============");
		
		//al_dup.removeAll(al);
		
		System.out.println(al_dup);
		
		Collections.sort(al_dup);
		System.out.println(al_dup);
		
		Collections.sort(al_dup,Collections.reverseOrder() );
		System.out.println(al_dup);
		
		Collections.shuffle(al_dup);
		System.out.println(al_dup);
	}

}
