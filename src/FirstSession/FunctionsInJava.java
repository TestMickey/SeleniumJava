package FirstSession;

public class FunctionsInJava {
	// can not create a function inside a function. Ex: can not create function inside main - as "main" is also a function
			// can call the functions from other function 
			
			//1. no input and no return
			// void -  no return
			
			public void test () {
				System.out.println("test method");
				int i = 10;
				System.out.println(i);
			}
			
			public void getPrint() {
				System.out.println("print this paper");
			}
			
			//2. no input but some return type is int
			public int getBalance() {
				
				System.out.println("get balance");
				int fee = 10;
				int tax = 5;
				int total = fee+tax;
				return total;
				
			}
			
			public String getTrainerName() {
				System.out.println("get trainer name");
				String name = "Neha";
				return name;
			}
			
			
			public boolean isEmpActive() {
				System.out.println("is emp active?");
				//boolean flag = true;
				return true;
				
			}
			
			//3. some input and some return
			
			public int add(int a, int b) {
				System.out.println("add number");
				int z = a+b;
				return z;
			}
			
			public int getCourseFee(String courseName) {
				System.out.println("get course fee for : "+courseName);
				
				if (courseName.equals("Selenium")) {
				return 100;
			}
			
			else if (courseName.equals("API")) {
				return 200;
			}
			
			else if (courseName.equals("Mobile")) {
				return 300;
			}
			else {
				System.out.println("Course not found....");
				return -1;
			}
			}

	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		obj.test();
		obj.getPrint();
		int p = obj.getBalance();
		System.out.println(p);// this is a good approach so we can use this (p)function again. 
		
		System.out.println(obj.getBalance());		
		
		String n1 = obj.getTrainerName();
		System.out.println("The trainer name is " + n1);
		
		if (obj.isEmpActive()) {
			System.out.println("Pass");
		}
		
		boolean b = obj.isEmpActive();
		System.out.println(b);
		
		int s1 = obj.add(10, 20);
		System.out.println(s1);
		
		 int f1 = obj.getCourseFee("Selenium");
			System.out.println(f1);

		int f2 = obj.getCourseFee("c#");
		System.out.println(f2);
		
		if (f2==-1) {
			System.out.println("this course is not available.");
		}
		
		
		
		
		

	}

}
