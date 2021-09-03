package c_Map.a_HashMap;

import java.util.HashMap;
import java.util.Map;

public class c_InternalWorkingMechanism {
	public static void main(String[] args) {
		Map<String, Integer> studentMarks = new HashMap<String, Integer>();
		studentMarks.put("Naveen", 100);
		studentMarks.put("Tom", 200);
		studentMarks.put("Lisa", 300);
		studentMarks.put("Peter", 400);
		studentMarks.put("Robby", 500);
		
		studentMarks.put(null, 500);	// hashCode = 0 | index = 0
		studentMarks.put(null, 700);	// Key null value overridden from 500 to 700
		studentMarks.put("Nav", 900); 	// Key "Nav" Value overridden from 100 to 900
		// HashMap is an associative Array Data Structure
		
		// Hashing:Java uses a method "hashCode()" which is coming from Object class 
		
		studentMarks.get("Lisa");	// Following things happens:
									// 	1. It GET's hashCode of Key "Lisa" 		-->  HashCode found = 2368655
									//	2. Using HasCode, it calculates index 	-->  Index found = 15
									//	3. Using Index, calls .equals() method with Key="Lisa" to locate the Object whose Key = "Lisa". Object found
									//	4. Using Object, it GET's value associated with that object and returns back to studentMarks.get("Lisa") command
		
	}

}
