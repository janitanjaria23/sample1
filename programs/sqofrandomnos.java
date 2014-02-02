import java.util.*;
class sqofrandomnos
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		Random ran=new Random();
		int n=0;
		do
		{
			System.out.print("No. of nos");
			n=sc.nextInt();
		}while(n>25 || n<4);
		int x=0;
		float y=0;
		for(int i=1; i<=n; i++)
		{
			do
			{
				y=ran.nextFloat();
				x=(int)(y*n+1);
			}while(x>20);
			
			System.out.println("Squares of summation of"+x"is"+(x*(x+1)*(2*n+1))/6);
		}
	}
}				
			
			
			