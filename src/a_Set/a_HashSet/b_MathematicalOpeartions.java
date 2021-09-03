package a_Set.a_HashSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class b_MathematicalOpeartions {
	public static void main(String[] args) {
		
		Set<Integer> hs1 =new HashSet<>(Arrays.asList(1,3,4,5,6,8,9,10));
		Set<Integer> hs2 =new HashSet<>(Arrays.asList(1,3,5,6,0,9));

		// ---- UNION OF TWO SETS ------------------------------------------------------
		hs1.addAll(hs2); 			// hs1 to add all elements from hs2
									// 	since duplicates are not allowed, hs1 + hs2 will only have uniques values
		System.out.println(hs1); 	//	[0, 1, 3, 4, 5, 6, 8, 9, 10]
		
		// ---- INTERSECTION OF TWO SETS ------------------------------------------------------		
		hs1.retainAll(hs2);			// hs1 to retain all hs2 elements
									//	those hs1 elements which are not found in hs2 must be removed
		System.out.println(hs1); 	// [1, 3, 5, 6, 9]

		// ---- DISJOINT OF TWO SETS ------------------------------------------------------
		hs1.removeAll(hs2);			// hs1 to remove all elements found in hs2
		System.out.println(hs1); 	// [4, 8, 10]
		
		
	}

}
