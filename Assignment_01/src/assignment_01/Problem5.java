package assignment_01;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Problem5 {

	public static boolean balnced(String expression) {
		Deque<Character> S = new ArrayDeque<Character>();

		for (int i = 0; i < expression.length(); i++) {
			char x = expression.charAt(i);

			if (x == '(' || x == '[' || x == '{') {
				S.push(x);
				continue;
			}

			if (S.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = S.pop();
				if (check == '{' || check == '[')
					return false;
				break;

			case '}':
				check = S.pop();
				if (check == '(' || check == '[')
					return false;
				break;

			case ']':
				check = S.pop();
				if (check == '(' || check == '{')
					return false;
				break;
			}
		}

		return (S.isEmpty());
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string expression: ");
		String exp = scan.next();

		if (balnced(exp))
			System.out.println("True ");
		else
			System.out.println("False");
	}
}
