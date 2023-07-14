class MetroStation{

	static String stationNames[] = {null, null, null,null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;

	public static boolean addStations(String stations){
		boolean isAdded = false;
		if(stations!= null){
			stationNames[index]= stations;
			index++;
			isAdded = true;
		}else{
			System.out.println("cannot add station");
		}
		return isAdded;

	}
	
	
	public static void getAllStations(){

	for(String individualstations : stationNames){
			System.out.println(individualstations);
			
		}
	}
	
	public static boolean updatedStationNames(String existingStationNames, String updatedStationNames){
		boolean isUpdated = false;
		for(int stationIndex=0; stationIndex< stationNames.length; stationIndex++){
		
			if(stationNames[stationIndex].equals(existingStationNames)){
				stationNames[stationIndex]= updatedStationNames;
				isUpdated= true;
		}
	}
	return isUpdated;
}
}

/*
class MetroStation{

	
	static String station= "chocolate";
	static String station1= "strawberry";
	static String station2 = "blackcurrent";
	static String station3 = "butterscoch";
	static String station4 = "tender";
	static String station5 = "pinaple";
	static String station6 = "vanilla";
	
	static String stationNames[] = {station, station1, station2, station3, station4, station5, station6, station7};
	
	public static void getAllStationNames(){
		System.out.println("invoking getallStationNames");
		

		for(int station=0; station<stationNames.length; station++){
			
			String reference = stationNames[station];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}

}

*/