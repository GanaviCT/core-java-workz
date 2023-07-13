class BankAccount{

	
	static  double minAmount;
	static double maxAmount;
	static double balance;
	static boolean isCreditedOrDebited;
	
	public static boolean creditedOrDebited(){
	
		System.out.println("checking the amount as creditedOrDebited()");
		
		if(isCreditedOrDebited == false){
			isCreditedOrDebited = true;
			System.out.println("the amount is credited");
		}
		else if(isCreditedOrDebited == true){
			isCreditedOrDebited = false;
			System.out.println("the amount is debited");
		}
		return isCreditedOrDebited; //when we use void no need to print this.
	
	}
	
	public static void debit(){
		if(isCreditOrDebited == true){
		
		if(balance < maxAmount){
			
			balance=balance - 1;
			System.out.println("the balance is "+balance);
		}
		else{
			
			System.out.println("balance is low");
		}
		}
		else{
			System.out.println("------");
		}
	}
	
//decrease voume
	public static void credit(){
		if(isCreditedOrDebited == true){
			if(balance> minAmount){
				
				balance=balance+1;
				System.out.println("the balance of bank is "+balance);
			}
			else{
				System.out.println("balance is high");
			}
		
		}
		else{
			System.out.println("-----");
		}
		
	}
}




