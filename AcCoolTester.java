class AcCoolTester{
	
	public static void main(String test[]){
		 System.out.println("main started");
		 boolean connected= AcCool.onOrOff();
		 
		 System.out.println("is Ac connected" +connected);
		 AcCool.increaseTemp();
		 AcCool.increaseTemp();
		 AcCool.increaseTemp();
		 
		 AcCool.decreaseTemp();
		 AcCool.decreaseTemp();
		 
		 boolean connected1 = AcCool.onOrOff();
		 System.out.println("is connected" + connected1);
		 
		 AcCool.decreaseTemp();
		 AcCool.decreaseTemp();
		 
		 AcCool.increaseTemp();
		 AcCool.increaseTemp();
		 AcCool.increaseTemp();
		 
		 System.out.println("Ac is off enjoy.......");
		 System.out.println("main ended");
	}
	
	
}
