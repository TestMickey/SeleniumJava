package ExceptionOrErrorHandling;

public class ThrowsKeyWord {
	
	public void m1() {
		System.out.println("m1");
	}
	
	public void m2() {
		System.out.println("m2");
	}
	
	public void m3() throws ArithmeticException{
		System.out.println("m3");
		int i = 9/0;
	}
	
	
	

	public static void main(String[] args) throws ArithmeticException {
		ThrowsKeyWord obj = new ThrowsKeyWord();
		obj.m1();
		

	}

}
