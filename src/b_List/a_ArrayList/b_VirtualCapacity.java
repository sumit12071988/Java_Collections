package b_List.a_ArrayList;

import java.util.ArrayList;

public class b_VirtualCapacity {
	
	public static void main(String[] args) {
		ArrayList<Object> al =new ArrayList<Object>(20);
		// The moment we create an ArrayList, its :
		//	a) PHYSICAL CAPACITY (PC) = 0
		//	b) VIRTUAL CAPACITY  (VC) = 10
		
		// As we start adding data, VIRTUAL CAPACITY starts decreasing and PHYCIAL CAPACITY starts increasing gradually
		System.out.println(al.size());	// O/p = 0 since .size() method shows the PHYSICAL CAPACITY of Arraylist.
		
		al.add(100);	// PC: 1 | VC = 0
		System.out.println(al.size());	// O/P = PC = 1
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al.size());	// O/P = PC = 4		
		// now put a debugger at line 14 and check the size shown
	}

}
