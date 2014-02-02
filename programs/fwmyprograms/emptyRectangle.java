import java.util.Scanner;
class emptyRectangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		byte r=sc.nextByte();
		System.out.print("Enter the number of columns: ");
		byte c=sc.nextByte();
		for(byte r1=r; r!=0; r--)
		{	
			if(r==r1 || r==1)
				for(byte c1=0; c1!=c; c1++)
					System.out.print("* ");
			else			
				for(byte c1=1; c1<=c; c1++)
					if(c1==1 || c1==c)
						System.out.print("* ");
					else
						System.out.print("  ");	
			System.out.println();
		}
	}
}