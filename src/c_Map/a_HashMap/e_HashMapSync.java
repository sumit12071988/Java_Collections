package c_Map.a_HashMap;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class e_HashMapSync {

	public static void main(String[] args) {
		// synchronizedMap method in collections class:
		Map<String, String> map1 = new HashMap<>();
		map1.put("1", "Naveen");
		map1.put("2", "Tom");
		map1.put("3", "lisa");
		System.out.println(map1); 	// O/p: {1=Naveen, 2=Tom, 3=lisa}
		
		// SynchronizedHashMap creation | From HashMap 
		Map<String, String> synchronizedHashMap = Collections.synchronizedMap(map1);
		System.out.println(synchronizedHashMap); 	// O/p: {1=Naveen, 2=Tom, 3=lisa}
		
		// ConcurrentHashMap creation
		//		It does not throw any ConcurrentModificationException
		ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
		concurrentHashMap.put("A", "Java");
		concurrentHashMap.put("B", "Python");
		concurrentHashMap.put("C", "Ruby");
		
		System.out.println(concurrentHashMap); 			// {A=Java, B=Python, C=Ruby}
		System.out.println(concurrentHashMap.get("A"));	// Java
		
		// 	Q: Can Multiple Threads WRITE at same Segment concurrently/ Parallelly in ConccurrentHashMap ?
		//	A: No. Threads acquire a LOCK on segment in put() operation. At a time only 1 thread is allowed to write at a segment.
		
		// 	Q: Can Multiple Threads WRITE on different segment concurrently/ Parallelly in ConcurrentHashMap ?
		//	A: Yes.
		
		//	Q: Can Multiple Threads READ from same segment concurrently/ Parallelly in ConccurrentHashMap ?
		//	A: Yes.
		
		//	Q: If one Thread is WRITING on a segment, can another Thread READ from same segment concurrently/ Parallelly in ConccurrentHashMap ?
		//	A: Yes. READ Threads will always fetch UPDATED value
		
		
		
		
		
		
	}
}
