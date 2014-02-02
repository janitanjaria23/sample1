import java.util.Scanner;
class hexagon
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the length of one side: ");
		byte a=sc.nextByte();
		for(byte l=1, s=0; l<=a; l++, s+=2)
		{
			for(byte sp=1; sp<=a-l; sp++)
				System.out.print("  ");
			for(byte x=1; x<=a+s; x++)
				System.out.print("* ");
			System.out.println();
		}
		for(byte l=1; l<=a-2; l++)
		{
			for(byte x=1; x<=(a*3)-2; x++)
				System.out.print("* ");
			System.out.println();
		}
		for(byte l=1, s=3; l<=a; l++, s+=2)
		{
			for(byte sp=1; sp<=l; sp++)
				System.out.print("  ");
			for(byte x=1; x<=(a*3)-s; x++)
				System.out.print("* ");
			System.out.println();
		}
	}
}