package OOP_Interface;


//Multiple Inheritance
public class FortisHospital extends UNHG implements USMedical, UKMedical, IndiaMedical {

	@Override
	public void physioServices() {
		System.out.println("FH- USMedical - physioServices");		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH- USMedical - cardioServices");	
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH- USMedical - oncologyServices");	
		
	}

	@Override
	public void pediaServices() {
		System.out.println("- UKMedical - pediaServices");	
		
	}

	@Override
	public void entServices() {
		System.out.println("FH- UKMedical - entServices");	
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH- IndiaMedical - dentalServices");	
		
	}

	@Override
	public void mentalServices() {
		System.out.println("FH- IndiaMedical - mentalServices");	
		
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH- Overridden - emergencyServices");
	}
	
	
	// we can override default methods
	@Override
	public void medInsurance() {
		System.out.println("FH Med Insurnace");
	}

	@Override
	public void covidTest() {
		System.out.println("FH Covid Test ");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
