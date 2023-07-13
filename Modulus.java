class Modulus{

	public static void main(String modulus[]){
		
		mod(12, 20);
		mod(23, 32);
		mod(10, 25);
		mod(15, 40);
		mod(45, 67);
		mod(56, 47);
		mod(55, 10);
		mod(30, 40);
		mod(60, 77);
		mod(88, 99);
		
		System.out.println("---------------------------");
	
		mod(2, 20, 34);
		mod(22, 32, 45);
		mod(67, 25, 65);
		mod(35, 40, 89);
		mod(45, 67, 45);
		mod(56, 47, 47);
		mod(55, 10, 90);
		mod(54, 40, 456);
		mod(79, 77, 67);
		mod(98, 99, 99);
	
	}
	
	public static void mod(int i, double j){
		
		System.out.println(i%j);
		}
		
	public static void mod(int i, int j, int k){
		
		System.out.println((i%j)%k);
		}
}







/*

class Modulus{

	public static void main(String modulus[]){
	
		mod(12, 20);
		mod(23, 32);
		mod(10, 25);
		mod(15, 40);
		mod(45, 67);
		mod(56, 47);
		mod(55, 10);
		mod(30, 40);
		mod(60, 77);
		mod(88, 99);
	
	}
	public static void mod(int i, double j){
		
		System.out.println(i%j);
		}
}

*/