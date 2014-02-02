import java.util.*;
class triangular
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of terms: ");
		short n=sc.nextShort();
		for(short x=1; x<=n; x++)
		{
			if(x<=n-1)
				System.out.print(x*x+", ");
			else
				System.out.print(x*x+".");
		} 
	}
}
