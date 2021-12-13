package HomeWork;

public class HomeWork {

	public static void main(String[] args) {
		//1. Loops Assignment
		while (true) {
			System.out.println("I am Batman.");
			break;
		}
		System.out.println("-------------");
		//2. WAP to print (I am Batman 1, 2, 3...)
		int i=1;
		System.out.println(i);
		for (; i<=9; i++) {
			System.out.println("I am Batman " +i);
		}
		System.out.println("-------------");
		//3.1 For Loop- 10 to 1
		
		//for(int k=--l; k>1;)
		for (int l=10; l>0; --l){
			
			System.out.println(l);
		}
		System.out.println("-------------");
		//3.2 while Loop- 10 to 1
		int u=10;
		while (u>=1) {
			System.out.println(u);
			u--;
		}
		System.out.println("-------------");
		//3.3 Do While Loop - 10 to 1
		int r=11;
		do {
			--r;
		System.out.println(r);	
		}
		while(r>1);
		System.out.println("-------------");
		
		//4. "Hello World" 10 times
		
		int p = 1;
		while(p<10) {
			p++;
			System.out.println("Hello World" );
			
		} 
		System.out.println("-------------");
		//5.print 1 to 10 using while loop but quit if multiple of 7 is encountered
		
		int q = 0;
		while (q<10) {
			if(q==7) {
				continue;
			}
			System.out.println(q);
			q++;
			break;
		}
		
		System.out.println("-------------");
		//6. 'Hello' on screen and then print your name on a separate line.
		System.out.println("Hello");
		String name = "Niyanta";
		System.out.println(name);
		
		System.out.println("-------------");
		//7.the sum of two numbers. 74+36= 110
		
		byte b1 = 74;
		byte b2 = 36;
		System.out.println(b1+b2);
		
		System.out.println("-------------");
		//8.divide 50/3= 16
		
		byte n1 = 50;
		byte n2 = 3;
		System.out.println(n1/n2);
		
		System.out.println("-------------");
		//9. -5 + 8 * 6= 43
		byte a= -5;
		byte b = 8;
		byte c = 6;
		System.out.println(a+(b*c));
		
		System.out.println("-------------");
		//10. 55+9) % 9 =1
		byte d= 55;
		byte e = 9;
		byte f = 9;
		System.out.println((d+e)%f);
		
		System.out.println("-------------");
		//11.20 + -3*5 / 8 = 19
		byte g = 20;
		byte h = -3;
		byte j = 5;
		byte k = 8;
		System.out.println((h*j)/k+g);
		
		System.out.println("-------------");
		//12. 5 + 15 / 3 * 2 - 8 % 3 =13
		byte m= 5;
		byte n= 15;
		byte s= 3;
		byte t = 2;
		byte v= 8;
		byte w= 3;
		System.out.println(m+n/s*t-v%w);
		
		System.out.println("-------------");
		
		//13. ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)) = 2.138888888888889
		double a1=25.5;
		double a2 = 3.5;
		double a3 = 40.5;
		double a4 = 4.5;
		System.out.println((a1*a2-a2*a2)/ (a3-a4));
		
		System.out.println("-------------");
		//14. Try concatenation  "Hello Selenium" with a character 't'.
		
		String a5 = "Hello Selenium";
		char a6 = 't';
		System.out.println(a5+" "+a6);
		
		//15. Create three int variables having values like : 100, 200, 3400. Add them and concatenate and generate this output String : Your Total amount is. 3700".
		System.out.println("-------------");
		int c1 = 100;
		int c2 = 200;
		int c3 = 3400;
		System.out.println("Your Total amount is :"+(c1+c2+c3));
		
		System.out.println("-------------");
		//16. out put for b3= 065;
		int b3= 065;
		System.out.println(b3);
		
		System.out.println("-------------");
		//17. print greatest number
		int d1= 25;
		int d2 = 78;
		int d3 = 87;
		if (d1>d2) {
			System.out.println("The greatest number is :" + d1 );
		}
		else if (d2>d3) {
			System.out.println("The greatest number is :"+d2);
		}
		else {
			System.out.println("The greatest number is :"+ d3);
		}
		
		System.out.println("-------------");
		//18. test a number is positive or negative.
		int m1= 35;
		int m2 = -11;
		if (m1 <0) {
			System.out.println("This value is negative number" + m1);
		}
		else if (m2<0) {
			System.out.println("This value is negative number" +m2);
		}
		else {
			System.out.println("All numbers are positive values");
		}
		
		System.out.println("-------------");
		//19. Array Assignment
		for (int z= 0; z<9; z++) {
			for (int x = 0; x<9; x++) {
				System.out.print(z+""+x+" ");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		//20. Create static array
		int age[] = new int[4];
		age[0] = 20;
		age[1] = 25;
		age[2] = 26;
		age[3] = 32;
		
		String cricketer[] = new String[4];
		cricketer[0] ="Axar Patel";
		cricketer[1] ="Harshal Patel";
		cricketer[2] ="Rohit Sharma";
		cricketer[3] ="Sachin Tedulkar";
		
		double runRate [] = new double[4];
		runRate[0] = 80.12;
		runRate[1] = 89.12;
		runRate[2] = 85.12;
		runRate[3] = 80.12;
		
		System.out.println("Cricketrs Data are as below:");
		System.out.println(cricketer[0] +"'s age is "+ age[0]+ " and runrate is " +runRate[0] +".");
		System.out.println(cricketer[1] +"'s age is "+ age[1]+ " and runrate is " +runRate[1]+".");
		System.out.println(cricketer[2] +"'s age is "+ age[2]+ " and runrate is " +runRate[2]+".");
		System.out.println(cricketer[3] +"'s age is "+ age[3]+ " and runrate is " +runRate[3]+".");
		
		
		
		System.out.println("-------------");
		//21. print n==4...
		for(int y=4; y>-1; y--) {
			System.out.println("N ="+ y);
		}
		
		//22 Array List
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
  }
		
		

}
