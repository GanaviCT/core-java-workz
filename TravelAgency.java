class TravelAgency{

	static String touristPlaces[] = {null, null, null,null, null, null, null, null};
	static int index;

	public static boolean createPlaces(String places){
		boolean isCreated = false;
		if(places!= null){
			touristPlaces[index]= places;
			index++;
			isCreated = true;
		}else{
			System.out.println("cannot create places");
		}
		return isCreated;

	}
	
	
	public static void getAllPlaces(){

	for(String individualPlaces : touristPlaces){
			System.out.println(individualPlaces);
			
		}
	}
	
	public static boolean updatedTouristPlaces(String existingTouristPlaces, String updatedTouristPlaces){
		boolean isUpdated = false;
		for(int touristIndex=0; touristIndex< touristPlaces.length; touristIndex++){
		
			if(touristPlaces[touristIndex].equals(existingTouristPlaces)){
				touristPlaces[touristIndex]= updatedTouristPlaces;
				isUpdated= true;
		}
	}
	return isUpdated;
}
}
