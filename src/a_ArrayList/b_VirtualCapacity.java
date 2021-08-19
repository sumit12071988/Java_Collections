package a_ArrayList;

import java.util.ArrayList;

public class b_VirtualCapacity {
	
	public static void main(String[] args) {
		ArrayList<Object> al =new ArrayList<Object>();
		// The moment we create an ArrayList, its :
		//	a) PHYSICAL CAPACITY (PC) = 0
		//	b) VIRTUAL CAPACITY  (VC) = 10
		
		// As we start adding data, VIRTUAL CAPACITY starts decreasing and PHYCIAL CAPACITY starts increasing gradually
		System.out.println(al.size());	// O/p = 0 since .size() method shows the PHYSICAL CAPACITY of Arraylist.
		
		al.add(100);	// PC: 1 | VC = 0
		
		
		
		
	}

}
