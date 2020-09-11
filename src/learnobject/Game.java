package learnobject;

public class Game {

	int indoor = 34;
	short outdoor = 5674;
	long totalGame = 68738;
	double gameCombination = 4895.9078;
	float teamViewer = 578729.98f;
	byte winner = 67;
	char teamHead = 'A';
	boolean teamPerformance = true;
	String team = "Abahani";

	public void stadium() {
	}

	private void vip() {
	}

	protected void media() {
	}

	public static void main(String[] args) {

		Game type = new Game();

		System.out.println(type.gameCombination);
		System.out.println(type.indoor);
		System.out.println(type.team);
		System.out.println(type.teamHead);
		System.out.println(type.teamPerformance);
		System.out.println(type.teamViewer);
		System.out.println(type.totalGame);
		System.out.println(type.outdoor);
		System.out.println(type.winner);
		//=============================================================================================================	
		//=============================================================================================================	

		Football match = new Football();

		match.Addidas="NIKE";
		System.out.println(match.Addidas);

		// match.coach='Z';
		System.out.println(match.coach);

		// match.finalMatch=false;
		System.out.println(match.finalMatch);

		// match.game=1500;
		System.out.println(match.game);

		// match.name="Argentina";
		System.out.println(match.name);

		// match.nationalPlayer=26;
		System.out.println(match.nationalPlayer);

		// match.playerIncome=950000.50f;
		System.out.println(match.playerIncome);

		// match.player=160000;
		System.out.println(match.player);

		// match.quantityOfFootball=6500;
		System.out.println(match.quantityOfFootball);

		// match.trainerPlayerRatio=7500.50;
		System.out.println(match.trainerPlayerRatio);
		//=============================================================================================================	
		//=============================================================================================================	

		Mall brand=new Mall();
		
		//brand.biggestStore="Express";
		System.out.println(brand.biggestStore);
		
		//brand.customer=250000;
		System.out.println(brand.customer);
		
		//brand.customerParking=1500;
		System.out.println(brand.customerParking);
		
		//brand.dailySaleTrend=65700.50f;
		System.out.println(brand.dailySaleTrend);
		
		//brand.foodCourt=15;
		System.out.println(brand.foodCourt);
		
		//brand.store=6500;
		System.out.println(brand.store);
		
		//brand.securityIncharge='C';
		System.out.println(brand.securityIncharge);
		
		//brand.sundayOpen=false;
		System.out.println(brand.sundayOpen);
		
		//brand.salesVolume=2540000.50;
		System.out.println(brand.salesVolume);
		
		
	}

}
