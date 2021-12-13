package OOP_Inheritance;

public class Car extends Vehicle{

	public void start() {
		System.out.println("Car Start");
	}
	
	public void stop() {
		System.out.println("Car Stop");
	}
	
	public void refuel() {
		System.out.println("Car Refuel");
	}
	
	
	// static methods can not be override
	public static void drive() {
		System.out.println("Car drive");
	}
}
