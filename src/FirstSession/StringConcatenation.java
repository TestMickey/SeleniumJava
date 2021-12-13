package FirstSession;

public class StringConcatenation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "hello world";
		String s1 = "100";
		String ph = "9923244255";
		String cc = "1234 2222 5555 2124";
		
		String x = "Hello";
		String y = "Testing";
		
		int a = 100;
		int b = 200;
		
		System.out.println(a+b);//addition
		System.out.println(x+y);//concat operator
		
		System.out.println(x+a);
		System.out.println(a+x);
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		System.out.println(x+y+(a+b));
		
		System.out.println(x+y+a+b+a+b);
		
		System.out.println("the value of a:"+a);
		System.out.println("the value of b:"+b);
		System.out.println("the sum :"+(a+b));
		
		System.out.println(x+""+y);
		
		double c = 12.33;
		double d = 34.55;
		
		System.out.println(x+y+c+d);
		
		char c1 = 'a';//97
		char c2 = 'b';//98
		
		System.out.println(c1+c2);
		//ASCI Values
		//A-Z : 65 to 90
		//a-z : 97 to 122
		//0-9 : 48 to 57
		
		System.out.println(c1+""+c2);
		
		byte b1 = 60;
		byte b2 = 50;
		
		System.out.println(b1+b2);
		
		int b3 = b1+b2;
		System.out.println(b3);
		
		
		int g = 10;
		int h = 3;
		System.out.println(g/h);
		
		System.out.println(10/2);
		System.out.println(10.0/2);
		System.out.println(10.0/2.0);
		System.out.println(10/2.0);
		System.out.println(10/3.0);
		
		//System.out.println(0/9);//Arithmetic Exception
		
		
		//System.out.println(0/0);//Arithmetic Exception
		
		System.out.println(0.0/0);//NaN (Not a number)
		System.out.println(0/0.0);//NaN (Not a number)
		System.out.println(0.0/0.0);//NaN
		System.out.println(5/0.0);//Infinity
		System.out.println(5.0/0/0);//Infinity
		
		
		char t = 'z';
		System.out.println((int)t);
		
		
		
		
		
		


		

	}

}
