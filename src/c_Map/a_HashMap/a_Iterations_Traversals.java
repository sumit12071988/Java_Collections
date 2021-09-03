package c_Map.a_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class a_Iterations_Traversals {
	public static void main(String[] args) {
		// 	No order maintained, thus no indexing
		// 	Stores values in the form of KEY-VALUE pairs
		//	Keys cannot be duplicate
		//	Can have only 1 NULL KEY. Writing multiple NULL KEYS results in overriding their DATA
		//	Can have multiple NULL VALUES
		//	Not Thread-Safe/ Not Synchronized
		
		
		
		//	Syntax: HashMap<KeyDataType,ValueDataType> obj = new HashMap<KeyDataType, ValueDataType>();		
		HashMap<String, String> countryCapitalMap=new HashMap<String, String>();

// ----------------------------------------------------------------------------------------------------------------------------------- //		
		// ------- ADD VALUE USING KEYS  |.put("key","value") -----------
		countryCapitalMap.put("India","New Delhi");
		countryCapitalMap.put("USA","Washington DC");
		countryCapitalMap.put("UK","London");
		countryCapitalMap.put("UK","Birmingham");	// 	Duplicate Key is not allowed, the value gets overridden
													//	In this case the value "London" is overridden by "Birmingham"
		countryCapitalMap.put(null,"Berlin");		//	Allowed one null KEY
		countryCapitalMap.put(null,"Karachi");		//	In this case the "Berlin" will be overridden by "Karachi"
		countryCapitalMap.put("Indonesia",null);
		countryCapitalMap.put("Philippines",null);
		countryCapitalMap.put("Greece","Athens");
		System.out.println(countryCapitalMap);	// O/p: {null=Karachi, Greece=Athens, USA=Washington DC, UK=Birmingham, Philippines=null, India=New Delhi, Indonesia=null}
		System.out.println("Keys in HashMap: "+countryCapitalMap.keySet()); 	// O/p: [null, Greece, USA, UK, Philippines, India, Indonesia]
		System.out.println("Values in HashMap: "+countryCapitalMap.values());	// O/p:  [Karachi, Athens, Washington DC, Birmingham, null, New Delhi, null]
		System.out.println("Checking value in HashMap: "+countryCapitalMap.containsValue("New Delhi")); 	// O/p: true
		
		// ------- REMOVE VALUE USING KEYS  |.remove("key") -----------
		countryCapitalMap.remove("Greece");		// removes the KEY-VALUE pair from hashMap i.e. (Greece-Athens)
		System.out.println(countryCapitalMap);	// O/p: {null=Karachi, USA=Washington DC, UK=Birmingham, Philippines=null, India=New Delhi, Indonesia=null}
		
		
		// ------- GET VALUE USING KEYS | .get("key") -----------
//		System.out.println(countryCapitalMap.get("India"));			// O/p: New Delhi
//		System.out.println(countryCapitalMap.get("USA"));			// O/p: Washington DC
//		System.out.println(countryCapitalMap.get("UK"));			// O/p: Birmingham
//		System.out.println(countryCapitalMap.get(null));			// O/p: Karachi
//		System.out.println(countryCapitalMap.get("CANADA"));		// O/p: null | Reason: Key is not found whose data we're trying to get
//		System.out.println(countryCapitalMap.get("Indonesia"));		// O/p: null
//		System.out.println(countryCapitalMap.get("Philippines"));	// O/p: null
		
		
		
		
// ----------------------------------------------------------------------------------------------------------------------------------- //		
		// ------- TRAVERSING INSIDE HASHMAP USING ITERATOR ---------------------
		// We'll use iterator() method
		// Iteration can done on KEYS as well as on VALUES separately

				// #1: ITERATION USING KEYS | hashMap.keySet().iterator() ---------
				System.out.println("KeySets contents: "+countryCapitalMap.keySet()); 	// O/p: [null, USA, UK, Philippines, India, Indonesia]
				Iterator<String> iterator = countryCapitalMap.keySet().iterator();		// keySet() collect only keys as elements
				while (iterator.hasNext()) {
					String key = iterator.next();	// getting KEY
					String value = countryCapitalMap.get(key);	// getting VALUE using hashMap.get("KEY")
					System.out.println("Key using keySet() = "+key+" | Value using keySet() = "+value);	
						// O/p:		Key 		| Value
						//	-------------------------------------
						//			null		| Karachi
						//			USA			| Washington DC
						//			UK			| Birmingham
						//			Indonesia	| null
						//			India		| New Delhi
						//			Philippines	| null
				}
				

				// #2: ITERATION USING KEY-VALUE PAIR | hashMap.entrySet().iterator() ---------	
				Iterator<Entry<String, String>>iterator2 = countryCapitalMap.entrySet().iterator();		// entrySet() collect K-V pairs as an element
				while(iterator2.hasNext()) {
					Entry<String, String> entry = iterator2.next(); // return a SET of KEY-VALUE PAIR e.g:
																	//	(null,Karachi)		--> 1st Iteration
																	//	(USA,Washington DC)	--> 2nd Iteration etc..
					System.out.println("Key using entrySet() = "+entry.getKey()+" | Value using entrySet() = "+entry.getValue());
						// O/p:		Key 		| Value
						//	-------------------------------------
						//			null		| Karachi
						//			USA			| Washington DC
						//			UK			| Birmingham
						//			Indonesia	| null
						//			India		| New Delhi
						//			Philippines	| null
				}
				
				// #3: ITERATION USING Lambda "->" function of Java8 
				countryCapitalMap.forEach((k,v) -> System.out.println("Key using lambda ="+k+" | Value using lambda ="+v));
						// O/p:		Key 		| Value
						//	-------------------------------------
						//			null		| Karachi
						//			USA			| Washington DC
						//			UK			| Birmingham
						//			Indonesia	| null
						//			India		| New Delhi
						//			Philippines	| null
	}

}
