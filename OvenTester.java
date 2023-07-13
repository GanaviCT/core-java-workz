class OvenTester{
	
	public static void main(String test[]){
		 System.out.println("main started");
		 boolean connected= Oven.onOrOff();
		 boolean increased=Oven.increaseOrDecrease();
		 
		 System.out.println("is Oven connected" +connected);
		 System.out.println("check the speed" +increased);
		 Oven.increaseTemp();
		 Oven.increaseTemp();
		 Oven.increaseTemp();
		 
		 Oven.decreaseTemp();
		 Oven.decreaseTemp();
		 
		 Oven.increaseTime();
		 Oven.decreaseTime();
		 
		 boolean connected1 = Oven.onOrOff();
		 boolean increased1= Oven.increaseOrDecrease();
		 System.out.println("is connected" + connected1);
		 System.out.println("speed is rised" +increased1);
		 
		 Oven.decreaseTemp();
		 Oven.decreaseTemp();
		 
		 Oven.increaseTemp();
		 Oven.increaseTemp();
		 Oven.increaseTemp();
		 
		 Oven.decreaseTime();
		 Oven.increaseTime();
		 
		 System.out.println("Oven is off enjoy.......");
		 System.out.println("oven is increased  emjoyy");
		 System.out.println("main ended");
	}
}
