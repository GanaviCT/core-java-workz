class MetroStationTester{

	public static void main(String test[]){
		
		MetroStation.addStations("rajajinagar");
		MetroStation.addStations("kengeri");
		MetroStation.addStations("kengeri bus terminal");
		MetroStation.addStations("mg road");
		MetroStation.addStations("jp nagar");
		MetroStation.addStations("mysore road");
		MetroStation.addStations("rr nagar");
		MetroStation.addStations("jayanagar");
		MetroStation.addStations("rajajinagar");
		MetroStation.addStations("mantri square mall");
		MetroStation.addStations("majestic");
		MetroStation.addStations("mahalakshmi");
		MetroStation.addStations("peenya");
		MetroStation.addStations("jalahalli");
		MetroStation.addStations("attiguppe");

	
	MetroStation.getAllStations();
	
		boolean isUpdated = MetroStation.updatedStationNames("rajajinagar", "silk institute"); 
		boolean isUpdated1 = MetroStation.updatedStationNames("kengeri", "vajarahalli");
		boolean isUpdated2 = MetroStation.updatedStationNames("jayanagar", "banashankari"); 
		boolean isUpdated3 = MetroStation.updatedStationNames("majestic", "south end circle");
		boolean isUpdated4 = MetroStation.updatedStationNames("peenya", "national college"); 
		boolean isUpdated5 = MetroStation.updatedStationNames("jalahalli", "lalbagh");
		boolean isUpdated6 = MetroStation.updatedStationNames("attiguppe", "chikpete");
		
		MetroStation.getAllStations();
	
	}
}


/*
class MetroStationTester{

	public static void main(String test[]){
		
		
	MetroStation.getAllStationNames();
	}
}
*/