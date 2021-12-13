package OOP_Encapsulation;

public class AmazonTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage();
		lp.setUserName("Niyanta@gmail.com");
		lp.setPassword("Pancholi123");
		
		lp.loginMethod(lp.getUserName(), lp.getPassword());
		
		lp.setPassword("Pancholi44444444");
		lp.loginMethod(lp.getUserName(), lp.getPassword());
		
		
		LoginPage lp1 = new LoginPage();
		lp1.loginMethod(lp1.getUserName(),lp1.getPassword());
	}

}
