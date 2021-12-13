package FirstSession;

import java.util.ArrayList;

public class Customer {
	// productName = parameter
	
	public ArrayList<String> doSearch(String productName) {
		System.out.println("Searching the product..." + productName);
		ArrayList<String> prodList = new ArrayList<String>();
		switch (productName) {
		case "Apple":
			prodList.add("iPhone12");
			prodList.add("Macbook");
			prodList.add("iPad");
		break;
		case "Samsung":
			prodList.add("S8");
			prodList.add("Note");
			prodList.add("Tablet");
			
		break;
		case "HP":
			prodList.add("Headphones");
			prodList.add("Laptop");
			
		break;
		default:
			System.out.println("product category not found ...." + productName);
			break;
		}
		return prodList;
	}
	
	//WAF(Write a Function)- launch the browser(launch browser logic)
	//input param: browserName(String)
	//return: void
	public void launchBrowser(String browserName, int version) {
		System.out.println("the browser name is: " + browserName);
		
		if(browserName.equals("chrome")) {
			System.out.println("launch chrome");
		}
		else if(browserName.equals("safari")){
			System.out.println("launch safari");
		}
		else if (browserName.equals("ff")) {
			System.out.println("launch ff");
		}
		else {
			System.out.println("please provide correct browser name." +browserName);
		}
		
		
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		//customer is object Class
		//C1 - RHS
		Customer c1 = new Customer();
		ArrayList<String> appleList= c1.doSearch("Apple");// Apple is a method argument
		System.out.println(appleList.size());
		System.out.println(appleList);
		
		
		ArrayList<String> samsungList = c1.doSearch("Samsung");
		System.out.println(samsungList.size());
		System.out.println(samsungList);
		
		for (String e :samsungList) {
			System.out.println(e);
		}
		
		ArrayList<String> nokiaList = c1.doSearch("Nokia");
		System.out.println(nokiaList.size());
		System.out.println(nokiaList);
	}

}
