package HomeWork;

public class ConstructorHomeWorkTest {

	public static void main(String[] args) {
		ConstructorHomeWork test1 = new ConstructorHomeWork();
		test1.name = "Student1";
		test1.country = "India";
		test1.establishedDate = 20;
//		test1.course  = <"This", "Is">;
//		
		test1.getInfo();
		System.out.println(test1.getInfo());

	}

}
