class HotelMandya{

static String foodMenus[]={"biriyani", "pizza", "burger"};
static double foodPrices[]={10,20,30};

public static void main(String mandya[]){
	
	for(String foodMenu : foodMenus){
		for(double foodPrice : foodPrices){
		
		System.out.println(foodMenu);
	
		System.out.println(foodPrice);
	
		}
		
	} 
	
}
}





/*for integer use as
class Number{
	static int numbers[]={1,2,3};
	public static void main(String num[]){
		
		for(int numberValue : numbers){
			System.out.println(numberValue);
		}
	}
}*/