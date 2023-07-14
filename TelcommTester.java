
class TelcommTester{

	public static void main(String test[]){
		
		Telcomm.createSim("jio");
		Telcomm.createSim("airtel");
		Telcomm.createSim("vadafone");
		Telcomm.createSim("docomo");
		Telcomm.createSim("bsnl");
	
	Telcomm.getAllSim();
	
		boolean isUpdated = Telcomm.updatedSimName("vadafone", "vada");
		System.out.println("is updated "+isUpdated);
		
		Telcomm.getAllSim();
	
		
	}
}
/*

class TelcommTester{

	public static void main(String test[]){
		
		
	Telcomm.getAllSimNames();
	
	
	boolean isUpdated = Telcomm.updatedSimName("hassan", "Hasan");
		System.out.println("is updated "+isUpdated);
		
		Telcomm.getAllSimNames();
	}
}
*/

