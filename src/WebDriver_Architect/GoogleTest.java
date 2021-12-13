package WebDriver_Architect;

public class GoogleTest {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		//ChromeDriver cm = new ChromeDriver();
		//cross browser logic
		String browser = "safari";
		if (browser.equals("chrome")) {
			driver  = new ChromeDriver();
		}
		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}
		else if (browser.equals("firefox")) {
			driver = new FireFoxDriver();
		}
		else {
			System.out.println("launch no browser");
		}
		
		
		
		
		
		
		String title= driver.getTitle();
		driver.get("www.google.com");
		System.out.println(title);
		
		driver.findElement();
		driver.findElement();
		driver.sendKeys("keys");
		driver.Close();
		

	}

}
