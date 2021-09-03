package b_List.a_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;


public class g_RemoveDuplicateElements {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7);
		ArrayList<Integer> arrayList = new ArrayList<Integer>(list);

		// Two ways to remove duplicate elements from ArrayList:
		// a. Using LinkedHashSet
		// b. Using JDK8 Streams

		// ------------ Method #1: LINKEDHASHSET ---------------------------------
		// Since LinkedHashSet is part of Set family, it doesn't accept duplicates
		// Create an Object of LinkedHashSet and pass the Arraylist Object which has duplicates
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(arrayList);
		//	passing arrayLlist object to linkedHasSet object will remove all duplicates and maintain only unique values
		// Create another Arraylist object and pass the linkedHashSet object.
		ArrayList<Integer> arrayListWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		System.out.println(arrayListWithoutDuplicates); // O/p: [1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		Iterator<Integer> iterator = arrayListWithoutDuplicates.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		
		// ----------- Method #2: JDK8 STREAMS -----------------------------------
		ArrayList<Integer> arrayList2=new ArrayList<Integer>(Arrays.asList(1, 2, 3, 2, 2, 3, 1, 4, 5, 6, 1, 7, 8, 9, 7));	// Create an Arraylist obj and add data
		List<Integer> list2 = arrayList2.stream().distinct().collect(Collectors.toList());
		System.out.println(list2); // O/p: [1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		Iterator<Integer> iterator2 = list2.iterator();
		while (iterator2.hasNext()) {
			Integer integer = (Integer) iterator2.next();
			System.out.println(integer);
		}
		
	}

}
