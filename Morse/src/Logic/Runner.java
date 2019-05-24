package Logic;

import java.util.HashMap;

public class Runner {

	public static void main(String[] args) {

		String string = ".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--";
		System.out.println(MorseToString(string));
		System.out.println("-----------------------------------------------------------------------------------------");
		System.out.println(StringToMorse("Forward is forward"));
	}

	public static String MorseToString(String string) {

		HashMap<String, Character> morse = new HashMap<>();

		morse.put(".-", 'a');
		morse.put("-...", 'b');
		morse.put("-.-.", 'c');
		morse.put("-..", 'd');
		morse.put(".", 'e');
		morse.put("..-.", 'f');
		morse.put("--.", 'g');
		morse.put("....", 'h');
		morse.put("..", 'i');
		morse.put(".---", 'j');
		morse.put("-.-", 'k');
		morse.put(".-..", 'l');
		morse.put("--", 'm');
		morse.put("-.", 'n');
		morse.put("---", 'o');
		morse.put(".--.", 'p');
		morse.put("--.-", 'q');
		morse.put(".-.", 'r');
		morse.put("...", 's');
		morse.put("-", 't');
		morse.put("..-", 'u');
		morse.put("...-", 'v');
		morse.put(".--", 'w');
		morse.put("-..-", 'x');
		morse.put("-.--", 'y');
		morse.put("--..", 'z');
		morse.put(".----", '1');
		morse.put("..---", '2');
		morse.put("...--", '3');
		morse.put("....-", '4');
		morse.put(".....", '5');
		morse.put("-....", '6');
		morse.put("--...", '7');
		morse.put("---..", '8');
		morse.put("----.", '9');
		morse.put("-----", '0');
		morse.put("/", ' ');
		String result = "";
		String[] parts = string.split(" ");
		for (int i = 0; i < parts.length; i++) {
			String a = parts[i];
			result = result + morse.get(a);
		}
		return result;
	}

	public static String StringToMorse(String string) {

		HashMap<Character, String> morse = new HashMap<>();

		morse.put('a', ".- ");
		morse.put('b', "-... ");
		morse.put('c', "-.- ");
		morse.put('d', "-.. ");
		morse.put('e', ". ");
		morse.put('f', "..-. ");
		morse.put('g', "--. ");
		morse.put('h', ".... ");
		morse.put('i', ".. ");
		morse.put('j', ".--- ");
		morse.put('k', "-. ");
		morse.put('l', ".-.. ");
		morse.put('m', "-- ");
		morse.put('n', "-. ");
		morse.put('o', "--- ");
		morse.put('p', ".--. ");
		morse.put('q', "--.- ");
		morse.put('r', ".-. ");
		morse.put('s', "... ");
		morse.put('t', "- ");
		morse.put('u', "..- ");
		morse.put('v', "...- ");
		morse.put('w', ".-- ");
		morse.put('x', "-..- ");
		morse.put('y', "-.-- ");
		morse.put('z', "--.. ");
		morse.put('1', ".---- ");
		morse.put('2', "..--- ");
		morse.put('3', "...-- ");
		morse.put('4', "....- ");
		morse.put('5', "..... ");
		morse.put('6', "-.... ");
		morse.put('7', "--... ");
		morse.put('8', "---.. ");
		morse.put('9', "----. ");
		morse.put('0', "----- ");
		morse.put(' ', "/");

		string = string.toLowerCase();
		String result = "";
		char[] array = string.toCharArray();
		for (int i = 0; i < array.length; i++) {
			char a = array[i];
			result = result + morse.get(a);
		}
		return result;
	}
}
