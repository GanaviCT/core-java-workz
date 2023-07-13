class Account{
	
	static double balance;

	public static void credit(int amount){
	
		boolean isCredited= false;
		
		if(amount >= 0){
		balance = balance +amount;
		isCredited= true;
		}
		return isCredited;
	}


	public static void debit(int amount){
	
		boolean isDebited= false;
		
		if(amount < balance){
		balance = balance - amount;
		isDebited = true;
		}
		return isDebited;
	
	}
	
	publis static double getBalance(){
		System.out.println("...........")
		return balance;
		
	}

}