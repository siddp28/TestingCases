package javaPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String animals[] = { "Lion", "Tiger", "Cat" , "Dog"};
		for (String value : animals) {
			System.out.println(value);
		}
		
		//Converting array to ArrayList
		ArrayList ar =new ArrayList(Arrays.asList(animals));
		System.out.println(ar);
	}

}
