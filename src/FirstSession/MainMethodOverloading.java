package FirstSession;

public class MainMethodOverloading {
	
	// if we do method overloading then also it will be printed only which has, static, void and main (with one parameter) because JVM understand only this. 

	
	public static void main(String [] naveeen) {//[] is array parameter not a string
		System.out.println("Main 1");
	}
		
		public static void main(int a) {
			System.out.println("Main 2"+a);

	}
		
		public static void main(String a) {
			System.out.println("Main 4"+ a);
			
		}
		
		public static void main(int a, int b) {
			System.out.println("Main 3"+ a+b);

}
}
