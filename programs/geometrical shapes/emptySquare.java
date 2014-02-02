import java.util.Scanner;
class emptySquare
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		for(byte r1=r; r!=0; r--)
		{	
			if(r==r1 || r==1)
				for(byte c=0; c!=r1; c++)
					System.out.print("* ");
			else			
				for(byte c=1; c<=r1; c++)
					if(c==1 || c==r1)
						System.out.print("* ");
					else
						System.out.print("  ");					
			System.out.println();
		}	
	}
}