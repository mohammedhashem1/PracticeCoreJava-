package constructor;

public class Education {
	String fN;
	String lN;
	String aDD;
	String sN;
	String lP;
	int nS;
	String sM;
	String fT;
	double fP;
	String bS;
	int qS;
	String eB;
	int tS;
	String s;
	double l;
	public Education() {
		
		
	}//Default constructor ,when create multiple constructor of 
	//same class we must create default constructor ,constructor has to be same class ,
	//constructor varies number of signature or parameter 
	//when we use signature called paramerized constructor
	
	public Education(String fName, String lName, String address) {
		String firstName=this.fN=fName;
		String lastName=this.lN=lName;
		String mailing=this.aDD=address;
		System.out.println("Name of the Student is="+firstName+" "+lastName+"; Mailing Address is ="+mailing);
	}
	
	public Education(String sName, int nStudent, String lPlace) {
		String schoolName=this.sN=sName;
		int numberOfStudent=this.nS=nStudent;
		String location=this.lP=lPlace;
		System.out.println("Name of the School is=" +schoolName+ "; Number of Student is="+numberOfStudent+" ; Address is ="+location);
	}
	
	public Education(String sMarket,String mFt,double mP ) {
		String superMarket=this.sM=sMarket;
		String mango=this.fT=mFt;
		double price=this.fP=mP;
		System.out.println("Name of the supermarket="+superMarket+"; Name of the fruit is="+mango+";But price of Mango is="+price);
		
	}
	public Education (String bSchool, int qStudent) {
		String bestSchool=this.bS=bSchool;
		int qualifiedStudent=this.qS=qStudent;
		System.out.println("Name of the School is="+bestSchool+"; Number of Qualified Student ="+qualifiedStudent);
	}
	public Education( int tSalary, String eBoard) {
		int teacherSalary=this.tS=tSalary;
		String educationBoard=this.eB=eBoard;
		System.out.println("New York city teacher intial salary is ="+teacherSalary+";"+educationBoard);
	}
	
	public Education(String sName,double lch) {
		String schoolName=this.sN=sName;
		double lunchCost=this.l=lch;
		System.out.println("Name of the School is="+schoolName+", Lunch cost from city per student is ="+lunchCost);
	}
	
	
	public static void main(String[] args) {
		Education learner=new Education("Mohammed", "Hashem"," 165-20 Highland Ave ,Jamaica, Queen's ,N.Y" );
		Education school=new Education("Stuyvesant High School",7800, "Battery park north ,South Manhattan,N.Y");
		Education shop=new Education("Mannan Super Market", "JackFruit", 79.99);
		Education best=new Education("Ryan Middle school Fresh Meadow", 2500);
		Education cost=new Education("Bayside middle school", 14.99);
		Education teacher=new Education(75000, " Education Board of New York ,Albany");
	}
}
