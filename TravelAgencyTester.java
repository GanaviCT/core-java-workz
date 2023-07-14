class TravelAgencyTester{

	public static void main(String test[]){
		
		TravelAgency.createPlaces("mandya");
		TravelAgency.createPlaces("chikkamagaluru");
		TravelAgency.createPlaces("mysore");
		TravelAgency.createPlaces("banglore");
		TravelAgency.createPlaces("hampi");
		TravelAgency.createPlaces("shimogga");
		TravelAgency.createPlaces("gokarna");
		TravelAgency.createPlaces("bandipur national park");

	
	TravelAgency.getAllPlaces();
	
		boolean isUpdated = TravelAgency.updatedTouristPlaces("bandipur national park", "udupi"); 
		boolean isUpdated1 = TravelAgency.updatedTouristPlaces("gokarna", "coorg");
		boolean isUpdated2 = TravelAgency.updatedTouristPlaces("shimogga", "murudeshwara"); 
		boolean isUpdated3 = TravelAgency.updatedTouristPlaces("hampi", "badami");
		boolean isUpdated4 = TravelAgency.updatedTouristPlaces("banglore", "bengaluru"); 
		boolean isUpdated5 = TravelAgency.updatedTouristPlaces("mysore", "jog falls");
		boolean isUpdated6 = TravelAgency.updatedTouristPlaces("chikkamagaluru", "dandelli");
		
		TravelAgency.getAllPlaces();
	}
}
