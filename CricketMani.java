class CricketMani{

static String batsMan[]={"Sachin tendulkar", "Rahul david", "Sunil gavaskar", "VVS Laxman", "Virendra sehwag", "sourav ganguly", "dilip", "virat kohli", "Md Azharuddin", "gundappa vishwanath"};

static String teamRanking[]={"Australia", "Pakistan", "India", "Newziland", "Bangladesh", "USA", "England", "Bulgaria", "Cuba", "Denmark"};

static String iplTeamName[]={"Chennai super kings", "Delhi capitals", "Gujarat titans", "Kolkatta knight riders", "Sunrisers Hyderabad", "Rajasthan Royals", "Royal challengers bangaluru", "Lucknow super giants", "Punjab kings", "Mumbai Indians"};

//here i have used 2 types of for loop, and the one is common way.the new for loop called as "FOREACH"
public static void main(String criketmania[]){

	System.out.println("main started");
	
	System.out.println("list of the batsMan are:");
	
	for(int index=0; index<batsMan.length-1; index++){
	
		System.out.println(batsMan[index]);
	
	}
					   
	System.out.println("list of the  teamRanking are:");
	
	for(String teamRanking: teamRanking)/*here we can use int, double for string like type*/
	{
		
			System.out.println(teamRanking);
	}
					   
	System.out.println("list of the iplTeamName are:");
	
	System.out.println(iplTeamName[0] + " " + 
					   iplTeamName[1] + " " + 
					   iplTeamName[2] + " " + 
					   iplTeamName[3] + " " + 
					   iplTeamName[4] + " " + 
					   iplTeamName[5] + " " + 
					   iplTeamName[6] +  " " + 
					   iplTeamName[7] + " " + 
					   iplTeamName[8] + " " +
					   iplTeamName[9] );
							   
	
	System.out.println("main ended");
	
}
}