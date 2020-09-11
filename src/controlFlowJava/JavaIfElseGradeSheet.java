package controlFlowJava;

public class JavaIfElseGradeSheet {
	
	public static void main(String[] args) {
		int pass=85;
		char grade;
		if(pass>=80) {
			 grade = 'A';
		}
		else if(pass>90) {
			grade ='B';
		}
		else if (pass<=90) {
			grade ='C';
		}
		else if (pass!=95) {
		grade='D';
		}
		else if (pass>=85) {
			grade ='F';
		}
		else {
			grade='G';
		}
		System.out.println("Ranking of the Student ="+grade);
		
	}
	
	
	
	
	

}
