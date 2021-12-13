package HomeWork;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListHomeWork {

	public static void main(String[] args) {
		
		//1. Write a Java program to create a new array list, add some colors (string) and print out the collection
		ArrayList<String> color = new ArrayList<String>();
		color.add("Purple");
		color.add("Navy Blue");
		color.add("Aqua");
		color.add("Green");
		color.add("Yellow");
		color.add("Orange");
		color.add("Red");
		
		System.out.println("colors of Rainbow are: " + color.size());
		
		for (String e : color) {
			System.out.println(e);
		}
		System.out.println("------------2");
		//2. Write a Java program to insert an element into the array list at the first and last positions.
		color.add(0,"Black");
		color.add(8,"White");
		
		for (String e : color) {
			System.out.println(e);
		}
		System.out.println("------------3");
		//3. Write a Java program to retrieve an element (at a specified index) from a given array list.
		System.out.println("The color in the 3rd position is "+ color.get(3));
		
		System.out.println("------------4");
		// 4. Write a Java program to update specific array element by given element.
		color.set(7, "Pink");
		for (String e : color) {
			System.out.println(e);
		}
		System.out.println("------------5");
		//5. Write a Java program to remove the third element from a array list. 
		
		
		
		color.remove(3);
		for (String e : color) {
			System.out.println(e);
		}
		System.out.println("------------6");
		
		//6. Write a Java program to search an element in a array list.
		
		if(color.contains("Pink")){
			System.out.println(" Pink color is available in the list");
			
		}
		else {
			System.out.println("color is not available. ");
		}
		System.out.println("------------7");
		//7. Write a Java program to reverse elements in a array list
		
		
		Collections.reverse(color);
		
		for (String e : color) {
			System.out.println(e);
		}
		System.out.println("------------8");
		//8. Write a Java program to extract a portion of a array list.
		
		System.out.println("------------9");
		//9. Write a Java program of swap two elements in an array list.
		
		Collections.swap(color, 1,7);
		
		for (String e : color) {
			System.out.println(e);
		}
		
		System.out.println("------------10");
		//10. Write a Java program to empty an array list.
		
		color.clear();
		
		for (String e : color) {
			System.out.println("list contains"+e);
		}
		System.out.println("------------11");
		//11.Write a Java program to trim the virtual capacity of an array list the current list size.
		
		System.out.println("------------12");
		//12. Write a Java program to print all the elements of a ArrayList using the position of the elements
		
		
		
	
	}

}
