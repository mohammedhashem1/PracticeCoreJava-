package learnobject;

public class TestMain {

	
	public static void main(String[] args) {
		// 300 object from 10 class: 30 object each class
		

		// 1. object create 
		// 2. call by object:   appleComputer.
		
		Computer appleComputer=new Computer();
		System.out.println(appleComputer.keyboard);
		
		
		Computer windows=new Computer();
		windows.isAppleBrand=false; // Newly value Initialize
		System.out.println(windows.isAppleBrand);
		
		
		Computer myComputer=new Computer();
		myComputer.hardDiskPrice=350.50;// Newly value Initialize
		System.out.println(myComputer.hardDiskPrice);
		
	
		
	}
}
