package useScanner;

import java.util.Scanner;

public class Scanner4 {

	
	public static void main(String[] args) {
		System.out.println("What is Best hospital in Bangladesh for Diabetics");
		Scanner type=new Scanner(System.in);
		String hospital=type.nextLine();
		System.out.println("Name of the best Hospital for Diabetics is ="+hospital);
		
		Scanner school=new Scanner(System.in);
		System.out.println("What is the Name of the Best School in Dhaka");
		String middleSchool=school.nextLine();
		System.out.println("Name of the middle school in Dhaka is ="+middleSchool);
		
		Scanner income=new Scanner(System.in);
		System.out.println("What is average income of CPA in USA");
		double accountant=income.nextDouble();
		System.out.println("Average income of CPA of USA is ="+accountant);
		
		Scanner style=new Scanner(System.in );
		System.out.println("Which country is the world champion in Football at 2018");
		String name=style.nextLine();
		System.out.println("The current world Champion in Football 2018 is ="+ name);
		
		Scanner use=new Scanner(System.in);
		System.out.println("The Best creation of Almighty Allah is =");
		String creation=use.nextLine();
		System.out.println("The Best Creation Of Almighty Allah is ="+creation);
		
		Scanner part=new Scanner(System.in); 
		System.out.println("Total gross production in Bangladesh is =");
		double production=part.nextDouble();
		System.out.println("total Gross production in Bangladesh is ="+production);
		
		type.close();
		school.close();
		income.close();
		style.close();
		use.close();
		part.close();
	}
	
}
