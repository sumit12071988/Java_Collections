package b_List.a_ArrayList;

import java.util.ArrayList;

public class c_GenericArrayList {
	public static void main(String[] args) {
		
		// 	If a generics is specified to an ArrayList, then that ArrayList will NOT allow data of different datatype
		//	Generics are specified using WRAPPER CLASS i.e. Integer, Boolean, etc..
		//		If attempted to use primitive datatype instead of WRAPPER CLASS, Generics will not be accepted
		  ArrayList<Integer> al =new ArrayList<Integer>();
		//ArrayList<int> al =new ArrayList<int>();	// Compilation Error
			
		//	Once generics Integer is added, now ArrayList only accepts integer data
		al.add(100);
		// Trying to add data of different datatype
		//al.add(100.01);	// This will throw compilation error
		
		ArrayList<Double> al1=new ArrayList<Double>();
		al1.add(10.01);
		//al1.add(10);	// This will throw compilation error
		
		
	}
}
