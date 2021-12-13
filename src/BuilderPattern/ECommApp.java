package BuilderPattern;

public class ECommApp {
	
	// returning current class(ECommApp)
	public ECommApp login() {
		System.out.println("default login");
		return this;
	}
	
	public ECommApp login(String un, String pw) {
		System.out.println("default login:" +un+ ":"+pw );
		return this;
	}
	
	public ECommApp search() {
		System.out.println("default search");
		return this;
	}
	public ECommApp search(String productName) {
		System.out.println("Search for: "+ productName);
		return this;
	}
	public ECommApp search(String productName, int rating) {
		System.out.println("search for :"+ productName + ":"+ rating);
		return this;
	}
	public ECommApp addToCart(String productName) {
		System.out.println("add to cart:"+productName);
		return this;
		
	}
	public ECommApp doPayment(String upi) {
		System.out.println("do payment via"+upi);
		return this;
	}
	public ECommApp doPayment(String CC, int cvv) {
		System.out.println("do payment via"+CC+":"+cvv);
		return this;
	}
	public ECommApp doPayment(String CC, int cvv, int otp) {
		System.out.println("do payment via"+CC+":"+cvv+":"+otp);
		return this;
	}
	public ECommApp generateOrderId() {
		System.out.println("order id is :"+ 1233);
		return this;
	}
	public ECommApp logOut() {
		System.out.println("LogOut");
		return this;
	}
	
	
}	
