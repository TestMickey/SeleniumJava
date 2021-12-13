package FirstSession;

public class LoopsConcepts {

	public static void main(String[] args) {
		//1. while loop
		//While Loop we use when we do not know number of cycles. 
		int i= 1;// Starting point of loop. but does not start from here
		while (i<=10) {//starts from Conditional statement
			System.out.println(i);//1,2..10
			//i++; Correct
			//++i;Correct
			i=i+1;//correct//incremental to decremental
		}
		
		int k=1;
		while (true) {
			System.out.println(k);//1,2,3...20
			k++;
			if (k==21) {
				break;
			}
		}
		
		
		//Homework
		int u=10;
		while (u>=1) {
			System.out.println(u);
			u--;
		}

		//Infinite Loop Example
		while (true) {
			System.out.println("Welcom to Hotel Taj!");
			break;
		}
		
		System.out.println("-----------------");
		//2. For Loop
		//typical for loop(index based for loop)
		// can also put int value seperate before for loop starts
		int p=1;
		for (; p<=10; p++) {
			System.out.println(p);
			
		}
		
		/*for (int g=1; g<=10; ) {
		System.out.println(g);	
		}*/
		
		
		//Infinite loop example
		/*for (;;) {
			System.out.println("welcome to Hotel Taj!");
		}*/
		
		//even numbers up to 10
		int z=2;
		for (;z<=10; z=z+2 ) {
			System.out.println(z);
		}
		
		//odd numbers up to 100
		int odd=1;
		for (; odd<=100; odd=odd+2) {
			System.out.println(odd);
		}
		
		for(double d=1.0; d<=10.0; d++) {
			System.out.println(d);
		}
		
		for(char t='a'; t<='z'; t++) {
			System.out.println(t);
		}
		
		// to print ASCI Value
		for (int b= 97; b<=122; b++ ) {
			System.out.println((char)b);
		}
		
		for (int l=1; l<=100; l++) {
			System.out.println(l);
			if(l%5==0) {
				System.out.println("hi");
			}
		}
		System.out.println("-----------------");
		//3. DO While Loop
		
		int r=1;
		do {
			r++;
		System.out.println(r);	
		}
		while(r<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
