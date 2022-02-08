package assignment_01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Problem8 {

	public static void main(String[] args) {
		
	Queue<Integer> Que = new LinkedList<>();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the Queue");
		int n = scanner.nextInt();
		
		System.out.println("Enter the list of Integers for the Queue");
		for(int i=1; i<=n;i++) {
			Que.add(scanner.nextInt());
		}
		
		System.out.println("List of the Queue : " + Que);
		
		Stack<Integer> S = new Stack<>();
		
		Iterator<Integer> objIterator = Que.iterator();  
		while(objIterator.hasNext())
		{
			S.add(objIterator.next());
		}
		
		List<Integer> Arr = new ArrayList<Integer>(n);	
		
		for(int i=0;i<n;i++) {
				if(Arr.size()<n) {
					Arr.add(S.get(n-i-1));
					if(Arr.size()<n) {
						Arr.add(S.get(i));
					}
				}
		}
		System.out.println("Output ArrayList : " + Arr);
	}

}
