package b_List.a_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class h_CompareArrayLists {
	public static void main(String[] args) {
		ArrayList<String> al1  = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> al2  = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> al3  = new ArrayList<String>(Arrays.asList("D","C","B","A","E"));
		
		
		// -------- COMPARING ARRAYLISTS | .sort + .equals ---------------		
		// Sorts the data inside ArrayList
		Collections.sort(al1);		// O/p: [A, B, C, D, F]
		Collections.sort(al2);		// O/p: [A, B, C, D, E]
		Collections.sort(al3);		// O/p: [A, B, C, D, E]
		
		// Compare both ArrayLists using .equals
		boolean flag =al1.equals(al2);
		System.out.println(flag); 	// O/p : false since elements in both ArrayLists al1 and al2 are not same
		
		boolean flag1 =al2.equals(al3);
		System.out.println(flag1); 	// O/p : true since elements in both ArrayLists al2 and al3 are the same
									// O/p : false if the data is not Sorted before Comparison
		
		
		// -------- FINDING OUT ADDITIONAL ELEMENT IN ONE ARRAYLIST COMPARED TO ANOTHER ---------------
		// 2. Compare two lists - find out additional element
		ArrayList<String> al4  = new ArrayList<String>(Arrays.asList("A","B","C","D","F","G","H"));
		ArrayList<String> al5  = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		al4.removeAll(al5); // al4 to removeAll al5 elements from its list
							// This It will pick one element at a time from al5 and check if found in al4.
							//	If found then that element is removed from al4.
		System.out.println(al4); // O/p: [F,G,H]
		
		// -------- FINDING OUT MISSING ELEMENT IN ONE ARRAYLIST COMPARED TO ANOTHER ---------------
		ArrayList<String> al6  = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> al7  = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		al7.removeAll(al6); // this removes A,B,C,D from al7
		System.out.println(al7); // O/p: [E]
		
		// -------- FINDING OUT COMMON ELEMENTS IN TWO ARRAYLISTS ---------------
		ArrayList<String> lang1  = new ArrayList<String>(Arrays.asList("java","javaScript","python","ruby","c#"));
		ArrayList<String> lang2  = new ArrayList<String>(Arrays.asList("java","javaScript","php","ruby","c#"));
		lang1.retainAll(lang2);	// Lang1 to retain all data found in lang2 and removes those which are not found in lang2
		System.out.println(lang1); // O/p [java, javaScript, ruby, c#]
	}

	
}
