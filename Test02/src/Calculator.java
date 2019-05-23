
public class Calculator {

	static int num1 = 10;
	static int num2 = 15;
	static char op = '+';

	public static void main(String[] args) {
		System.out.println(calculator(num1, op, num2));
	}

	private static int calculator(int num1, char op, int num2) {
		if (op == '+')
			return num1 + num2;
		else if (op == '-')
			return num1 - num2;
		else if (op == '*')
			return num1 * num2;
		else if (op == '/')
			return num1 / num2;
		else
			return num1 % num2;
	}
}