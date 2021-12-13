package SuperKeyWord;

public class LoginPage extends Page{
	
	
	int timeout = 200;
	
	public LoginPage() {
		// super is always first in calling the method, and can not have multiple super 
		super(10,20);
		System.out.println("Hi");
	}
	
	public void loginInfo() {
		System.out.println("Login Info Method");
		super.display();//parent
		display();//child
	}
	
	@Override
	public void display() {
		System.out.println("LP display.");
		super.display();
	}
	
	public void getTimeout() {
		System.out.println(timeout);
		System.out.println(super.timeout);
	}
}
