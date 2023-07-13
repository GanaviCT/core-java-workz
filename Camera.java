class Camera{


	static String connectivityTechnology="wi-fi";
	static String brand="Imou";
	static int price=2199;
	/*static String flashMemory="Micro SD";
	static String specialFeature= "waterproof";
	static String screenSize= "2inches";
	static String compatibleDevices="laptops, dekstop";
	static String controlType= "amazon alexa";
	static boolean isWireless=true;*/
	
	public static void main(String camera[]){
		
	 String flashMemory="Micro SD";
	 String specialFeature= "waterproof";
	 String screenSize= "2inches";
	 String compatibleDevices="laptops, dekstop";
	 String controlType= "amazon alexa";
	 boolean isWireless=true;
		
	System.out.println("The Camera connectivityTechnology is " + connectivityTechnology);
	System.out.println("The camera brand is "+brand);
	System.out.println("The Camera price is "+price);
	System.out.println("Camera memory is " +flashMemory);
	System.out.println("The Camera specialFeature is "+ specialFeature );
	System.out.println("The Camera screenSize is"+ screenSize);
	System.out.println("compatible of the camera is "+compatibleDevices);
	System.out.println("camera type is "+controlType);
	System.out.println("type of wires in camera is "+isWireless);
}

}