package controlFlowJava;

import java.util.Scanner;

public class GradeIFElseIFElse {

	public static void main(String[] args) {
		int doctor = 4;
		String name ;

		if (doctor == 1) {
			name = "Rahim";
		} else if (doctor == 2) {
			name = "Rashed";
		} else if (doctor == 3) {
			name = "Deepak";
		} else if (doctor == 4) {
			name = "Sabina Awal";
		} else if (doctor == 5) {
			name = "Mohammed";
		} else if (doctor == 6) {
			name = "Basher";
		} else {
			name="Zakir";
			System.out.println("Invalid Doctor Name :");
		}
		System.out.println("Name of the personal Doctor is :" + name);
		// ==============================================================================================
		double pass = 84.0;
		char rank ;

		if (pass >= 65) {
			rank = 'F';
		} else if (pass >= 70) {
			rank = 'D';
		} else if (pass >= 75) {
			rank = 'C';
		} else if (pass >= 80) {
			rank = 'B';
		} else if (pass == 84.0) {
			rank = 'A';
		} else if (pass <= 90) {
			rank = 'x';
		} else {
			rank='N';
			System.out.println(" Result performance is out of standrad level");
		}

		System.out.println("Average good quality of student rank is : " + rank);
//===================================================================================================

		int num = 4;
		String day ;
		if (num == 1) {
			day = "Monday";
		} else if (num == 2) {
			day = "Tuesday";
		} else if (num == 3) {
			day = "wednesday";
		} else if (num == 4) {
			day = "Thursday";
		} else if (num == 5) {
			day = "Friday";
		} else if (num == 6) {
			day = "Saturday";
		} else if (num == 7) {
			day = "Sunday";
		}

		else {
			day="non Matching";
			System.out.println("The Day is not matching with log book");
		}
		System.out.println("The Thank's Giving Day in USA is :" + day);
		// ==============================================================================================
		int result = 85;
		String grade ;

		if (result > 90) {
			grade = "A";
		} else if (result >= 85) {
			grade = "B";
		} else if (result >= 80) {
			grade = "C";
		} else if (result >= 75) {
			grade = "D";
		} else if (result >= 70) {
			grade = "F";
		} else {
			grade="N";
			System.out.println("Yearly performance by result mark : Failure");
		}
		System.out.println(" Grading of the student about the exam mark :" + grade);
//=================================================================================================
		double mark = 86.5;
		char score;
		if (mark == 75.5) {
			score = 'F';
		} else if (mark == 78.5) {
			score = 'D';
		} else if (mark == 80.0) {
			score = 'C';
		} else if (mark == 83.5) {
			score = 'B';
		} else if (mark == 86.5) {
			score = 'A';
		}

		else if (mark < 89.5) {
			score = 'x';
		} else {
			score = 'X';
		}

		System.out.println("Performance of the average student is:" + score);
//====================================================================================================

		Scanner team = new Scanner(System.in);
		System.out.println("Name of the player is :");

		int player = 5;
		String serial ;

		if (player == 1) {
			serial = "Liton Das";
		} else if (player == 2) {
			serial = "Shuymu Sarkar";
		} else if (player == 3) {
			serial = "Tamim";
		} else if (player == 4) {
			serial = "Musfiquer Rahim";
		} else if (player == 5) {
			serial = "Sakib Al Hasan";
		} else if (player == 6) {
			serial = "Mominul";
		} else if (player == 7) {
			serial = "Mortuza bin Mashrafie";
		} else {
			serial = "Nobody in best squad";
		}
		System.out.println("Number five and best player is:" + serial);

		// ===============================================================================================
		double record = 80.00;
		char list ;
		if (record <= 75) {
			list = 'F';
		} else if (record >= 80) {
			list = 'D';
		} else if (record > 80) {
			list = 'C';
		} else if (record > 85) {
			list = 'B';

		} else if (record >= 90) {
			list = 'A';
		} else {
			list='N';
			System.out.println("student or candidate not in the list"+list);
		}
		System.out.println("Yearly performance of the student is :" + list);
//=======================================================================================
		double exam = 86.0;
		String evaluate ;
		if (exam <= 70) {
			evaluate = "H";
		} else if (exam <= 75) {
			evaluate = "G";
		} else if (exam <= 80) {
			evaluate = "F";
		} else if (exam == 86.0) {
			evaluate = "E";
		} else if (exam >= 90) {
			evaluate = "C";
		} else if (exam >= 95) {
			evaluate = "B";
		} else if (exam >= 98.5) {
			evaluate = "A";
		} else if (exam >= 99.5) {
			evaluate = "AA";
		} else {
			evaluate=" not satisfactory";
			System.out.println("Not above the evaluation numbering sheet" +evaluate);
		}
		System.out.println("Annual exam evaluation sheet indicate most of the student is:"+evaluate);
		
		
		
//=====================================================================================================
		double written=80.0;
		
		char follow;
		
		if(written<65) {
			follow='H';
		}else if(written<70) {
			follow='G';
		}else if(written<75) {
			follow='D';
		}else if(written<=80) {
			follow='C';
		}else if(written>85) {
			follow='B';
		}else if(written>95) {
			follow='A';
		}else if(written>99) {
			follow='*';
		}else {
			follow='F';
			System.out.println("the person in the achievement list ,invalid ");
		}
		System.out.println("Average pass mark for the written exam indicate symbol:"+follow);
	//=======================================================================================
		double min=90;
		String rating;
		if(min==80) {
			rating="fail";
		}else if(min>=85) {
			rating="fair";
		}else if(min>=90) {
			rating="good";
		}else if (min>=92.5) {
			rating="A+";
			
		}else if(min>=95) {
			rating="excellent";
		}else if(min>=98) {
			rating="extra ordinary";
		}else {
			rating="notSatisfactory";
			System.out.println(" The candidate not fulfill the above minimum score"+rating);
		}
		
		System.out.println("Most of the highly qualify student score is :"+rating);	
	//=====================================================================================	
		int mango=6;
		String brand;
		if (mango==1) {
			brand="dhaka";	
		}else if(mango==2) {
			brand="comilla";
		}else if(mango==3) {
			brand="rajshahi";
		}else if(mango==4) {
			brand="dinajpur";
		}else if(mango==5) {
			brand="barishal";
		}else if(mango==6) {
			brand="rajshahi";
		}else if(mango==7) {
			brand="kustia";
		}else if(mango==8) {
			brand="jessore";
		}else if(mango==9) {
			brand="khulna";
		}else {
			brand="nothing";
			System.out.println("invalid location"+brand);
		}
		System.out.println("the best mango area in Bangladesh is :"+brand);
		//====================================================================================
		
		int rich=5;
		String state;
		if(rich==1) {
			state="california";
		}else if(rich==2) {
			state="texas";
		}else if(rich==3) {
			state="connecticuit";
		}else if (rich==4) {
			state="new jersey";
		}else if(rich==5) {
			state="pennysylvania";
		}else if(rich==6) {
			state="new mexico";
		}else if(rich==7) {
			state="verginia";
		}else if(rich==8) {
			state="maine";
		}else if(rich==9) {
			state="delware";
		}else {
			state="invalid";
			System.out.println("name of one the richest state in USA is :"+state);
		}
		System.out.println("Name of the richest state in USA is :"+state);
		
		
		//=============================================================================================
		int count=4;
		String country;
		if (count==1) {
			country="Nepal";
		}else if(count==2) {
			country="Bhutan";
		}else if(count==3) {
			country="Maldives";
		}else if(count==4) {
			country="Bangladesh";
		}else if(count==5) {
			country="Pakistan";
		}else if(count==6) {
			country="Nepal";
		}else if(count==7) {
			country="India";
		}else
		{ country="Not Matching";
			System.out.println("Name of the best cricket country in the world is:"+country);
		}
		System.out.println("Best cricket country in the world is :"+country);
	}

}
