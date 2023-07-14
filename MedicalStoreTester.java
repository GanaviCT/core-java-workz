class MedicalStoreTester{

	public static void main(String test[]){
		
		MedicalStore.addMedicines("ativan");
		MedicalStore.addMedicines("dolo650");
		MedicalStore.addMedicines("atorvastatin");
		MedicalStore.addMedicines("antibiotics");
		MedicalStore.addMedicines("omeprazole");
		MedicalStore.addMedicines("albuterol");
		MedicalStore.addMedicines("citrogen");
		MedicalStore.addMedicines("paracetemol");
		MedicalStore.addMedicines("gabapentin");
		MedicalStore.addMedicines("adderall");
		
		MedicalStore.addMedicines("metaformin");
		MedicalStore.addMedicines("lisinopril");
		MedicalStore.addMedicines("metoprolol");
		MedicalStore.addMedicines("simvastatin");
		MedicalStore.addMedicines("cipla");

	
	MedicalStore.getAllMedicines();
	
	boolean isUpdated = MedicalStore.updatedMedicineNames("cipla", "zestril"); 
		boolean isUpdated1 = MedicalStore.updatedMedicineNames("metaformin", "synthroid");
		boolean isUpdated2 = MedicalStore.updatedMedicineNames("simvastatin", "lipitor"); 
		boolean isUpdated3 = MedicalStore.updatedMedicineNames("paracetemol", "zocor");
		boolean isUpdated4 = MedicalStore.updatedMedicineNames("citrogen", "norvasc"); 
		boolean isUpdated5 = MedicalStore.updatedMedicineNames("ativan", "ventolin");
		
		MedicalStore.getAllMedicines();
		
		
		 MedicalStore.getMedicineByName("ventolin");
		//System.out.println()
	}
}


/*
class MedicalStoreTester{

	public static void main(String test[]){
		
		
	MedicalStore.getAllMedicines();
	}
}
*/