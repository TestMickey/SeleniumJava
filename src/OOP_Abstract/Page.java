package OOP_Abstract;

// abstract class object can not be created
// abstract method means no body

// but abstract constructor can be created
public abstract class Page {
	
	
	public Page() {
		System.out.println("page default constructor ");
	}
	
	public Page(int a) {
		System.out.println("Page one param constructor");
		
	}
	
	public abstract void title();
	public abstract void url();
	
	public void header() {
		System.out.println("page -header");
		
	}
	
	public final void logo() {
		System.out.println("page - logo");
	}


}
