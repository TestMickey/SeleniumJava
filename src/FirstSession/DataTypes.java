 package FirstSession;

public class DataTypes {
	
	public static void main(String[] args) {
		
		//Data Types
		//Strict Type
		
		//1. Primitive Data Types: Don't need any object
			//a. Boolean Type : boolean (true/false)
			//b. Numeric Type : 
				//I. character type: char
				//II. Integral type:
					//- Integer : byte, int, short, long
					//- Floating-point : float, double
		//2. Non primitive Data Types : Do need Object
			// String, Array, Interface, Classes
		
		
		//1. byte
		//size: 1 byte = 8 bits
		//range: -128 to 127
		byte a =10;
		a=20;
		a=30;
		int x = 350;
		
		
		System.out.println(a);
		System.out.println(x);
		
		//2. int 
		//size: 4 bytes = 32 bits
		// range : -2147483648 to 214783647
		int i = 23450;
		int i1 = -190;
		
		System.out.println(i);
		System.out.println(i1);
		
		//3. short
		//size : 2 byte = 16 bits
		//range: -32768 to 32767
		short s1  = 1234;
			System.out.println(s1);
		
		//4. long
		// size: 8 byte - 64 bits
		//range : -9223372036854775808 to 922337203685477807
			long pop = 100000000;
			//long g = 7777777777;
			System.out.println(pop);
			
		//5. float 
		// size: 4 byte = 32 bits
		//range : after. (upto 7 decimal digits)
			
		float f1 = 12.33f;
		float f2 = (float)34.55;
		System.out.println(f1+f2);
		
		//6. double
		//size: 8 byte = 64 bits
		//range: after. (upto 16 decimal digits)
		
		double d1 = 5.777777;
		double d2 = 34.555;
		System.out.println(d2+d1);		
		
		
		//7. Char
		//size: 2 byte =16 bits
		//single digit value
		char c1 = 'e'; //a-z, A-Z
		char c2 = '5'; //0-9
		char c3 = '$';
		
		//chinese, unicode
		System.out.println(c3);
		
		// 8. boolean (true/false)
		//size: ~1
		boolean flag = true;
		boolean flag1 = false;
		System.out.println(flag);
		
		//9. Octal Number
		// It can not go beyond 077. 
		byte t = 065;//Octal Number
		System.out.println(t);
		
		
		// Print below things:
		//00 01 02 03 04
		//10 11 12 13 14
		//20 21 22 23 24
		//30 31 32 33 34
		
		for (int m =0; m<5; m++) {
			for (int n=0; n<5; n++) {
				System.out.print(m+""+n+" ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
