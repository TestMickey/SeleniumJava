package FirstSession;

public class Browser {
	String name;
	double version;
	String vendor;

	public void getInfo(Browser br) {
		System.out.println(br.name + ""+ br.version + "" + br.vendor);
		
	}
	
	public void sum(int a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Browser b = new Browser();
		b.name="Chrome";
		b.version = 91.1;
		b.vendor= "Google";
		b.getInfo(b);// call by reference/pass by reference
		
		b.sum(12, 1533536);// call by value/pass by value
	}

}
