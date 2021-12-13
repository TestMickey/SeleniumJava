package WebDriver_Architect;

public class ChromeDriver implements WebDriver{
	
	public void chromeDriver() {
		System.out.println("launch chrome");
	}
	
	@Override
	public void findElement() {
		System.out.println("Find element");
		
	}

	@Override
	public void findElements() {
		System.out.println("Find elements");
		
	}

	@Override
	public void click() {
		System.out.println("click");
		
	}

	@Override
	public void sendKeys(String keys) {
		System.out.println("enter value" + keys);
		
	}

	@Override
	public void get(String url) {
		System.out.println("enter url" +url );
		
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void Close() {
		// TODO Auto-generated method stub
		
	}

}
