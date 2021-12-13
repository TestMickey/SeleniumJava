package FirstSession;

public class Ecomm {
	
	//method overloading
	//within the same class, when you have number of methods:
	//1. with the same name
	//2. different parameters
	//3. different types of parameters
	
	public void login() {//0
		System.out.println("default login");
		
	}
	public int login(String un, String pwd) {//2
		System.out.println("login with" + un +":" + pwd);
		return 100;
	}
	
	public void login(int otp, String un) {//2
		System.out.println("login with" + otp +":"+un);
	}
	
	public void login(String un, String pwd, String otp) {//3
		System.out.println("login with :"+ un+ ":"+ pwd +":"+otp);
	}
	public void login(long ph, int otp) {//2
		System.out.println(ph + ":"+ otp);
	}
	public void login(int otp, long ph) {//2
		System.out.println(ph +":" + otp);
	}
	public void login(int otp, String un, double num) {//3
		System.out.println(un+":"+otp);
	}
	
	// Search feature
	public void search() {
		
	}
	public void search(String name) {
		
	}
	public void search(String name, int price) {
		
	}
	public void search(String name, int price, String seller) {
		
	}
	//payment
	public void doPayment(String cc, int otp, String pwd) {
		
	}
	public void doPayment(long ph, int otp, String upi) {
		
	}

	
	//uber
	//booking
	public void booking(String st, String end) {
		
	}
	
	public void booking(String st, String end, String carType) {
		
	}
	public void booking(String st, String end, String carType, String couponCode) {
		
	}
	public static void main(String[] args) {
	Ecomm e1 = new Ecomm();
	e1.login("admin", "admin");
	e1.booking("Koramangalm", "Whitefield");
	}

}
