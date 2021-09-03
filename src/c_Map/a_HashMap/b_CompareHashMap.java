package c_Map.a_HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class b_CompareHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "A");
		map1.put(2, "B");
		map1.put(3, "C");
		System.out.println("map1 contents: "+map1); 		// O/p: {1=A, 2=B, 3=C}
		System.out.println("map1 keySet: "+ map1.keySet()); // O/p: [1, 2, 3]
		
		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(3, "C");
		map2.put(1, "A");
		map2.put(2, "B");
		System.out.println("map2 contents: "+map2); 		// O/p: {1=A, 2=B, 3=C}
		System.out.println("map2 keySet: "+ map2.keySet()); // O/p: [1, 2, 3]
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();	
		map3.put(1, "A");
		map3.put(2, "B");
		map3.put(3, "C");
		map3.put(3, "D");	// D overrides C as both are associated with same Key
		System.out.println("map3 contents: "+map3); 		// O/p: {1=A, 2=B, 3=C}
		System.out.println("map3 keySet: "+ map3.keySet()); // O/p: [1, 2, 3]
		
		boolean flag;
		
		// -------------- COMPARING HASHMAPS | .equals --------------------
		flag = map1.equals(map2);
		System.out.println("KEY-VALUE pair comparision result for map1: "+flag);	// O/p: true
		
		flag = map1.equals(map3);
		System.out.println("KEY-VALUE pair comparision result for map2: "+flag); 	// O/p: false
		
		// ------------- COMPARE HASHMAPS FOR SAME KEYS | .keySet() -------------------
		Set<Integer> set1 = map1.keySet();	// [1,2,3]
		Set<Integer> set2 = map2.keySet();	// [1,2,3]
		Set<Integer> set3 = map3.keySet();	// [1,2,3]
		flag = set1.equals(set2);
		System.out.println("KeySet comparision result: "+flag); 				// O/p: true
		System.out.println("KeySet comparision result: "+set1.equals(set3)); 	// O/p: true
		
		// ------------- COMPARE HASHMAPS & FIND EXTRA KEYS |  -------------------
		// logic: Collect keys from both hashMaps --> save in hashSet --> remove keys of one keySet from HashSet
		HashMap<Integer, String> map4 = new HashMap<Integer, String>();	
		map4.put(1, "A");
		map4.put(2, "B");
		map4.put(3, "C");
		map4.put(4, "D");
		Set<Integer> set4 = map4.keySet();	// [1,2,3, 4]
		
		HashSet<Integer> hashSet =new HashSet<Integer>(set1);	// hashSet = [1,2,3]
		hashSet.addAll(set4); 		// hashSet = [1,2,3,4]. Duplicates from addAll will be removed since Set doesn't allow duplicates
		hashSet.removeAll(set1);	// hashSet = [4] since we're removing all elements of set1 from hashSet which is [1,2,3]
		System.out.println("Extra Key in map4 is: "+hashSet);
		
		// ------------- COMPARE HASHMAPS BY VALUES  | DUPLICATES ALLOWED | USING ARRAYLIST  ----------------
		HashMap<Integer, String> map5 = new HashMap<Integer, String>();
		map5.put(1, "A");
		map5.put(2, "B");
		map5.put(3, "C");
		System.out.println(map5.keySet());	// [1, 2, 3]
		System.out.println(map5.values());	// [A, B, C]
		
		HashMap<Integer, String> map6 = new HashMap<Integer, String>();
		map6.put(4, "A");
		map6.put(5, "B");
		map6.put(6, "C");
		System.out.println(map6.keySet());	// [4, 5, 6]
		System.out.println(map6.values());	// [A, B, C]
		
		HashMap<Integer, String> map7 = new HashMap<Integer, String>();	
		map7.put(1, "A");
		map7.put(2, "B");
		map7.put(3, "C");
		map7.put(4, "C");
		System.out.println(map7); 			// {1=A, 2=B, 3=C, 4=C}
		System.out.println(map7.keySet());	// [1, 2, 3, 4]
		System.out.println(map7.values());	// [A, B, C, C]
		
		Collection<String> collection1 = map5.values();	// [A,B,C]
		Collection<String> collection2 = map6.values();	// [A,B,C]
		Collection<String> collection3 = map7.values();	// [A,B,C,C]
		
		ArrayList<String> ar1 = new ArrayList<String>(collection1);	// [A,B,C]
		ArrayList<String> ar2 = new ArrayList<String>(collection2);	// [A,B,C]
		ArrayList<String> ar3 = new ArrayList<String>(collection3);	// [A,B,C,C]
		
		HashSet<String> hashSet1 = new HashSet<String>(collection1);// [A,B,C]
		HashSet<String> hashSet2 = new HashSet<String>(collection2);// [A,B,C]
		HashSet<String> hashSet3 = new HashSet<String>(collection2);// [A,B,C]
		
		flag = ar1.equals(ar2);		// true
		System.out.println("Arraylist Checking value comparision result: "+flag);		
		
		flag = ar1.equals(ar3);		// false
		System.out.println("Arraylist Checking value comparision result: "+flag);
		
		// ------------- COMPARE HASHMAPS BY VALUES  | DUPLICATES NOT ALLOWED | USING HASHSET  ----------------
		
		flag = hashSet1.equals(hashSet3);	// true
		System.out.println("HashSet Checking value comparision result: "+flag);	
		
	}
}
