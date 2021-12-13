package HomeWork;

import java.util.ArrayList;
import java.util.List;

public class ConstructorHomeWork {

	/*Constructor Assignments: 
	1. Design a University class template with the following features:
	 variables:
	name
	country
	establishedDate
	List of course provided in Array List<String>


	--Design the constructor of this class with different parameters and all parameters.


	--Write the get method of each variable with return keyword. */
	
	
	String name;
	String country;
	int establishedDate;
	ArrayList<String> course = new ArrayList<String>();
	
	
	public void university(String name, String coutnry, int establishedDate, ArrayList<String> course) {
		this.name = name;
		this.country = coutnry;
		this.establishedDate = establishedDate;
		this.course = course;
	};
	//getter and setter
	public void setName(String name) {
		this.name =name;
	}
	
	public void setCountry(String country) {
		this.country= country;
	}
	
	public void setEstablishedDate(int establishedDate) {
		this.establishedDate= establishedDate;
	}
	
	public void setCourse(ArrayList<String> course) {
		this.course= course;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCountry() {
		return country;
	}
	public int getEstablishedDate() {
		return establishedDate;
	}
	
	public ArrayList<String> getCourse(){
		return course;
	}
	public String getInfo() {
		return name +" " +country+ " " +establishedDate+" "+course;
		
	}
	
	public static void main(String[] args) {
	
	
	}
	
	
}
