package FirstSession;

public class TestBlock {
	static{
		System.out.println("Static Block");
	}
	
	public static void test () {
		System.out.println("test");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is main method");
		test();
	}

}
