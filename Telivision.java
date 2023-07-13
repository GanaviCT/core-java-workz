class Telivision{

	static String name="Sony";
	static  int minVolume;
	static  int currentVolume;
	static int maxVolume=2;
	static boolean isConnected;
	
	//method why we use boolean means to check on or off;
	public static boolean onOrOff(){
	
		System.out.println("invoking onoroff()");
		System.out.println("parameter "+ 0);
		
		if(isConnected == false){
			isConnected = true;
			System.out.println("the speaker is on");
		}
		else if(isConnected == true){
			isConnected = false;
			System.out.println("the speaker is off");
		}
		return isConnected; //when we use void no need to print this.
	
	}
 
 //increase  volume
	public static void increaseVolume(){
		if(isConnected == true){
		
		if(currentVolume < maxVolume){
			
			currentVolume=currentVolume + 1;
			System.out.println("the currentVolume is "+currentVolume);
		}
		else{
			
			System.out.println("max voulume reached");
		}
		}
		else{
			System.out.println("On the speaker");
		}
	}
	
//decrease voume
	public static void decreaseVolume(){
		if(isConnected == true){
			if(currentVolume > minVolume){
				
				currentVolume=currentVolume-1;
				System.out.println("the currentVolume is "+currentVolume);
			}
			/*else{
				System.out.println("miv volume reached");
			}
			*/
		}
		/*else{
			System.out.println("off the speaker");
		}
		*/ 	
	}
}
