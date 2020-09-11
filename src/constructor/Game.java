package constructor;

public class Game {
	
	String fN;
	String lN;
	double score;
	String sT;
	String sP;
	int tG;
	
	

	public Game() {}//default constructor class
	//constructor has no return type
	//constructor class depend on how many Parameter or signature 
	//if we make more than one construtor class need to create one default class
	
	public Game(String fName,String lName,double result ) {
		String firstName=this.fN=fName;
		String lastName=this.lN=lName;
		double exam=this.score=result;
		String overall=firstName+" "+lastName+"; score of the student is :"+exam;
		System.out.println("Dhaka college ,Dhaka . best performance 2019 is:"+overall);
	
	}
	
	public Game(String sTeam,String sPlayer, int tGoal ) {
		String team=this.sT=sTeam;
		String player=this.sP=sPlayer;
		int best=this.tG=tGoal;
		String performance=team+player+"; number of goal is:s"+best;
		System.out.println("name of the best team in the world is:"+performance);
	}
	
	
	
	
	
	public static void main(String[] args) {
		Game type=new Game("Mohammed", "Hashem", 96.5);
		Game best=new Game("Barcelona ", "leonal massi", 36);
	}
	
	
	
	
	
	
	
}
