class IceCream{

	static String flavourNames[] = {null, null, null,null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;

	public static boolean addFlavours(String flavours){
		boolean isAdded = false;
		if(flavours!= null){
			flavourNames[index]= flavours;
			index++;
			isAdded = true;
		}else{
			System.out.println("cannot add flavours");
		}
		return isAdded;

	}
	
	
	public static void getAllFlavours(){

	for(String individualflavours : flavourNames){
			System.out.println(individualflavours);
			
		}
	}
	
	
	public static boolean updatedFlavourNames(String existingFlavourNames, 
												String updatedFlavourNames){
		boolean isUpdated = false;
		for(int flavourIndex=0; flavourIndex< flavourNames.length; flavourIndex++){
		
			if(flavourNames[flavourIndex].equals(existingFlavourNames)){
				flavourNames[flavourIndex]= updatedFlavourNames;
				isUpdated= true;
		}
	}
	return isUpdated;
}


public static boolean deleteFlavourNames(String deletedFlavourNames){
		boolean isDeleted =  false;
		
		for(int flavourIndex=0; flavourIndex< flavourNames.length; flavourIndex++){
			
			if(flavourNames[flavourIndex].equals(deletedFlavourNames)){
				
				flavourNames[flavourIndex]= " ";
				isDeleted = true;
			}
		}
		return isDeleted;
}

}




/*

	public static String searchFlavourByname(String flavour){
		
		System.out.println("invoking search flavour by name");
		
		String fName= null;
		
		for(String name : flavourName){
			
			if(name.equals(flavour)){
				fName=name;
			System.out.println("the searched floavor is = " + fName);
			}
		}
			return fName;
		
	}
	
*/




/*
class IceCream{

	
	static String flavour= "chocolate";
	static String flavour1= "strawberry";
	static String flavour2 = "blackcurrent";
	static String flavour3 = "butterscoch";
	static String flavour4 = "tender";
	static String flavour5 = "pinaple";
	static String flavour6 = "vanilla";
	
	static String flavourNames[] = {flavour, flavour1, flavour2, flavour3, flavour4, flavour5, flavour6,};
	
	public static void getAllFlavourNames(){
		System.out.println("invoking getallflavourNames");
		

		for(int flavour=0; flavour<flavourNames.length; flavour++){
			
			String reference = flavourNames[flavour];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}

}

*/