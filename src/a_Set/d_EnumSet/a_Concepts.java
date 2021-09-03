package a_Set.d_EnumSet;

import java.util.EnumSet;
import java.util.Iterator;

/**
 * 1. Not Synchronized
 * 2. Very Fast. thus High performance java collection member
 * 3. Faster than HashSet
 * 4. All methods are implemented using bitwise arithmetic operations
 */
public class a_Concepts {
	
	enum Lang{
		JAVA,
		JAVASCRIPT,
		PYTHON,
		CSHARP,
		RUBY
	}
	
	public static void main(String[] args) {
		
		// ---- CREATING EMUMSET USING CUSTOM DEFINED ENUM | EnumSet.allOf(customEnum.class) -------
		EnumSet<Lang> e1 = EnumSet.allOf(Lang.class);		// Creates an ENUM SET, containing allOf the elements of enum "Lang"
		System.out.println(e1); 							// [JAVA, JAVASCRIPT, PYTHON, CSHARP, RUBY]
		
		// ---- CREATING EMPTY ENUMSET | EnumSet.noneOf(customEnum.class) --------------------------
		EnumSet<Lang> e2 = EnumSet.noneOf(Lang.class);// Creats an EnumSet with noneOf the elements from enum "Lang"
		System.out.println(e2);								// []
		
		// ---- TO GET RANGE OF ELEMENTS FROM ENUMSET | EnumSet.range(fromEnumElement,toEnumElement)
//		EnumSet<Lang> e3 = EnumSet.range(Lang.JAVASCRIPT, Lang.CSHARP);
//		System.out.println(e3); 							// [JAVASCRIPT, PYTHON, CSHARP]
		
		// ---- CREATING ENUMSET WITH ONE ELEMENT FROM ENUM ----------------------------------------
//		EnumSet<Lang> e4 = EnumSet.of(Lang.CSHARP);			// Creates an ENUMSET containing the specified element
//		System.out.println(e4); 							// [CSHARP]
		
		// ---- CREATING ENUMSET WITH MULTIPLE ELEMENT FROM ENUM ----------------------------------------		
//		EnumSet<Lang> e5 = EnumSet.of(Lang.JAVA,Lang.RUBY);	// Creates an ENUMSET containing the specified element
//		System.out.println(e5); 							// [JAVA, RUBY]
		
		// ---- ADDING ONE ELEMENT FROM ONE ENUMSET TO ANOTHER ---------------------------------------------
//		e2.add(Lang.JAVA);
//		System.out.println(e2); 							// [JAVA]
		
		// ---- ADDING ALL ELEMENTS FROM ONE ENUMSET TO ANOTHER ---------------------------------------------	
//		e2.addAll(e1);										// e2 to add all elements From e1 at the end
//		System.out.println(e2);								// [JAVA, JAVASCRIPT, PYTHON, CSHARP, RUBY]		

		
		// ---- REMOVE ELEMENT FROM ENUMSET | .remove(EnumOptionToBeRemoved) --------------------------------
		e1.remove(Lang.RUBY);
		System.out.println(e1); 							// [JAVA, JAVASCRIPT, PYTHON, CSHARP]
		
		// ---- REMOVE ALL ELEMENTS FROM ENUMSET | .removeAll(EnumName) -------------------------------------
		e1.removeAll(e1);
		System.out.println(e1); 							// []
		
		// ----- TRAVERSAL IN ENUMSET ----------------------------------------------------------------------
//		Iterator<Lang> itr = e1.iterator();
//		while(itr.hasNext()) {
//			System.out.println("Iterator O/p: "+itr.next());
//			//	O/P: 
//			//	Iterator O/p: JAVA
//			//	Iterator O/p: JAVASCRIPT
//			//	Iterator O/p: PYTHON
//			//	Iterator O/p: CSHARP
//			//	Iterator O/p: RUBY			
//		}
		

		
		
		
	}

}
