import java.util.Scanner;
class fivestar
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner (System.in);
		System.out.print("Enter the numbers of rows: ");
		byte  r=sc.nextByte();
		for(int n=1, sp=r-1; n<=r; n++, sp--)
		{
			for(int k=1; k<=sp; k++)
				System.out.print("   ");
			for(int x=n; x>=1; x--)
			{	
				if(x<=9)
					System.out.print(x+"  ");
				else
					System.out.print(x+" ");	
			}
			for(int x=2; x<=n; x++)
			{	
				if(x<=9)
					System.out.print(x+"  ");
				else
					System.out.print(x+" ");	
			}
			System.out.println();	
		}
		for(int n=r-1, sp=1; n>0; n--, sp++)
		{
			for(int k=1; k<=sp; k++)
				System.out.print("   ");
			for(int x=n; x>=1; x--)
			{	
				if(x<=9)
					System.out.print(x+"  ");
				else
					System.out.print(x+" ");	
			}
			for(int x=2; x<=n; x++)
			{	
				if(x<=9)
					System.out.print(x+"  ");
				else
					System.out.print(x+" ");	
			}
			System.out.println();				
		}		
	}
}