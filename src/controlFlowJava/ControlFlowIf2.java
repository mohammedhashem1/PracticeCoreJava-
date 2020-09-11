package controlFlowJava;

public class ControlFlowIf2 {

	public static void main(String[] args) {
		int pintu = 55;

		if (pintu > 40) {
			System.out.println("Pintu age greater  than 50 years");
		} else if (pintu == 55) {
			System.out.println(" pintu is exactly 55 years old");
		} else {
			System.out.println("pintu age less than 60 years old");

		}
		int salary = 5000;
		if (salary > 6000) {
			System.out.println("pintu's salary is more than 6000 per month ");
		}
		if (salary > 4500) {
			System.out.println("Pintu's salary is more than 4500 per month");
		} else {
			System.out.println("Salary of pintu is not smart figure");

		}

		int z = 35;
		int y = 40;

		if (z < y) {
			System.out.println("z is greater than y");
		} else if (z <= 35) {
			System.out.println("z is not less or equal than y value");
		} else {
			System.out.println("z is not greater than y ");
		}

		int anika = 45;
		int rumi = 30;

		if (anika > 40) {
			System.out.println("anika age is greater than rumi");
		} else if (anika == 45) {
			System.out.println("Anika is exactly 45 years old");
		} else {
			System.out.println("Anika is younger than Rumi");
		}

		// ================================================================================
		int pintuAge = 42;
		double tituAge = 45.5;

		if (pintuAge == tituAge) {
			System.out.println("Pintu's age is equal to titu's age is not true");
		} else if (pintuAge > tituAge) {
			System.out.println("pinu is older than titu");
		} else if (tituAge >= pintuAge) {
			System.out.println("titu's age is greater than and equal to pintu's age");
		} else {
			System.out.println("All the above statement is not true as per statements");
		}

		// ===============================================================================
		int mango = 25;
		int orange = 30;
		if (mango == orange) {
			System.out.println("quantity is Mango not equal to orange");
			double mangoPrice = 12.99;
			double orangePrice = 9.99;
			if (mangoPrice > orangePrice) {
				System.out.println("Mango price is higher than orange price");
				double mangoJuice = 34.99;
				double orangeJuice = 29.99;
				if (mangoJuice > orangeJuice) {
					System.out.println("Mango juice is More expensive than prange");
				} else {
					System.out.println("orange juice is cheaper than mango juice");
				}
			} else {
				System.out.println("Orange price is less than mango price");
			}
		} else {
			System.out.println("Quantity of mango is more than orange");
		}
//=====================================================================================
		double potato = 3.99;
		double onion = 3.49;
		if (potato > onion) {
			System.out.println("potato price is expensive");
			double redPotato = 4.99;
			double whitePotato = 3.99;
			if (redPotato > whitePotato) {
				System.out.println("red potato is expensive ");
				int mahmudAge = 39;
				int hashemAge = 46;
				if (mahmudAge > hashemAge) {
					System.out.println("Mahmud is younger than hashem");
				} else {
					System.out.println("Hashem is older than mahmud");
				}
			} else {
				System.out.println("white potato is cheaper");
			}
		} else {
			System.out.println("onion is cheaper than potato");
		}
		// ================================================================================

		int pritul = 18;
		int raka = 26;
		if (pritul < raka) {
			System.out.println("Pritul is younger than Raka");
			double pritulIncome = 23500.50;
			double rakaIncome = 22550.5;
			if (rakaIncome > pritulIncome) {
				System.out.println("raka income is less than pritul");
				double pritulExpense = 19500.5;
				double rakaExpense = 17500.5;
				if (pritulExpense > rakaExpense) {
					System.out.println("pritul expenses is higher than raka's expense");
				} else {
					System.out.println("Pritul expenses is higher than Raka");
				}

			} else {
				System.out.println("pritul income is higher than pritul");
			}
		} else {
			System.out.println("Raka is not younger than Pritul");
		}
//==========================================================================================

		int tituIncome = 20000;
		int pintuIncome = 25000;
		if (tituIncome < pintuIncome) {
			System.out.println("Titu's income is less than pintu's income");
			double tituExpense = 15600.5;
			double pintuExpense = 19500.5;
			if (tituExpense < pintuExpense) {
				System.out.println("Titu's expense is less than pintu's expense");
				double tituSaving = 3500.5;
				double pintuSaving = 3000.5;
				if (tituSaving > pintuSaving) {
					System.out.println("Titu's saving is more than Pintu");
				} else {
					System.out.println("Pintu's saving is less than Titu");
				}
			} else {
				System.out.println("Pintu's expense is higher than Titu");
			}
		} else {
			System.out.println("pintu income is higher than Titu's income");
		}

	}

}
