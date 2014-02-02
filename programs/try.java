import java.util.*;
class hexagon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		for(byte i=1; i<=r; i++)
		{
			if(i==1 || i==r)
				for(byte k=1; k<=r; k++)
					System.out.print("* ");
			else if(i<=r/2+1)
			{
				for(int k=1; k<=r/i-1; k++)
					System.out.print("* ");
				for(int k=1; k<=r-2*(r/i-1); k++)
					System.out.print("  ");		
				for(int k=1; k<=r/i-1; k++)
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}