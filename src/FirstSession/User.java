package FirstSession;

public class User {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		
		User u1 = new User();
		u1.name = "Aarav";
		u1.age = 13;
		u1.city = "Delhi";

		User u2 = new User();
		u2.name = "Vihaan";
		u2.age = 5;
		u2.city = "Mumbai";
		
		User u3 = new User();
		u3.name = "Parag";
		u3.age = 30;
		u3.city = "Vadodara";
		
		
		System.out.println(u1.name + " " + u1.age+ " " + u1.city + " ");
		System.out.println(u2.name + " " + u2.age+ " " + u2.city + " ");
		System.out.println(u3.name + " " + u3.age+ " " + u3.city + " ");
		
		
		u1 = u2;
		System.out.println(u1.name + " " + u1.age+ " " + u1.city + " ");
		System.out.println(u2.name + " " + u2.age+ " " + u2.city + " ");
		System.out.println(u3.name + " " + u3.age+ " " + u3.city + " ");
		
		u2=u3;
		System.out.println(u1.name + " " + u1.age+ " " + u1.city + " ");
		System.out.println(u2.name + " " + u2.age+ " " + u2.city + " ");
		System.out.println(u3.name + " " + u3.age+ " " + u3.city + " ");
		
		u3=u1;
		System.out.println(u1.name + " " + u1.age+ " " + u1.city + " ");
		System.out.println(u2.name + " " + u2.age+ " " + u2.city + " ");
		System.out.println(u3.name + " " + u3.age+ " " + u3.city + " ");
	}

}
