package c_Map.b_LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class g_LinkedHashMap {
	public static void main(String[] args) {
		// LinkedHashMap :
		//	a. Extends HashMap class and Implements Map Interface
		//	b. Same features as HashMap except it maintains Insertion order.
		//		Insertion Order: It stores the value in a NODE (DOUBLY LINKED LIST)
		
		// Topcasting | Child class object is being referred by Parent Interface reference variable 
		Map<String, Integer> map = new LinkedHashMap<>();	
		map.put("Tom", 100);
		map.put("Naveen", 200);
		map.put("Steve",300);
		map.put("Lisa", 400);
		map.put(null, 500);
		
		map.get("Tom");	// 100
		System.out.println(map);
		
	}
}
