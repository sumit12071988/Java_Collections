package c_Map.c_HashTable;

import java.util.Hashtable;

public class a_Concepts {

	public static void main(String[] args) {
		
		Hashtable<String,Integer> marks = new Hashtable<>();
		marks.put("Naveen", 100);
		marks.put("Tom", 200);
		marks.put("Lisa", 300);
		marks.put("Peter", 400);
		marks.put("Robby", 600);
//		marks.put(null, 700);		// NullPointerException since HashTable doesn't allow null keys
		marks.put("Marcus", 800);	// NullPointerException since HashTable doesn't allow null values
		
		marks.get("Naveen"); 	// 100
		marks.get("Peter");		// 400
//		marks.get(null);		// NullPointerException since HashTable doesn't alloe null keys
		marks.get("Marcus");	// NullPointerException since HashTable doesn't alloe null values
		
		
	}

}
