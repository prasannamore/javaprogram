package utility;

public class Mathfunction {
	public static void checkCollinearusingSlope(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		double ab =(double)(y2-y1)/(x2-x1);
		//System.out.println(ab);
		double bc =(double)(y3-y2)/(x3-x2);
		if(ab==bc)
		{
			System.out.println("Are collinear ");
		}
		else
		{
			System.out.println("Are not collinear ");
		}
	}
	
	public static void checkCollinearusingArea(double x1,double y1,double x2,double y2,double x3,double y3)
	{
		double d =(double)(0.5)*((x1-x2)*(y2-y3)-(x2-x3)*(y1-y2));
		if(d==0)
		{
			System.out.println("Are collinear ");
		}
		else
		{
			System.out.println("Are not collinear ");
		}
		
	}
	
	public static int[][] multiplymatrix(int[][] A,int[][] B,int ra,int ca,int rb,int cb )
	{
		
		int[][] AB=new int[ra][cb];
		for(int i=0;i<ra;i++)
		{
			
			for(int k=0;k<cb;k++)
			{
				int sum=0;
			for(int j=0;j<ca;j++)
			{
				sum=sum+A[i][j]*B[j][k];
			}
			AB[i][k]=sum;
			}
			
		}
		return AB;
	}

}
