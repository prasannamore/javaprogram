package practice;

import java.util.Scanner;

import utility.Mathfunction;

public class Matricmultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter row and col of matrix A");
	int ra=sc.nextInt();
	int ca=sc.nextInt();
	int[][] A = new int[ra][ca];
	System.out.println("Enter row and col of matrix B");
	int rb=sc.nextInt();
	int cb=sc.nextInt();
	int[][] B = new int[rb][cb];
	if(ca==rb)
	{
	System.out.println("Enter Elements of matrix A");
	for(int i=0;i<ra;i++)
	{
		for(int j=0;j<ca;j++)
		{
			A[i][j]=sc.nextInt();
		}
	}
	System.out.println("Enter Elements of matrix B");
	for(int i=0;i<rb;i++)
	{
		for(int j=0;j<cb;j++)
		{
			B[i][j]=sc.nextInt();
		}
	}
	int[][] AB = new int[ra][cb];
	AB=Mathfunction.multiplymatrix(A,B,ra,ca,rb,cb);
	for(int i=0;i<ra;i++)
	{
		for(int j=0;j<cb;j++)
		{
			System.out.print(AB[i][j]+" ");
		}
		System.out.println();
	}
	}
	else
	{
		System.out.println("cannot multiply");
	}

	}

}
