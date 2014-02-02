import java.util.Scanner;
class diamond
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of characters in centre line: ");
		byte n=sc.nextByte();
		for(byte c=0,s=n; c!=n; c++,s--)
		{
			for(byte x=1; x<s; x++)			
				System.out.print(" ");
			for(byte x=0; x<=c; x++)
				System.out.print("* ");
			System.out.println();	
		}
		for(byte s=1; n!=0; n--,s++)
		{
			for(byte x=1; x<=s; x++)
				System.out.print(" ");
			for(byte x=1; x<n; x++)
				System.out.print("* ");
			System.out.println();		
		}
	}
}