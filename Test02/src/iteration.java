
public class iteration {

	static int printnumber = 6;

	public static void main(String[] args) {
		// prints0To10();
		// prints100To999();
		prints1To10InWords(printnumber);
	}

	private static void prints0To10() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}
	}

	private static void prints100To999() {
		for (int i = 100; i <= 999; i++) {
			System.out.println(i);
		}
	}

	private static void prints1To10InWords(int number) {
		switch (number) {
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		case 6:
			System.out.println("Six");
			break;
		case 7:
			System.out.println("Seven");
			break;
		case 8:
			System.out.println("Eight");
			break;
		case 9:
			System.out.println("Nine");
			break;
		case 10:
			System.out.println("Ten");
			break;
		case 11:
			System.out.println("Eleven");
			break;
		case 12:
			System.out.println("Twelve");
			break;
		case 13:
			System.out.println("Thirteen");
			break;
		case 14:
			System.out.println("Fourteen");
			break;
		case 15:
			System.out.println("Fifteen");
			break;
		case 16:
			System.out.println("Sixteen");
			break;
		case 17:
			System.out.println("Seventeen");
			break;
		case 18:
			System.out.println("Eighteen");
			break;
		case 19:
			System.out.println("Nineteen");
			break;
		default:
			System.out.println("Not a number");
		}

	}

}
