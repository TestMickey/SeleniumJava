package FirstSession;

public class ObjectReferenceConcepts {
	
	// class data members
	// class variables
	String name;
	int age;
	//method
	public void get() {
		System.out.println("get method");
	}

	public static void main(String[] args) {
		ObjectReferenceConcepts obj = new ObjectReferenceConcepts();
		/*obj = null; // not a good practice
		
		obj.name = "Tom";// Null Pointer Execution(NPE)
		obj.age = 25;
		
		System.out.println(obj.name);*/
		
		//no reference objects
		new ObjectReferenceConcepts().name="Peter";
		new ObjectReferenceConcepts().age=24;

		new ObjectReferenceConcepts().get();
		
		ObjectReferenceConcepts obj1= new ObjectReferenceConcepts();
		
System.gc();		

		
	}

}
