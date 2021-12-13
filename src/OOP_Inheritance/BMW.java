package OOP_Inheritance;

public class BMW extends Car{
	
	
	// method overriding from Parent class(Car)- poly(many) +Morphism(froms)- Runtime polymorphism
	
	//method overloading - only within the same class - Polymorphism - Compile Time polymorphism
	
	//Method Override same method name with variable requirements
	
	@Override
	public void start() {
		System.out.println("BMW Start");
	}
	
	public int start(int a) {
		System.out.println("BMW Start with A");
		return 200;
	}
	
	
	//Individual class method
	public void autoParking() {
		System.out.println("BMW autoPark");
	}
	
	
	
	
	
	
	

}
