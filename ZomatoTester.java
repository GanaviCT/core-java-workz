class ZomatoTester{
/*
	public static void main(String fooddeliver[]){
		//double priceOfFoodName=Zomato.search("pizza") called as passing the arguments
	
		String foodName= "pizza";
		System.out.println("searched is "+foodName);
		double priceOfFoodName = Zomato.search(foodName);
		System.out.println("the food price is " +priceOfFoodName);
	
		String foodName1= "veg";
		System.out.println("searched is "+foodName1);
		double priceOfFoodName1 = Zomato.search(foodName1);
		System.out.println("the food price is " +priceOfFoodName1);
		
		String foodName2= "biriyani";
		System.out.println("searched is "+foodName2);
		double priceOfFoodName2 = Zomato.search(foodName2);
		System.out.println("the food price is " +priceOfFoodName2);
		
		String foodName3= "burger";
		System.out.println("searched is "+foodName3);
		double priceOfFoodName3 = Zomato.search(foodName3);
		System.out.println("the food price is " +priceOfFoodName3);
		
		String foodName4= "chips";
		System.out.println("searched is "+foodName4);
		double priceOfFoodName4 = Zomato.search(foodName4);
		System.out.println("the food price is " +priceOfFoodName4);
		
		String foodName5= "fries";
		System.out.println("searched is "+foodName5);
		double priceOfFoodName5 = Zomato.search(foodName5);
		System.out.println("the food price is " +priceOfFoodName5);
		
		String foodName6= "cooling";
		System.out.println("searched is "+foodName6);
		double priceOfFoodName6 = Zomato.search(foodName6);
		System.out.println("the food price is " +priceOfFoodName6);
		
		String foodName7= "nonveg";
		System.out.println("searched is "+foodName7);
		double priceOfFoodName7 = Zomato.search(foodName7);
		System.out.println("the food price is " +priceOfFoodName7);
		
		String foodName8= "mutton";
		System.out.println("searched is "+foodName8);
		double priceOfFoodName8 = Zomato.search(foodName8);
		System.out.println("the food price is " +priceOfFoodName8);
		
		String foodName9= "fish";
		System.out.println("searched is "+foodName9);
		double priceOfFoodName9 = Zomato.search(foodName9);
		System.out.println("the food price is " +priceOfFoodName9);
		
		String foodName10= "pullaw";
		System.out.println("searched is "+foodName10);
		double priceOfFoodName10 = Zomato.search(foodName10);
		System.out.println("the food price is " +priceOfFoodName10);
		
		String foodName11= "uppittu";
		System.out.println("searched is "+foodName11);
		double priceOfFoodName11 = Zomato.search(foodName11);
		System.out.println("the food price is " +priceOfFoodName11);
		
		String foodName12= "mashroom";
		System.out.println("searched is "+foodName12);
		double priceOfFoodName12 = Zomato.search(foodName12);
		System.out.println("the food price is " +priceOfFoodName12);
		
		String foodName13= "manchoori";
		System.out.println("searched is "+foodName13);
		double priceOfFoodName13 = Zomato.search(foodName13);
		System.out.println("the food price is " +priceOfFoodName13);
		
		String foodName14= "paneer";
		System.out.println("searched is "+foodName14);
		double priceOfFoodName14 = Zomato.search(foodName14);
		System.out.println("the food price is " +priceOfFoodName14);
		
		String foodName15= "bread";
		System.out.println("searched is "+foodName15);
		double priceOfFoodName15 = Zomato.search(foodName15);
		System.out.println("the food price is " +priceOfFoodName15);
		
		String foodName16= "butter";
		System.out.println("searched is "+foodName16);
		double priceOfFoodName16 = Zomato.search(foodName16);
		System.out.println("the food price is " +priceOfFoodName16);
		
		String foodName17= "gravy";
		System.out.println("searched is "+foodName17);
		double priceOfFoodName17 = Zomato.search(foodName17);
		System.out.println("the food price is " +priceOfFoodName17);
		
		String foodName18= "alooburger";
		System.out.println("searched is "+foodName18);
		double priceOfFoodName18 = Zomato.search(foodName18);
		System.out.println("the food price is " +priceOfFoodName18);
		
		String foodName19= "french";
		System.out.println("searched is "+foodName19);
		double priceOfFoodName19 = Zomato.search(foodName19);
		System.out.println("the food price is " +priceOfFoodName19);
	}
	*/
	
	//method overloading
	
	public static void main(String fooddeliver[]){
		/*double priceOfFoodName=Zomato.search("pizza") called as passing the arguments*/
	
		String foodName= "pizza";
		System.out.println("searched  name is "+foodName);
		double priceOfFoodName = Zomato.search(foodName);
		double priceOfFoodQuantity=Zomato.search(foodName, 2);
		System.out.println("the food price is " +priceOfFoodName);
		System.out.println("the food quantity is " +priceOfFoodQuantity);
	
		String foodName1= "veg";
		System.out.println("searched is "+foodName1);
		double priceOfFoodName1 = Zomato.search(foodName1);
		System.out.println("the food price is " +priceOfFoodName1);
		double priceOfFoodQuantity1 = Zomato.search(foodName1, 2);
		System.out.println("the food quantity is " +priceOfFoodQuantity1);
		
		String foodName2= "biriyani";
		System.out.println("searched is "+foodName2);
		double priceOfFoodName2 = Zomato.search(foodName2);
		System.out.println("the food price is " +priceOfFoodName2);
		double priceOfFoodQuantity2 = Zomato.search(foodName2, 2);
		System.out.println("the food price is " +priceOfFoodQuantity2);
		
		String foodName3= "burger";
		System.out.println("searched is "+foodName3);
		double priceOfFoodName3 = Zomato.search(foodName3);
		System.out.println("the food price is " +priceOfFoodName3);
		double priceOfFoodQuantity3 = Zomato.search(foodName3, 8);
		System.out.println("the food price is " +priceOfFoodQuantity3);
		
		String foodName4= "chips";
		System.out.println("searched is "+foodName4);
		double priceOfFoodName4 = Zomato.search(foodName4);
		System.out.println("the food price is " +priceOfFoodName4);
		double priceOfFoodQuantity4 = Zomato.search(foodName4, 2);
		System.out.println("the food price is " +priceOfFoodQuantity4);
		
		String foodName5= "fries";
		System.out.println("searched is "+foodName5);
		double priceOfFoodName5 = Zomato.search(foodName5);
		System.out.println("the food price is " +priceOfFoodName5);
		double priceOfFoodQuantity5 = Zomato.search(foodName5, 6);
		System.out.println("the food price is " +priceOfFoodQuantity5);
		
		String foodName6= "cooling";
		System.out.println("searched is "+foodName6);
		double priceOfFoodName6 = Zomato.search(foodName6);
		System.out.println("the food price is " +priceOfFoodName6);
		double priceOfFoodQuantity6 = Zomato.search(foodName6, 5);
		System.out.println("the food price is " +priceOfFoodQuantity6);
		
		String foodName7= "nonveg";
		System.out.println("searched is "+foodName7);
		double priceOfFoodName7 = Zomato.search(foodName7);
		System.out.println("the food price is " +priceOfFoodName7);
		double priceOfFoodQuantity7 = Zomato.search(foodName7, 5);
		System.out.println("the food price is " +priceOfFoodQuantity7);
		
		String foodName8= "mutton";
		System.out.println("searched is "+foodName8);
		double priceOfFoodName8 = Zomato.search(foodName8);
		System.out.println("the food price is " +priceOfFoodName8);
		double priceOfFoodQuantity8 = Zomato.search(foodName8, 4);
		System.out.println("the food price is " +priceOfFoodQuantity8);
		
		String foodName9= "fish";
		System.out.println("searched is "+foodName9);
		double priceOfFoodName9 = Zomato.search(foodName9);
		System.out.println("the food price is " +priceOfFoodName9);
		double priceOfFoodQuantity9 = Zomato.search(foodName9, 3);
		System.out.println("the food price is " +priceOfFoodQuantity9);
		
		String foodName10= "pullaw";
		System.out.println("searched is "+foodName10);
		double priceOfFoodName10 = Zomato.search(foodName10);
		System.out.println("the food price is " +priceOfFoodName10);
		double priceOfFoodQuantity10 = Zomato.search(foodName10, 2);
		System.out.println("the food price is " +priceOfFoodQuantity10);
		
		String foodName11= "uppittu";
		System.out.println("searched is "+foodName11);
		double priceOfFoodName11 = Zomato.search(foodName11);
		System.out.println("the food price is " +priceOfFoodName11);
		double priceOfFoodQuantity11 = Zomato.search(foodName11, 6);
		System.out.println("the food price is " +priceOfFoodQuantity11);
		
		String foodName12= "mashroom";
		System.out.println("searched is "+foodName12);
		double priceOfFoodName12 = Zomato.search(foodName12);
		System.out.println("the food price is " +priceOfFoodName12);
		double priceOfFoodQuantity12 = Zomato.search(foodName12, 3);
		System.out.println("the food price is " +priceOfFoodQuantity12);
		
		String foodName13= "manchoori";
		System.out.println("searched is "+foodName13);
		double priceOfFoodName13 = Zomato.search(foodName13);
		System.out.println("the food price is " +priceOfFoodName13);
		double priceOfFoodQuantity13 = Zomato.search(foodName13, 4);
		System.out.println("the food price is " +priceOfFoodQuantity13);
		
		String foodName14= "paneer";
		System.out.println("searched is "+foodName14);
		double priceOfFoodName14 = Zomato.search(foodName14);
		System.out.println("the food price is " +priceOfFoodName14);
		double priceOfFoodQuantity14 = Zomato.search(foodName14, 5);
		System.out.println("the food price is " +priceOfFoodQuantity14);
		
		String foodName15= "bread";
		System.out.println("searched is "+foodName15);
		double priceOfFoodName15 = Zomato.search(foodName15);
		System.out.println("the food price is " +priceOfFoodName15);
		double priceOfFoodQuantity15 = Zomato.search(foodName15, 5);
		System.out.println("the food price is " +priceOfFoodQuantity15);
		
		String foodName16= "butter";
		System.out.println("searched is "+foodName16);
		double priceOfFoodName16 = Zomato.search(foodName16);
		System.out.println("the food price is " +priceOfFoodName16);
		double priceOfFoodQuantity16 = Zomato.search(foodName16, 3);
		System.out.println("the food price is " +priceOfFoodQuantity16);
		
		String foodName17= "gravy";
		System.out.println("searched is "+foodName17);
		double priceOfFoodName17 = Zomato.search(foodName17);
		System.out.println("the food price is " +priceOfFoodName17);
		double priceOfFoodQuantity17 = Zomato.search(foodName17, 4);
		System.out.println("the food price is " +priceOfFoodQuantity17);
		
		String foodName18= "alooburger";
		System.out.println("searched is "+foodName18);
		double priceOfFoodName18 = Zomato.search(foodName18);
		System.out.println("the food price is " +priceOfFoodName18);
		double priceOfFoodQuantity18 = Zomato.search(foodName18, 3);
		System.out.println("the food price is " +priceOfFoodQuantity18);
		
		String foodName19= "french";
		System.out.println("searched is "+foodName19);
		double priceOfFoodName19 = Zomato.search(foodName19);
		System.out.println("the food price is " +priceOfFoodName19);
		double priceOfFoodQuantity19 = Zomato.search(foodName19, 2);
		System.out.println("the food price is " +priceOfFoodQuantity19);
	}
	
	
	
	

}