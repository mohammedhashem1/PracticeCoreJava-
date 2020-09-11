package constructor;

import java.util.Scanner;

public class SchoolConstructor {
	String sN;
	String sL;
	
	
	public SchoolConstructor(String sName, String lName) {
		String school=this.sN=sName;
		String location=this.sL=lName;
		System.out.println("Name of the School is :"+school+"; location is:"+location);
		
	}
	double apple;
	String store;
	
	public void market(String mSuper, double appJuice) {
		
		String groccery=this.store=mSuper;
		double appleJuice=this.apple=appJuice;
		System.out.println("Name of the groccery is:"+groccery+"; price of the apple juice is :"+appleJuice);
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		SchoolConstructor name=new SchoolConstructor("Stuyvesant High School", " Battery park city North, Manhattan");
		name.market("Mannan super market ", 12.99);
		Scanner type=new Scanner(System.in);
		System.out.println("Name of the richest country in the world is:");
		String country=type.nextLine();
		System.out.println("Name of the richest country in the world is:"+country);
	}
	
	
	

}
