package StringConcepts;

public class StringManupulation {

	public static void main(String[] args) {
		String s = "Hello, This is my JAVA Code and I am so Happy Java is best!";
		
		
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		//System.out.println(s.charAt(40));//Exception Error
		
		System.out.println(s.indexOf('J'));
		System.out.println(s.indexOf('i'));//1st occurance of i
		
		
		System.out.println(s.indexOf('i',3));
		System.out.println(s.indexOf('i', s.indexOf('i')+1));//2nd occurance of i
		
		System.out.println(s.indexOf("Code"));//16
		System.out.println(s.indexOf("code"));// if it's not available response will be -1
		
		String msg = "Welcome Admin";
		if(msg.indexOf("Admin") > 0) 	 {
			System.out.println("Pass");
		}
		
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		
		String hello = "      Hello World      ";
		System.out.println(hello.trim());
		System.out.println(hello.replace(" " , ""));
		
		
		String dob = "01-01-1990";
		System.out.println(dob.replace('-', '/'));
		
		//contains- easy if- else conditions
		String s1 = "your user id is n1";
		System.out.println(s1.contains("n1"));
		
		//comparisions
		String t1 = "Hello JAVA";
		String t2 = "Hello --JAVA";
		System.out.println(t1.equals(t2));// recommended by JAVA
		System.out.println(t1.equalsIgnoreCase(t2));// recommended by JAVA
		System.out.println(t1);
		System.out.println(t1==t2);
		
		//split
		// always store in array
		String lang ="JAVA_PYTHON_RUBY_C#";
		String langArray[] =lang.split("_");// splitting all in array
		System.out.println(langArray[0]);
		System.out.println(langArray[2]);
		for(String e:langArray) {
			System.out.println(e);
			
		}

	}

}
