package basic;

public class PracticeAccessModifier {

	public static void main(String[] args) {

	}
	// PUBLIC ACCESS SPECIFIER/MODIFIER
	
 public  static void ground() {}
 
 
 
 public   static void stadium(String[]args) {
	 
	 String location=" Dhaka";
	 String name="Banghabandhu cricket stadium";
	 String locationname=location+name;
	 
	 System.out.println(locationname);
	 
	 
 }
 
 
 
 
	public void cricket() {
	} // Accessible to any where all kind method and variable and class too

	public void charter() {
	} // Accessible from any where in the package or class or method

	public void array() {
	} // Accessible to any where all kind method and variable and class too

	public void name() {
	} // Accessible to any where all kind method and variable and class too

	public void country() {
	} // //Accessible to any where all kind method and variable and class too

	public void state() {
	} // SPECIFIER/Accessible to any where all kind method and variable and class too

	// PRIVATE ACCESS SPECIFIER/ MODIFIER:

	private void surgery() {
	} // Private is very much restricted only can be use only the same class it's
		// boundary with in the class;

	private void icu() {
	} // Private is very much restricted only can be use only the same class it's
		// boundary with in the class;

	private void bathroom() {
	} // Private is very much restricted only can be use only the same class it's
		// boundary with in the class;

	private void bedroom() {
	} // Private is very much restricted only can be use only the same class it's
		// boundary with in the class;

	private void email() {
	} // Private is very much restricted only can be use only the same class it's
		// boundary with in the class;

	// PROTECTED ACEESS SPECIFIER/ MODIFIER:

	protected void phone() {
	} // IT's limited we can call from same package but not publicly use ,Limited for
		// a certain boundary.

	protected void surgericalRoom() {
	}// IT's limited we can call from same package but not publicly use ,Limited for
		// a certain boundary.

	protected void facebook() {
	} // IT's limited we can call from same package but not publicly use ,Limited for
		// a certain boundary.

	protected void twitter() {
	} // IT's limited we can call from same package but not publicly use ,Limited for
		// a certain boundary.

	protected void personalRoom() {
	} // IT's limited we can call from same package but not publicly use ,Limited for
		// a certain boundary.

	/**
	 * SO FAR PUBLIC IS OPEN FOR ANY METHOD OR PACKAGE OR CLASS IT'S UNIVERSAL USE
	 * NY TIME WE CAN CLL OR USE IT
	 * 
	 * HIGHLY RESTRICTED PRIVATE IS ONLY USE WITH IN THE SAME CLASS IN THE PACKAGE
	 * ,OTHER CLASS OF THE SAME PACKAGE CAN'T ABLE TO SPECIFY OR ACCESS.
	 * 
	 * PROTECTED IS USABLE ONLY THE SAME PACKAGE CLASSES BUT NOT OTHER PACKAGE IN
	 * THE SAME PROJECT IS RESTRICTED TOO.
	 */

}
