class AcCool{

	static String name="Samsung";
	static  int minTemp;
	static  int currentTemp;
	static int maxTemp=10;
	static boolean isConnected;
	
	//method why we use boolean means to check on or off;
	public static boolean onOrOff(){
	
		System.out.println("invoking onoroff()");
		System.out.println("parameter "+ 0);
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("the Ac is on");
		}
		else if(isConnected == true){
			isConnected = false;
			System.out.println("the Ac is off");
		}
		return isConnected; //when we use void no need to print this.
	
	}
	
	public static void increaseTemp(){
		if(isConnected == true){
		
		if(currentTemp < maxTemp){
			
			currentTemp=currentTemp + 1;
			System.out.println("the currentTemp is "+currentTemp);
		}
		else{
			
			System.out.println("max Temp reached");
		}
		}
		else{
			System.out.println("On the Ac");
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
}

