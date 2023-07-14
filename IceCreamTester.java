class IceCreamTester{

	public static void main(String test[]){
		
		IceCream.addFlavours("blackcurrent");
		IceCream.addFlavours("strawberry");
		IceCream.addFlavours("tender");
		IceCream.addFlavours("vanilla");
		IceCream.addFlavours("butterScoch");
		IceCream.addFlavours("chocolate");
		IceCream.addFlavours("pecan");
		IceCream.addFlavours("chikoo");
		IceCream.addFlavours("orio");
		IceCream.addFlavours("jackfruit");
		IceCream.addFlavours("apple");
		IceCream.addFlavours("mango");
		IceCream.addFlavours("raw mango");
		IceCream.addFlavours("peanut");
		IceCream.addFlavours("brouny");
	
	IceCream.getAllFlavours();
	
	
		boolean isUpdated = IceCream.updatedFlavourNames("blackcurrent", "mint chocolate"); 
		boolean isUpdated1 = IceCream.updatedFlavourNames("strawberry", "rockey road");
		boolean isUpdated2 = IceCream.updatedFlavourNames("tender", "birthday cake"); 
		boolean isUpdated3 = IceCream.updatedFlavourNames("raw mango", "kulfi");
		boolean isUpdated4 = IceCream.updatedFlavourNames("peanut", "chocolate chip"); 
		boolean isUpdated5 = IceCream.updatedFlavourNames("brouny", "teaberry");
		
		System.out.println("is updated "+isUpdated);
		IceCream.getAllFlavours();
		
		
		IceCream.deleteFlavour("mint chocolate");
		//System.out.println("is deleted "+isDeleted);
		IceCream.getAllFlavours();
		
		
		
		
		/*
		
			int newLength =IceCream.deleteFlavourNames("kulfi");
			getAllFlavourNamesPostDeletion(newLength);
		
		IceCream.getAllFlavours();
		*/
		
	}
}


/*
class IceCreamTester{

	public static void main(String test[]){
		
		
	IceCream.getAllFlavourNames();
	}
}
*/