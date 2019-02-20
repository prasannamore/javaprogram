package utility;

import java.util.Random;
import java.util.Scanner;

public class utility {
	
	Scanner sc= new Scanner(System.in);
	
	 int[][] board = new int[3][3];
	int winnerPlayer;
	 int win=0;
	 int count=0;
	 int move=1;
	public void TictacToe()
	{
		while(count!=9)
		{
			count++;
			if(count>=4)
			{
			winnerPlayer=checkWin();
			}
			if(win==1)
			{
				if(winnerPlayer==1)
				{
				System.out.println("Player_1__Wins");
				break;
				}
				else
				{
				System.out.println("Player_2__Wins");
				break;
				}
			}
			else if(move==1)
			{
				playerMove();
				printBoard();
				move=2;
			}
			else
			{
				computerMove();
				printBoard();
				move=1;
			}
		}
		if(count==9)
		{
			System.out.println("Game draw");
		}
	}
	public void printBoard()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			   System.out.print(board[i][j]+ " "+"|");	
			}
			System.out.println("");
		}
		System.out.println("\n");
	}
	public void playerMove()
	{
		System.out.println("Yours move Enter row and col");
		int row=sc.nextInt();
		int col=sc.nextInt();
		if(row>2||col>2||!isEmpty(row,col))
		{
			System.out.println("wrong move");
			playerMove();
		}
		else if(board[row][col]==0)
		{
			board[row][col]=1;
		}
	
	}
	public void computerMove()
	{
		Random r = new Random();
		int row =(int)r.nextInt(3);
		int col =(int)r.nextInt(3);
		
		while(!isEmpty(row,col))
		{
			 row =(int)r.nextInt(3);
			 col =(int)r.nextInt(3);
			
		}
		board[row][col]=2;
	}
	public int checkWin()
	{
		//row
		if(board[0][0]==board[0][1]&&board[0][1]==board[0][2])
		{
			win=1;
			return board[0][0];	
		}
		else if(board[1][0]==board[1][1]&&board[1][1]==board[1][2])
		{
			win=1;
			return board[1][0];	
		}
		else if(board[2][0]==board[2][1]&&board[2][1]==board[2][2])
		{
			win=1;
			return board[2][0];	
		}
		//col
		else if(board[0][0]==board[1][0]&&board[1][0]==board[2][0])
		{
			win=1;
			return board[0][0];	
		}
		else if(board[0][1]==board[1][1]&&board[1][1]==board[2][1])
		{
			win=1;
			return board[0][1];	
		}
		else if(board[0][2]==board[1][2]&&board[1][2]==board[2][2])
		{
			win=1;
			return board[0][2];	
		}
		
		//diagonal
		
		else if(board[0][0]==board[1][1]&&board[1][1]==board[2][2])
		{
			win=1;
			return board[0][1];	
		}
		else if(board[0][2]==board[1][1]&&board[1][1]==board[2][0])
		{
			win=1;
			return board[0][2];	
		}
	
		return 0;
	}
	boolean isEmpty(int r,int c)
	{
		if(board[r][c]==0)
		{
			return true;
			
		}
		else 
		{
		 return false;	
		}
	}

	public void anagram(String s1,String s2)
	{
		int check=1;
		if(s1.length()!=s2.length())
		{
			System.out.println("Not an anagram");
			return;
		}
		for(int i=0;i<s1.length()-1;i++)
		{
				if(!s2.contains(s1.substring(i,i)))
				{
					System.out.println("Not an anagram");
					check=0;
					break;
				}
		}
		if(check!=0)
		{
			System.out.println(s1+"and"+s2+" is An anagram");
		}
	}
	public int  sumOfdice()
	{
		Random r= new Random();
		int dice1= r.nextInt(6)+1;
		System.out.println(dice1);
		int dice2 = r.nextInt(6)+1;
		System.out.println(dice2);
		return dice1+dice2;
	}
	public void L2andm2(int a[],int n)
	{
		int i=0;
		int min1=a[i];
		int min2=a[i+1];
		int max1=a[i];
		int max2=a[i+1];
		for(i=1;i<n;i++)
		{
			if(a[i]>max1)
			{
				max1=a[i];
				if(max1>max2)
				{
					int temp=max1;
					max1=max2;
					max2=temp;					
				}
			}
			
			if(a[i]<min2)
			{
				min2=a[i];
				if(min2<min1)
				{
					int temp=min2;
					min2=min1;
					min1=temp;					
				}
			}
		}
		System.out.println(" min1= "+min1+" min2= "+min2+" max1= "+max1+" max2= "+max2);
		
	}
	
	public int[] Dice(int n)
	{
		Random r = new Random();
		int[] a = {0,0,0,0,0,0,0}; 
 		for(int i=0;i<n;i++)
		{
			int num=r.nextInt(6)+1;
			System.out.println(num);
			a[num]++;		
		}
 		return a;
	}
	
	public double Toradian(double degree )
	{
		double radian = (double)degree*(3.14/180);
		return radian;
	}
	
	public double sin(double angle)
	{
		double sin = Math.sin(angle);
		return sin;
	}
	
	public double cos(double angle)
	{
		double cos = Math.cos(angle);
		return cos;
	}
	
}
