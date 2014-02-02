import java.util.*;
class trapezium
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Rows: ");
		int r=sc.nextInt();
		int c=0;
		for(int i=1; i<=r; i++, c+=2)
		{
			for(int s=1; s<=r-i; s++)
				System.out.print("  ");
			for(int k=1; k<=r+c; k++)
				System.out.print("* ");
			System.out.println();		
		}
	}
}