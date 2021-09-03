package b_List.a_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class e_ArrayListMethods {
	public static void main(String[] args) {
		ArrayList<String> arrayList =new ArrayList<String>();
		arrayList.add("java");
		arrayList.add("javaScript");
		arrayList.add("python");
		arrayList.add("ruby");
				
		ArrayList<String>arrayList2=new ArrayList<String>();
		arrayList2.add("testing");
		arrayList2.add("devops");
		arrayList2.add("qa");
		arrayList2.add("devops");	// Duplicate data at index: 3
		arrayList2.add("ea");
		arrayList2.add("ml");
		arrayList2.add("ai");
		arrayList2.add("devops");	// Duplicate data at index: 7		
		

		//------------------------------------------------------------------------------------/////		//	#1: ADD ALL ELEMENTS FROM ONE ARRAYLIST TO ANOTHER ARRAYLIST | .addAll(<anotherArraylist>) | ///		arrayList.addAll(arrayList2);	// This will add data from arrayList2 inside arrayList collection object///		System.out.println(arrayList); 	// O/p: [java, javaScript, python, ruby, testing, devops]///		///		//		ADDING ANOTHER ARRAYLIST DATA AT A SPECIFIC INDEX OF CURRENT ARRAYLIST///		arrayList.addAll(2, arrayList2);	// This will add data from arrayList2 from 2nd index of arrayList1///		System.out.println(arrayList); 		// O/p: [java, javaScript, testing, devops, python, ruby]
		//------------------------------------------------------------------------------------//
//		//	#2: CLEAR ALL DATA FROM ARRAYLIST | .clear()
//		arrayList.clear();	// Removes all of the elements from this list
//		System.out.println(arrayList);	// O/p: []
		//------------------------------------------------------------------------------------//
//		//	#3: CLONE ARRAYLIST | .clone()
//			// Call ArrayList's clone() method which returns Object.
//			// 	Typecast it to Arraylist to convert return Type to Arraylist
//			//	Store in Another ArrayList Object
//		ArrayList<String> cloneList = (ArrayList<String>)arrayList.clone();
//		System.out.println(cloneList);	// O/p: [java, javaScript, python, ruby]
		//------------------------------------------------------------------------------------//
//		//	#4: CHECK DATA AVAILABILITY IN ARRAYLIST | .contains("data")
//		boolean flag = arrayList.contains("python");
//		System.out.println(flag);									// O/p: true
//		System.out.println(arrayList.contains("nonExistingData"));	// O/p: false
		//------------------------------------------------------------------------------------//		
//		//	#5: GET INDEX OF DATA  | .indexOf("data")
//		int index = arrayList.indexOf("javaScript");
//		System.out.println(index); 									// O/p: 1
//		System.out.println(arrayList.indexOf("nonExistingData"));	// O/p: -1
		//------------------------------------------------------------------------------------//		
//		//	#6: GET LAST INDEX OF DUPLICATE DATA | .lastIndexOf("data")
//		 int lastIndex = arrayList2.lastIndexOf("devops");
//		System.out.println(lastIndex); 	// O/p: 7
//		System.out.println(arrayList2.lastIndexOf("nonExistingData")); 	// O/p: -1
		//------------------------------------------------------------------------------------//
		//	#7: REMOVE SPECIFIC DATA FROM ARRAYLIST | .remove(index) | .remove("data")
//		arrayList2.remove(0);	// remove data in 1st index i.e. testing
//		System.out.println(arrayList2); 	//	O/p: [devops, qa, devops, ea, ml, ai, devops]
//		arrayList2.remove("ai");			// remove the data "ai" from Arraylist
//		System.out.println(arrayList2); 	//	O/p: [testing, devops, qa, devops, ea, ml, , devops]
		//------------------------------------------------------------------------------------//		
//		//	#8: REMOVE DATA USING CONDITION | .removeIf(condition)
//		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//		ArrayList<Integer> integerList =new ArrayList<Integer>(list);
//		integerList.removeIf(num -> num%2 == 0);	// this will remove those data which when divided by 2 gives reminder as 0
//		System.out.println(integerList); 	// O/p: [1, 3, 5, 7, 9]
//		integerList.removeIf(num -> num%2 != 0);	// this will remove those data which when divided by 2 doesn't give reminder as 0
//		System.out.println(integerList); 	// O/p: [2, 4, 6, 8, 10]
		//------------------------------------------------------------------------------------//		
//		//	#9: RETAIN SPECIFIC DATA AND REMOVE REST | .retainAll(Collections.singleton("data"))
//		ArrayList<String> nameList = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Tom", "Tommas"));
//		nameList.retainAll(Collections.singleton("Tom"));
//			// Collections.singleton("Tom") returns an immutable set containing only the specified object/ data
//		System.out.println(nameList); 	// O/p: [Tom, Tom]
		//------------------------------------------------------------------------------------//		
//		//	#10: GETTING SUBLIST FROM ARRAYLIST | .subList(startIndex, endIndexExcluded)
		ArrayList<Integer> numberslist1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		// use sublist method and create a SubList by specifying the starting and ending indexes excluding the element in ending index
		List<Integer> subList = numberslist1.subList(2,6); 	// List will contain [3, 4, 5, 6]
		ArrayList<Integer> newArrayList = new ArrayList<Integer>(subList);
		System.out.println(newArrayList);	// O/p: [3, 4, 5, 6]
		//------------------------------------------------------------------------------------//		
		//	#11: CONVERT ARRAYLIST DATA INTO LST OF DATA IN AN ARRAY | .toArray()
//		ArrayList<String> nameList1 = new ArrayList<String>(Arrays.asList("Naveen","Tom","Peter","Steve","Lisa","Robert"));
//		Object[] arr = nameList1.toArray();	// Converts data from Arraylist to data inside Array
//		System.out.println(Arrays.toString(arr));	// O/P: [Naveen, Tom, Peter, Steve, Lisa, Robert]
//		
//		for (Object object : arr) {
//			//System.out.println(object);		// returns data as Objects
//			System.out.println((String)object);	// Typecasting returns data as String
//		}	
	}
}
