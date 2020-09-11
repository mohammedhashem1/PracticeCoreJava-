package constructor;

public class Hospital {
	String pName;
	String dName;
	int period;
	String kward;
	int kpatient;
	String kdoctor;
	String hTal;
	int dR;
	String Lcation;
	
	String kH;
	int nD;
	String bR;
	int tkSr;
	
	
	
	
	
	
	public Hospital() {// Constructor name must have to be same as class Name.
		// Constructor has no Return Type
		// Constructor varies based on Number of Signature/Parameter 
		// When we create multiple constructor then first we Need to create Default constructor.
		// Declare Variable
		// Parametarized Constructor: 2 signature
				//System.out.println("Parametarized Constructor");
		
	}
	
	public Hospital(String patient,int day,String doctor) {
		String hospitalized=this.pName=patient;
		String surgery=this.dName=doctor;
		 int number=this.period=day;
		 System.out.println(hospitalized+number+surgery);
		 
	}
	
	public Hospital(String kW,String kD, int kP) {
		
		String kidsWard=this.kward=kW;
		String KidsDoctor=this.kdoctor=kD;
		int patient=this.kpatient=kP;
		System.out.println(kidsWard+KidsDoctor+patient);
		
		
	}
	//==============================================================================================
	public Hospital (String nHospital,String address) {
		
		String name=this.hTal=nHospital;
		String location=this.Lcation=address;
		System.out.println("Name of the Best hospital for Heart is ="+name+", location is ="+location);
	}
	//==============================================================================================

	public Hospital(String kHospital, int nDoctor) {
		
		String kid=this.kH=kHospital;
		int doctor=this.nD=nDoctor;
		
		System.out.println("Best Hospital for Kid is ="+kid+"; number of doctor is ="+doctor);
		
	}
	public Hospital(int serv, String bHosp) {
		
		String best=this.bR=bHosp;
		int service=this.tkSr=serv;
		System.out.println("Best Hospital is ="+best+"; Everyday taking  patient's service is= "+service);
	}
	
	
	
	public static void main(String[] args) {
		Hospital type=new Hospital("Mohammed Hashem is the patient staying day =", 36, ";Under professor Depaak Majhan");
		Hospital kid=new Hospital("kid's ward in long island Jewish Hospital;", "Kid's doctor is 65 and patient is =; ", 650);
		Hospital heart=new Hospital("Mount Sinai Hospital ", " 168 st and broadway ,Manhattan,N.Y");
		Hospital infant=new Hospital("Long Island Jewish Hospital ", 126);
		Hospital service =new Hospital(15600, "Cornell Hospital");
	}
	


}
