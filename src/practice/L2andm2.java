package practice;

import java.util.Scanner;
import utility.utility;

public class L2andm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		utility u = new utility();
		int a[] = new int[20];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of element");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		u.L2andm2(a,n);

	}

}
