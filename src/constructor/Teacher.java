package constructor;

public class Teacher {

	String schL;
	int studT;
	String school;
	int teach;
	int stud;
	
	public Teacher() {}//default class .when you make more Costructor class nedd one default class
	//it's default class and No return value , Paramterized depend how many signature inside
	public Teacher(String sch, int stud) {
		
		String school=this.schL=sch;
		int student=this.studT=stud;
		System.out.println(school+student);
		
	}
	public Teacher(String sch, int teac, int stD) {
		
	String academy=	this.school=sch;
		
		int teacher=this.teach=teac;
		int student=this.stud=stD;
	System.out.println("Name of the School is="+academy+";number of teacher is ="+teacher+ "; number of student is="+6500);
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		Teacher name=new Teacher("Stuyevast High school, number of student is =", 1750);
		Teacher student=new Teacher("Ryan Middle school", 46, 1440);
	}
	
	
	
	
	
	
}
