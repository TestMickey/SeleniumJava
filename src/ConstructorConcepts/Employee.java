package ConstructorConcepts;

public class Employee {
	String name;
	int id;
	int age;
	double salary;
	boolean isPerm;
	char gender;
	
	//constructor:
	//name of the constructor is always same as class name
	
	// constructor can not have any return type. No void, No return
	//construcor will be called when you create object of the class
	
	
	/*public Employee() {// 0 param/default constructor
		System.out.println("Default constructor = 0");
		
	}*/
	
	public Employee(int a) {// 1 param constructor
		System.out.println(a);
		
	}
	
	public Employee(String name, int id) {// 2 param constructor
			this.name = name;
			this.id= id;
	}
	
	public Employee(String name, int id, int age) {
		this.name = name;
		this.id= id;
		this.age= age;
	}
	
	public Employee(String name, boolean isPerm) {
		this.name = name;
		this.isPerm = isPerm;
	}

	public Employee(String name, char gender) {
	
		this.name = name;
		this.gender = gender;
	}

	public Employee(String name, int id, int age, double salary, boolean isPerm, char gender) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.isPerm = isPerm;
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
