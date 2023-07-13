class AmazonPrimeMethods{

	/*static String kannadaMovies[]={"kalasipalya", "laalihadu", "lankeshpatrike", "namma-ramu", "suntaragali", "daasa", "darshan", "kariya", "dharma", "kooti kooti",
								   "yavahaadu", "yando kanda kanasu", "majestic", "sarathi", "ambareesha", "bul-bul", "virat", "robert", "odeya", "yodha", 
								   "yajamana", "jaggudada", "bangarada manushya", "kurukshetra", "kranti"};
	*/							   
	static String englishMovies[]={"love again", "a beautiful mind", "peterpan", "the fate of furious", "shang-chi", "gladiator", "hobbit", "mad max", "evil dead rise", "TYG2",
								   "Inception", "Hellboy", "Lost city", "Starship", "Avatar", "Avatar-2", "Lord of the rings", "gone with the wind", "Everest", "Unfaithful",
								   "Jumanji", "DOM", "Tom cruise", "Redeeming Love", "Matrix"};
								   
	static String hindiMovies[]={"Pathan", "tiger", "sanju", "Padmaavathi", "KGF", "Chatrapathi", "My name is Khan", "khoi mil gaya", "Ankush", "Aazam",
								 "AAG", "RAAZ", "The fakir of venice", "David", "liger", "Jalsa", "Barfi", "Drishyam", "bandaa", "Airlift", 
								 "Arya", "gangotri", "varudu", "vedam", "happy"};
								 
	static String malayalamMovies[]={"4 years", "The great indian kitchen", "sita ramam", "RRR", "Major", "Vikram", "Rocketry", "Kantara", "Oh my kaduvale", "Home",
									 "Banglore days", "God father", "classmates", "Idukki gold", "Hello madras girl", "vigathakumaran", "Bheeshma pavam", "Kerala  story", "premam", "kurup",
									 "jana gana mana", "pada", "Salute", "oh!baby", "lucifer"};
								 
		public static void main(String amazonprime[]){

		
		String kannadaMovies[]={"kalasipalya", "laalihadu", "lankeshpatrike", "namma-ramu", "suntaragali", "daasa", "darshan", "kariya", "dharma", "kooti kooti",
								       "yavahaadu", "yando kanda kanasu", "majestic", "sarathi", "ambareesha", "bul-bul", "virat", "robert", "odeya", "yodha", 
								       "yajamana", "jaggudada", "bangarada manushya", "kurukshetra", "kranti"};
		System.out.println("main started");
	
		System.out.println("list of the kannadamovies are:");
		
		getKannadaMovies(kannadaMovies);
		getEnglishMovies();
		fetchHindiMovies();
		readMalayalamMovies();
		
	/*
		System.out.println(kannadaMovies[0] + " " + 
						   kannadaMovies[1] + " " + 
						   kannadaMovies[2] + " " + 
						   kannadaMovies[3] + " " + 
						   kannadaMovies[4] + " " + 
						   kannadaMovies[5] + " " + 
						   kannadaMovies[6] + " " + 
						   kannadaMovies[7] + " " + 
						   kannadaMovies[8] + " " +
						   kannadaMovies[9] + " " +
						   kannadaMovies[10] + " " + 
						   kannadaMovies[11] + " " + 
						   kannadaMovies[12] + " " + 
						   kannadaMovies[13] + " " + 
						   kannadaMovies[14] + " " + 
						   kannadaMovies[15] + " " + 
						   kannadaMovies[16] + " " + 
						   kannadaMovies[17] + " " + 
						   kannadaMovies[18] + " " +
						   kannadaMovies[19] + " " +
						   kannadaMovies[20] + " " + 
						   kannadaMovies[21] + " " + 
						   kannadaMovies[22] + " " + 
						   kannadaMovies[23] + " " + 
						   kannadaMovies[24] );
						   
		System.out.println("list of the englishmovies are:");
	
		System.out.println(englishmovies[0] + " " + 
						   englishmovies[1] + " " + 
						   englishmovies[2] + " " + 
						   englishmovies[3] + " " + 
						   englishmovies[4] + " " + 
						   englishmovies[5] + " " + 
						   englishmovies[6] + " " + 
						   englishmovies[7] + " " + 
						   englishmovies[8] + " " +
						   englishmovies[9] + " " +
						   englishmovies[10] + " " + 
						   englishmovies[11] + " " + 
						   englishmovies[12] + " " + 
						   englishmovies[13] + " " + 
						   englishmovies[14] + " " + 
						   englishmovies[15] + " " + 
						   englishmovies[16] + " " + 
						   englishmovies[17] + " " + 
						   englishmovies[18] + " " +
						   englishmovies[19] + " " +
						   englishmovies[20] + " " + 
						   englishmovies[21] + " " + 
						   englishmovies[22] + " " + 
						   englishmovies[23] + " " + 
						   englishmovies[24] );
						   
		System.out.println("list of the hindimovies are:");
	
		System.out.println(hindimovies[0] + " " + 
						   hindimovies[1] + " " + 
						   hindimovies[2] + " " + 
						   hindimovies[3] + " " + 
						   hindimovies[4] + " " + 
						   hindimovies[5] + " " + 
						   hindimovies[6] + " " + 
						   hindimovies[7] + " " + 
						   hindimovies[8] + " " +
						   hindimovies[9] + " " +
						   hindimovies[10] + " " + 
						   hindimovies[11] + " " + 
						   hindimovies[12] + " " + 
						   hindimovies[13] + " " + 
						   hindimovies[14] + " " + 
						   hindimovies[15] + " " + 
						   hindimovies[16] + " " + 
						   hindimovies[17] + " " + 
						   hindimovies[18] + " " +
						   hindimovies[19] + " " +
						   hindimovies[20] + " " + 
						   hindimovies[21] + " " + 
						   hindimovies[22] + " " + 
						   hindimovies[23] + " " + 
						   hindimovies[24] );
						   
		System.out.println("list of the malayalammovies are:");
	
		System.out.println(malayalammovies[0] + " " + 
						   malayalammovies[1] + " " + 
						   malayalammovies[2] + " " + 
						   malayalammovies[3] + " " + 
						   malayalammovies[4] + " " + 
						   malayalammovies[5] + " " + 
						   malayalammovies[6] + " " + 
						   malayalammovies[7] + " " + 
						   malayalammovies[8] + " " +
						   malayalammovies[9] + " " +
						   malayalammovies[10] + " " + 
						   malayalammovies[11] + " " + 
						   malayalammovies[12] + " " + 
						   malayalammovies[13] + " " + 
						   malayalammovies[14] + " " + 
						   malayalammovies[15] + " " + 
						  malayalammovies[16] + " " + 
						  malayalammovies[17] + " " + 
						   malayalammovies[18] + " " +
						  malayalammovies[19] + " " +
						   malayalammovies[20] + " " + 
						  malayalammovies[21] + " " + 
						  malayalammovies[22] + " " + 
						  malayalammovies[23] + " " + 
						  malayalammovies[24] );
*/



		System.out.println("main ended");


	}
	public static void getKannadaMovies(String kannadaMovies[]){
		
		for(String kannadaMovie: kannadaMovies){
			System.out.println(kannadaMovie);
		}
	}

	public static void getEnglishMovies(){
		for(String englishMovie: englishMovies){
			System.out.println(englishMovie);
		}
	}
	
	public static void fetchHindiMovies(){
		for(String hindiMovie: hindiMovies){
			System.out.println(hindiMovie);
		}
	}
	
	public static void readMalayalamMovies(){
		for(String malayalamMovie: malayalamMovies){
			System.out.println(malayalamMovie);
		}
	}

}