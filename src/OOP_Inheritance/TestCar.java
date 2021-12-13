package OOP_Inheritance;

public class TestCar {

	public static void main(String[] args) {
		
		
		BMW b = new BMW();
		b.start();// this one is coming from overridden BMW child class
		b.stop();//Inherited from Car Class
		b.refuel();//Inherited
		b.autoParking();//Individual method of BMW child class
		b.engine();
		BMW.drive();
		b.drive();
		
		
		Car c = new Car();
		c.start();//parent class method will be called
		c.stop();
		c.refuel();
		//autoParking can not be accessed as it's a child class property. 
		Car.drive();
		
		//child class object can be referred by parent class reference variable.
		//top casting
		Car c1 = new BMW();
		c1.start();// will be taking child class method. 
		c1.stop();
		c1.refuel();
		// auto parking will not be access as it's owner's property which is BMW. 
		
		
		
		//down casting-- not allowed in JAVA.
		//parent class object can be referred by child class reference variable?
		/*BMW b1 = (BMW)new Car();// Class Cast Exception error
		b1.start();*/
		
		//Grant parent class object can be referred by child class reference variable. 
		/*BMW b2 = (BMW) new Vehicle();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
