package ConstructorConcepts;

public class TestCustomer {

	public static void main(String[] args) {
		
		Customer c1= new Customer("Tom", 30, "IBM");
		
		System.out.println(c1.getName());
		
		System.out.println(c1.getAge());

		System.out.println(c1.getComp());
		
		c1.name = "Tom22";
		c1.age = 55;
		
		System.out.println(c1.getName());
		
		System.out.println(c1.getAge());

		System.out.println(c1.getComp());
		
		
		Customer c2 = new Customer();
		c2.setName("Piku");
		c2.setAge(50);
		c2.setComp("MS");
		
		
		
		System.out.println(c2.getName());
		
		System.out.println(c2.getAge());

		System.out.println(c2.getComp());
		
 

	}

}
