package controlFlowJava;

public class RoughPractice {

	public static void main(String[] args) {

		int pintuAge = 46;
		int mahmudAge = 38;

		if (pintuAge > mahmudAge) {
			System.out.println("pintu is older than mahmud");
			int pintuIncome = 56000;
			int mahmudIncome = 65000;
			if (mahmudIncome > pintuIncome) {
				System.out.println("Mahmud income is more than pintu income");
				double pintuExpense = 52600.5;
				double mahmudExpense = 63500.5;
				if (mahmudExpense > pintuExpense) {
					System.out.println("Mahmud expense is higher than pintu");
				} else {
					System.out.println("Pintu expense is less than Mahmud ");
				}
			} else {
				System.out.println("Pintu income is less than Mahmud income");
			}
		} else {
			System.out.println("Mahmud is younger than pintu");
		}
//====================================================================================
		int sale = 5;
		String product;
		switch (sale) {
		case 1:
			product = "rice";
			break;
		case 2:
			product = "oil";
			break;
		case 3:
			product = "vegetable";
			break;
		case 4:
			product = "groccery";
			break;
		case 5:
			product = "meat";
			break;
		case 6:
			product = "stasionary";
			break;
		case 7:
			product = "fish";
			break;
		case 8:
			product = "juice";
			break;
		case 9:
			product = "paper goods";
			break;
		default:
			product = "invalid";
			break;

		}
		System.out.println("Name of the product is:" + product);
		System.out.println("Name of the product is :" + product);
		// =============================================================

		int xAge = 43;
		int yAge = 54;

		if (xAge < yAge) {
			System.out.println("Mr x is younger Mr y");
			int xIncome = 55000;
			int yIncome = 53000;
			if (yIncome < xIncome) {
				System.out.println("Mr x income is more than Mr y");
				double xExp = 42500.5;
				double yExp = 44550.5;
				if (yExp > xExp) {
					System.out.println("Mr y expense is more than Mr x");
				} else {
					System.out.println("Mr x expense is less than Mr y");
				}
			} else {
				System.out.println("Mr y is getting less than Mr x");
			}
		} else {
			System.out.println("Mr y is older than Mr x");
		}

	}

}
