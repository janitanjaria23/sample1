import java.util.Scanner;
class triangle
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		byte n1=0;
		System.out.print("Enter the number of lines: ");
		byte n=sc.nextByte();		
		do
		{
			for(byte ctr=0,x=0; ctr<=n1; ctr++)
			{
				x++;
				if(x<=9)
					System.out.print(x+"  ");
				else
					System.out.print(x+" ");	
			}
			n1++;
			System.out.println(" ");			
		}while(n1!=n);
	}
} 