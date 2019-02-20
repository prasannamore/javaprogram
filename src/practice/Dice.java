package practice;

import java.util.Scanner;

import utility.utility;

public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utility u = new utility();
		int[] a = new int[7];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a=u.Dice(n);
		for(int i=1;i<7;i++)
		{
			System.out.println(i+" came "+a[i]+" times");
		}
		sc.close();

	}

}
