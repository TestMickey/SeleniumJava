package BuilderPattern;

public class TestAmazon {

	public static void main(String[] args) {
		
		//method chaining builder pattern
		
		//UC1
		ECommApp user = new ECommApp();
		user.login("name", "username").search("Nike Shirt").doPayment("this is upi"+ 0).generateOrderId().logOut();
		
		
		//UC2
		
		user.login("name", "username").search("Amazon Gift Card").generateOrderId().logOut();
		

	}

}
