package operatorPractice;

public class ConditionalOperator2 {

	public static void main(String[] args) {
		int num1 = 25;
		int num2 = 45;
		// And taking data from TWO gate after verify like D style give output
		if (num1 == 25 && num2 == 45) {
		}
		// Or taking data from two gate and Working Like sharp curve give one output
		if (num1 == 25 || num2 == 45) {

		}
		if (num1 == 55 && num2 == 60) {

		}
		if (num1 == 10 || num2 == 25) {

		}

		double price1 = 25.5;
		double price2 = 35.5;
		if (price1 == 25.5 && price2 == 35.5) {

		}
		if (price1 == 25.5 || price2 == 35.5) {
		}

		double gold = 24500.5;
		double diamond = 26500.5;
		if (gold == 24500.5 && diamond == 26000) {
			System.out.println("Gold and Diamond price is not equal ");
		}
		if (gold == 24500.5 || diamond == 24600) {
			System.out.println("Diamond price is higher than gold price");
		} else {
			System.out.println("Above all the statement is not relevant");
		}

	}

}
