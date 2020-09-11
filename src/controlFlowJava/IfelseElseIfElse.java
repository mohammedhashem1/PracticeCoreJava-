package controlFlowJava;

public class IfelseElseIfElse {
	
	public static void main(String[] args) {
		int pritul=19000;
		int rumi=20000;
		if (pritul<rumi) {
			System.out.println("Pritul salary is less than Rumi's salary");
			int pritulAge=19;
			int rumiAge=24;
			if(pritulAge<rumiAge) {
				System.out.println("pritul is younger than rumi");
				double pritulExpense=16500.5;
				double rumiExpense=19500.5;
				if(rumiExpense>pritulExpense) {
					System.out.println("rumi yearly expense is higher than pritul");
				}else {System.out.println("pritul expenses is less than rumi's expense");
				}
			}else {System.out.println("rumi is older than pritul");
			}
		}else {System.out.println("rumi's salary is greater than pritul salary");
		}
		
		
	}
	

}
