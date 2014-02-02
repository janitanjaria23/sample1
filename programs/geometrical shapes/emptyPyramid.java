import java.util.Scanner;
class emptyPyramid
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		for(byte c=1; c<=r; c++)
		{
			for(byte sp=c; sp<r; sp++)
				System.out.print(" ");
			if(c==1 || c==r)
				for(byte x=c; x!=0; x--)
					System.out.print("* ");
			else
				for(byte x=1; x<=c; x++)
					if(x==1 || x==c)
						System.out.print("* ");
					else
						System.out.print("  ");
			System.out.println();
		}
	}
}