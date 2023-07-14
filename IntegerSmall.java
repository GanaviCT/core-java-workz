class IntegerSmall{

	static int price[] = {5674, 78,34, 92340, 1};

	
	public static int getSmallestNumber(){
		int min = price[0];
		//int price=descNumber;
		
		for(int i = 0; i<price.length; i++){
			if(price[i] < min){
				min = price[i];
				
			}
		}
		return min;
	

	}
	
}
	