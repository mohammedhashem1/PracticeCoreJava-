package controlFlowJava;

public class IfElseControlFlow {

	public static void main(String[] args) {
		int juice = 34;

		if (juice > 50) {
			System.out.println("Juice price is not more than $50 ");
		} else if (juice == 36) {
			System.out.println("Juice price is equal = $35;");
		} else if (juice >= 34) {
			System.out.println("juice price is greater than equal =34");
		} else if (juice == 34) {
			System.out.println("juice price is :35");
		} else {
			System.out.println("juice price is $35 ");
		}
		int pintuAge = 46;
		int mahmudAge = 40;

		if (pintuAge < mahmudAge) {
			System.out.println("Pintu is older than Mahmud");
		} else if (mahmudAge < pintuAge) {
			System.out.println("Mahmud is younger than Pintu");
		} else {
			System.out.println("Mahmud is younger than Pintu");
		}
//======================================================================================================

		double orange = 18.99;
		double apple = 14.99;
		if (orange == apple) {
			System.out.println("apple price is equal to orangeprice");
		} else if (orange < apple) {
			System.out.println("apple price is higher than orange price");

		} else if (orange > apple) {
			System.out.println("Orange price is higher than apple price");
		} else {
			System.out.println("Orange price not close to apple price");
		}

	}

}
