class FaceBook{

	static String eMail= "ganavi.123@gmail.com";
	static long phoneNumber= 1234567890;
	static String password= "ganu123";
	static boolean isLogin;
	
	
	public static boolean login(){
		
		if(isLogin== false){
			isLogin = true;
			System.out.println("the account logged in");
		}
		else if(isLogin == true){
			isLogin = false;
			System.out.println("the login inavlid");
		}
		return isLogin;
		
	}
	
	
	public static void login(String eMail, String password){
	
		if(eMail == eMail){
		
			System.out.println("the email is correct is"+eMail);
			
	    if(password == password){
		
			System.out.println("login successfull ");
		
		}
		else{
		
			System.out.println("login Unsuccessfull");
		}
		}
		else{
			System.out.println("eMail or password is invalid");
		}
	
	}
	
	
	
	public static void login(long phoneNumber, String password){
	
		if(phoneNumber == phoneNumber){
		
			System.out.println("the number is correct is"+phoneNumber);
			
		if(password == password){
		
			
			System.out.println("login successfull ");
		
		}
		else{
		
			System.out.println("login Unsuccessfull");
		}
		}
		else{
			System.out.println("phone or password is invalid");
		}
	}


}






/*


class Speaker1{

	static String name="jbl";
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



/*main function is written in the next file. then by passing this file name inside the main function of next file,
 then running the program will give the result.*/
 
 //increase  volume
	/*public static void increaseVolume(){
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
			else{
				System.out.println("miv volume reached");
			}
			
		}
		else{
			System.out.println("off the speaker");
		}
		
	}
}

*/
