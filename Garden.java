
class Garden{

	static String flowerNames[] = {null, null, null,null, null, null, null, null, null, null, null, null, null, null, null};
	static int index;

	public static boolean addFlower(String flower){
		boolean isAdded = false;
		if(flower!= null){
			flowerNames[index]= flower;
			index++;
			isAdded = true;
		}else{
			System.out.println("cannot add flower");
		}
		return isAdded;

	}
	
	
	public static void getAllFlower(){

	for(String individualflower : flowerNames){
			System.out.println(individualflower);
			
		}
	}
	
	
	public static boolean updatedFlowerName(String existingFlowerName, String updatedFlowerName){
		boolean isUpdated = false;
		for(int flowerIndex=0; flowerIndex< flowerNames.length; flowerIndex++){
		
			if(flowerNames[flowerIndex].equals(existingFlowerName)){
				flowerNames[flowerIndex]= updatedFlowerName;
				isUpdated= true;
		}
	}
	return isUpdated;
}
}




/*
class Garden{

	
	static String flower= "lilly";
	static String flower1= "rose";
	static String flower2 = "lavender";
	static String flower3 = "lotus";
	static String flower4 = "daisy";
	static String flower5 = "sunflower";
	static String flower6 = "jasmine";
	
	static String flowerNames[] = {flower, flower1, flower2, flower3, flower4, flower5, flower6,};
	
	public static void getAllFlowerNames(){
		System.out.println("invoking getallflowerNames");
		

		for(int flower=0; flower<flowerNames.length; flower++){
			
			String reference = flowerNames[flower];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}
	
	
	
	public static boolean updatedFlowerName(String existingFlowerName, String updatedFlowerName){
		boolean isUpdated = false;
		for(int flowerIndex=0; flowerIndex< flowerNames.length; flowerIndex++){
		
			if(flowerNames[flowerIndex].equals(existingFlowerName)){
				flowerNames[flowerIndex]= updatedFlowerName;
				isUpdated= true;
		}
	}
	return isUpdated;
}

}
*/
