class TelivisionTester{
	
	public static void main(String test[]){
		 System.out.println("main started");
		 boolean connected= Telivision.onOrOff();
		 
		 System.out.println("is Telivision connected" +connected);
		 Telivision.increaseVolume();
		 Telivision.increaseVolume();
		 Telivision.increaseVolume();
		 
		 Telivision.decreaseVolume();
		 Telivision.decreaseVolume();
		 
		 boolean connected1 = Telivision.onOrOff();
		 System.out.println("is connected" + connected1);
		 
		 Telivision.decreaseVolume();
		 Telivision.decreaseVolume();
		 
		 Telivision.increaseVolume();
		 Telivision.increaseVolume();
		 Telivision.increaseVolume();
		 
		 System.out.println("Telivision on or off enjoy.......");
		 System.out.println("main ended");
	}
	
	
}
