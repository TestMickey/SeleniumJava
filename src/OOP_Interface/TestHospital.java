package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {
		// interface variables can not be changed and final in nature
		
		FortisHospital fh = new FortisHospital();
		
		fh.cardioServices();
		fh.emergencyServices();
		fh.dentalServices();
		USMedical.billing();
		fh.medInsurance();
		fh.covidTest();
		UNHG.covidInfo();
		fh.medicalInfo();
		System.out.println(USMedical.min_fee);
		System.out.println(FortisHospital.min_fee);
		
		
		System.out.println("---------------------------");
		//top casting
		//child class object can be referred by parent interface ref variable
		USMedical us = new FortisHospital();
		us.cardioServices();
		us.emergencyServices();
		us.physioServices();
		// can not access methods coming from another Interfaces like India or UK
		us.medInsurance();
		
		UKMedical uk = new FortisHospital();
		uk.emergencyServices();
		uk.entServices();
		uk.pediaServices();
		
		IndiaMedical ind = new FortisHospital();
		ind.dentalServices();
		ind.emergencyServices();
		ind.mentalServices();
		
		
		//down casting-- CT(compile time) not allowed
		// parent interface object can be referred by child class ref variable
		//FortisHospital fh1 = new USMedical();-- not allowed
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
