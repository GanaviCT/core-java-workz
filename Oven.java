class Oven{

	static String name="Samsung";
	static  int minTemp;
	static  int currentTemp;
	static int maxTemp;
	static boolean isConnected;
	
	static String minTime;
	static String maxTime;
	static String currentTime;
	static boolean isIncreased;
	
	
	//method why we use boolean means to check on or off;
	public static boolean onOrOff(){
	
		System.out.println("invoking onoroff()");
		System.out.println("parameter "+ 0);
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("the Oven is on");
		}
		else if(isConnected == true){
			isConnected = false;
			System.out.println("the Oven is off");
		}
		return isConnected; 
	
	}
	
	
	public static boolean increaseOrDecrease(){
	
		System.out.println("invoking increaseOrDecrease()");
		System.out.println("parameter "+ 0);
		
		if(isIncreased == false){
			isIncreased = true;
			System.out.println("the Oven is on");
		}
		else if(isIncreased == true){
			isIncreased = false;
			System.out.println("the Oven is off");
		}
		return isIncreased; 
	
	}
	
	public static void increaseTemp(){
		if(isConnected == true){
		
		if(currentTemp < maxTemp){
			
			currentTemp=currentTemp++;
			System.out.println("the currentTemp is "+currentTemp);
		}
		else{
			
			System.out.println("max Temp reached");
		}
		}
		else{
			System.out.println("On the Oven");
		}
	}
	
	
	public static void increaseTime(){
		if(isIncreased == true){
		
		if(currentTime == maxTime){
			
			
			System.out.println("the currentTime is "+currentTime);
		}
		else{
			
			System.out.println("max time reached");
		}
		}
		else{
			System.out.println("On the Oven");
		}
	}
	
//decrease voume
	public static void decreaseTemp(){
		if(isConnected == true){
			if(currentTemp > minTemp){
				
				currentTemp=currentTemp-1;
				System.out.println("the currentTemp is "+currentTemp);
			}
			else{
				System.out.println("miv Temp reached");
			}
			
		}
		else{
			System.out.println("off the Temp");
		}
		 	
	}
	
	
	public static void decreaseTime(){
		if(isIncreased == true){
			if(currentTime == minTime){
				
				
				
				System.out.println("the currentTime is "+currentTime);
			}
			else{
				System.out.println("miv Time reached");
			}
			
		}
		else{
			System.out.println("off the Time");
		}
		 	
	}
}

/*here when we delcare the variable to string, 
if we want to check the condition for the strng means then we have to use relational operator["=="],
then donot  use i++; or i+1; it is only for the integer type.
*/




