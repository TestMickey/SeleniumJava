package FirstSession;

public class Car {
	String name;
	int price;
	String color;
	static int wheels = 4;

	public static void main(String[] args) {
	
		Car c1 = new Car();
		c1.name = "Audi";
		c1.price = 100;
		c1.color = "Blue";
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 100;
		c2.color = "Blue";
		
		Car c3 = new Car();
		c3.name = "Audi";
		c3.price = 100;
		c3.color = "Blue";
		
		System.out.println(c1.name+" : "+ c1.price + " : "+c1.color );
		
		// how to access static variables
		//1. within the same class, you can access them directly
		System.out.println(Car.wheels);
		
		//2. Call by the class name
		System.out.println(Car.wheels);
		
		//3. call by obj reference
		System.out.println(c1.wheels);

	}

}
