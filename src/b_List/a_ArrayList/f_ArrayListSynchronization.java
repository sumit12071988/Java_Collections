package b_List.a_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class f_ArrayListSynchronization {

	public static void main(String[] args) {
		
		// Synchronizing Arraylist Method #1: using Collections.synchronizedList(arrayList)
		ArrayList<String> arrayList = new ArrayList<String>();	// Create an arraylist Object
		List<String> list  = Collections.synchronizedList(arrayList);	// call the synchronizedList(arrayList obj) method of Collections class
		
		list.add("java");
		list.add("javaScript");
		list.add("python");
		
		// add, remove --> No Explicit Synchronization needed
		// Fetch values from list/ Traverse inside list --> Explicit Synchronization needed
		
		// Using synchronized block to traverse inside synchronized list.
		synchronized (list) {
			Iterator<String> iterator = list.iterator();
			while (iterator.hasNext()) {
				String string = iterator.next();
				System.out.println(string); // O/p: java
											//		javaScript
											//		python

			}
		}
		//------------------------------------------------------------------------------------//		
		// Synchronizing Arraylist Method #2: using copyOnWriteArrayList class
		CopyOnWriteArrayList<String> copyOnWriteArrayList = new CopyOnWriteArrayList<String>();
		copyOnWriteArrayList.add("Tom");
		copyOnWriteArrayList.add("Hardy");
		copyOnWriteArrayList.add("Naveen");
		
		// No need for Explicit Synchronization required for add, remove, fetch or traverse inside the list
		
		// Traversing inside the copyOnWriteArrayList
		Iterator<String> iterator = copyOnWriteArrayList.iterator();
		while (iterator.hasNext()) {
			String string = iterator.next();
			System.out.println(string);		// O/p: Tom
											//		Hardy
											//		Naveen
		}
	}
}
