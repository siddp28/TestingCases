package javaPractice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap <Integer, String> hm = new HashMap  <Integer, String>();
		
		hm.put(101, "John");
		hm.put(102, "David");
		hm.put(103, "Tim");
		hm.put(104, "Marry");
		hm.put(105, "Marsh");
		hm.put(103, "Tim pain");

		hm.remove(103);
		System.out.println(hm);
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsValue("Marry"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.entrySet());
		
		for (Object o : hm.keySet()) {
			System.out.println(o);
		}
		
		for (Object v : hm.values()) {
			System.out.println(v);
		}
		
		for (Object o : hm.keySet()) {
			System.out.println(o + "--"+ hm.get(o));
		}
		
		for (Map.Entry entry :  hm.entrySet()) {
			System.out.println(entry.getKey()+"=="+ entry.getValue());
		}
		
		Set s = hm.entrySet();
		Iterator i1 = s.iterator();
		while (i1.hasNext()) {
			Map.Entry e = (Entry) i1.next();
			System.out.println(e.getKey()+"==="+e.getValue());
			
		}
	}

}
