package methods;

public class JavaMethod3 {

	public double income(int daily, double days) {
		
		int sale=daily;
	double gross=days;
		double income=daily*days;
		System.out.println("Yearly garments product sale in Bangladesh is ="+income);
return income;		
	}
	
	public void shopping(String oldN,double sale) {
		String store=oldN;
		double saleVolume=sale;
		System.out.println("Name of the Shopping Mall is="+store+"; yearly sale volume is ="+saleVolume);
		
	}
	
	public String school(String name, int student) {
		
		String education=name;
		int participant=student;
		String academy=education+participant;
		System.out.println(academy);
		
return academy;		
	}
	
	
	public static void main(String[] args) {
		
		JavaMethod3 salary=new JavaMethod3();
		salary.income(2500, 362);
		salary.shopping("Macy's in Manhattan =", 5565000.50);
		salary.school("Bayside Middle high school , number of student is =", 1750);
	}
	
	
	
	
	
}
