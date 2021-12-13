package FirstSession;

public class Persons {
	public void m1() {
		System.out.println("Print M1");
		m2();
		
	}
	
	public void m2() {
		
		System.out.println("Print M2");
		m3();
		
	}
	
	public void m3() {
		System.out.println("Print M3");
		
	}
	
	// calling static method inside static method
	public static void s1() {
		System.out.println("s1");
		s2();
		Persons pp = new Persons();// calling class methods inside statis class methods
		pp.m1();
		
	}
	
	public static void s2() {
		System.out.println("s2");
		s3();
	}
	
	public static void s3() {
		System.out.println("s3");
		s1();
	}
	

	public static void main(String[] args) {
		
		Persons p1 = new Persons();
		p1.m1();
		p1.m2();
		
		
		Persons.s1();// calling static class methods inside Object
	}

}
