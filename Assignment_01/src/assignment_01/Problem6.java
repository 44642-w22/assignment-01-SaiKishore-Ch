package assignment_01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem6 {

	public static void main(String[] args) {

		Stack<Integer> S = new Stack<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Length of the Stack");

		int n = scanner.nextInt();
		if (n % 2 == 0) {
			System.out.println("Enter the list of the Stack");
			for (int i = 0; i < n; i++) {
				S.add(scanner.nextInt());
			}
			System.out.println("List of Integers is: " + S);

			List<Integer> Arr = new ArrayList<Integer>();

			for (int i = n; i > n / 2; i--) {
				Arr.add(S.get(i - 1));
			}
			for (int i = 0; i < n / 2; i++) {
				Arr.add(S.get(i));
			}
			System.out.println("List of Integers : " + Arr);

		} else {
			System.out.println("Enter the even number for Length of the Stack");
		}

	}

}
