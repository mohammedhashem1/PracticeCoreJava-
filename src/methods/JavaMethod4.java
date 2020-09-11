package methods;

public class JavaMethod4 {
	
	public String country(String develop,int total) {
		String name=develop;
		int rich=total;
		String richest=name+" ; total number of country is ="+rich;
		System.out.println(richest);
	return richest;	
	}
	
	public void school(String bSchool, int nStudent) {
		
		String best=bSchool;
		int student=nStudent;
		System.out.println(" Best School in Bnagladesh is "+best+"; number of student is ="+nStudent);
		
	}
	
	public double income(double daily, double yearly) {
		double gross=daily;
		double net=yearly;
		double netIncome =gross*net;
		System.out.println("Yearly net income of USA rich citizen is ="+netIncome);
	return netIncome;	
	}
	
	public void hospital(String fName, int nDoctor) {
		String fullName=fName;
		int surgeon=nDoctor;
		System.out.println("Name of the Hospital is "+fullName+"; number of doctor is ="+nDoctor);
		
	}
	public int participant(int school, int country) {
		
		int academy=school;
		int performance=country;
		int participant=academy*performance;
		System.out.println("Number of student participating in world international Debate competition is ="+participant);
	return participant;	
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		JavaMethod4 state=new JavaMethod4();
		state.country("Average income $40000 to $50000", 25);
		state.school("Vikharhunnessa,Dhaka", 2750);
		state.income(4550.5, 300);
		state.hospital("Birdem Diabetic Hospital", 165);
		state.participant(25, 35);
	}
	
	
	
	
	
	
	
	
	
	
	

}
