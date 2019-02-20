package practice;

import java.util.Scanner;

import utility.utility;

public class Trignometric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter angle in degree");
		System.out.println("Enter 1 to convert in sin/n Enter 2 to convert in cos");
		utility u =new utility();
		Scanner sc = new Scanner(System.in);
		double degree = sc.nextDouble();
		int in = sc.nextInt();
		double radian = u.Toradian(degree);
		if(in==1)
		{
			double sin =u.sin(radian);
			System.out.println(sin);
		}
		else
		{
			double cos = u.cos(radian);
			System.out.println(cos);
		}

		
		
		
		

	}

}
