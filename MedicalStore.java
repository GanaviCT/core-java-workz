class MedicalStore{

	static String medicineNames[] = {null, null, null,null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;

	public static boolean addMedicines(String medicines){
		boolean isAdded = false;
		if(medicines!= null){
			medicineNames[index]= medicines;
			index++;
			isAdded = true;
		}else{
			System.out.println("cannot add medines");
		}
		return isAdded;

	}
	
	
	public static void getAllMedicines(){

	for(String individualMedicines : medicineNames){
			System.out.println(individualMedicines);
			
		}
	}
	
	
	public static boolean updatedMedicineNames(String existingMedicineNames, String updatedMedicineNames){
		boolean isUpdated = false;
		for(int medicineIndex=0; medicineIndex< medicineNames.length; medicineIndex++){
		
			if(medicineNames[medicineIndex].equals(existingMedicineNames)){
				medicineNames[medicineIndex]= updatedMedicineNames;
				isUpdated= true;
		}
	}
	return isUpdated;
}


	public static boolean getMedicineByName(String medicineName){
		
		System.out.println("invoking getMedicineByName");
		System.out.println("no of parameter: 1, type= String");
		String sName = null;
		for(String name : medicineNames){
			if(name.equals(medicineName)){
				sName = name;
				System.out.println("item name found");
			}
		}
		return sName;
		
	}
}

/*
class MedicalStore{

	
	static String medicine= "chocolate";
	static String medicine1= "strawberry";
	static String medicine2 = "blackcurrent";
	static String medicine3 = "butterscoch";
	static String medicine4 = "tender";
	static String medicine5 = "pinaple";
	static String medicine6 = "vanilla";
	static String medicine7 = "pinaple";
	static String medicine8 = "vanilla";
	static String medicine9 = "pinaple";
	
	static String Names[] = {medicine, medicine1, medicine2, medicine3, medicine4, medicine5, medicine6, medicine7, medicine8, medicine9};
	
	public static void getAllMedicineNames(){
		System.out.println("invoking getallMedicineNames");
		

		for(int medicine=0; medicine<medicineNames.length; medicine++){
			
			String reference = medicineNames[medicine];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}

}

*/