import java.util.Scanner;
class emptyDiamond
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of characters in centre: ");
		byte r=sc.nextByte();
		for(byte c=1; c<=r; c++)
		{			
			for(byte sp=c; sp<r; sp++)
				System.out.print(" ");
			if(c==1)
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
		for(int c=r-1; c>0; c--)
		{
			for(int sp=r-c; sp>0; sp--)
				System.out.print(" ");
			if(c==1)
				for(int x=c; x>0; x--)
					System.out.print("* ");
			else
				for(int x=1; x<=c; x++)
					if(x==1 || x==c)
						System.out.print("* ");
					else
						System.out.print("  ");				
			System.out.println();
		}
	}
}
/*
 *r:rows
 *sp:space counter
 *x:checker for printing "* "
 *c=checker for number of rows
 */