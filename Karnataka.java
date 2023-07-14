/*
class Karnataka{

	static String cityNames[] = {null, null, null,null, null, null, null, null, null, null, null, 
								 null, null, null, null, null, null, null, null, null};// array have size limitation.
	static int index;

	public static boolean addcity(String city){
		boolean isAdded = false;
		
		if(city != null)
		{
			cityNames[index]= city;
			index++;
			isAdded = true;
		}
		else{
			System.out.println("cannot add cities");
		}
		return isAdded;
	}

	
	
	public static void getAllCity(){
	for(int city=0; city< cityNames.length; city++){
			
			String reference = cityNames[city];
			System.out.println(reference);

	/*for(String individualCity : cityNames){
			System.out.println(individualCity);
			
		}*/
	//}
	//}
	
	
	/*
	public static boolean updatedCityNames(String existingCityNames, String updatedCityNames){
		boolean isUpdated = false;
		for(int cityIndex=0; cityIndex< cityNames.length; cityIndex++){
		
			if(cityNames[cityIndex].equals(existingCityNames)){
				cityNames[cityIndex]= updatedCityNames;
				isUpdated= true;
		}
	}
	return isUpdated;
}



}


*/





class Karnataka{

	static String cityNames[] = {null, null, null,null, null, null, null, null, null, null, null, 
								 null, null, null, null, null, null, null, null, null};// array have size limitation.
	static int index;

	public static boolean addcity(String city){
		boolean isAdded = false;
		
		
		if(index < cityNames.length){
		
		
		if(city != null && cityNames.length>0)
		{
			cityNames[index]= city;
			index++;
			isAdded = true;
			//System.out.println("city added" +isAdded);
		}
		else{
			System.out.println("cannot add cities");
		}
		}
		else{
			System.out.println("add the cities");
		}
		return isAdded;

	}
	
	
	public static void getAllCity(){
	/*for(int city=0; city< cityNames.length; city++){
			
			String reference = cityNames[city];
			System.out.println(reference);
	*/
	

	for(String individualCity : cityNames){
			System.out.println(individualCity);
			
		}
	}
	
	
	
	public static boolean updatedCityNames(String existingCityNames, String updatedCityNames){
		boolean isUpdated = false;
		for(int cityIndex=0; cityIndex< cityNames.length; cityIndex++){
		
			if(cityNames[cityIndex].equals(existingCityNames))//.equals is method of string{
				cityNames[cityIndex]= updatedCityNames;
				isUpdated= true;
		}
	}
	return isUpdated;
}
}

/*
class Karnataka{

	static String cityNames[] = {null, null, null,null, null};
	static int index;

	public static boolean addcity(String city){
		boolean isAdded = false;
		if(city != null)//if(city != null && cityName.length>0)
		{
			cityNames[index++]= city;
			//index++;
			isAdded = true;
		}else{
			System.out.println("cannot add cities");
		}
		return isAdded;

	}
	
	
	public static void getAllCity(){
	/*for(int city=0; city< cityNames.length; city++){
			
			String reference = cityNames[city];
			System.out.println(reference);
	*/
	

	/*
	for(String individualCity : cityNames){
			System.out.println(individualCity);
			
		}
	}
}

*/


/*
class Karnataka{
	
	
	static String cityNames[] = {"mysore", "banglore", "hubli", "shimogga"};
	
	public static void getAllCityNames(){
		System.out.println("invoking getAllCityNames");
		
		
		for(int city=0; city< cityNames.length; city++){
			
			String reference = cityNames[city];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		System.out.println("end of getAllCityNames");
		
	}

}
*/



/*

class Karnataka{

	
	static String city= "mysore";
	static String city1= "banglore";
	static String city2 = "hubli";
	static String city3 = "shimogga";
	static String city4 = "hassan";
	static String cityNames[] = {city, city1, city2, city3, city4};
	
	public static void getAllCityNames(){
		System.out.println("invoking getallCityNames");
		

		for(int city=0; city<cityNames.length; city++){
			
			String reference = cityNames[city];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}

}


*/
/*
public static boolean updatedCityName(String existingCityName, String updatedCityName){
	for(int cityIndex=0; cityIndex< cityName.length; cityIndex++){
		
		if(cityNames[cityIndex].equals(existingCityName)){
			cityNames[cityIndex]= updatedCity;
			isUpdated= true;
		}
	}
	return isUpdated;
}


*/
















