import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListsStreams {
	public static void main(String[] args) {
		ListsStreams StreamPractice = new ListsStreams();

		ArrayList<Integer> intList = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++) {
			intList.add(i);
		}
		for (int i = 0; i <= intList.size() - 1; i++) {

			System.out.print(intList.get(i) + " ");
		}
		System.out.println();
		ArrayList<String> strList = new ArrayList<String>();
		for (int i = 0; i <= 10; i++) {
			strList.add("Hello");
		}
		for (int i = 0; i <= strList.size() - 1; i++) {

			System.out.print(strList.get(i) + " ");
		}
		ArrayList<Integer> intList2 = new ArrayList<Integer>();
		intList2.add(3);
		intList2.add(5);
		intList2.add(1);

		System.out.println();
		System.out.println(StreamPractice.checkWordString(strList, "Hello"));
		System.out.println(StreamPractice.checkLargestValue(intList));
		System.out.println(StreamPractice.removeOddNumbers(intList));
		System.out.println(StreamPractice.incrementalOrder(intList2));
	}

	// Q5) Create a method that checks for a specific word in a list of Strings and
	// returns the number of times that word occurs.
	public int checkWordString(ArrayList<String> strList, String input) {
		return (int) strList.stream().filter(i -> i.equals(input)).count();
	}

	// Q6) Create a method that goes through a list of numbers and sums the values

	// Q7) Create a method that checks a list of numbers and returns the LARGEST
	// value
	public int checkLargestValue(ArrayList<Integer> intList) {
		return (int) intList.stream().reduce(Integer.MIN_VALUE, Integer::max);
	}

	// Q8) Create a method that removes all ODD values from a list of Numbers.
	public ArrayList<Integer> removeOddNumbers(ArrayList<Integer> intList) {
		return (ArrayList<Integer>) intList.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
	}

	// Q9) Create a method that takes a list of Numbers and sort them into an
	// incremental order
	public ArrayList<Integer> incrementalOrder(ArrayList<Integer> intList) {
		return (ArrayList<Integer>) intList.stream().sorted().collect(Collectors.toList());
	}
}
