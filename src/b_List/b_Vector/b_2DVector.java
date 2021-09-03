package b_List.b_Vector;

import java.util.Arrays;
import java.util.Vector;

public class b_2DVector {

	public static void main(String[] args) {
		Vector<String> v1= new Vector<String>(Arrays.asList("Java","JavaScript","Python","Ruby","C#","Php"));
		
		Vector v2 = new Vector();
		v2.add(v1);	// Adding a vector "v1" as an Object inside another Vector "v2"
					// Thus v2 is Vector of vectors
		
		for (int i = 0; i < v1.size(); i++) {
			System.out.println((String)((Vector)v2.get(0)).get(i)); 
			// Typecasting v2.get(0) to behave as a Vector i.e. ((Vector)v2.get(0)) --> A Vector with only 1 Row [0][v1]
			// Typecasting the return from (Vector)v2.get(0)).get(i) to act a String.
										// 1st Iteration | ((Vector)v2.get(0)).get(0) --> v1.get(0)	--> Java
										// 2nd Iteration | ((Vector)v2.get(0)).get(1) --> v1.get(1)	--> JavaScript
										// 3rd Iteration | ((Vector)v2.get(0)).get(2) --> v1.get(2)	--> Python
										// 4th Iteration | ((Vector)v2.get(0)).get(3) --> v1.get(3)	--> Ruby
										// 5th Iteration | ((Vector)v2.get(0)).get(4) --> v1.get(4)	--> C#
										// 6th Iteration | ((Vector)v2.get(0)).get(5) --> v1.get(5)	--> Php
		}
		
	}

}
