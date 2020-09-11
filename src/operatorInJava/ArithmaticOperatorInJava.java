package operatorInJava;

public class ArithmaticOperatorInJava {

	
	public static void main(String[] args) {
		int num1=7+9;
		int num2=num1;
		int num3=num2+16;
		
		System.out.println("num2+16 Additive Operator  is ="+num3);
		
		double price=num3-2;
		System.out.println("num3-2 substractive opertor is ="+price);
		
		double priceMultiply=price*6;
		System.out.println("Price*6 Multiply Operator is ="+priceMultiply);
		
		double priceDivision=priceMultiply/2;
		System.out.println(" priceMultiply/2 Multiply Operator is =" +priceDivision);
		
		double priceRemainder=priceDivision%4;
		System.out.println("priceDivision%4 priceRemainder is ="+ priceRemainder%4);
		
		int x=5;
		int y=x+5;
		int z=y+9;
		System.out.println("Additive operator is:"+z);
		
		int a=z-3;
		System.out.println("Subtructive operator is:"+a);
		
		int b=a*2;
		System.out.println("Multiplication operator is :"+b);
		
		int c=b/2;
		System.out.println("Divisional Operator is:"+c);
		
		int d=c*3/2;
		System.out.println("Remainder operator is :"+d);
		
		
	}
	
	
	
	
	
	

}
