package assignment_01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem4 {
	public static void main(String[] args) {
		
		ArrayList<String> A1 = new ArrayList<String>();
		ArrayList<String> A2 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int num = sc.nextInt();
		System.out.println("Enter the list of the arry: ");
		for (int i = 0; i < num; i++) {
			A1.add(sc.next());
		}
		
		System.out.println("Input (A1): "+A1);
		
		List<String> A21 = getSortedStr(A1);
		System.out.println(A21);
	}
	
	public static List<String> getSortedStr(List<String> A1){
		List<String> A2 = new ArrayList<>();
		for(int i=0;i<A1.size();i++) {
			A2.add(A1.get(i));
		}
		Collections.sort(A2,(a,b)->a.length()-b.length());
		System.out.print("Output:");
		return A2;
	}
	
}
