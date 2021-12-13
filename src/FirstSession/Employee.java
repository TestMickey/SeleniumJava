package FirstSession;

//Employee- Class
//Class - Non Primitive Data Type

public class Employee {
	
	
	// Class - Properties / Template
	String name;
	int age;
	String city;
	double salary;
	boolean isPerm;

	public static void main(String[] args) {
		
		// e1 = Object /ref name
		Employee e1 = new Employee();
		//RHS -> new Employee (); - is the object
		
		e1.name = "Tomy";
		e1.age = 32;
		e1.city = "Surat";
		e1.salary = 11.23;
		e1.isPerm = true;
		
		System.out.println(e1.name + " " + e1.age + " " + e1.city + " " + e1.salary +" "+e1.isPerm+" ");
		
		
		// without giving values of Object
		Employee e2 = new Employee();
		System.out.println(e2.name + " " + e2.age + " " + e2.city + " " + e2.salary +" "+e2.isPerm+" ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
