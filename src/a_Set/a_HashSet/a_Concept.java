package a_Set.a_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 1. NO ORDER MAINTAINED
 * 2. DUPLICATES NOT ALLOWED
 * 3. NULL DATA ALLOWED
 *
 */
public class a_Concept {
	public static void main(String[] args) {
		
		// ------- CREATING HASHSET OBJECT AND ADDING ELEMENTS LATER ------
		Set<String> hs = new HashSet<>();	// TopCasting

		// ------- CREATING HASHSET OBJECT AND ADDING ELEMENTS TOGATHER ------		
		Set<String> hs1 = new HashSet<>(Arrays.asList("Nitin", "Nagpal","Monica", "Sonia"));
		
		
		// ------- INSERT ELEMENTS | .add(data) -----------------------
		hs.add("Alpha");
		hs.add("testing");
		hs.add("Beta");
		
		System.out.println(hs); 	// [testing, Alpha, Beta]
		System.out.println(hs1);	// [Nitin, Nagpal, Monica, Sonia]
		
		hs.add("Alpha");			// HashSet doesn't accept Duplicated. Thus won't be added in runtime
		hs.add("Alpha");			// Won't be added due to duplication
		hs.add("Alpha");			// Won't be added due to duplication
		hs.add("Alpha");			// Won't be added due to duplication			
		
		System.out.println(hs);	// [testing, Alpha, Beta]
		
		hs.add(null);			// Added as NULL data are allowed
		hs.add(null);			// Won't be added due to duplication	
		System.out.println(hs); // [null, testing, Alpha, Beta]
		
		// ------- CHECK ELEMENT PRESENT | .contains(data) ----------------------------
		System.out.println(hs.contains("Alpha"));	// true
		System.out.println(hs.contains(null));		// true
		
		// ------- TRAVERSAL ----------------------------------------------------------
				// ----- METHOD #1 | USING FOR EACH LOOP ----------------
//				for(String ele: hs) {
//					System.out.println("Element fetched using forEach loop: "+ele);
//					// O/p:
//					// Element fetched using forEach loop: null
//					// Element fetched using forEach loop: testing
//					// Element fetched using forEach loop: Alpha
//					// Element fetched using forEach loop: Beta
//				}
		
				// ----- METHOD #2 | USING ITERATOR ----------------
//				Iterator<String> iterator = hs.iterator();
//				while(iterator.hasNext()) {
//					System.out.println("Element fetched using iterator: "+iterator.next());
//					// O/p:
//					// Element fetched using iterator: null
//					// Element fetched using iterator: testing
//					// Element fetched using iterator: Alpha
//					// Element fetched using iterator: Beta
//				}
			
		// ------- REMOVE ELEMENT | .remove(data) ----------
		hs.remove("Beta");
		System.out.println(hs); // [null, testing, Alpha]		
		}
	}
