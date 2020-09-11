package learnobject;

public class Mall {

	int store = 576;
	double salesVolume = 576497.68f;
	float dailySaleTrend = 5873.0978f;
	short customerParking = 6785;
	long customer = 67845739;
	byte foodCourt = 76;
	char securityIncharge = 'H';
	boolean sundayOpen = false;
	String biggestStore = "Macy's";

	public void location() {

		System.out.println("Thumbs up everybody");

	}

	public static void main(String[] args) {

		// First create object which is the blue print of the class to call Non static
		// variable or Any method we create must object
		// A CLASS IS THE BUE PRINT PROTOTYPE OF THAT DEFINES VARIABLE OR METHOD;
		// A OBJECT IS THE SPECIMAN OF THE CLASS

		Mall price = new Mall();

		price.customerParking = 567;

		System.out.println(price.customerParking);
		System.out.println(price.customer);
		System.out.println(price.biggestStore);
		System.out.println(price.dailySaleTrend);
		System.out.println(price.salesVolume);
		System.out.println(price.store);
		System.out.println(price.sundayOpen);
		System.out.println(price.foodCourt);
		System.out.println(price.customer);

		// =========================================================================================================
		// =========================================================================================================

		Pizza food = new Pizza();

		food.Cheese = 3645;
		System.out.println(food.Cheese);
		// System.out.println(food.Cheese);

		// food.pizzaStore = 5769;
		System.out.println(food.isPizzaStore);

		System.out.println(food.pizzaStore);
		// food.manager = "Omar Fareque";
		System.out.println(food.manager);

//  food.SodaAndPizza=456.87f;

		System.out.println(food.SodaAndPizza);
		System.out.println(food.vegetablePizza);

		// food.quantityOfPizza=4697586;
		System.out.println(food.quantityOfPizza);

		// food.manager="Anika Hashem" ;

		System.out.println(food.manager);

		// food.SodaAndPizza=65.97;
		System.out.println(food.SodaAndPizza);

		System.out.println(food.isPizzaStore);
		// =========================================================================================================
		// =========================================================================================================

		Football rank = new Football();

		// rank.game=2000;

		System.out.println(rank.game);

//	rank.Addidas="Brand";
		System.out.println(rank.Addidas);

		// rank.coach = 'K';
		System.out.println(rank.coach);
		System.out.println(rank.coach);

		// rank.playerIncome=97500;
		System.out.println(rank.playerIncome);

		// rank.game=4500;
		System.out.println(rank.game);

		// rank.finalMatch=false;
		System.out.println(rank.finalMatch);

		// rank.name="Rial Madrid";
		System.out.println(rank.name);

		// rank.player=56500;
		System.out.println(rank.player);

		// rank.nationalPlayer=48;
		System.out.println(rank.nationalPlayer);

		// rank.trainerPlayerRatio=96.456f;
		System.out.println(rank.trainerPlayerRatio);

		// rank.quantityOfFootball=3500;
		System.out.println(rank.quantityOfFootball);

		// =========================================================================================================
		// =========================================================================================================

		RestaurentInJamaica type = new RestaurentInJamaica();

		// type.BestRestaurent="TajMahal";
		System.out.println(type.BestRestaurent);

		// type.Chief=86;
		System.out.println(type.Chief);

		// type.Employees=400;
		System.out.println(type.Employees);

		// type.GrossProfit=78500.950f;
		System.out.println(type.GrossProfit);

		// type.IsGood=false;
		System.out.println(type.IsGood);

		// type.location='S';
		System.out.println(type.location);

		// type.NumberOfRestaurent=350;
		System.out.println(type.NumberOfRestaurent);

		// type.YearlyCustomer=965006;
		System.out.println(type.YearlyCustomer);

		// type.NetProfit=578940.70;
		System.out.println(type.NetProfit);

		// =========================================================================================================
		// =========================================================================================================

		Game kind = new Game();

		// kind.indoor=89;
		System.out.println(kind.indoor);

		// kind.outdoor=5006;
		System.out.println(kind.outdoor);

		// kind.team="Ranger's";
		System.out.println(kind.team);

		// kind.teamHead='P';
		System.out.println(kind.teamHead);

		// kind.teamPerformance=false;
		System.out.println(kind.teamPerformance);

		// kind.gameCombination=98760.85;
		System.out.println(kind.gameCombination);

		// kind.teamViewer=786096.86f;
		System.out.println(kind.teamViewer);

		// kind.totalGame=95600;
		System.out.println(kind.totalGame);

		// kind.winner=12;
		System.out.println(kind.winner);
		
		
		
		

	}

}
