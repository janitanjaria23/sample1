import java.util.*;
class arrowHead
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r=sc.nextInt();
		for(int i=1; i<=r; i++)
		{
			for(int sp=r-i; sp!=0; sp--)
				System.out.print("  ");
			for(int k=1; k<=r; k++)
				System.out.print("* ");
			System.out.println();	
		}
		for(int i=1; i<=r-1; i++)
		{
			for(int sp=1; sp<=i; sp++)
				System.out.print("  ");
			for(int k=1; k<=r; k++)
				System.out.print("* ");
			System.out.println();	
		}		
	}
}
/*
 import java.util.*;
class arrowHead
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int r=sc.nextInt();
		for(int i=1,sp=r-1; i<=r; i++,sp--)
		{
			for(int k=1;k<=sp;k++)
				System.out.print("  ");
			for(int k=1; k<=r; k++)
				System.out.print("* ");
			System.out.println();	
		}
		for(int i=1; i<=r-1; i++)
		{
			for(int sp=1; sp<=i; sp++)
				System.out.print("  ");
			for(int k=1; k<=r; k++)
				System.out.print("* ");
			System.out.println();	
		}		
	}
}*/