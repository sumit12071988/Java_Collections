package c_Map.a_HashMap;

import java.util.AbstractMap.SimpleEntry;
import java.util.AbstractMap.SimpleImmutableEntry;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.google.common.collect.ImmutableMap;
/**
 * MUTABLE MAP 		--> MAP which doesn't support PUT operation
 * IMMUTABLE MAP	--> MAP which supports PUT operation
 * @author Batto
 *
 */
public class d_DifferentWaysToCreateHashMaps {
	
	public static Map<String, Integer> marksMap;	// Creating static Map for #3
	
	// Creating a Static Block for #3
	static {
		marksMap = new HashMap<>();		// Can also write  as new HashMap<String, String>();
		marksMap.put("A", 100);
		marksMap.put("B", 200);
	}
	
	public static void main(String[] args) {
// ------------------------------------------------------------------------------------------------------------------------------------------ //		
		// 1. MUTABLE MAP | Creating Object of Hashmap class and assigning to HashMap class reference
		HashMap<String, String> map1 = new HashMap<>();
		//HashMap<String, String> map1 = new HashMap<String, String>();	// both are same
// ------------------------------------------------------------------------------------------------------------------------------------------ //		
		// 2. MUTABLE MAP | TOPCASTING | Child class object is being referred by Parent Interface reference variable
		Map<String, String> map2 = new HashMap<>();
// ------------------------------------------------------------------------------------------------------------------------------------------ //		
		// 3. Static way | Static HashMap
			// Step1: Create a Static Map reference variable
			// Step2: Create Static block and create a HashMap Object i.e initialize the HashMap
			// Step3: PUT values inside the HashMap using reference variable
			// Step4: Access reference variable statically using current class reference		
		d_DifferentWaysToCreateHashMaps.marksMap.get("A"); // O/p: 100
// ------------------------------------------------------------------------------------------------------------------------------------------ //		
		// 4. MUTABLE MAP | JDK8 | Using 2D Array and Streams
			// Step1: Create a 2D array to add Key and Values as two columns of same row
			String[][] arrKeyValue = new String[][] {{"Tom","A Grade"}, {"Naveen","A+ Grade"}, {"Sumit","A Grade"}};
	
			// Step2: Create a "Stream.of" that 2D Array --> "collect"ing Data --> feeding them "toMap" of Collections
			Map<String, String> map4 = Stream.of(arrKeyValue).collect(Collectors.toMap(data -> data[0], data -> data[1]));
																			//	1. Data in 1st Array of 2D Array will be added as KEY
																			//	2. Data in 2nd Array of 2D Array will be added as VALUE
			// (data -> data[0], data -> data[1])
			//		This lambda expression will fill up the map as: [{Tom,A Grade}, {Naveen, A+ Grade}, {Sumit, A Grade}]
			
			System.out.println(map4.get("Tom"));	// A Grade
			System.out.println(map4.get("Naveen"));	// A+ Grade
			System.out.println(map4.get("Sumit"));	// A Grade
			
			// now we can PUT as many data inside that Map
			map4.put("Lisa", "B Grade");
			System.out.println(map4.get("Lisa"));	// O/p: B Grade
// ------------------------------------------------------------------------------------------------------------------------------------------ //			
		// 5.MUTABLE MAP | Using SimpleEntry
			// Step1: Create multiple objects of SimpleEntry Abstract Class and add Key an Values
			SimpleEntry<String, String> obj1 = new SimpleEntry<>("Naveen", "Java");
			SimpleEntry<String, String> obj2 = new SimpleEntry<>("Tom", "Python");
			
			// Step2: Create a "Stream.of" SimpleEmptry objects --> "collect"ing data --> feeding them "toMap" of Collections 
			Map<String, String> map5 = Stream.of(obj1,obj2).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))  ;
			
			System.out.println(map5.get("Naveen")); 	// O/p: Java
			System.out.println(map5.get("Tom")); 		// O/p: Python
			
			map5.put("Sumit", "JavaScript");
			System.out.println(map5);					//	{Tom=Python, Naveen=Java, Sumit=JavaScript}
			System.out.println(map5.get("Sumit"));		//	JavaScript
			
// ------------------------------------------------------------------------------------------------------------------------------------------ //
		// 6. MUTABLE MAP | Using SimpleImmutableEntry
			// Step1: Create multiple objects of SimpleEntry Abstract Class and add Key an Values
			SimpleImmutableEntry<String, String> obj3 = new SimpleImmutableEntry<>("ImmutableKey1", "ImmutableValue1");
			SimpleImmutableEntry<String, String> obj4 = new SimpleImmutableEntry<>("ImmutableKey2", "ImmutableValue2");
			
			// Step2: Create a "Stream.of" SimpleEmptry objects --> "collect"ing data --> feeding them "toMap" of Collections 
			Map<String, String> map6 = Stream.of(obj3,obj4).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue))  ;
			
			System.out.println(map6.get("ImmutableKey1")); 		// O/p: ImmutableValue1
			System.out.println(map6.get("ImmutableKey2")); 		// O/p: ImmutableValue2		
			
			map6.put("ImmutableKey3", "ImmutableValue3");
			System.out.println(map6);							//	{ImmutableKey1=ImmutableValue1, ImmutableKey2=ImmutableValue2, ImmutableKey3=ImmutableValue3}
			System.out.println(map6.get("ImmutableKey3"));		//	ImmutableValue3
// ------------------------------------------------------------------------------------------------------------------------------------------ //
		// 7. EMPTY MAP | JDK 1.9 onwards | Creating Empty Map
			Map<String, String> emptyMap = Map.of();	// This will create an unModifiable/ Immutable Map which returns an Empty map
			//emptyMap.put("Tom", "Python");			// This will throw UnsupportedOperationException since this is an EmptyMap
														//	EmptyMap doesn't allow adding new Objects(Key-Value pairs) inside it.
// ------------------------------------------------------------------------------------------------------------------------------------------ //			
		// 8. IMMUTABLE MAP | JDK 1.9 onwards | Using SingleTon Map & Map.of
			
			// Method #1: Using JDK 8's Collections.singletonMap(Key, Value) 
			Map<String, Integer> map3 = Collections.singletonMap("test", 100);
			map3.get("test");		// O/p: 100
			//map3.put("abc", 200);	// O/p: Not allowed !!. It will throw UnsupportedOperationException Since we've created a singleton Map
									//		This Singleton Map : 
									// 			1. Allows adding only one entry.
									//			2. Immutable in nature i.e. We cannot change its value
			
			// Method #2: | using JDK 9's Map.of(Key,Value)
						//	Map.Of() is an overloaded method
			Map<String, String> singletonMap = Map.of("Key1", "Value1");
			singletonMap.get("Key1"); 					// value1
			//singletonMap.put("Key2", "Value2");		// O/p: Not allowed !!. It will throw UnsupportedOperationException Since we've created a singleton Map
// ------------------------------------------------------------------------------------------------------------------------------------------ //			
		// 9. IMMUTABLE MAP | Multi Values Immutable Map | METHOD #1 | Max 10 Key-Value Pairs can be added using this method | Immutable after initial K-V added up
			Map<String, String> multiMap = Map.of("Key1", "Value1", "Key2", "Value2", "Key3", "Value3");
			System.out.println(multiMap.get("Key3")); 	// O/p: Value3
			System.out.println(multiMap.get("Key1")); 	// O/p: Value1
			System.out.println(multiMap.get("Key2")); 	// O/p: Value2
			
			//multiMap.put("Key4", "Value4");			// O/p: Not allowed !!. It will throw UnsupportedOperationException
			
// ------------------------------------------------------------------------------------------------------------------------------------------ //			
		// 10. IMMUTABLE MAP | Multi Values Immutable Map | METHOD #2 | No size limitations as compared to Map.of(10 K-V pairs) | Immutable after initial K-V added up	
			SimpleEntry<String, Integer> obj5 = new SimpleEntry<>("A", 100);
			SimpleEntry<String, Integer> obj6 = new SimpleEntry<>("B", 200);
			SimpleEntry<String, Integer> obj7 = new SimpleEntry<>("C", 300);

			Map<String, Integer> map7 = Map.ofEntries(obj5,obj6,obj7);
			System.out.println(map7); 	// {C=300, B=200, A=100}
			//map7.put("D", 400);		// O/p: Not allowed !!. It will throw UnsupportedOperationException
// ------------------------------------------------------------------------------------------------------------------------------------------ //			
		// 11. IMMUTABLE MAP | Using Guava Libraries | Pre-req: Add guava libraries in pom.xml or guava-30.1.1-jre.jar as External Jar
			Map<String, String> map8 = ImmutableMap.of("GoogleKey", "GoogleValue", "AmazonKey", "AmazonValue");
			System.out.println(map8); 					// {GoogleKey=GoogleValue, AmazonKey=AmazonValue}
			//map8.put("FacebookKey", "FacebookValue"); // O/p: Not allowed !!. It will throw UnsupportedOperationException since its an Immutable Map
			
			
			
			
			
	}
}
