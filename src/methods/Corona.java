package methods;

public class Corona {
	
public String hospital(String pN,String hN,int aP) {
	String name=pN;
	String hospital=hN;
	int age=aP;
	
	String overview=name+hospital+age;
	System.out.println(overview);
	
	
return overview;	
}	

public void patient(String sN, String nH,int pA) {
	
	String serial=sN;
	String hospital=nH;
	int patientAge=pA;
	
	
	String senario=serial+hospital+patientAge;
	System.out.println(senario);
	
}
	//========================================================================
public int reality(int pP,int mP,int rP) {
	int potato=pP;
	int mango=mP;
	int rice=rP;
	int groccery=potato+mango+rice;
	System.out.println();
return groccery;	
}
	//======================================================================
public String prayer(String nP, String Lp, int pP) {
	String name=nP;
	String location=Lp;
	int attendance=pP;
	String prayer=name+location+attendance;
	System.out.println(prayer);
return prayer;	
}

public double ratio( double gP, double sP, double bP) {
	double gold=gP;
	double silver=sP;
	double bronx=bP;
	double set=gold+silver+bronx;
	
	System.out.println("The price of the whole per event is :"+set);
return set;	
}
//*******************************************************
public String hospital(String fN, String lN, String lC) {
	String firstName=fN;
	String lastName=lN;
	String location=lC;
	String hospital=firstName+" "+lastName+";"+location;
	System.out.println(hospital);
	return hospital;
}
public String patient(String nH,String hL,String nP) {
	String hospital=nH;
	String location=hL;
	String patient=nP;
	String urgentPatient=hospital+location+patient;
	System.out.println(urgentPatient);
	return urgentPatient;
	
}





	public static void main(String[] args) {
		
		Corona type=new Corona();
		type.hospital("Mohammed Abdul Qudus;", " Long Island Jewish Hospital;  Age of the Patients :", 42);
		
		type.patient("Mohammed A ;", " Mount Sinai Hospital ; Age of the patient is :",36 );
		type.prayer("Fajr prayer; ", "Mosjidul Harram, Holy Mecca; ", 2700000);
		type.ratio(54500.5, 34550.5, 19650.5);
		type.patient("Long Island Jewish Hospital;", "New Hyde Park Long Island;", "Patient =Mr X");
		type.hospital("Mount", "Sinai", "Long island");
	}
	
	
	
	

}
