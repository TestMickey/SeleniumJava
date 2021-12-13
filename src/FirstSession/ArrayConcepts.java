package FirstSession;

public class ArrayConcepts {

	public static void main(String[] args) {
		
		// 2 Big Problems of Array
		//1. size is limited(static Array) : to overcome this problem, use dynamic array- ArrayList
		//2. similar type of data : to overcome this problem, use dynamic array - ArrayList/Static Object Array
		
		
		//use Cases for Static Array:
		//Months 12
		//Days 7
		
		//Learning Array
		//1.int Array
		int i[] = new int [4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		System.out.println(i[0]);
		System.out.println(i[3]);
		/*System.out.println(i[4]);//ArrayIndexOutOfBoundsException

		System.out.println(i[-1]);//ArrayIndexOutOfBoundsException- It can never be negative
		System.out.println(i);*/
		
		System.out.println(i[0]+i[2]);
		
		int len = i.length;
		System.out.println("Length =" +len);
		System.out.println("Hi =" +(len-1));
		System.out.println("Lo=" + 0);
		
		
		//print all the values from array: for loop
		for (int k=0; k<=len-1; k++) {
			System.out.println(i[k]);
		}
		
		//for each loop: enhanced for loop
		
		for (int e :i) {
			System.out.println(e);
		}
		
		//double array:
		double d[] = new double [3];
		d[0] =12.33;
		d[1] = 100;
		d[2] = 34.55;
		
		System.out.println(d[2]);
		
		
		//char array:
		char c[] = new char [3] ;
		c[0] = 'a';
		c[1] = '$';
		c[2] ='3';
		
		for (char e:c) {
			System.out.println(e);
		}
		
		String lang[] = new String[4];
		
		lang[0] = "JAVA";
		lang[1] = "PYTHON";
		lang[2] = "JS";
		lang[3] = "RUBY";
		
		System.out.println(lang[0] + lang[1]);
		
		for (int p=0; p<lang.length; p++) {
			System.out.println(p+":"+lang[p]);
		}
		
		for (String e : lang) {
			System.out.println(e);
		}
		
		//Object Array:
		Object emp[] = new Object[4];
		emp[0]="Tom";
		emp[1] = 25;
		emp[2] = 'm';
		emp[3] = 23.44;
		
		for (Object e : emp) {
			System.out.println(e);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
	}

}
