package assignment_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem3 {

		public static void main(String[] args) {
			
			
			List<Integer> A1= new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter numuber of integers");
			int n = sc.nextInt();
			
			System.out.println("Enter the list of elememts");
			for(int i=0;i<n;i++)
			{  
				A1.add(sc.nextInt());
			}
			
			System.out.println("Input (A1):"+A1);
			
			int ele = getMaxNumber(A1);
			System.out.println(ele);
		}
		
		public static int getMaxNumber(List<Integer> A1){
			int maxNumber= Integer.MIN_VALUE;
			for(int i=0;i<A1.size();i++) {
				maxNumber = Math.max(maxNumber, A1.get(i));
			}
			System.out.print("Output:");
			return maxNumber;
		}
}
		
		

	


