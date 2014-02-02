import java.util.*;
class emptyRightAngleTriangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the number of line: ");
		byte r=sc.nextByte();
		for(byte c=1, x=0, s=r; s!=1; c++, s--)
		{
			x=c;			
			System.out.print("* ");
			x--;
			while(x>1)
			{	
				System.out.print("  ");
				x--;
			}
			if(x==1)
			{	
				System.out.print("* ");	
				x--;
			}
			System.out.println();
		}
		while(r!=0)
		{
			System.out.print("* ");
			r--;
		}
	}
}