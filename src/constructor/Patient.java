package constructor;

import java.util.Scanner;

public class Patient {
	int doc;
	int pat;

	public Patient(int docN, int patN) {
		int doctor = this.doc = docN;
		int patient = this.pat = patN;
		System.out.println("Numberof patient in the Hospital is:" + patient + ";Doctors is:" + doctor);

	}
	// ==================================================================================

	double patExpense;
	String hosN;
	String hosD;

	public Patient(String hosptN, String hosptD, double patientEx) {
		String name = this.hosN = hosptN;
		String doctor = this.hosD = hosptD;
		double expenses = this.patExpense = patientEx;

		System.out.println("Name of the hospital is:" + name + ";Name of the doctor is :" + doctor
				+ ";Patient expense per head is:" + expenses);

	}

	// ==========================================
	String countN;
	double perInc;
	long popul;

	public Patient(String countryName, long population, double headIncome) {
		String country = this.countN = countryName;
		long citizen = this.popul = population;
		double perCapitaIncome = this.perInc = headIncome;
		System.out.println("Name of the country is:" + country + ";Number of people is:" + citizen
				+ ";Per person income is :" + perCapitaIncome);
	}

	public static void main(String[] args) {
		Patient number = new Patient(250, 3650);
		Patient type = new Patient("Long Island Jewish ", " Dr Deepak Majhajan", 3450.50);
		Patient state = new Patient("Bangladesh", 1850000000, 1950);

		Scanner name = new Scanner(System.in);
		System.out.println("Name of the university is :");
		String university = name.nextLine();
		System.out.println("President Obama's studied at the university of :" + university);
		System.out.println("Yearly budget of the Bangladesh is :");
		double budget = name.nextDouble();
		System.out.println("Yearly budget of the Bangladesh is :" + budget);
	}

}
