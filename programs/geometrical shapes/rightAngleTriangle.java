import java.util.*;
class rightAngleTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the number of line: ");
		byte r=sc.nextByte();
		for(byte c=1, x=0; r!=0; c++, r--)
		{
			x=c;
			while(x!=0)
			{
				System.out.print("* ");
				x--;
			}
			System.out.println();
		}
	}
}
/*
import java.util.Scanner
class rightAngleTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte n=sc.nextByte();
		for(byte r=1; r<=n; r++)
		{			
			for(byte x=0; x!=r; x++)
				System.out.print("* ");
			System.out.println();	
		}
	}
}*/
		

