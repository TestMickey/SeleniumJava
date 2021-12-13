package OOP_Abstract;

public class LoginPage extends Page {

	
	// default constructor -- hidden constructor by JAVA
	
	public LoginPage() {
		System.out.println("Login page default constructor ");
	}
	
	@Override
	public void title() {
		System.out.println("Login Page Title");
		
	}

	@Override
	public void url() {
		System.out.println("Login Page URL");
		
	}
	
	public void doLogin(String username, String password) {
		System.out.println("Login"+ username+"password" +password);
	}
	
	public void doLogin(String username, String password, int phone) {
		System.out.println("Login"+ username+"password" +password+ "phone"+phone);
	}

}
