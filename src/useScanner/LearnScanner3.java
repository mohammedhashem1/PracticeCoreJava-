package useScanner;

import java.util.Scanner;

public class LearnScanner3 {

	public static void main(String[] args) {

		Scanner teacher = new Scanner(System.in);
		System.out.println("What is Name of the biology teacher in the school");
		String name = teacher.nextLine();
		System.out.println("Biology teacher is =" + name);

		Scanner salary = new Scanner(System.in);
		System.out.println(" How much salary Biology teacher getting in Bangladesh");
		int basic = salary.nextInt();
		System.out.println("Biology Teacher getting salary is =" + basic);

		Scanner rate = new Scanner(System.in);
		System.out.println("What is the Gold rate in world market");
		double gold = rate.nextDouble();
		System.out.println("Gold rate in 10 gram in Bangladesh is=" + gold);

		Scanner ratio = new Scanner(System.in);
		System.out.println("what is the population growth in Bangladesh");
		float growth = ratio.nextFloat();
		System.out.println("Population Growth rate in Bangladesh is=" + growth);

		Scanner appeal = new Scanner(System.in);
		System.out.println("How many case's appealfor The Supreme Court  per year ");
		short court = appeal.nextShort();
		System.out.println("Case's appeal for the Supreme Court in USA is =" + court);

		Scanner citizen = new Scanner(System.in);
		System.out.println("How many US citizen is in New York state ");
		long newYork = citizen.nextLong();
		System.out.println("In New York state living US citizen is almost =" + citizen);

		Scanner award = new Scanner(System.in);
		System.out.println("How many people are Oscar nominated for 2019 ");
		byte person = award.nextByte();
		System.out.println("Oscar nominated people for 2019 is =" + person);

		Scanner sunday = new Scanner(System.in);
		System.out.println("Is the Thank's Giving day in Usa is Sunday");
		boolean thanksGiving = sunday.nextBoolean();
		System.out.println("USA this year Thank's Giving day is Sunday is=" + thanksGiving);

		Scanner country = new Scanner(System.in);
		System.out.println("What is the Rich country in the world ");
		String rich = country.nextLine();
		System.out.println("The rich country in the world right current year is =" + rich);

		Scanner team = new Scanner(System.in);
		System.out.println("How many country is particapating in the  world cup Football qualifying round ");
		int worldCup = team.nextInt();
		System.out.println("The participating team for Football world cup qualifying round is=worldCup" + worldCup);

		teacher.close();
		salary.close();
		ratio.close();
		rate.close();
		appeal.close();
		citizen.close();
		award.close();
		sunday.close();
		country.close();
		team.close();
	}

}
