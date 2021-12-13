package OOP_Interface;

public interface USMedical extends WHO{
	
	public final static int min_fee = 100;
	
	// can not have method body
	// only method prototype
	//only method declaration
	// can not have business logic
	
	//abstract method or declare method
	public void physioServices();
	public void cardioServices();
	public void oncologyServices();
	public void emergencyServices();
	
	
	//after jdk 1.8
	//1. you can have static methods with the body.
	public static void billing() {
		System.out.println("US Medical --- biling");
	}
	
	//2. you can have default method
	default void medInsurance() {
		System.out.println("US Med Insurance");
	}

}
