package b_List.c_LinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class b_Methods {

	public static void main(String[] args) {
		// Its a Default class in Java
		// Dynamic Collection
		// Can be used as List, Stack and Queue since it implements List, Queue and Stack interfaces
		// It allows null and duplicate values
		// Insertion and Deletion can be done easily
		// Not Synchronized/ Thread-safe
		// Data manipulation (inserting a node in between two nodes) is fast as we don't need shifting.
		//		we can add new node by pointing "next" pointer of previous node to this node and pointing 
		//		the "next" pointer of current node to next node
		
		// Two constructors:
		// 1. LinkedList();				--> Deafult Constructor
		// 2. LinkedList(Collection c)	--> Parameterized Constructor
		
		// Creating Linked List object without Addind Data
		LinkedList<String> ll1 =new LinkedList<>();
		
		// Creating Linked List object + Add Data at same time
		LinkedList<String> ll2 =new LinkedList<>(Arrays.asList("Peter","Trump"));
		LinkedList<String> ll3 =new LinkedList<>(Arrays.asList("java","javaScript", "python", "ruby"));

		
		// --- COUNT ELEMENTS ----------------------------------
		ll1.size();								// 0

		// --- ADD ELEMENTS ----------------------------------
		ll1.add("Tom");							// Index: 0
		ll1.add("Naveen");						// Index: 1
		ll1.add("Robby");						// Index: 2
		ll1.add("Lisa");						// Index: 3
		System.out.println(ll1);				// [Tom, Naveen, Robby, Lisa]
		ll1.addFirst("Sumit");					// Index: 0, Tom's new Index = 1
		ll1.addLast("Saha");					// Index: 5
		ll1.add(1, "Kumar");					// Index: 1 --> This will shift other elements in next indices.
		System.out.println(ll1); 				// [Sumit, Kumar, Tom, Naveen, Robby, Lisa, Saha]
		ll1.size();								// 7
	
		ll1.addAll(ll2);						// Adds elements of ll2 inside ll1 at the end
		System.out.println(ll1); 				// [Sumit, Kumar, Tom, Naveen, Robby, Lisa, Saha, Peter, Trump]
		
		// --- GET ELEMENTS ----------------------------------
		ll1.get(0);								// Tom
		ll1.get(1);								// Naveen
//		names.get(2);							// IndexOutOfBoundException
		ll1.getFirst();							// Tom
		ll1.getLast();							// Lisa
		
		// --- TRAVERSE INSIDE LINKED LIST | ----------------------------------
		//	Method #1 | Using iterator()
		Iterator<String> iterator = ll1.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();	
			System.out.println("Using iterator: "+string);			
												// Sumit	--> 1st Iteration
												// Kumar	--> 2nd Iteration
												// Tom 		--> 3rd Iteration
												// Naveen	--> 4th Iteration
												// Robby	--> 5th Iteration
												// Lisa		--> 6th Iteration
												// Saha		--> 7th Iteration
												// Peter	--> 8th Iteration
												// Trump	--> 9th Iteration
		}

		//	Method #2 | Using foreach
		for(String s: ll1) {
			System.out.println("Using forEach: "+s);
												// Sumit	--> 1st Iteration
												// Kumar	--> 2nd Iteration
												// Tom 		--> 3rd Iteration
												// Naveen	--> 4th Iteration
												// Robby	--> 5th Iteration
												// Lisa		--> 6th Iteration
												// Saha		--> 7th Iteration
												// Peter	--> 8th Iteration
												// Trump	--> 9th Iteration
		}
		
		// --- REVERSE ELEMENTS IN LINKED LIST ----------
		Iterator<String> iterator2 = ll3.descendingIterator();
		while(iterator2.hasNext()) {
			String s = iterator2.next();
			System.out.println("Using descending iterator: "+s);
												// ruby			--> 1st Iteration									
												// python		--> 2nd Iteration
												// javaScript	--> 3rd Iteration
												// java			--> 4th Iteration
		}
		
		// --- REMOVE SPECIFIC ELEMENT FROM LINKEDLIST USING INDEX ----------
//		ll1.remove(); 							// Removes 1st Element from LinkedList
//		ll1.remove(2); 							// Removes Element in Index=2 from LinkedList

//		ll1.removeAll(ll2);						// Removes all ll2 Elements from ll1
//		System.out.println(ll1); 				// [Sumit, Kumar, Tom, Naveen, Robby, Lisa, Saha]

//		System.out.println(ll1.removeFirst()); 	// Removes 1st Element from ll1 and returns 1st Element | O/p: Sumit	
//		System.out.println(ll1);				// [Kumar, Tom, Naveen, Robby, Lisa, Saha, Peter, Trump]
		
//		System.out.println(ll1.removeLast());	// Removes last Element from ll1 and returns last Element | O/p: Trump
//		System.out.println(ll1); 				// [Sumit, Kumar, Tom, Naveen, Robby, Lisa, Saha, Peter]
		
//		ll1.remove("Saha"); 					// Removes the element from ll1
//		System.out.println(ll1);				// [Sumit, Kumar, Tom, Naveen, Robby, Lisa, Peter, Trump]
		
//		ll1.clear(); 							// Removes all elements from LinkedList | O/p: Empty LinkedList
//		System.out.println(ll1);				// []

		// --- SORT LINKEDLIST -----------------------------------------------------
		// If String, sort by Alphabets, If number then sort by numbers
		Collections.sort(ll1);					// [Kumar, Lisa, Naveen, Peter, Robby, Saha, Sumit, Tom, Trump]
		Collections.sort(ll2);					// [Peter, Trump]
		Collections.sort(ll3);					// [java, javaScript, python, ruby]

	}

}
