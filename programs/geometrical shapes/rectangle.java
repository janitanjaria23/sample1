import java.util.Scanner;
class rectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		System.out.print("Enter the number of columns: ");
		byte c=sc.nextByte();
		while(r!=0)
		{
			for(byte c1=1; c1<=c; c1++)
				System.out.print("* ");
			System.out.println();	
			r--;	
		}
	}
}