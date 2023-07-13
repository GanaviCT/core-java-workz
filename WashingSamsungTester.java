class WashingSamsungTester 
 {
    
    public static void main(String test[]) 
	{
        
        boolean connected = WashingSamsung.onOrOff();
        System.out.println("washing machine is connected " +connected);
        WashingSamsung.increaseTime();
        WashingSamsung.increaseTime();

        boolean connected1 = WashingSamsung.onOrOff();
        System.out.println("washing samsung is connected " +connected1);
        WashingSamsung.decreaseTime();
        WashingSamsung.decreaseTime();
    }
}