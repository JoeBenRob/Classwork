
public class QuestionSeven {

	public static void main(String[] args) {
		System.out.println(questionSeven2(5, 10));
	}

	private static int questionSeven2(int num1, int num2) {

		int counter = 0;

		for (int i = num1; i <= num2; i++)
			if (i % 5 == 0)
				counter++;
		return counter;
	}
}