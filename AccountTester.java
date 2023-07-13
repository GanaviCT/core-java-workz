class AccountTester{

	public static void main(Strinng test[]){
	
		Account.credit(2000);
		double currentBalance= Account.getBalance();
		Account.debit(300);
		double currentBalance= Account.getBalance();
		System.out.println(current balance);
		Account.credit(20);
		Account.credit(200);
		
		System.out.println(Account.credit(4000));
		System.out.println(Account.getBalance());
	}

}