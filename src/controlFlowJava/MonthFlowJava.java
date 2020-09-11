package controlFlowJava;

public class MonthFlowJava {

	public static void main(String[] args) {

		int number = 8;
		String monthName ;
		if (number == 1) {
			monthName = "january";
		} else if (number == 2) {
			monthName = "February";

		} else if (number == 3) {
			monthName = "March";
		} else if (number == 4) {
			monthName = "April";
		} else if (number == 5) {
			monthName = "May";

		} else if (number == 6) {
			monthName = "june";
		} else if (number == 7) {
			monthName = "July";

		} else if (number == 8) {
			monthName = "August";
		} else if (number == 9) {
			monthName = "September";
		} else if (number == 10) {
			monthName = "October";
		} else if (number == 11) {
			monthName = "November";
		} else if (number == 12) {
			monthName = "December";
		} else { monthName="invalid";
			System.out.println("The month is not matching and invalid");
		}
		System.out.println("The birth month of Skaib ul Hasan is :" + monthName);
		
	//====================================================================================================	
		
		int day=5;
		String dayOff;
		
		if(day==1) {
			dayOff="saturday";
		}else if(day==2) {
			dayOff="Sunday";
		}else if(day==3) {
			dayOff="Christmas day";
		}else if(day==4) {
			dayOff="Father's day";
		}else if(day==5) {
			dayOff="mother's day";
		}else if(day==6) {
			dayOff="veteran day";
		}else if (day==7) {
			dayOff="columbus day";
		}else if(day==8) {
			dayOff="independece day";
		}else if(day==9) {
			dayOff="personal day";
		}else {
			dayOff="not matching";
			System.out.println("nothing is matching");
		}
		
		
		System.out.println("My personal day off is :"+dayOff);
		
	//=====================================================================================================	
		int university=5;
		String name;
		if (university==1) {
			name="Dhaka";
		}else if(university==2) {
			name="chittagong";
		}else if(university==3) {
			name="rajshahi";
		}else if(university==4) {
			name="mymensing";
		}else if(university==5) {
			name="oxford";
		}else if(university==6) {
			name="stamford";
		}else if(university==7) {
			name="stanford california";
		}else if (university==8) {
			name="columbia";
		}else if (university==9) {
			name="stony broke";
		}else {
			name="invalid";
			System.out.println("invalid university");
		}
		System.out.println("Less cost and academic good performance university name is :"+name);
		//===========================================================================
		int food=7;
		String menu;
		if(food==1) {
			menu="chicken Rice";
		} else if(food==2) {
			menu="morag polao";
		}else if(food==3) {
			menu="dal rice";
		}else if(food==4) {
			menu="vegetable";
		}else if(food==5) {
			menu="beef and nan";
		}else if(food==6) {
			menu="beef tehari";
		}else if(food==7) {
			menu="muglai parata";
		}else if(food==8) {
			menu="behari kebab";
		}else if(food==9) {
			menu="shish kebab";
		}else {
			menu="not indian food";
			System.out.println("invalid menu list");
		}
		System.out.println("Bestfood for evening official break is: "+menu);
	//=================================================================================	
		int serial=5;
		String player;
		if(serial==1) {
			player="liton das";
		}else if(serial==2) {
			player="shumo sarker";
		}else if(serial==3) {
			player="mahmudullah";
		}else if(serial==4) {
			player="mushfiquer";
		}else if(serial==5) {
			player="sakibul al hasan";
		}else if(serial==6) {
			player="imrul kayes";
		}else if(serial==7) {
			player="masrafie";
		}else if(serial==8) {
			player="robel hussain";
		}else if(serial==9) {
			player="shabuddin";
		}
		else {
			player="not selected";
			System.out.println("player is not in the best eleveen list ");
		}
		
		System.out.println("Al rounder batting .bowling and fielding best player is:"+player );	
	//========================================================================================	
		int select=7;
		String singer;
		if(select==1) {
			singer="Runa laila";
		}else if(select==2) {
			singer="Sabina Yeasmin";
		}else if(select==3) {
			singer="Abdul hadi";
		}else if(select==4) {
			singer="Subir nandi";
		}else if(select==5) {
			singer="Mohammed abdul Haddi";
		}else if(select==6) {
			singer="kanak chappa";
		}else if(select==7) {
			singer="Bhupan Hazarika ";
		}else if(select==8) {
			singer="michael Jackson";
		}else if(select==9) {
			singer="Bob dilon";
		}else if (select==10) {
			singer="Lady gaga";
		}
		else {
			singer="not famous";
			System.out.println(" invalid singer name");
		}
	System.out.println("The most favourite singer of pintu is :" +singer);	
	//============================================================================================

	
	try {
		int x=10;
		int y=0;
		int z=x/y;
		System.out.println(z);
	}
		catch(Exception e) {
			
		}
	}

}
