import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			intList.add(i);
		}
		for (int i = 0; i <= intList.size() - 1; i++) {

			System.out.print(intList.get(i) + " ");
		}
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i <= 10; i++) {
			strList.add("Hello");
		}

		System.out.println();
		System.out.println(checkList(intList, 11));
		System.out.println(checkListString(strList, "Hello"));
		divisableBy5(intList);
		System.out.println();
		System.out.println(checkWordCount(strList, "Hello"));
	}

	// create a method that looks through a list of numbers and checks for a
	// specific number
	private static boolean checkList(ArrayList<Integer> intList, int input) {
		return intList.contains(input) == true;
	}

	// as above but with strings
	private static boolean checkListString(ArrayList<String> strList, String input) {
		return strList.contains(input) == true;
	}

	// create a method that multiplies each number divisible by 5 by 10 in a list of
	// numbers
	private static void divisableBy5(ArrayList<Integer> intList) {

		for (int i = 0; i <= intList.size() - 1; i++) {
			if (intList.get(i) % 5 == 0) {
				System.out.print(intList.get(i) / 10 + " ");
			} else {
				System.out.print((intList.get(i) + " "));
			}
		}

	}

	// create a method that checks for a specific word in a list of Strings and
	// returns the number of times that word occurs
	private static int checkWordCount(ArrayList<String> strList, String input) {
		int count = 0;
		for (int i = 0; i <= strList.size() - 1; i++) {
			if (strList.get(i) == input) {
				count++;
			}
		}
		return count;
	}
}
