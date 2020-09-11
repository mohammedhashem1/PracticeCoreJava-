package constructor;

import java.util.Scanner;

public class Doctor {
	int nD;
	String pN;
	String hN;

	public Doctor(int nubD, String phyName, String hospName) {
		String hospitalName = this.hN = hospName;
		String physicianName = this.pN = phyName;
		int numOfDoctor = this.nD = nubD;

		System.out.println(hospitalName + physicianName + numOfDoctor);

	}

//====================================================================================
	String gP;
	String hL;
	int sN;

	public Doctor(String genphy, String hospL, int serialN) {
		String generalPhysician = this.gP = genphy;
		String hospitalLocation = this.hL = hospL;
		int serialNumber = this.sN = serialN;
		System.out.println(generalPhysician + hospitalLocation + serialNumber);
	}
//================================================================================

	public String Hospital(String nH, String nD, int yS) {
		String hospital = nH;
		String doctor = nD;
		int yearlySalary = yS;
		String overall = hospital + ";" + doctor + ";" + yearlySalary;
		System.out.println(overall);
		return overall;
	}

	String fN;
	String oP;
	String hp;

	public Doctor(String fullN, String occP, String hosP) {

		String name = fullN;
		String occupation = occP;
		String hospital = hosP;
		String senario = name + occupation + hospital;
		System.out.println(senario);

	}

	public static void main(String[] args) {
		Doctor type = new Doctor(35, "; Dr Sabina Awal;", "Queens Hospital");
		Doctor name = new Doctor("Professor Singh;", "Mount Sinai Hospital, Flushing,Queens,NY; Serial No=", 2);
		Doctor fame = new Doctor("Doctor Hashem;", "Surgeon;", "Mount sinai hospital");
		Scanner group = new Scanner(System.in);
		System.out.println("Name of the Football Team is:");
		String footballTeam = group.nextLine();
		System.out.println("Name of the football team is :" + footballTeam);
		// ===================================================================
		System.out.println("Total Salary of Real Madrid team's Player  of Spain is :");
		double totalSalary = group.nextDouble();
		System.out.println("Total Salary of Real Madrid team's Player  of Spain is" + totalSalary);
		// ====================================================================================================
Scanner team=new Scanner(System.in);
	System.out.println("Name of the Pandemic disease is :");	
		
		String disease=team.nextLine();
		System.out.println("Name of the pandemic disease is :"+disease);
		Scanner panic=new Scanner(System.in);
		System.out.println("Pandemic disease spread all over the world including :");
		String patient=panic.nextLine();
		System.out.println("Pandemic disease spread all over the world including :"+patient);
		
	}

}
