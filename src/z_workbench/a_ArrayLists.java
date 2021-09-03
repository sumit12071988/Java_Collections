package z_workbench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 
 * @author SumitSaha
 * REMOVE DUPLICATES FROM TWO ARRAYLIST

 *
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
public class a_ArrayLists {
	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>(Arrays.asList("f","b","e","d","c","a"));
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList("b","c","a"));
		
		//removeDuplicatesFromArrayLists(al1, al2);
		keepUniquesInArrayLists(al1, al2);
		
	}

	
// -------------------------------------------------------------------------------------- //	
	/**
	 * REMOVE DUPLICATES FROM TWO ARRAYLISTS
	 * 
	 * Solution: 
	 * 1. Sort the ArrayLists
	 * 2. Find the count to check which one is bigger ArrayList
	 * 3. Remove elements from Bigger ArrayList using smaller ArrayList
	 */
	public static void removeDuplicatesFromArrayLists(ArrayList al1,ArrayList al2) {
		Collections.sort(al1);
		Collections.sort(al2);
		if (al1.size() > al2.size()) {
			al1.removeAll(al2);
		}else {
			al2.removeAll(al1);
		}
		System.out.println("Unique in 1st ArrayList: "+al1);
		System.out.println("Unique in 2nd ArrayList: "+al2);
	}
// --------------------------------------------------------------------------------------- //	
	/**
	 * KEEP COMMON ELEMENTS IN ARRAYLISTS
	 * Solution:
	 * 1. Sort ArrayLists
	 * 2. Find out which ArrayList has more Elements
	 * 3. User retainAll() to retain only the common elements from other ArrayList
	 */
	public static void keepUniquesInArrayLists(ArrayList al1, ArrayList al2) {
		Collections.sort(al1);
		Collections.sort(al2);
		if (al1.size()>al2.size()) {
			al1.retainAll(al2);
		}else {
			al2.retainAll(al1);
		}
		
		System.out.println("Common elements in 1st ArrayList: "+al1);
		System.out.println("Common elements in 2nd ArrayList: "+al2);
	}

}
