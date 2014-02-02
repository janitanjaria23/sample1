import java.util.*;
class pyramid
{
	public static void main(String abc[])
	{
		Scanner sc=new Scanner(System.in);
		byte r=0;
		do
		{
			System.out.print("enter rows: ");
			r=sc.nextByte();
		}while(r<4 || r>24);
		
		for(int i=1,sp=r-1;i<=r;i++,sp--)
		{
			for(int k=0;k<=sp;k++)
			System.out.print(" ");
			
			for(int k=1;k<=i;k++)
			System.out.print("* ");
			
			System.out.println();
		}
		
	}
}
