package constructor;

public class Health {
	String sName;
	int sStudent;
	String mSchool;
	int mSS;
	String fNS;
	String lNS;
	String aS;
	String dN;
	int pH;
	double iC;
	
	String qHL;
	int qHD;
	boolean qEO;
	
	public Health() {
		
	}//Default constructor ,when we create lot of constructor in the class we need have to create first 
	//default constructor , it has no Return type and Parameterized constructor
	//depend on how many signature in the parameter,
	
	public Health(String school, int student) {
		String education=this.sName=school;
		int learner=this.sStudent=student;
		
		System.out.println("Name of the school is="+education+"; Number of student is ="+learner);
	}
	//==========================================================================================
	public Health(int mStudent,String medical) {
		
		String nameOfMedical=this.mSchool=medical;
		int medicalStudent=this.mSS=mStudent;
		System.out.println("Name of the medical school is ="+nameOfMedical+"Number of Medical student is="+medicalStudent);
	}
	
	//==========================================================================================

	public Health(String fNStudent,String lNStudent,String aDD) {
		String firstName=this.fNS=fNStudent;
		String lastName=this.lNS=lNStudent;
		String address=this.aS=aDD;
		
		System.out.println("Full Name of the medical student is="+firstName+" "+lastName+" ;Address is =;"+address);
	}
	//==========================================================================================
public Health(String dName,int pHour, double dIncome) {
	
	String doctorName=this.dN=dName;
	int practicingHour=this.pH=pHour;
	double income=this.iC=dIncome;
	System.out.println("professor name is = "+doctorName+"; practicing hour is ="+practicingHour+"; Yearly income is="+income);
	
}
//==========================================================================================
	public Health(String qHospital, int qDoctor, boolean qEmergency) {
		
	String hospital=this.qHL=qHospital;
		int doctor=this.qHD=qDoctor;
		boolean treatment=this.qEO=qEO;
		
		System.out.println("Name of the Hospital ="+hospital+"; number of doctor is="+doctor+",Regular treatment in emergency ="+ treatment);
		
	}
	
	
	
	public static void main(String[] args) {
		Health nursingSchool=new Health("Queen's community college for nursing,", 1450);
		Health medicalSchool=new Health(2550, " New York dental college and surgery,Manhattan  ;");
	Health medicalStudent=new Health("Mohammed", " Hashem", " 27-14 ,Babor Road ,Mohammedpur ,Dhaka -1207");
		Health doctorIncome=new Health("Abul Kalam Azad", 60,1546000 );
		Health queensHospital=new Health("Queen's Hospital", 167, false);
		
		
	}
}
