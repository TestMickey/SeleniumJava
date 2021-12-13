package FirstSession;

public class Customers {
	String name;
	int id;
	static String city = "Banglore";
	static String paymentMethod = "CC";
	
	public void getInfo() {
		System.out.println("Get Info...");
	}
	
	public static void sendMail() {
		System.out.println("Send Mail....");
	}
	
	public static void main(String[] args) {
		
		Customers cust = new Customers();
		
		// how to call static method
		//1. call directly
		sendMail(); // as it's static
		cust.getInfo();// as it's not static we need to use object to call class methods
		
		//2. using class name
		Customers.sendMail();
		
		//3. call with object
		cust.sendMail();

	}

}
