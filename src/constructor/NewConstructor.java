package constructor;

public class NewConstructor {
	String fN;
	String lN;
	String uN;

	public NewConstructor(String fName, String lName, String uversity) {
		String firstName = this.fN = fName;
		String lastName = this.lN = lName;
		String university = this.uN = uversity;
		System.out.println(firstName + " " + lastName + " " + university);

	}

//======================================================================
	String fP;
	String pL;
	int nP;

	public NewConstructor(String fPerson, String pLocation, int nPatient) {
		String person = this.fP;
		String location = this.pL;
		int patient = this.nP;

		String overall = person + location + patient;
		System.out.println(overall);
	}

	public static void main(String[] args) {
		NewConstructor aim = new NewConstructor("Mohammed ", "Hashem ", " ; University Of Dhaka");
		NewConstructor panic = new NewConstructor("Mr X", "Mount Sinai Manhattan ; Serial of the patient is:", 56);
	}

}
