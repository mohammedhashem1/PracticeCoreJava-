package methods;

public class MethodJava6 {
	int price(int gPrice, int oPrice) {
		int goldPrice = gPrice;
		int ouncePrice = oPrice;
		int goldOunce = goldPrice * ouncePrice;
		System.out.println("Gold price in the world market per ounce is:" + goldOunce);

		return goldOunce;
	}

//==================================================================================================
	public void resident(String lArea, int res) {
		String location = lArea;
		int residence = res;
		System.out.println("Name of the location is:" + location + "; number of people living is:" + residence);

	}
//=========================================================================================

	public String newYork(String school, int student, int teacher) {
		String academy = school;
		int participant = student;
		int guider = teacher;
		String overall = "Name of the School is:" + academy + ";Number of Student is:" + participant
				+ ";Number of Student is:" + guider;
		System.out.println(overall);
		return overall;
	}

	// ==============================================================================================
	String fN;
	String lN;
	double iC;
	double eX;

	public String person(String fName, String lName, double grossInc, double monthlyExp) {
		String firstName = fName;
		String lastName = lName;
		double monthlyIncome = grossInc;
		double monthlyExpense = monthlyExp;
		String senario = firstName + " " + lastName + " ; Monthly income is :" + monthlyIncome + "; monthly Expense is:"
				+ monthlyExpense;
		System.out.println(senario);
		return senario;
	}

	public void city(String cName, int cPopulation, double hRent) {
		String cityName = cName;
		int resident = cPopulation;
		double houseRent = hRent;

		System.out.println("Name of the city is:" + cityName + "; Number of the resident is:" + resident
				+ ";House rent average is:" + houseRent);

	}

	public static void main(String[] args) {
		MethodJava6 name = new MethodJava6();
		name.price(2550, 8);
		name.resident("Bashundhara model town", 126500);
		name.newYork("Mohammadpur Govt High School", 3600, 45);
		name.city("Dhaka,Bangladesh", 12500000, 25000);
		name.person("Mohammed", "Hashem", 450000, 415000);
	}

}
