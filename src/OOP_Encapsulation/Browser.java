package OOP_Encapsulation;

public class Browser {
	
	public void launchBrowser() {
		System.out.println("launch browser");
		checkVersion();
		checkOSVersion();
		checkRAM();
		
		System.out.println("Browser is launched.");
	}
	
	public void checkVersion() {
		System.out.println("check version number");
	}
	
	public void checkOSVersion() {
		System.out.println("check OS version");
	}
	
	public void checkRAM() {
		System.out.println("check RAM");
	}
	

	

}
