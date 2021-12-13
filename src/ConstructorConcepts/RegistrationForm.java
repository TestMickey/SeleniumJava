package ConstructorConcepts;

public class RegistrationForm {
	String firstName;
	String lastName;
	String email;
	int phone;
	String password;
	
	
	public RegistrationForm(String firtName, String lastName, String email, int phone, String password) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.password = password;
	}


	public String getFirtName() {
		return firstName;
	}


	public void setFirtName(String firtName) {
		this.firstName = firtName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getPhone() {
		return phone;
	}


	public void setPhone(int phone) {
		this.phone = phone;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDetails() {
		return "Firstname: "+firstName+", LastName :  "+lastName+", Email : "+email+", Phone : "+phone+", Passwrod:  "+password;
	
	}
}
