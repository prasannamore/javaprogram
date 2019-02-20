package practice;

import java.util.Scanner;

import utility.utility;

public class Anagram {
	public static void main(String a[]) {
		// TODO Auto-generated method stub
	utility u = new utility();
	System.out.println("Enter two String ");
	Scanner sc = new Scanner(System.in);
	String s1 =sc.next();
	String s2 =sc.next();
	u.anagram(s1,s2);
	sc.close();
	}

}
