package useScanner;

import java.util.Scanner;

public class LearnScanner2 {

	public static void main(String[] args) {

		Scanner nameInput = new Scanner(System.in);
		System.out.println(" What is your name");
		String name = nameInput.nextLine();
		System.out.println("My name is =" + name);
		
	Scanner collegeInput = new Scanner(System.in);
		
		System.out.println("What is the  college");
		String college = collegeInput.nextLine();

	System.out.println("Name of the College is="+college);

		Scanner doctorInput=new Scanner(System.in);
		System.out.println("Name of the Doctor is");
		String physician=doctorInput.nextLine();
	
		System.out.println("Doctor name ="+physician);
		
	Scanner playerInput=new Scanner(System.in);
		System.out.println("Name of the best Goalkeeper");
	String goalKeeper=playerInput.nextLine();
		
		
		System.out.println("Goalkeeper Name is ="+goalKeeper);		
		Scanner ageInput=new Scanner(System.in);
		System.out.println("Name of the Player karim mohammed  ");
		int year=ageInput.nextInt();
		System.out.println("Age is ="+year);
		
		nameInput.close();
		collegeInput.close();
		doctorInput.close();
		playerInput.close();
		ageInput.close();
		
	}

}
