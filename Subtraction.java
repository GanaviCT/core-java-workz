class Subtraction{

	public static void main(String subtraction[]){
		
		sub(99, 88);
		sub(88, 77);
		sub(66, 55);
		sub(55, 44);
		sub(33, 22);
		sub(11, 10);
		sub(25, 20);
		sub(109, 678);
		sub(678, 456);
		sub(1, 1);
		
		System.out.println("---------------------------");
	
		sub(199, 82, 11);
		sub(128, 77, 12);
		sub(166, 55, 13);
		sub(535, 44, 14);
		sub(333, 22, 15);
		sub(711, 10, 16);
		sub(925, 20, 17);
		sub(809, 678, 18);
		sub(678, 456, 19);
		sub(134, 19, 1);
	}
	
	public static void sub(int c, int d)
	{
		System.out.println(c-d);
	}
	
	public static void sub(int c, int d, int e)
	{
		System.out.println(c-d-e);
	}

}
/*

class Subtraction{

	public static void main(String subtraction[]){
	
		sub(99, 88);
		sub(88, 77);
		sub(66, 55);
		sub(55, 44);
		sub(33, 22);
		sub(11, 10);
		sub(25, 20);
		sub(109, 678);
		sub(678, 456);
		sub(1, 1);
	}
	
	public static void sub(int c, int d)
	{
		System.out.println(c-d);
	}

}
*/