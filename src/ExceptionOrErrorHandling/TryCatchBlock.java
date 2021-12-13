package ExceptionOrErrorHandling;

public class TryCatchBlock {
	
	String name;
	
	public static void main(String[] args) {
		
		
		System.out.println("A");
		System.out.println("A");
		System.out.println("A");
		
		TryCatchBlock obj = new TryCatchBlock();
		obj.name = "Tom";
		obj = null;
		System.out.println(obj.name);//NPE
		
		
		//create arithmetic exception
		try {
		int i =9/3;
		System.out.println("Hii");
		}
		
		/*catch (Error m) {
			System.out.println("some exception is coming....");
			m.printStackTrace();
		}*/
		catch (ArithmeticException e) {
			System.out.println("some exception is coming....");
			e.printStackTrace();
			
		}
		catch(NullPointerException n) {
			System.out.println("NPE is coming...");
			n.printStackTrace();
		}
		
		
		System.out.println("B");
		System.out.println("B");
		System.out.println("B");

	}

}
