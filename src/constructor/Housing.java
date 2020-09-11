package constructor;

public class Housing {
	
	String  fName;
	String lName;
	int apt;
	
	String gHousing;
	int nPeople;
	
	
	public Housing() {//default Constructor class, No return type,depending of parameterized
		//or  no.ofSignature
		
	}
	
	
	public Housing(String fN,String lN, int apart) {
		
		String firstName=this.fName=fN;
		String lastName=this.lName=lN;
		int house=this.apt=apart;
		
		System.out.println("Name of the Apartment is="+firstName+" "+lastName+"; number of apartment is ="+house);
	}
	
	public Housing(String gH, int nP ) {
		String government=this.gHousing=gH;
		int resident=this.nPeople=nP;
		
		System.out.println(government+"; Number of resident living is="+resident);
		
	}
	
	
	
	public static void main(String[] args) { 
		Housing jamaica=new Housing("Park", "View", 65);
		Housing city=new Housing("Housing ", 175);
	}
	
	
	

}
