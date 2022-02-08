package assignment_01;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		
		Queue<Integer> Que = new LinkedList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of Queue");
		int len = scanner.nextInt();
		
		System.out.println("Enter the list of Queue with 0's and 1's");
		for(int i=1; i<=len;i++) {
			Que.add(scanner.nextInt());
		}

		System.out.println("List of Queue : " + Que);
		
		int Out = 0;
		int index = len-1;
		for(int e : Que) {
			Out += e*(Math.pow(2,index));
			index--;
		}
		System.out.println("Output : " + Out);
	}

}
