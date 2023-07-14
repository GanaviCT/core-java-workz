class Factorial{

//5! = 120



	public static int getFact(int factNumber){
	
		int fact = 1;
		
		for(int i=1; i<=factNumber; i++){
		
			fact = i*fact;
			//System.out.println(fact);
		}
		return fact;
	}

}