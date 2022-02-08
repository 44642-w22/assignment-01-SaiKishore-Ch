package assignment_01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Problem2 {
	 
	public static void problem2()
	{
		LinkedList<Integer> L1 = new LinkedList<Integer>();
		LinkedList<ArrayList<Integer>> L2 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numuber of integers");
		int n = sc.nextInt();
		System.out.println("Enter the sum of the number");
		int k=sc.nextInt();
		System.out.println("Enter the list of elememts");
		for(int i=0;i<n;i++)
		{  
			L1.add(sc.nextInt());
		}
		System.out.println("Input (L1): "+L1);
		
		for(int i=0;i<n-1;i++)
		{
			ArrayList<Integer> pair=new ArrayList<>();
			int ele=(L1.get(i)+L1.get(i+1));
			if(k==ele)
			{
				pair.add(L1.get(i));
				pair.add(L1.get(i+1));
				L2.add(pair);
				
			}
		}
		System.out.println("Output (L2): "+L2);
		
	}
	public static void main(String[] args)
	{
		Problem2.problem2();
	}
}