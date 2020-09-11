package controlFlowJava;

public class SwitchCase1 {

	public static void main(String[] args) {
		int select = 7;
		String best;
		switch (select) {
		case 1:
			best = "tahsin";
			break;
		case 2:
			best = "karim";
			break;
		case 3:
			best = "al amin";
			break;
		case 4:
			best = "swaccha";
			break;
		case 5:
			best = "pritul";
			break;
		case 6:
			best = "anika";
		case 7:
			best = "titu";
		case 8:
			best = "pintu";
		case 9:
			best = "rumi";
			break;
		default:
			best = "nonMatching";
			break;

		}
		System.out.println("The best candidate selected by  the interview board is :" + best);
		System.out.println("****************************************************");
		// ===========================================================================================
		int month = 7;
		String monthName;

		switch (month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "February";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5:
			monthName = "May";
			break;
		case 6:
			monthName = "June";
			break;
		case 7:
			monthName = "July";
			break;

		case 8:
			monthName = "August";

			break;
		case 9:
			monthName = "September";
		default:
			monthName = "Invalid Month";
			break;
		}
		System.out.println("Anika's birth month is:" + monthName);
//====================================================================================================
		int food = 6;
		String name;
		switch (food) {
		case 2:
			name = "curry";
			break;
		case 4:
			name = "byarani";
			break;
		case 6:
			name = "muglai parata";
			break;
		case 8:
			name = "halim";
			break;
		case 10:
			name = "morug polao";
			break;
		case 12:
			name = "kacchi byarani";
			break;
		case 14:
			name = "alu parata";
			break;
		case 16:
			name = "shish kabab";
			break;
		default:
			name = "non matching";
			break;

		}
		System.out.println("Name of the best food in Sagor reastaurent is:" + name);

		int type = 4;
		String panic;

		switch (type) {
		case 1:
			panic = "flu";
			break;
		case 2:
			panic = "headache";
			break;
		case 3:
			panic = "diarrihoea";
			break;
		case 4:
			panic = "corona";
			break;
		case 5:
			panic = "cancer";
			break;
		case 6:
			panic = "diabatic";
			break;
		case 7:
			panic = "vomiting";
			break;
		case 8:
			panic = "heartFilure";
			break;
		default:
			panic = "Nothing";
			break;

		}
		System.out.println("The most pandemic disease in the world now is :" + panic);
		/**
		 * 
		 */
		int number=4;
		String fruit;
		switch(number) {
		case 1:
			fruit="Apple";
			break;
		case 2:
			fruit="Mango";
			break;
		case 3:
			fruit="Grapes";
			break;
		case 4:
			fruit="orange";
			break;
		case 5:
			fruit="Malta";
			break;
		case 6:
			fruit="Cantalop";
			break;
		case 7:
			fruit="HoneyDew";
			break;
		case 8:
			fruit="Lemon";
			break;
		case 9:
			fruit="Coconut";
			break;
		default:
			fruit="Invalid";
			break;

		}
			System.out.println("Name of the fruit is :"+fruit);
		
	}
}
