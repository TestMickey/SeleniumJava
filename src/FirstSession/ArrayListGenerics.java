package FirstSession;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		//Integer ArrayList
		ArrayList<Integer> ar = new ArrayList<Integer>();
		
		ar.add(100);
		ar.add(200);
		ar.add(300);
		ar.add(400);
		
		//for each Loop
		for(Integer e : ar) {
			System.out.println(e);
		}
		
		for (int e :ar) {
			System.out.println(e);
		}
		
		//String ArrayList
		ArrayList<String> prodList= new ArrayList<String>();
		prodList.add("Nokia");
		prodList.add("Samsung");
		prodList.add("Apple");
		
		for(String e: prodList) {
			System.out.println(e);
		}
		
		//Object ArrayList
		ArrayList<Object> empData = new ArrayList<Object>();
		empData.add("Dhara");
		empData.add(25);
		empData.add('f');
		empData.add(34.55);
		empData.add(true);
		
		System.out.println(empData.size());
		
		for (Object e : empData) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
