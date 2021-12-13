package MapConcept;

import java.util.HashMap;

public class Employee {

	public static void main(String[] args) {
		// Map is an interface --> HashMap is the Class
		//Map(I) --> HashMap(C)
		
		HashMap<String, String > empMap = new HashMap<String, String>();
		
		empMap.put("A", "Tom");
		empMap.put("B", "Dick");
		empMap.put("C", "Harry");
		empMap.put("D", "Cherry");
		
		System.out.println(empMap.get("A"));
		
		HashMap<String, Integer > stuMap = new HashMap<String, Integer>();
		stuMap.put("Tom", 100);
		stuMap.put("Dick", 300);
		
		stuMap.put("Dick", 500);
		stuMap.put(null, 200);
		
		//-> Lambda arrow means we are supplying this value to next statement like SYSo.
		
		System.out.println("-------------");
		stuMap.forEach((k,v)->System.out.println(k+":"+v));
		
		System.out.println(stuMap.get("Dick"));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
