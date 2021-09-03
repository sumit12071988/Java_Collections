package c_Map.d_TreeMap;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class a_Concepts {

	public static void main(String[] args) {
		
		// -------------- SORTING IN ASCENDING ORDER --------------------------
		TreeMap<Integer, String> map1 =new TreeMap<>();
		map1.put(1000, "Tom");
		map1.put(2000, "Peter");
		map1.put(3000, "Steve");
		map1.put(11000, "Naveen");
		map1.put(1400, "Robby");
		
		// TreeMap will maintain K-V pairs in sorted order by KEYS.
		System.out.println(map1); 	// {1000=Tom, 1400=Robby, 2000=Peter, 3000=Steve, 11000=Naveen}
			
		// Traverse using Lambda expression
//		map1.forEach((k,v) -> System.out.println("Key : "+k+" | Value: "+v));
		//	Key : 1000 | Value: Tom
		//	Key : 1400 | Value: Robby
		//	Key : 2000 | Value: Peter
		//	Key : 3000 | Value: Steve
		//	Key : 11000 | Value: Naveen

//		System.out.println(map.lastKey()); 		// 11000
//		System.out.println(map.firstEntry());	// 1000
		
		// -------------- SORTING IN DESCENDING ORDER --------------------------
		TreeMap<Integer, String> map2 =new TreeMap<>(Comparator.reverseOrder());
		map2.put(1000, "Tom");
		map2.put(2000, "Peter");
		map2.put(3000, "Steve");
		map2.put(11000, "Naveen");
		map2.put(1400, "Robby");
		
		System.out.println(map2); // {11000=Naveen, 3000=Steve, 2000=Peter, 1400=Robby, 1000=Tom}

		
// ============================================================================================================= //
// ============================================================================================================= //
		
		// --------- TO GET FEW K-V PAIRS FROM START OF TREEMAP -----------------------
			// ----------- To find all those Employees with Salary < 3000 -------------
			// map.headMap(toKey)	// Returns a portion of the map(i.e. K-V pairs) whose keys are less than toKey
		SortedMap<Integer, String> sortedmap = map1.headMap(3000);	// {1000=Tom, 1400=Robby, 2000=Peter}
		Set<Integer> keysLessThan3K = sortedmap.keySet();
		
		System.out.println(keysLessThan3K);		// [1000, 1400, 2000]
		
		
		// --------- TO GET FEW K-V PAIRS FROM END OF TREEMAP -----------------------		
		// ----------- To find all those Employees with Salary > 3000 -------------
		// map.tailMap(fromKey);	// Returns a view of the portion of this map whose keys are greater than or equal to fromKey
		SortedMap<Integer, String> sortedMap2 = map1.tailMap(10000);
		Set<Integer> keysMoreThan3K = sortedMap2.keySet();
//		System.out.println(keysMoreThan3K); 	// [11000]		

		
		TreeMap<String, Integer> userMap = new TreeMap<>();
		userMap.put("James", 100);
		userMap.put("Brad", 200);
		userMap.put("Albert", 400);
		userMap.put("George", 50);
		userMap.put("Larry", 900);
		userMap.put("Ted", 120);
		userMap.put("Paul", 300);
		
		// Sorted based on Key i.e String i.e. in Alphabetic Order
		System.out.println(userMap);	// {Albert=400, Brad=200, George=50, James=100, Larry=900, Paul=300, Ted=120}
		userMap.forEach((k,v) -> System.out.println("Key is: "+k+" | Value: "+v));
		//	Key is: Albert | Value: 400
		//	Key is: Brad | Value: 200
		//	Key is: George | Value: 50
		//	Key is: James | Value: 100
		//	Key is: Larry | Value: 900
		//	Key is: Paul | Value: 300
		//	Key is: Ted | Value: 120
	}

}
