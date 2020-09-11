package demo;
import java.util.Scanner;

public class PracticeScanner{

	
	
	public static void main(String[] args) {
		
		Scanner useInput=new Scanner(System.in);
		System.out.println("What is the name of the Computer");
		String name=useInput.nextLine();
		System.out.println("Computer Brand name is ="+name);
		
		Scanner yearInput=new Scanner(System.in);
		System.out.println("which model is");
		int model=yearInput.nextInt();
		System.out.println("Apple  Brand computer model is ="+model);
		
		Scanner television=new Scanner(System.in); 
		System.out.println("What is the name of the Television");
		String flatScreen=television.nextLine();
		System.out.println("Brand Name of the Television is = "+flatScreen);
	
		Scanner ageInput= new Scanner (System.in); 
		System.out.println("Age of the Chairman is");
		int born=ageInput.nextInt();
		System.out.println("Chairman age is="+born);
	
		Scanner price=new Scanner(System.in);
		System.out.println("Gold price in world Market is");
		int gold=price.nextInt();
		System.out.println("Gold price is="+gold);
		
		Scanner citizen=new Scanner(System.in);
		System.out.println("what is the Name of the senior citizen");
		String newYork=citizen.nextLine();
		System.out.println("Name of the Senior citizen is ="+newYork);
		
		Scanner footballTeam=new Scanner(System.in);
		System.out.println("what is name of the Football team");
		String europian=footballTeam.nextLine();
		System.out.println("Europian Football club champion is ="+europian);
		
		useInput.close();
		yearInput.close();
		television.close();
		ageInput.close();
		price.close();
		citizen.close();
		footballTeam.close();
	}
	
	
	
}
