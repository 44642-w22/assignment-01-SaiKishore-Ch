package assignment_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> Q = new LinkedList<>();
		Queue<Integer> Q_even = new LinkedList<>();
		Queue<Integer> Q_odd = new LinkedList<>();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the Queue");
		int len = scanner.nextInt();
		
		System.out.println("Enter the list of Integers for the Queue");
		for(int i=1; i<=len;i++) {
			Q.add(scanner.nextInt());
		}
		
		System.out.println("List of the Queue : " + Q);
		
		Queue<Integer> Q_dup = new LinkedList<>(Q);
		
		for(int e : Q_dup) {
			if(e%2==0) {
					Q_even.add(e);	
			}else{
					Q_odd.add(e);				
				}
		}
		

		System.out.println("List of the Queue : " + Q_dup);		
		System.out.println("List of the Queue with odd index elements : " + Q_odd);
		System.out.println("List of the Queue with even index elements : " + Q_even);
		List<Integer> A = new ArrayList<Integer>(len);	
		
		for(int i=0;i<len;i++) {
				if(A.size()<len) {
					if(!Q_even.isEmpty()) {
						A.add(Q_even.poll());
					}
					if(A.size()<len) {
						if(!Q_odd.isEmpty()) {
							A.add(Q_odd.poll());	
						}
					}
				}
		}
		System.out.println("Output ArrayList is : " + A);
		
	}

}
