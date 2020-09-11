package methods;

public class MethodJava5 {

	public String award(String ammy, int nomi) {

		String famous = ammy;
		int movie = nomi;
		String best = famous + "World best movie nominated is " + movie;
		System.out.println("One of the best Award for flim industry in the world is AMMY ,nominateed" + best);

		return best;
	}

	// =========================================================================================================
	public void field(String fName, int capacity) {

		String fullName = fName;
		int people = capacity;
		System.out.println(fullName + people);

	}
	// ===========================================================================================

	public int price(int rice, int dal) {
		int pack = rice;
		int pound = dal;
		int basic = rice + dal;
		System.out.println("Basic need for living in Bangladesh cost is :" + basic);

		return basic;
	}

	// ==============================================================================================
	public void student(String fName, String lName) {

		String firstName = fName;
		String lastName = lName;
		String fullName = firstName + " " + lastName;
		System.out.println("The person qualified for the best job in Hartford life insurance is:" + fullName);

	}

//==============================================================================================

	public String university(String fName, String lName) {

		String firstName = fName;
		String lastName = lName;
		String fullName = fName + " " + lName;
		System.out.println(" Name of the University world famous is:" + fullName);

		return fullName;
	}

//============================================================================================	
	public void market(String mName, double gPrice) {
		String marketName = mName;
		double goldPrice = gPrice;

		System.out.println("Name of the market is :" + marketName + "; gold price price per gram =" + goldPrice);

	}

	// ===================================================================================
	public int patient(int pQ, int pB, int pM, int pX, int pI) {
		int patientQueens = pQ;
		int patientBrooklyn = pB;
		int patientManhattan = pM;
		int patientBronx = pX;
		int patientSisland = pI;
		int totalPatient = patientQueens + patientBrooklyn + patientManhattan + patientBronx + patientSisland;

		System.out.println("Total Corona patient in New York city is :" + totalPatient);
		return totalPatient;
	}

	public void corona(String nP, String nH, int pA) {

		String patient = nP;
		String hospital = nH;
		int age = pA;
		System.out.println(patient + hospital + age);
	}

	public double price(double pP, double mP, double wP) {
		double potato = pP;
		double mango = mP;
		double water = wP;
		double groccery = potato + mango + water;

		System.out.println("Total groccery for pandemic Corona virous is :" + groccery);

		return groccery;
	}

	public static void main(String[] args) {
		MethodJava5 flim = new MethodJava5();
		flim.award("Award for all over flim industry is =", 45);
		flim.field("Madison Square Garden ,Capacity of the Stadium =", 75000);
		flim.price(4500, 950);
		flim.student("Mahmud", "Hasan");
		flim.university("Harvard university ", "Boston");
		flim.market("Dubai international Gold market ", 24500.50);
		flim.patient(250, 300, 450, 400, 150);
		flim.corona("Mr Azizul Haque;", " Long Island Jewish Hospital ; age :", 45);
flim.price(24.5, 62.5, 34.5);
	}

}
