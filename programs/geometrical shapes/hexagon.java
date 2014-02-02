import java.util.*;
class hexagon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Rows: ");
		int r=sc.nextInt();
		int c=r;
		for(int i=1; i<=r; i++, c+=2)
		{
			for(int s=1; s<=r-i; s++)
				System.out.print("  ");
			for(int k=1; k<=c; k++)
				System.out.print("* ");
			System.out.println();	
		}
		c-=4;
		for(int i=r-1; i>0; i--, c-=2)
		{
			for(int s=r-i; s>0; s--)
				System.out.print("  ");
			for(int k=1; k<=c; k++)
				System.out.print("* ");
			System.out.println();	
		}
	}
}