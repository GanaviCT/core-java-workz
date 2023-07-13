class BankAccountTester{
	
	public static void main(String test[]){
		 System.out.println("main started");
		 boolean creditedOrDebited= BankAccount.creditedOrDebited();
		 
		 System.out.println("is credited" +creditedOrDebited);
		 BankAccount.credit();
		 BankAccount.credit();
		 
		 BankAccount.debit();
		 
		 boolean creditedOrDebited1 = BankAccount.creditedOrDebited();
		 System.out.println("is debited" + creditedOrDebit1);
		 
		 BankAccount.debit();
		 BankAccount.debit();
		 
		 BankAccount.credit();
		 
		 System.out.println(".......");
		 System.out.println("main ended");
	}
	
	
}
