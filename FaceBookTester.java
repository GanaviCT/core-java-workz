class FaceBookTester{

	public static void main(String test[]){
	
		System.out.println("main started");
		
		boolean login= FaceBook.login();
		System.out.println("is account logged in" +login);
		
		FaceBook.login("eMail","ganu123");
		FaceBook.login(1234567890L,"ganu123");
		
		
		
		
	
	}



}











/*

class SpeakerTester{
	
	public static void main(String test[]){
		 System.out.println("main started");
		 boolean connected= Speaker1.onOrOff();
		 
		 System.out.println("is speaker connected" +connected);
		 Speaker1.increaseVolume();
		 Speaker1.increaseVolume();
		 Speaker1.increaseVolume();
		 
		 Speaker1.decreaseVolume();
		 Speaker1.decreaseVolume();
		 
		 boolean connected1 = Speaker1.onOrOff();
		 System.out.println("is connected" + connected1);
		 
		 Speaker1.decreaseVolume();
		 Speaker1.decreaseVolume();
		 
		 Speaker1.increaseVolume();
		 Speaker1.increaseVolume();
		 Speaker1.increaseVolume();
		 
		 System.out.println("speaker is on enjoy.......");
		 System.out.println("main ended");
	}
	
	
}

*/