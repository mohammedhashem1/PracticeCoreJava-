package demo;

public class CoronaVirous {

	public CoronaVirous() {
		// A constructor in Java is a special method that is used to initialize objects.
		// The constructor is called when an object of a class is created.
		// It can be used to set initial values for object attributes:
		// Default class of Constructor
		// Constructor name should be similar as Class name;
		// Constructor has no return type
		// Constructor varies based on number parameter or signature we used;
	}

	String sl;
	String sA;
	int sS;

	public CoronaVirous(String slocation, String sAddress, int sStudent) {
		String location = this.sl = slocation;
		String address = this.sA = sAddress;
		int student = this.sS = sStudent;
		System.out.println(location + address + student);
	}

	public static void main(String[] args) {
		CoronaVirous type = new CoronaVirous();

	}
}
