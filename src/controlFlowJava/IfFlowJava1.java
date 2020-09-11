package controlFlowJava;

public class IfFlowJava1 {
	
	public static void main(String[] args) {
		int x=35;
		int y=65;
		if(x==y) {
			System.out.println("x is equal to  y ");
		} 
		else {
			System.out.println("x is greater than or equal to y");
			
		}	
		int a=55;
		int b=65;
		if(a<b) {
			System.out.println("a is less than b ");
			int c=25;
			int d=45;
			int sum=c+d;
			System.out.println("Summation of  c and d is equal to ="+sum);
		}
		if(a>b) {
			System.out.println(" a is greater than b ");
			
		}
		else { System.out.println("a is not greater than b");
			
		}
		if (a<=b) {
			System.out.println("a is less than or equal to b");
			;
		}
		else { System.out.println("a is greater than or equal to b");
		}
	int mithu=45;	
		int pintu =40;
		if (mithu==45) {
			System.out.println("Mithu is 45 years old ");
		}
		else if(mithu>pintu) {
			System.out.println("mithu is older and elder than pintu");
		}
		
		else { System.out.println("mithu is elder than pintu");
		} 
	int alamin=55;
	if (alamin>60) {
		System.out.println("Alamin age is not greater than 60 years");
		
	}
	else if(alamin==50) {
		System.out.println("alamin age is equal to 55 years");
	}
	else {
		System.out.println("alamin is greater than 50 years");
	}	
		
	int lemon=35;
	int mango=37;
	if(lemon<mango) {
		System.out.println("lemon price is less than mango");
		double limeJuice=45.5;
		double mangoJuice=43.5;
		 if(limeJuice>mangoJuice) {
			System.out.println("limeJuice is better than mangoJuice");
		}else {
			System.out.println("mango juice is not good for health");
		}
		
	}else {
		System.out.println("mango price is higher than lemon");
	}
	
	
	
	
	
	

	}
	

}
