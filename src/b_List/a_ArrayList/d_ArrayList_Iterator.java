package b_List.a_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class d_ArrayList_Iterator {

	public static void main(String[] args) {
		
		// Create an ArrayList of Strings TYPE
		ArrayList<String> arrayList = new ArrayList<String>();
		
		// ADDING DATA IN ARRAYLIST	 	INDEX
		arrayList.add("Naveen");		//0
		arrayList.add("Tom");			//1
		arrayList.add("Steve");			//2
		arrayList.add("Lisa");			//3
		//------------------------------------------------------------------------------------//		
		// CREATING ARRAYLIST OBJECT AND ADDING DATA AT SAME TIME
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		System.out.println("Contents of Integer ArrayList: "+arrayList2); 			// O/p: [10, 20, 30, 40]
		ArrayList<String> arrayList3 = new ArrayList<String>(Arrays.asList("Java","JS","Python",".NET"));
		System.out.println("Contents of String ArrayList: "+arrayList3); 			// O/p: [Java, JS, Python, .NET]
		System.out.println("String ArrayList Size: "+arrayList3.size()); 			// O/p: 4		
		
		// -------------------------------------------------------------------------------------
		// ------------------- TRAVERSING INSIDE ARRAYLIST -------------------------------------
		// -------------------------------------------------------------------------------------		
		//	#1. USING FOR LOOP
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			//O/p: Naveen, Tom, Steve, Liza
		}
		//------------------------------------------------------------------------------------//		
		//	#2: USING FOR EACH LOOP
		for (String string : arrayList) {					//O/p: Naveen, Tom, Steve, Liza
			System.out.println(string);
		}
		//------------------------------------------------------------------------------------//
		//	#3: USING STREAMS WITH LANBDA FUNCTION "->"
		//		LAMBDA functions are introduced in JDK 1.8 onwards
		arrayList.stream().forEach(element -> System.out.println(element));		//O/p: Naveen, Tom, Steve, Liza
			// arrayList.stream()	-->	will return elements in the collection "arrayList" in a Sequential streams 
			// forEach(element -> <Do some activity with that element>)	
			// forEach(element)	--> we get one element at a time.
			// Lambda "->" 		--> function used to specify what ACTION we need to do with that element
			
			//	Thus arrayListObject.stream().forEach(ele -> <Action>) will use Collection to:
			//		1. pick one element at a time 
			//		2. perform some action on it
		//------------------------------------------------------------------------------------//		
		//	#4: USING ITERATOR
		Iterator<String> iterator = arrayList.iterator();	// This will create an ITERATOR

		// create a while loop to check as long as ITERATOR HAS NEXT element, the loop continues
		while (iterator.hasNext()) {	
			String string = iterator.next();	// This returns the data from collection
			System.out.println(string); 		//O/p: Naveen, Tom, Steve, Liza
		}
	}		
}
