package OOP_Abstract;

public class AmazonTest {

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.title();
		lp.header();
		lp.doLogin("new", "password");
		
		
		HomePage hp = new HomePage();
		hp.header();
		hp.title();
		hp.url();
		hp.logOut();
		
		
		
		//top casting
		// child class object can be referred by parent abstract class.
		Page p = new HomePage();
		p.url();
		p.header();
		p.title();
		
		
		// down casting -- CT compile time not allowed
		//LoginPage l1 = new Page();

	}

}
