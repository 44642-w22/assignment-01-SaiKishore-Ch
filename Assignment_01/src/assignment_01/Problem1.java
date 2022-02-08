package assignment_01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of integers");
		int n = sc.nextInt();
		System.out.println("Enter the list of elememts");
		for(int i=0;i<n;i++)
		{  
			L1.add(sc.nextInt());
		}
		System.out.println("Input (L1): "+L1);
		
		List<Integer> L2 = getPerfectNums(L1);
		System.out.println(L2);
	}
	
	public static List<Integer> getPerfectNums(List<Integer> L1){
		List<Integer> L2 = new LinkedList<>();
		for(int i=0;i<L1.size();i++) {
			int num = L1.get(i);
			int sum=0;
			for(int j=1; j<num; j++)
			{
				if(num%j == 0)
				{
					sum += j;
				}
			}
			if(sum==num) {
				L2.add(num);
			}

		}
		System.out.print("Output (L2):");
		return L2;
	}
	
	

}
