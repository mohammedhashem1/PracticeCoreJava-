package useScanner;

import java.util.Scanner;

public class Education {
public static void main(String[] args) {
	
	Scanner name=new Scanner(System.in);
	System.out.println("Name of the high school where i passed H.S.C is :");
	String school=name.nextLine();
	System.out.println("Name of the High school where i got H.S.C is :"+school);
	System.out.println("Gold price per ounce in the world market is :");
	double goldPrice=name.nextDouble();
	System.out.println("Gold price in the world market per ounce is now :"+goldPrice);
	System.out.println("Populaion in Bangladesh is:");
	long population=name.nextLong();
	System.out.println("Total populstion of Bangladesh is :"+population);
}
}
