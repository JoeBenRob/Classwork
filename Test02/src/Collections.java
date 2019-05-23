import java.util.ArrayList;
import java.util.Arrays;

public class Collections {

	public static void main(String[] args) {

		int[] intArray = new int[100];
		int[] intArray100 = new int[999];

		for (int i = 0; i < 100; i++) {
			intArray[i] = i + 1;
		}
		System.out.println(Arrays.toString(intArray));

		{
			for (int i = 0; i < 900; i++) {
				intArray100[i] = i + 100;
			}
		}
	}

	private static void list100to999() {

		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i < 999; i++) {
			intList.add(i + 100);
		}
		for (int i = 0; i < intList.size(); i++) {

		}
	}

	private static void multiplyBy10(int input) {
		System.out.println(input * 10);
	}
}