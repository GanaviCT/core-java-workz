
class KarnatakaTester{

	public static void main(String test[]){
		
		Karnataka.addcity("banglore");
		Karnataka.addcity("mangaluru");
		Karnataka.addcity("hubli");
		Karnataka.addcity("chikkamagaluru");
		Karnataka.addcity("mysore");
		Karnataka.addcity("Mandya");
		Karnataka.addcity("viajapur");
		Karnataka.addcity("udupi");
		Karnataka.addcity("bidar");
		Karnataka.addcity("bellary");
		Karnataka.addcity("tumkur");
		Karnataka.addcity("hassan");
		Karnataka.addcity("chitradurga");
		Karnataka.addcity("belgaum");
		Karnataka.addcity("shimogga");
		Karnataka.addcity("kolar");
		Karnataka.addcity("bagalkote");
		Karnataka.addcity("dharwad");
		Karnataka.addcity("dhavangere");
		Karnataka.addcity("haveri");
		
		
		boolean isUpdated = Karnataka.updatedCityNames("Mandya", "mandovi");
		boolean isUpdated1 = Karnataka.updatedCityNames("haveri", "mandya");
		boolean isUpdated2= Karnataka.updatedCityNames("dhavangere", "hospet");
		boolean isUpdated3= Karnataka.updatedCityNames("shimogga", "raichur");
		boolean isUpdated4= Karnataka.updatedCityNames("dharwad", "hunsur");
		boolean isUpdated5= Karnataka.updatedCityNames("kolar", "madikeri");
		boolean isUpdated6= Karnataka.updatedCityNames("tumkur", "koppal");
		boolean isUpdated7= Karnataka.updatedCityNames("chitradurga", "kodagu");
		boolean isUpdated8= Karnataka.updatedCityNames("hassan", "manglore");
		boolean isUpdated9= Karnataka.updatedCityNames("bidar", "belur");
		
		System.out.println("is updated "+isUpdated);
		
	
	Karnataka.getAllCity();
	}
}

/*

class KarnatakaTester{

	public static void main(String test[]){
		
		
	Karnataka.getAllCity();
	}
}
*/




