package practice;

import utility.utility;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		utility u = new utility();
    
	int index=0;
		int[] primeNumbers = new int[1000];
		
		for(int i=2;i<1000;i++)
		{
			int notPrime=0;
			 for(int j=2;j<=i/2;j++)
			 {
				 if(i%j==0)
				 {
					notPrime=1;
					break;
				 }
			 }
			 if(notPrime!=1)
			 {
				// System.out.println(i);
				 primeNumbers[index]=i;
				 index++;			 
			 }
		}
		for(int i=0;i<index-1;i++)
		{
			for(int k=i+1;k<index;k++)
			{
				String s1 = Integer.toString(primeNumbers[i]);
				String s2 = Integer.toString(primeNumbers[k]);
				u.anagram(s1,s2);
			}
		}
	}
}
