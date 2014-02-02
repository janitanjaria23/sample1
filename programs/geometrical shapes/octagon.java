import java.util.*;
class hexagon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int c=0;
		System.out.print("Enter the number: ");
		int r=sc.nextInt();
		for(int i=1; i<=r; i++, c+=2)
		{
			for(int sp=1; sp<=r-i; sp++)
				System.out.print("  ");
			for(int k=1; k<=r+c; k++)
				System.out.print("* ");
			System.out.println();	
		}
		c-=2;
		for(int i=1; i<=r-2; i++)
		{
			for(int k=1; k<=r+c; k++)
				System.out.print("* ");
			System.out.println();	
		}		
		for(int i=0; i<r; i++, c-=2)
		{
			for(int sp=r-i; sp<r; sp++)
				System.out.print("  ");
			for(int k=1; k<=r+c; k++)
				System.out.print("* ");
			System.out.println();	
		}
	}
}