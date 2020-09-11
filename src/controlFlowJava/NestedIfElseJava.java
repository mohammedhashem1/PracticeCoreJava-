package controlFlowJava;

public class NestedIfElseJava {

	public static void main(String[] args) {
		int anika = 19;
		int rumi = 40;
		if (anika < rumi) {
			System.out.println("Anika is younger than Rumi ");
			int salary = 7500;
			if (salary > 7000) {
				System.out.println(" Anika getting smart salary from his job");
				int price = 5500;
				if (price < 6000) {
					System.out.println("Anika's yearly clothing price is less than $6000 per year");
					double food = 65.5;
					if (food > 60) {
						System.out
								.println("New York city average food expenses for nedium family is $65.5 in Manhattan");

					}
				}

			}
		}
//=====================================================================================================
		int mahmud = 50;
		int pintu = 40;

		if (mahmud > pintu) {
			System.out.println("Mahmud exam is more higher than pintu");
			int mahmudSalary = 10000;
			int pintuSalary = 8000;
			if (10000 > 8000) {
				System.out.println("Mahmud getting monthly salary is good;");
				int rent = 8000;
				if (rent < 7500) {

					System.out.println("If mahmud rent is less than $7500 per month");
				}

			}

		}
//==============================================================================================================//
		int titu = 35;
		int santu = 45;
		if (santu > titu) {
			System.out.println("Santu is greater than Titu");
			int salary = 6500;
			if (salary > 7000) {
				System.out.println("Santu getting more salary than Titusss");
			} else {
				System.out.println("Titu is getting more salary than santu ");
			}

		}

		int anikaAge = 18;
		int rumiAge = 38;
		if (anikaAge < rumiAge) {
			System.out.println("Anika is older than rumi");
			int income = 5000;
			if (income > 6000) {
				System.out.println("Anika salary is not good enough");
			} else {
				System.out.println("Anika salary is Good");

			}
		} else {
			System.out.println("Anika is younger than rumi");
		}
//=========================================================================================================

		int xAge = 25;
		int yAge = 20;

		if (xAge > yAge) {
			System.out.println("Mr X age is older than Mr Y");
			int expense = 4500;
			if (expense > 5000) {
				System.out.println("MR X monthly expenses is not acceptable");
			} else {
				System.out.println("MR X monthly expense is good range");
			}
		} else {
			System.out.println("MR Y is younger than MR X");

		}

//====================================================================================================		
		double x = 65;
		double y = 50.0;
		if (x > y) {
			System.out.println("X is greater than Y");
			int xSalary = 5000;
			int ySalary = 6000;
			if (xSalary < ySalary) {
				System.out.println("X salary is not more than Y");
				double xExpense = 7500.50;
				double yExpense = 9000.00;
				if (xExpense < yExpense) {
					System.out.println("X expense is less than Y expense");
				} else {
					System.out.println("Y expense is more Higher than X expense");
				}
			} else {
				System.out.println("Y salary is higher than X");
			}
		} else {
			System.out.println("Y is less than X");
		}
//===========================================================================================	

		int pritul = 19;
		int babu = 35;
		if (pritul < babu) {
			System.out.println("Pritul is younger than Babu");
			double pSalary = 7550.5;
			double bSalary = 6950.5;
			if (pSalary > bSalary) {
				System.out.println("Pritul salary is higher than Babu");
				int pExp = 5000;
				int bExp = 4500;
				if (pExp > bExp) {
					System.out.println("Pritul expense is higher than Babu");
				} else {
					System.out.println("Babu expense is less than pritul");
				}

			} else {
				System.out.println("Babu salary is less than pritul salary");
			}

		} else {
			System.out.println("Babu is older than Pritul");
		}
//======================================================================================================
		int pass = 79;

		if (pass >= 79) {
			System.out.println("Officially school pass number is 79, ");

			double value = 24.99;
			if (value == 24.99) {
				System.out.println(" Pizza price by the school side pizza store is below or 24.99;");
				int namePintu = 42;
				int nameMahmud = 36;
				if (namePintu < nameMahmud) {
					System.out.println("Mahmud is older than pintu");

				} else {
					System.out.println("pintu is olde than Mahmud");
				}

			} else {
				System.out.println("pizza price by the school side is more than 25;");
			}
		} else {
			System.out.println(" Below 79 is the Officially fail number for the student");
		}
//===============================================================================================

		int priceShirt = 72;
		int pricePant = 85;

		if (priceShirt < pricePant) {
			System.out.println("Dress Shirt price is less than dress pant price");
			double shoeRegular = 54.99;
			double shoeDress = 64.99;
			if (shoeDress > shoeRegular) {
				System.out.println("Dress shoe price higher than regular shoe");
				double tieRegular = 24.99;
				double tieDress = 24.99;
				if (tieRegular == tieDress) {
					System.out.println("Tie regular and dress is same price");
				} else {
					System.out.println("No difference price of the Tie ");
				}
			} else {
				System.out.println("Regular shoe price is less than dress shoe");
			}
		} else {
			System.out.println("Dress pant is more than dress shirt");
		}
//=======================================================================================================
		int mahmudAge = 36;

		if (mahmudAge > 34) {
			System.out.println("Mahmud age over 30 years old");
			int mahmudSalary = 35000;
			int pintuSalary = 34500;
			if (pintuSalary > mahmudSalary) {
				System.out.println("Mahmud Salary is higher than ointu salary");
				double mahmudExpense = 34500.50;
				double pintuExpense = 30500.50;
				if (mahmudExpense >= 34500.50) {
					System.out.println("Pintu's expense is less than mahmud expense");
				} else {
					System.out.println("Mahmud's expense is hgher than pintu's expense");
				}

			} else {
				System.out.println("Pintu salary less than mahmud salary");
			}
		} else {
			System.out.println("Mahmud age not over than 40 years old");
		}
//=========================================================================
		int salary = 50000;
		if (salary == 50000) {
			System.out.println("Anika's salary is $50000; ");
			int netIncome = 12000;
			if (netIncome > 10000) {
				System.out.println("Anika's Net income is $12000;");
				int ageAnika = 19;
				int ageMridula = 24;
				if (ageAnika < ageMridula) {
					System.out.println("Anika is younger than Mridula");
				} else {
					System.out.println("Mridula is older than Anika");
				}
			} else {
				System.out.println("Anika's net income not less than $10000");
			}
		} else {
			System.out.println("Anika's salary is not $40000;");
		}
//========================================================================================
		int a = 5000;
		int b = 6000;
		if (a <= b) {
			System.out.println("a is greater than or equal tos b");
			x = 4500;
			y = 4600;
			if (x < y) {
				System.out.println("x is less than y");
			} else {
				System.out.println("y is greater than x");
			}
		} else {
			System.out.println(" b is not greater than a");
		}

	}

}