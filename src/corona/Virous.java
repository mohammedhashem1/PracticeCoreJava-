package corona;

public class Virous {
	String hosP;
	String nameP;
	int a;

	public Virous() {
	}

	public Virous(String hP, String nP, int aG) {
		String hospital = this.hosP = hP;
		String name = this.nameP = nP;
		int age = this.a = aG;
		System.out.println(hospital + name + age);
	}

	// ======================================================================
	String nC;
	String nU;
	String nS;

	public Virous(String nameC, String nameU, String nameS) {
		String nameOfCountry = this.nC = nameC;
		String nameOfUniversity = this.nU = nameU;
		String nameOfStudent = this.nS = nameS;
		System.out.println(nameOfStudent + nameOfUniversity + nameOfCountry);
	}

	public static void main(String[] args) {

		Virous type = new Virous("Mount Sinai Hospital , Manhattan; ", "Mohammed Azhar uddin; age =", 56);
		Virous university = new Virous("Bangladesh.s", "Dhaka University;", "Anika Hashem, ");
	}

}
