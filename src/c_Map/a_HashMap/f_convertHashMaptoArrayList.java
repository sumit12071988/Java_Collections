package c_Map.a_HashMap;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class f_convertHashMaptoArrayList {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Google",10000);
		map.put("Wallmart",20000);
		map.put("Amazon",30000);
		map.put("Facebook",5000);
		map.put("Cisco",15000);
		
		// Checking Map's size
		System.out.println(map); 	// {Google=10000, Wallmart=20000, Cisco=15000, Amazon=30000, Facebook=5000}

// -------------------------------------------------------------------------------------------------------------------- //
		// Collecting all Keys of HashMap and storing in an ArrayList
		Set<String> keySet = map.keySet();
		List<String> compNameList= new ArrayList<String>(keySet);
		System.out.println("Arraylist of Keys: "+compNameList);					//	[Google, Wallmart, Cisco, Amazon, Facebook]
		
		for(String string : compNameList) {
			System.out.println("Key is :"+string);								//	Key is :Google
																				//	Key is :Wallmart
																				//	Key is :Cisco
																				//	Key is :Amazon
																				//	Key is :Facebook
		}		
// -------------------------------------------------------------------------------------------------------------------- //
		// Collecting all Values of HashMap and storing in an ArrayList
		Collection<Integer> valueSet = map.values();
		List<Integer> compEmpList= new ArrayList<Integer>(valueSet);
		System.out.println("Arraylist of Values: "+compEmpList);				//	[10000, 20000, 15000, 30000, 5000]
		
		for(int i : compEmpList) {
			System.out.println("Value is :"+i);									//	Value is :10000
																				//	Value is :20000
																				//	Value is :15000
																				//	Value is :30000
																				//	Value is :5000
		}
// -------------------------------------------------------------------------------------------------------------------- //
		System.out.println("----------- Using LAMBDA -----------------");
		map.forEach((k,v) -> System.out.println("Key: "+k+" | Value: "+v));	//	Key: Google | Value: 10000
																				//	Key: Wallmart | Value: 20000
																				//	Key: Cisco | Value: 15000
																				//	Key: Amazon | Value: 30000
																				//	Key: Facebook | Value: 5000
	}
	

}
