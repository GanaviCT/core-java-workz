/*
class Telcomm{

	
	static String sim= "mysore";
	static String sim1= "banglore";
	static String sim2 = "hubli";
	static String sim3 = "shimogga";
	static String sim4 = "hassan";
	static String simNames[] = {sim, sim1, sim2, sim3, sim4};
	
	public static void getAllSimNames(){
		System.out.println("invoking getallSimNames");
		

		for(int sim=0; sim<simNames.length; sim++){
			
			String reference = simNames[sim];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}
	
	
	public static boolean updatedSimName(String existingSimName, String updatedSimName){
		boolean isUpdated = false;
		for(int simIndex=0; simIndex< simNames.length; simIndex++){
		
			if(simNames[simIndex].equals(existingSimName)){
				simNames[simIndex]= updatedSimName;
				isUpdated= true;
		}
	}
	return isUpdated;
}

}
*/




class Telcomm{

	static String simNames[] = {null, null, null,null, null};
	static int index;

	public static boolean createSim(String sim){
		boolean isCreated = false;
		if(sim!= null){
			simNames[index]= sim;
			index++;
			isCreated = true;
		}else{
			System.out.println("cannot create sim");
		}
		return isCreated;

	}
	
	
	public static void getAllSim(){

	for(String individualsim : simNames){
			System.out.println(individualsim);
			
		}
	}
	
	
	public static boolean updatedSimName(String existingSimName, String updatedSimName){
		boolean isUpdated = false;
		for(int simIndex=0; simIndex< simNames.length; simIndex++){
		
			if(simNames[simIndex].equals(existingSimName)){
				simNames[simIndex]= updatedSimName;
				isUpdated= true;
		}
	}
	return isUpdated;
}
}


