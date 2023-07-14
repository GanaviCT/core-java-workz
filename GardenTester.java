
class GardenTester{

	public static void main(String test[]){
		
		Garden.addFlower("lilly");
		Garden.addFlower("lavender");
		Garden.addFlower("rose");
		Garden.addFlower("jasmine");
		Garden.addFlower("lotus");
		Garden.addFlower("sunflower");
		Garden.addFlower("daisy");
		Garden.addFlower("marale");
		Garden.addFlower("daffodil");
		Garden.addFlower("iris");
		Garden.addFlower("dahlia");
		Garden.addFlower("marigold");
		Garden.addFlower("poppy");
		Garden.addFlower("peony");
		Garden.addFlower("buttons");
		
	
	Garden.getAllFlower();
	
	
		boolean isUpdated = Garden.updatedFlowerName("daisy", "disy"); 
		boolean isUpdated1 = Garden.updatedFlowerName("iris", "crismatonin");
		boolean isUpdated2 = Garden.updatedFlowerName("sunflower", "flower"); 
		boolean isUpdated3 = Garden.updatedFlowerName("dahlia", "pushpa");
		boolean isUpdated4 = Garden.updatedFlowerName("poppy", "puppy"); 
		boolean isUpdated5 = Garden.updatedFlowerName("buttons", "poppy");
		
		System.out.println("is updated "+isUpdated);
		
		Garden.getAllFlower();
	}
}



/*
class GardenTester{

	public static void main(String test[]){
		
		
	Garden.getAllFlowerNames();
	
	boolean isUpdated = Garden.updatedFlowerName("daisy", "disy");
		System.out.println("is updated "+isUpdated);
		
		Garden.getAllFlowerNames();
	}
}
*/