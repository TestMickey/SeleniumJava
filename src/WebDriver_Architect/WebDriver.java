package WebDriver_Architect;

public interface WebDriver extends SearchContext{
	
	@Override
	public void findElement();
	
	@Override
	public void findElements();
	
	
	public void click();
	public void sendKeys(String keys);
	public void get(String url);
	public String getTitle();
	public void Close();
	
	
	
	
}
