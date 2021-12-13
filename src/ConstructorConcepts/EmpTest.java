package ConstructorConcepts;

public class EmpTest {

	public static void main(String[] args) {
		Employee e1 = new Employee("Poonam", 101, 23, 20000, true, 'M');
		e1.name = "Poonam";
		e1.age = 25;
		e1.id = 101;
		e1.isPerm = true;
		e1.gender = 'M';
		
		System.out.println(e1.name+ e1.age);
		Employee e2 = new Employee(10);
		
		Employee e3 = new Employee("Tom", 201);
		System.out.println(e3.name + " "+ e3.id + " "+e3.age +" " +e3.isPerm+ " "+ e3.gender);
		
		Employee e4 = new Employee("Peter", 202, 30, 13.44, true, 'M');
		System.out.println(e4.isPerm);
		
		Users u1 = new Users("Niyanta", 25, true, "Banglore");
		Users u2 = new Users("Tom", "Surat");
		Users u3 = new Users("Ram", false, "Mumbai");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
