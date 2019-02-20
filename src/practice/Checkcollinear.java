package practice;
import java.util.Scanner;

import utility.Mathfunction;

public class Checkcollinear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();
		
		Mathfunction.checkCollinearusingSlope(x1, y1, x2, y2, x3, y3);
		Mathfunction.checkCollinearusingArea(x1, y1, x2, y2, x3, y3);

	}

}
