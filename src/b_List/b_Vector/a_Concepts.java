package b_List.b_Vector;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class a_Concepts {

	public static void main(String[] args) {
		
		Vector<Integer> v1 = new Vector<Integer>();
		
		// -------- INSERT DATA IN VECTOR  |.add(data) --------------
		v1.add(2);
		v1.add(4);
		v1.add(6);
		v1.add(8);
		v1.add(10);
		v1.add(12);
		v1.add(14);
		v1.add(16);
		
		Vector<Integer> v2 = new Vector<Integer>();
		v2.add(10);
		v2.add(11);
		
		System.out.println(v1); // [2, 4, 6, 8, 10, 12, 14, 16]
		System.out.println(v2); // [10, 11]
		
		// -------- RETRIEVE DATA FROM VECTOR  |.get(index) --------------
//		v1.get(2); 				// 6
		
		// -------- DELETE DATA FROM VECTOR  |.remove(index) --------------
//		v1.remove(3); 			// removes data 8
//		System.out.println(v1); // [2, 4, 6, 10, 12, 14, 16]
		
		// -------- SORT DATA INSIDE VECTOR -----------
		Collections.sort(v1);
		Collections.sort(v2);
		
		// -------- ADD ONE VECTOR LIST TO ANOTHER VECTOR LIST
		v1.addAll(v2); 			// v1 to add all v2 elements at the end of v1 elements
		System.out.println(v1); // [2, 4, 6, 8, 10, 12, 14, 16, 10, 11]
		
		// -------- TRAVERSE INSIDE VECTOR | ITERATION --------------------
				// ------ METHOD #1: FOR LOOP -----------
				for(int i =0; i<v1.size(); i++) {
					System.out.println("Element picked using for loop: "+v1.get(i));
					// O/p:
					//	Element picked using for loop: 2
					//	Element picked using for loop: 4
					//	Element picked using for loop: 6
					//	Element picked using for loop: 8
					//	Element picked using for loop: 10
					//	Element picked using for loop: 12
					//	Element picked using for loop: 14
					//	Element picked using for loop: 16
					//	Element picked using for loop: 10
					//	Element picked using for loop: 11
				}				
				
				// ------ METHOD #2: FOREACH LOOP -------
				for (Integer integer : v1) {
					System.out.println("Element picked using forEach Loop: "+integer);
					// O/p:
					//	Element picked using forEach Loop: 2
					//	Element picked using forEach Loop: 4
					//	Element picked using forEach Loop: 6
					//	Element picked using forEach Loop: 8
					//	Element picked using forEach Loop: 10
					//	Element picked using forEach Loop: 12
					//	Element picked using forEach Loop: 14
					//	Element picked using forEach Loop: 16
					//	Element picked using forEach Loop: 10
					//	Element picked using forEach Loop: 11
				}
				
				// ------ METHOD #3: ITERATOR -------		
				Iterator<Integer> iterator = v1.iterator();
				while(iterator.hasNext()) {
					System.out.println("Element picked using iterator: "+iterator.next());
					//	O/p:
					//	Element picked using iterator: 2
					//	Element picked using iterator: 4
					//	Element picked using iterator: 6
					//	Element picked using iterator: 8
					//	Element picked using iterator: 10
					//	Element picked using iterator: 12
					//	Element picked using iterator: 14
					//	Element picked using iterator: 16
					//	Element picked using iterator: 10
					//	Element picked using iterator: 11
				}
				
		
		
	}

}
