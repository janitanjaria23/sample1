import java.util.Scanner;
class square
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Number of rows: ");
		byte r=sc.nextByte();
		for(byte x=0; x<r; x++)
		{
			for(byte c=r; c!=0; c--)
				System.out.print("* ");
			System.out.println();	
		}
	}
}