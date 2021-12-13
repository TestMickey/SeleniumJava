package ConstructorConcepts;

public class TestRegistrationForm {

	public static void main(String[] args) {
		
		RegistrationForm Test = new RegistrationForm("TestFirstName", "TestLastName", "Test@testemail.com", 222222222, "Password222");
		
		Test.setFirtName("Niyanta");
		Test.setLastName("Pancholi");
		Test.setEmail("Email@email.com");
		Test.setPassword("This is a password");
		Test.setPhone(999999-99);
		
		System.out.println(Test.getDetails());

	}

}
