package FirstSession;

import java.util.ArrayList;

public class ArrayListConcepts {

	public static void main(String[] args) {
		// ArrayList - default class
		// need to create object of ArrayList using new keyword
		// it maintains the order/index
		
		ArrayList ar = new ArrayList();
		System.out.println(ar.size());// size=0
		
		ar.add(100);//size=1
		ar.add(200);//size=2
		
		System.out.println(ar.size());
		
		// adding more values
		ar.add(300);
		ar.add(400);
		
		ar.add(500);
		
		//Verify Size
		System.out.println(ar.size());
		
		ar.add(600);
		ar.add(700);
		
		// add multiple data types
		ar.add(12.33);
		ar.add("testing");
		ar.add('n');
		ar.add(true);
		ar.add(500);// you can add the same value again. ex: index 4 and index 11 both has value of 500.
		
		//get value of particular Index
		System.out.println(ar.get(0));
		System.out.println(ar.get(6));
		//System.out.println(ar.get(7));//Error
		//System.out.println(ar.get(-1));//Error - There is no "-(Negative)" index concept in JAVA.
		
		//remove index value
		ar.remove(4);
		System.out.println(ar.get(5));
		
		// verify size
		System.out.println(ar.size());
		
		// to print all the values from ArrayList : use For Loop
		for (int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
