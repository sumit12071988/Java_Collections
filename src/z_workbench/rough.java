package z_workbench;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class rough {

	public static void main(String[] args) {
		ArrayList<String> al1 = new ArrayList<>(Arrays.asList("f","b","e","d","c","a"));
		ArrayList<String> al2 = new ArrayList<>(Arrays.asList("b","c","a"));
		
		Collections.sort(al1);		// [a, b, c, d, e, f]
		Collections.sort(al2);		// [a, b, c]
//		al1.equals(al2); 			// false
//		al2.equals(al1); 			// false
//		al1.removeAll(al2);			// al1 --> [d, e, f]					
//		al2.removeAll(al1);			// al2 --> []
//		al1.retainAll(al2);			// al1 --> [a, b, c]		
		al1.containsAll(al2);		// true
		al2.containsAll(al1);		// false
		


		
	}

}
