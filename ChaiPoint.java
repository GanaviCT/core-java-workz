
//crud operation
/*
class ChaiPoint{
	
	static String location= "kormangala";
	static String chaiAvailable[] = {"masala tea", "green tea", "ginger tea"};
	
	public static void getAllChaiAvailable(){
		System.out.println("invoking getallChaiAvailable");
		
		for(String individualChai : chaiAvailable){
			System.out.println(individualChai);
		}
		
		/*for(int chai=0; chai< chaiAvailable.length; chai++){
			
			String reference = chaiAvailable[chai];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		*/
/*
		System.out.println("end of getAllChaiAvailable");
		
	}

}

*/




//this has to be done in the static point.

class ChaiPoint{

		static String chaiAvailable[] = {null, null, null};
		static int index;
		
		public static boolean addchai(String chai){
			boolean isAdded = false;
			if(chai!= null){
				//chaiAvailable[0] = "masala tea";...
				
				chaiAvailable[index]=chai;
				index++;
				isAdded = true;

			   }
			else{
				System.out.println("cannot add chai, as it is null value");
			}
			return isAdded;
		}
			
		public static void getAllChai(){
		System.out.println("invoking getallChai");
		
		
		for(int chai=0; chai< chaiAvailable.length; chai++){
			
			String reference = chaiAvailable[chai];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
			
		
		}
		
		System.out.println("end of getAllChai");
		
	}

}

















/*

class ChaiPoint{
	
	String location= "kormangala";
	
	static String tea= "masala tea";
	static String tea1= "green tea";
	String chaiAvailable[] = {tea, tea1, "ginger tea"};
	
	public static void getAllChaiAvailable(){
		System.out.println("invoking getallChaiAvailable");
		/*for(String individualChai : chaiAvailable){
			System.out.println(individualChai);
		}
		*/
/*
		for(int chai=0; chai<chaiAvailable.length; chai++){
			
			String reference = chaiAvailable[chai];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		

		
	}

}
*/



