class Giriyas{

static String electronicDevices[] = {"Microwave", "refrigerator", "television", "LED", "Washing machine", "Ac", "Grinder"};

public static void main(String args[]){

	System.out.println("main started");
	
	for(int ganIndex=0; ganIndex<electronicDevices.length; ){

		System.out.println(electronicDevices[ganIndex]);
		ganIndex++;

	}
	System.out.println("main ended");
}

}