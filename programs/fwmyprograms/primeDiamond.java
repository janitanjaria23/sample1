import java.util.Scanner;
class primeDiamond
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int x=2;
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		for(byte l=1; l<=r; l++)
		{
			for(int sp=1; sp<=r-l; sp++)
				System.out.print("  ");
			for(byte c=1, f=0; c<=l; x++, f=0)
			{
				for(int d=2; d<x; d++)
					if(x%d==0)
						f++;
				if(f==0)
				{
					if(x>9)
						System.out.print(x+"  ");
					else if(x>99)
						System.out.print(x+" ");
					else
						System.out.print(x+"   ");
					c++;
				}
			}
			System.out.println();
		}
		for(byte l=1; l<=r-1; l++)
		{
			for(byte sp=1; sp<=l; sp++)
				System.out.print("  ");
			for(byte c=1, f=0; c<=r-l; x++,f=0)
			{
				for(int d=2 ; d<x; d++)
					if(x%d==0)
						f++;
				if(f==0)
				{
					if(x>9)
						System.out.print(x+"  ");
					else if(x>99)
						System.out.print(x+" ");
					else
						System.out.print(x+"   ");
					c++;
				}
			}
			System.out.println();
		}
	}
}