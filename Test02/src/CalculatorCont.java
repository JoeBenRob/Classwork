
public class CalculatorCont {

	static int num1 = 123;
	static int num2 = 100;
	static char op = '/';

	public static void main(String[] args) {
		System.out.println(calculator(num1, num2, op));
	}

	private static int calculator(int num1, int num2, char op) {
		switch (op) {
		default:
			System.out.println("not a valid operator");
		case '+':
			return num1 + num2;
		case '-':
			return num1 - num2;
		case '*':
			return num1 * num2;
		case '/':
			return num1 / num2;
		case '%':
			return num1 % num2;

		}
	}
}
