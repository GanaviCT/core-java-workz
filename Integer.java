class Integer{

	static int price[] = {567, 78,12, 90, 1};

	
	public static int getLargestNumber(){
		int max = price[0];
		//int price=descNumber;
		
		for(int i = 0; i<price.length; i++){
			if(price[i] > max){
				max = price[i];
				
			}
		}
		return max;
	

	}
	
}
	
	/*class Integer
{
    static int arr[] = {10, 324, 45, 90, 9808};
     
    // Method to find maximum in arr[]
    static int largest()
    {
 
         
        // Initialize maximum element
        int max = arr[0];
         
        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];
         
        return max;
    }
}	

*/