import java.util.Scanner;
class pyramid
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte n=sc.nextByte();
		for(byte r=1,s=40; r<=n; r++,s--)
		{			
			for(byte x=0; x<s; x++)
				System.out.print(" ");
			for(byte x=0; x!=r; x++)
				System.out.print("* ");
			System.out.println();		
		}
	}
}
/*
import java.util.Scanner;
class openPyramid
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
			for(byte x=c; x!=0; x--)
				System.out.print("* ");
			System.out.println();		
		}
	}
} */