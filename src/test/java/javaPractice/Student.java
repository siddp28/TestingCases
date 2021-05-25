package javaPractice;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails sd1 = new StudentDetails(1, "Siddhant", 30);
		StudentDetails sd2 = new StudentDetails(2, "Tanmay", 26);
		StudentDetails sd3 = new StudentDetails(3, "Mahesh", 27);
		StudentDetails sd4 = new StudentDetails(4, "Sonia", 32);
		
		ArrayList al = new ArrayList();
		al.add(sd1);
		al.add(sd2);
		al.add(sd3);
		al.add(sd4);
		
		Iterator i = al.iterator();
		while (i.hasNext()) {
			StudentDetails values = (StudentDetails) i.next();
			System.out.println(values.rollno+values.name+values.age);
		}
	}

}
