package learnobject;

public class TestComputer {
	
	
	
	public static void main(String[] args) {
		
		
		
		Computer appleComputer=new Computer();
		System.out.println(appleComputer.keyboard);
		
		
		Computer windows=new Computer();
		windows.isAppleBrand=false;
		System.out.println(windows.isAppleBrand);
		
		
		Computer myComputer=new Computer();
		myComputer.isAppleBrand=false;
		System.out.println(myComputer.isAppleBrand);
		
	}

}
