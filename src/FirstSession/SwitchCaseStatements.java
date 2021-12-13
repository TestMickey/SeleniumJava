package FirstSession;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		
		String browser = "Chrome";
		
		switch (browser.toLowerCase()) {
		case "opera":
			System.out.println("launch chrome");
			break;
		case "safari":
			System.out.println("launch safari");
			break;
		case "firefox":
			System.out.println("firefox");
			break;
		case "IE":
			System.out.println("IE");
			break;

		default:
			System.out.println("pls pass correct browser.");
			break;
		}	
		
		int marks = 90;
		
		switch (marks) {
		case 100:
			System.out.println("Grade A");
			break;
		case 90:
			System.out.println("Grade B");
			break;

		default:
			System.out.println("Fail");
			break;
		}
		
		/*switch-case is not applicable for boolean expressions
		int num =10;
		switch (num<=10){
	System.out.println("FAIl");
		break;
		
		default:
		break;
		
		
		*/
		
		
		double d1 =12.33;
		double d2 =12.34;
		
		if (d1==d2) {

		}
		
		
		//< <= => > == !=
		boolean flag = true;
		if (!flag) {
			System.out.println("Bye");
		}
		else {
			System.out.println("Pass");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
