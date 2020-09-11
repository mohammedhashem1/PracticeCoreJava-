package constructor;

public class PizzaNewYork {

	String pizza;
	double chPizzaPrice;
	String store;
	int QuaOfStore;
	String aPizza;
	int aPrice;
	
	String dPizza;
	double dP;
	
	
	
	
	public PizzaNewYork() {

	}// default constructor,no return,should be same class,need when we create lot of
		// Constructor class,first need to make default constructor.cinstuctor class
		// depend on parameter

	public PizzaNewYork(String cPizza, double pPrice) {

		String cheese = this.pizza = cPizza;
		double cheesePrice = this.chPizzaPrice = pPrice;

		System.out.println("Name of the type of pizza is=" + cheese + "; price of the cheese pizza is =" + cheesePrice);

	}

	public PizzaNewYork(String StoreN, int storeQ) {

		String papazone = this.store = StoreN;
		int storeQuantity = this.QuaOfStore = storeQ;
		System.out.println(
				"Brand name of the pizza is=" + papazone + ";number of chain Store in New York is =" + storeQuantity);
	}
	
	public PizzaNewYork(int aPP ,String aP) {
		
		String best=this.aPizza=aP;
		int price=this.aPrice=aPP;		
		System.out.println("Best Pizza in New York Manhattan is="+best+"; Price is ="+price);
		
	}
	
	public PizzaNewYork( double dP, String dPP) {
		 
		String quality=this.dPizza=dPP;
		double reasonable=this.dP=dP;
		
		System.out.println(quality+reasonable);
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {

		PizzaNewYork quality = new PizzaNewYork(" American Cheese Pizza", 34.99);
		PizzaNewYork brand = new PizzaNewYork("Papazone pizza ", 1250);
		PizzaNewYork rank = new PizzaNewYork(34, "Artichoke Pizza");
		PizzaNewYork taste=new PizzaNewYork("Name of reasonable Price and Quality pizza is DOMINO ,price =", 19.99);
		PizzaNewYork flavour=new PizzaNewYork("Domino is moderate quality pizza , price is =", 22.99);
		
		
		
		
	}
}
