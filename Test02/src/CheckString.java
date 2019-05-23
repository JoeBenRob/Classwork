
public class CheckString {

	static String string1 = "Hello";
	static String string2 = "Hello";

	public static void main(String[] args) {

		System.out.println(stringsMatch(string1, string2));
	}

	private static String stringsMatch(String string1, String string2) {

		if (string1.equals(string2)) {

			return "strings do match";
		} else {
			return "strings do not match";
		}
	}
}
