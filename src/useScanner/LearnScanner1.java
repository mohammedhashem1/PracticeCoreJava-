package useScanner;

import java.util.Scanner;

import javax.management.openmbean.OpenDataException;

public class LearnScanner1 {

	public static void main(String[] args) {

		Scanner type = new Scanner(System.in);
		System.out.println("What is the best university in the world");
		String Education = type.nextLine();
		System.out.println("Best University in the world is=" + Education);

		Scanner price = new Scanner(System.in);
		System.out.println("What is the Gold price per gram in the world market now");
		int gold = price.nextInt();
		System.out.println("Gold price in world market is=" + gold);

		Scanner population = new Scanner(System.in);
		
		System.out.println("What is the population of Bangladesh");
		long populationOfBangladesh = population.nextLong();
		System.out.println("Population of Bangladesh with Ruhingha is=" + populationOfBangladesh);
		
		Scanner cost=new Scanner(System.in);
		System.out.println("What is the Diamond price in the world market");
		double diamond=cost.nextDouble();
		System.out.println("Diamond price in the world market is="+diamond);
		
		Scanner number=new Scanner(System.in);
		System.out.println("What is the total number of Cricket Player in Australia");
		short player=number.nextShort();
		System.out.println("Total number of cricket player in Australia is="+player);
		
		Scanner rate=new Scanner(System.in);
		System.out.println("What is currency pound exchange rate in Bangladesh ");
		float exchange=rate.nextFloat();
		System.out.println("Currency pound Exchange rate in Bangladesh is ="+exchange);
		
		Scanner best=new Scanner(System.in);
		System.out.println("What is number of best cricketer in India");
		byte cricketer=best.nextByte();
		System.out.println("Ranking best cricketer in India is ="+cricketer);
		
		Scanner open=new Scanner(System.in);
		System.out.println("Is the school of New York open Thank's Giving Day");
		boolean school=open.nextBoolean();
		System.out.println("Thank's Giving day school of New York  open is ="+school);
		
		Scanner famous=new Scanner(System.in);
		System.out.println("What is the famous football player in the world ");
		String footballer=famous.nextLine();
		System.out.println("Fmaous football player in the world is now ="+footballer);
		
		Scanner rich=new Scanner(System.in);
		System.out.println("How much asset the world richest man has now ");
		double wealth=rich.nextDouble();
		System.out.println("World richest person in the world, has the wealth of ="+wealth);
		
		type.close();
		price.close();
		population.close();
		cost.close();
		number.close();
		rate.close();
		best.close();
		open.close();
		famous.close();
		rich.close();
	}

}
