package tryCatch;

public class UseTryCatch {

	public static void main(String[] args) {
		try {
		int a=15;
		int b=0;
		int division=a/b;	
		System.out.println(division);	
		}
		catch(Exception x) {//EXception is the class , e. is the variable 
			//x.printStackTrace();
			System.out.println("The result turn to infinity "); 
		}
	}
	
	
	
	
	
	
	
	
}
