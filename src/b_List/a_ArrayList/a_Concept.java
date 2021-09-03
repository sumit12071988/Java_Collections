package b_List.a_ArrayList;

import java.util.ArrayList;
/**
 * 
 * @author Batto
 *IMPORTANT POINTS TO REMEMBER:
 * a) -ve index not allowed in ArrayList
 */
public class a_Concept {
	public static void main(String[] args) {
		// ArrayList is a default class in Java
		// Behaves like a Dynamic Array
		
		//Arraylist can be created in 3 ways:
		//	a) Using default Generics
//		ArrayList ar =new ArrayList();
//		ar.add(100);
//		ar.add("String");
//		ar.add(true);
//		ar.add(100.25);
//				// Using generics is not recommended as ArrayList expects we define a dataType to maintain TypeSafety 
//				//		so that all elements of same datType is allowed to be added inside
//				// Using generics will allow user to add data of Any DataType
//		System.out.println(ar);	// this will print [100, String, true, 100.25]
//		//------------------------------------------------------------------------------------//		
		// To avoid generics warning, we need specify datatype as shown below:
		ArrayList<Object> al1 =new ArrayList<Object>();
		al1.add(100);				// Index = 0
		al1.add("String");			// Index = 1
		al1.add(true);				// Index = 2
		al1.add(100.25);			// Index = 3
		//System.out.println(ar1);	// this will print [100, String, true, 100.25]
//		//------------------------------------------------------------------------------------//		
		// TO FETCH DATA FROM ARRAYLIST | .get(index)
		//System.out.println(al1.get(1));		// o/p: string
		//System.out.println(al1.get(2));		// O/p: true
		//System.out.println(al1.get(4));		// O/p: ArrayIndexOutOfBoundException since index 4 doesn't exist
		//System.out.println(al1.get(-1));		// O/p: ArrayIndexOutOfBoundException since index 4 doesn't exist
//		//------------------------------------------------------------------------------------//		
		// TO FETCH ARRAYLIST SIZE | .size()
		System.out.println("Arraylist size after adding 4 data: "+	al1.size());	// O/p: 4
		System.out.println("Lowest index: "+(al1.size()-al1.size()));				// O/p: 0
		System.out.println("Highst index: "+(al1.size()-1));						// O/p: 3
//		//------------------------------------------------------------------------------------//		
		// Adding new data inside Arraylist object will increase its side programmatically
		al1.add(400);				// Index = 4
		al1.add(500);				// Index = 5
		System.out.println("Arraylist size after adding 6 data: "+ al1.size());		// O/p: 6
		// This proves that ArrayList is Dynamic in nature
		
	}
}
