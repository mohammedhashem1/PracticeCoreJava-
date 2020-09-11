package learnobject;

public class CricketNew {

	
	public int player(int captain, int trainer) {
		
		int num1=captain;
		int num2=trainer;
		
		int income=num1+num2;
		
		System.out.println("Average income of National teainer and  player in India = "+income);
		return income;
	}
	
	public static void main(String[] args) {
		
		
		
		CricketNew qualify=new CricketNew();
		
		qualify.player(8500000, 950000);
		
		Football game=new Football();
		
		//game.name="Ranger's";
		System.out.println(game.name);
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
