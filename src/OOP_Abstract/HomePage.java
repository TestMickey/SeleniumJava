package OOP_Abstract;

public class HomePage extends Page{

	@Override
	public void title() {
		System.out.println("Home page title");
		
	}

	@Override
	public void url() {
		System.out.println("Home Page Url");
		
	}
	
	public void header() {
		System.out.println("Home page header");
	}
	
	public void logOut() {
		System.out.println("User is logged out");
	}

}
