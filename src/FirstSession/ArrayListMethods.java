package FirstSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<Integer> numbers= new ArrayList<Integer>(Arrays.asList(10,20,30,40));
		
		System.out.println(numbers);
		
		int i[] = {10,20,30,40,50,60};//array literals
		System.out.println(i);
		
		System.out.println(Arrays.toString(i));
		
		//String
		ArrayList<String> names= new ArrayList<String>(Arrays.asList("JAVA", "PYTHON", "C#"));
		System.out.println(names);
		
		ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		System.out.println(l3);
		Collections.sort(l3);
		System.out.println(l3);
		
		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
		
		if(l1.equals(l3)) {
			System.out.println("Pass");
		}
		
		//web page ---> drop down --->5 elements ---actual list
		//expected list ---> 5 elements
		ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		ArrayList<String> l5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		/*l4.removeAll(l5);
		System.out.println(l4);
		
		l5.removeAll(l4);
		System.out.println(l5);*/
		
		//find out the common elements
		
		//1. retain all
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "Algo"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA", "Python", "JS", "DS", "PHP"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
		//2. add all
		ArrayList<String> l6 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		ArrayList<String> l7 = new ArrayList<String>(Arrays.asList("P", "Q", "R"));
		
		l6.addAll(l7);
		System.out.println(l6);
		System.out.println(l7);
		
		// 3. clear
		/*l7.clear();
		System.out.println(l7);*/
		
		//4. clone
		ArrayList<String> cloneList = (ArrayList<String>)l7.clone();
		System.out.println(cloneList);
		
		//5. add value
		ArrayList<String> l8 = new ArrayList<String>(Arrays.asList("A", "B", "C", "D", "E"));
		l8.add(0, "T");
		System.out.println(l8);
		l8.add(4, "N");
		System.out.println(l8);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
