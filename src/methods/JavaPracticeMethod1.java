package methods;

public class JavaPracticeMethod1 {
	

	

		public int student() {

			int gradeA = 90;
			int gradeB = 60;
			int gradeC = gradeA + gradeB;

			System.out.println(gradeC);

			return gradeC;
			// ==========================================
		}
		// ==========================================

		public void result() {

			int gradeA = 250;
			int gradeB = 50;
			int gradeC = gradeA - gradeB;
			System.out.println(gradeC);

		}
		// ==========================================
		// ==========================================

		public double production(double rice, double wheat) {

			double pro = rice;
			double pro1 = wheat;
			double pro2 = pro + pro1;
			System.out.println(pro2);
			return pro2;
		}
		// ==========================================
		// ==========================================

		public void level(double math, double chemistry) {

			double sub = math;
			double sub1 = chemistry;
			double grand = sub + sub1;

			System.out.println(grand);

		}
		// ==========================================
		// ==========================================

		public void math(int costing, int budgeting) {

			int a = costing;
			int b = budgeting;
			int c = a + b;
			System.out.println(c);

		}
		// ==========================================
		// ==========================================

		public int value(int gold, int diamond) {

			int a = gold;
			int b = diamond;
			int a1 = a + b;
			System.out.println(a1);

			return a1;
		}
		// ==========================================

		// ==========================================
		public double rank() {

			double orange = 15.50;
			double price = 25.75;
			double cost = orange + price;
			System.out.println(cost);
			return cost;
		}

		// ==========================================
		// ==========================================

		public double market(double gold, double diamond) {

			double a = gold;
			double b = diamond;
			double ab = a + b;
			System.out.println(ab);

			return ab;
		} 
		 //==========================================
		 //==========================================

		public float exchage(float production, float income) {
			
			float a=production;
			float b=income;
			float ratio=a+b;
			System.out.println(ratio);
			
		return ratio;	
		}
		
		 //==========================================
	 //==========================================

		public String university(String dhaka,String university) {
			
			String institution=dhaka;
			String institution1=university;
			String academy=institution+" "+institution1;
			
			System.out.println(academy);
			
			return academy;
		}
		
		 //==========================================

		public long population() {
			long city=700000;
			long state=190000;
			long citizen=city+state;
			System.out.println("population of Albany New york is ="+citizen);
			
			
			
		return citizen;	
		}
		 //==========================================
		 //==========================================

		public long citizen( long city,long rural) {
			
			long a=city;
			long b=rural;
			long resident=a+b;
			
			System.out.println(resident);
			
			
			
			
		return resident;	
		}
		
		 //==========================================
		 //==========================================
	//public short education() {
	//	
//		short city=6000;
//		short rural=2600;
	//	
//		short highSchool=city+rural;
	//	
//		System.out.println(highSchool);
	//	
	//	
	//	
	//	
//		return highSchool;
	//}


	//==========================================

	public void hospital(String location,String name) {
		
		String num1=location;
		String num2=name;
		
		String num3 =num1+" "+num2;
		
		System.out.println("Name of the best hospital for heart is located in ="+num3);
		
		
		
	}


	//==========================================

	//==========================================

	public void school(String name,String location) {
		
		String study=name;
		String place=location;
		
		String learning=name+" "+location;
		
		System.out.println("Name of the best middle school around Jamaica and Fresh Meadows is="+learning);
		
		
		
		
		
		
		
		
	}


	////==========================================
	//
	//public byte marry(byte boy,byte girl ) {
	//	
//		byte jamacia=boy;
//		byte foresthill=girl;
//		byte couple=jamacia+foresthill;
	//	
//		System.out.println(couple);
	//	
	//	
	//	
//		return couple;
	//}
	//
	// //==========================================
	//==========================================
		
	public int viewer(int jamuna,int independence) {
		
		int day=jamuna;
		int night=independence;
		int daynight=jamuna+independence;
		
		System.out.println("Television viewer of Bangladesh who are watching both day and night time total of two channel="+daynight);

		
	return daynight;	
	}
	//==========================================
	//==========================================
	public double food() {
		
		double organic=876500.50;
		double homeMade=7500000;
		
		double consumer=organic+homeMade;
		
		System.out.println(consumer);
		
		
		
		
	return consumer;	
	}
	//==========================================
	//==========================================

	public float juice(float orange, float mango) {
		
		float type=orange;
		float price=mango;
		float pricetype=orange+mango;
		
		System.out.println("New york city in Organic store orange and mango price ="+pricetype);


		return pricetype;
	}
	//========================================== //==========================================

	public long player(long baseball, long hockey) {
		
		long hat=baseball;
		long stick=hockey;
		long participant=baseball+hockey;
		
		System.out.println("In New York total Baseball and Hockey player is="+participant);
		
		return participant;
	}
	////========================================== //==========================================
	//	
//		public char hospital(char doctor, char patient) {
//			
//			char service=doctor;
//			char sick=patient;
//			char relation=doctor+patient;
//			
//			System.out.println(relation);
//			
//			
//			
	//return relation;		
//		}
	//	
		
		
		 //==========================================

	public void president(String fName, String lName ) {
		
		String num1=fName;
		String num2=lName;
		String num3=num1+" "+num2;
		
		System.out.println("Name the President In USA, Which office in white house in Washington D.C is Honourable="+num3);
		
		
		
		
	}
	//=========================================================================================
	//=========================================================================================

	public void currency(double dollar,double pound) {
		
		double usa=dollar;
		double uk=pound;
		double exchange=dollar+pound;
		System.out.println(exchange);
		
		
		
		
		
	}

	//=========================================================================================
	//=========================================================================================

	public int store(int groccery, int mall) {
		
		int primiary=groccery;
		int deluxe=mall;
		int lifeStyle=groccery+mall;
		
		System.out.println("Middle class fmily in New york city spending money yerly average is="+lifeStyle);
		
		
	return lifeStyle;	
	}

















	 
		public static void main(String[] args) {

			JavaPracticeMethod1 result = new JavaPracticeMethod1();
			result.student();
			result.result();
			result.production(95000, 70000);
			result.level(95.5, 98.765);

	result.value(5000, 7000);
			result.math(8000, 6500);
			result.rank();
			result.market(50000, 80000);
		result.exchage(5.65f, 8.93f);
			
			result.university("harvard", "america");
			result.population();
			result.citizen(550000, 650000);
			result.hospital("queen's", "Mount Sinai");
			result.school("Ryan middle school", "Queen's");
			//result.marry(25, 22);
			
			result.viewer(55700, 1050300);
			
			result.food();
			result.juice(10.99f, 34.87f);
			result.player(95000, 205000);
			
		//	result.hospital('D', 'K');
			
			result.president("Donald", "Trumph");
			result.currency(2000000, 755000);
			
			result.store(500000, 25000);
			
		}
			
}		
			
		

	


