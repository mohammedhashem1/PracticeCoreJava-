package controlFlowJava;

public class GradeFlowPractice {

	public static void main(String[] args) {

		int mark = 85;
		char grade = 0;

		if (mark == 70) {
			grade = 'H';
		} else if (mark >= 75) {
			grade = 'G';
		} else if (mark >= 80) {
			grade = 'E';
		} else if (mark <= 85) {
			grade = 'D';
		} else if (mark >= 90) {
			grade = 'C';
		} else if (mark >= 93.5) {
			grade = 'B';
		} else if (mark >= 95) {
			grade = 'A';
		} else {
			System.out.println("Marks is not satisfy to make grading" + grade);
		}

		System.out.println("Average satisfactory mark for the exam is ranked by : " + grade);

		double score = 86.5;
		String rank = null;

		if (score == 72) {
			rank = "F";
		} else if (score <= 75) {
			rank = "F+";
		} else if (score >= 80) {
			rank = "E";
		} else if (score >= 83) {
			rank = "D";
		} else if (score >= 86.5) {
			rank = "C";
		} else if (score >= 90) {
			rank = "B";
		} else if (score >= 95) {
			rank = "A";
		} else if (score >= 98) {
			rank = "A+";
		} else {
			System.out.println(" The score are not reached the satisfactory level:" + rank);
		}

		System.out.println("The smart mark or satisfactory level of marked indicate rank is: " + rank);
		// ======================================================================================================
		int num = 80;
		char rating = 0;

		if (num == 75) {
			rating = 'F';
		} else if (num <= 80) {
			rating = 'D';
		} else if (num > 85) {
			rating = 'C';
		} else if (num >= 90) {
			rating = 'B';
		} else if (num > 95) {
			rating = 'A';
		} else {
			System.out.println("Performance is not the satisfactory level" + rating);
		}
		System.out.println("Average performance is acceptable if the rating is :" + rating);

		// =====================================================================================
		int food = 6;
		String name = null;

		if (food == 1) {
			name = "parata";
		} else if (food == 2) {
			name = "omlet";
		} else if (food == 3) {
			name = "biarayani";
		} else if (food == 4) {
			name = "tandoor roti";
		} else if (food == 5) {
			name = "chicken biaryani";
		} else if (food == 6) {
			name = "Kacchi byrani";
		} else if (food == 7) {
			name = "beef byrani";
		} else if (food == 8) {
			name = "moglai parta";
		} else if (food == 9) {
			name = "halim";
		} else {
			System.out.println("Nothing in the menu list,have to make by specially " + name);
		}
		System.out.println("My fovourite food is :" + name);

		// =========================================================================
		int apple = 10;
		int greenApple = 10 + 5;
		System.out.println("Additive operator is :" + greenApple);

		
		
		double subApple = greenApple - 2.5;
		System.out.println("Substractive operator is:" + subApple);

		double multApple = subApple * 4;
		System.out.println("Multiple operator is :" + multApple);
		double divApple = multApple / 2;
		System.out.println("Division operator is:" + divApple);
		double redApple=divApple%2;
		System.out.println("Remainder operator is :"+redApple);
		
int cost=5;

	}

}
