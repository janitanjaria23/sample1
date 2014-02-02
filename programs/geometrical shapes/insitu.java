import java.util.Scanner;
class insitu
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		for(byte i=1; i<=r; i++)
		{
			if(i==1 || i==r)
				for(byte x=1; x<=r; x++)
					System.out.print("* ");
			else if(i<=r/2+1)
			{
				for(int x=1; x<=r/i; x++)
					System.out.print("* ");
				for(int x=r-(2*(r/i)); x!=0; x--)
					System.out.print("  ");		
				for(int x=1; x<=r/i; x++)
					System.out.print("* ");
			}
				else
				{
						for(int x=i-(r/2); x!=0; x--)
							System.out.print("* ");
						for(int x=r-(2*(i-(r/2))); x!=0; x--)
							System.out.print("  ");
						for(int x=i-(r/2); x!=0; x--)
							System.out.print("* ");					
				}	
			System.out.println();
		}
	}
}