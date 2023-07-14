class RcbCaffee{
	
	static String location= "mg";
	static String coffee= "masala coffee";
	static String coffee1 = "black coffee";
	static String coffee2 = "ginger coffee";
	static String coffee3 = "regular coffee";
	static String coffee4 = " espresso";
	static String coffee5 = "amrericono";
	static String coffee6 = "hot chocolate";
	static String coffee7 = "latte coffee";
	static String coffee8 = "carmel coffee";
	static String coffee9 = "capichino";
	
	static String caffeeAvailable[] = {coffee, coffee1, coffee2, coffee3, coffee4, coffee5, coffee6, coffee7, coffee8, coffee9};
	
	public static void getAllCaffeeAvailable(){
		System.out.println("invoking getAllCoffeeAvailable");
		
		for(String individualCaffee : caffeeAvailable){
			System.out.println(individualCaffee);
		}
		
		/*for(int caffee=0; caffee< caffeeAvailable.length; caffee++){
			
			String reference = caffeeAvailable[caffee];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		*/
		System.out.println("end of getAllCaffeeAvailable");
		
	}

}


/*
class RcbCaffee{
	
	static String location= "mg";
	static String caffeeAvailable[] = {"masala coffee", "black coffee", "ginger coffee"};
	
	public static void getAllCaffeeAvailable(){
		System.out.println("invoking getallCoffeeAvailable");
		
		for(String individualCaffee : caffeeAvailable){
			System.out.println(individualCaffee);
		}
		
		/*for(int caffee=0; caffee< caffeeAvailable.length; caffee++){
			
			String reference = caffeeAvailable[caffee];
			System.out.println(reference);//  instead of doing System.out.println(chaiAvailable[chai]);
		}
		*/
/*		
		System.out.println("end of getAllCaffeeAvailable");	
	}

}

*/
