package ConstructorConcepts;

public class Customer {
	
	String name;
	int age;
	String comp;
	public Customer(String name, int age, String comp) {
		this.name = name;
		this.age = age;
		this.comp = comp;
	}
	
	public Customer() {
		
	}
	public String getName() {
		return name;
	}
	
	

	//getter and setter
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getComp() {
		return comp;
	}
	public void setComp(String comp) {
		this.comp = comp;
	}
	
	//feature/method
	public String getCustomerInfo() {
		return name +" " + age + " "+ comp;
	}
	
	
	
	

}
