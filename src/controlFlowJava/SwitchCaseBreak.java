package controlFlowJava;

public class SwitchCaseBreak {

	public static void main(String[] args) {

		int day = 4;
		String work;
		switch (day) {
		case 1:
			work = "Monday";
			break;
		case 2:
			work = "Tuesday";
			break;
		case 3:
			work = "Wednesday";
			break;
		case 4:
			work = "Thursday";
			break;
		case 5:
			work = "Friday";
			break;
		case 6:
			work = "Saturday";
		case 7:
			work = "Sunday";
			break;
		default:
			work = "Invalid day";
			break;
		}
		System.out.println("Personal day off from my work is every week day:" + work);
		// =============================================
		int num = 11;
		String month;
		switch (num) {
		case 1:
			month = "january";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";

		default:
			month = "invalid";
			break;

		}
		System.out.println("The best weather for New York city for travel is : " + month);
//==========================================================================================
		int name = 6;
		String store;

		switch (name) {
		case 1:
			store = "Mannan";
			break;
		case 2:
			store = "Fatema";
			break;
		case 3:
			store = "Kawran";
			break;
		case 4:
			store = "ChangPai";
			break;
		case 5:
			store = "RiteAid";
			break;
		case 6:
			store = "Macy's";
			break;
		case 7:
			store = "OldNavy";
			break;
		case 9:
			store = "Sears";
			break;
		case 10:
			store = "Best Buy";
			break;
		default:
			store = "invalid Name";
			break;
		}
		System.out.println("Best store for shopping for original items and reasonable price is :" + store);
//=======================================================================================
//
		int student = 5;
		String grade;
		switch (student) {
		case 1:
			grade = "pintu";
			break;
		case 2:
			grade = "mahmud";
			break;
		case 3:
			grade = "titu";
		case 4:
			grade = "anika";
		case 5:
			grade = "rumi";
		case 6:
			grade = "muhammed";
		case 7:
			grade = "hasina";
		case 8:
			grade = "khaleda";
		case 9:
			grade = "rowshan";
		default:
			grade = "invalid name";
			break;

		}

		System.out.println("Name of the number 5th student is=" + grade);

		// ========================================================================================
		int top = 6;
		String result;

		switch (top) {
		case 1:
			result = "titu";

			break;
		case 2:
			result = "pintu";
			break;
		case 3:
			result = "santu";
		case 4:
			result = "sajjad";
			break;
		case 5:
			result = "aroz";
			break;
		case 6:
			result = "mahmud";
			break;
		case 7:
			result = "rasul";
			break;
		case 8:
			result = "hanif";
			break;
		case 9:
			result = "dipu";
			break;
		default:
			result = "not Matching";
			break;

		}
		System.out.println("The person selected for Hartford insurance is :" + result);

		int rank = 6;
		String food;
		switch (rank) {
		case 1:
			food = "plain";
			break;
		case 2:
			food = "birayani";
			break;
		case 3:
			food = "kebab";
			break;
		case 4:
			food = "sweet";
			break;
		case 5:
			food = "morug polao";
		case 6:
			food = "kacchi byrani";
			break;
		case 7:
			food = "fried chicken";
			break;
		case 8:
			food = "muglai parata";
			break;

		case 9:
			food = "alu parata";
		case 10:
			food = "fish and rice";
			break;
		default:
			food = "american food";
			break;

		}

		System.out.println("Most favourite food at the weekend at sagor reastaurent is :" + food);

		// ================================================================================================

		int price = 12;
		String item = null;

		switch (price) {
		case 0:
			item = "potato";
			break;
		case 2:
			item = "banana";
			break;
		case 4:
			item = "peanut";
			break;
		case 6:
			item = "onion";
			break;
		case 8:
			item = " pineapple";
			break;
		case 10:
			item = "lemon";
			break;
		case 12:
			item = "padma";
			break;
		case 14:
			item = "oil";
			break;
		case 16:
			item = "sweat";
			break;
		case 18:
			item = "tomato";
			break;
		case 20:
			item = "fruit";
		default:
			item = "no groceery item";
			break;

		}
		System.out.println("Brand of the rice is:" + item);

		// ====================================================================================================

		int serial = 6;
		String player;

		switch (serial) {
		case 2:
			player = "ronaldo";
			break;
		case 4:
			player = "revaldo";
			break;
		case 6:
			player = "messai";
			break;
		case 8:
			player = "donadoni";
			break;
		case 10:
			player = "maldini";
			break;
		case 12:
			player = "bevato";
			break;
		case 14:
			player = "clinsman";
			break;
		case 16:
			player = "ziko";
			break;
		case 18:
			player = "Bappiy";
			break;
		case 20:
			player = "christiana ronaldo";
			break;
		case 22:
			player = "mohammed salah";
			break;
		default:
			player = "invalid";
			break;
		}
		System.out.println("The best award winning player in the Europian football is :" + player);
//===================================================================================================
		int value = 12;
		String product;
		switch (value) {
		case 2:
			product = "milk";
			break;
		case 4:
			product = "water";
			break;
		case 6:
			product = "juice";
			break;
		case 8:
			product = "ice cream";
			break;
		case 10:
			product = "soda";
		case 12:
			product = "meat";
			break;
		case 14:
			product = "fish";
			break;
		case 16:
			product = "vegetable";
			break;
		case 18:
			product = "oil";
		case 20:
			product = "onion";
			break;
		default:
			product = "invalid";
			break;
		}
		System.out.println("The basic item of the especially muslim holiday sis :" + product);
//=======================================================================================
		int best = 10;
		String state;
		switch (best) {
		case 2:
			state = "Texas";
			break;
		case 4:
			state = "Pensylvania";
			break;
		case 6:
			state = "California";
			break;
		case 8:
			state = "New Jersey";
			break;
		case 10:
			state = "New York";
			break;
		case 12:
			state = "Connecticuit";
			break;
		case 14:
			state = "Ohaio";
			break;
		case 16:
			state = "Delware";

			break;
		case 18:
			state = "Alaska";
			break;
		case 20:
			state = "Washington D.C";
			break;
		default:
			state = "Invalid State";
			break;

		}
		System.out.println("Most of the tourist people in the world,come to see time square , which is:" + state);
//======================================================================================
		int brand = 6;
		String type;
		switch (brand) {
		case 1:
			type = "armani";
			break;
		case 2:
			type = "polo";
			break;
		case 3:
			type = "levis";
			break;
		case 4:
			type = "london fox";
			break;
		case 5:
			type = "express";
		case 6:
			type = "fruit of the loom";
			break;
		case 7:
			type = "andrew scott";
			break;
		case 8:
			type = "movado";
		case 9:
			type = "rolex";
		default:
			type = "invalid";
			break;

		}
System.out.println("My favourite brand for use is:"+type);
	}

}
