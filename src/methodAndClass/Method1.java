package methodAndClass;

public class Method1 {
	
 String hospi;
	int patie;
	
	public int student( int sDent, int tCher ) {
		int student=sDent;
		int teacher=tCher;
		int studentAndTeacher=student+teacher;
	
	System.out.println(studentAndTeacher);
	return studentAndTeacher;
	}
	
	public String college(String ins,int stud) {
		String institution=ins;
		int student=stud;
		String academy=institution+student;
		System.out.println(academy);
return academy;		
	}
	
	public void university(String univer, String locat, int stud) {
		
		String university=univer;
		String location=locat;
		int student=stud;
		String education=university+location+stud;
		System.out.println(education);
	}
	public Method1() {
		// TODO Auto-generated constructor stub
	}
	
	public Method1(String hosp,int patie) {
		String hospital=this.hospi=hosp;
		int patient=this.patie=patie;
		String medical=hospital+patient;
		System.out.println(medical);
	}
	

	public static void main(String[] args) {
		
		Method1 number=new Method1();
		Method1 service=new Method1("Long Island Jewish Hospital In Long Island ,  patient's is=", 3560);
		number.student(1500, 65);
		number.college("Mohammedpur Govt Boy's high school, Number of student is =", 2750);
		
		number.university("Harvard University , locaton is =", " Boston USA and number of student is=", 24550);
		
		
		
		
	}
	
	
}
	
	
	
	
	
	


