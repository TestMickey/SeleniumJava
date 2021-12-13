package FirstSession;

public class IfElseConditions {

	public static void main(String[] args) {
		int a = 20;
		int b = 20;
		
		if(a>b) {
			System.out.println("a is greater than b");
		
		}
		else {
			System.out.println("b is greater than a");
		}
		if(a==b) {
			System.out.println("both are equal");
		}
		
		if (false) {
			System.out.println("hi");
		}
		else {
			System.out.println("bye");
		}
		boolean t = true;
		if (t) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		int number = 101;
		if(number <= 100) {
			if (number >= 90) {
				System.out.println("Grade A");
			}
			if (number >= 75) {
				System.out.println("Grade B");
			}
		}
		else {
			System.out.println("invalid number");
		
		}
		
		
	/*String browser = "firefox";{
			if (browser.equals("chrome")) {
				System.out.println("launch chrome");
			}
			if (browser.equals("firefox")) {
				System.out.println("launch firefox");
			}
			if (browser.equals("safari")) {
				System.out.println("launch safari");
			}
			if (browser.equals("IE")) {
				System.out.println("launch IE");
			}
			else {
				System.out.println("please pass correct browser.");
			}
		}*/
		
		
		String browser = "firefox";
		
		if (browser.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if (browser.equals("firefox")){
			System.out.println("launch firefox");
		}
		else if (browser.equals("safari")) {
			System.out.println("launch safari");
		}
		else if (browser.equals("IE")) {
			System.out.println("launch IE");
		}
		else {
			System.out.println("pls pass the correct browser.");
		}
		
	}

}
