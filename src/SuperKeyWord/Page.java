package SuperKeyWord;

public class Page {
	
	public Page() {
		System.out.println("Default Constructor");
	}
	
	public Page(int a) {
		System.out.println("Default Constructor" +a);
	}
	
	public Page(int b, int a) {
		System.out.println("Default Constructor" +(a+b));
	}
	
	int timeout = 100;
	
	public void display() {
		System.out.println("Page display.");
	}

}
