import java.util.*;
class zero
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        double n=0;
		System.out.print("Enter the no. of zero: ");
        n=sc.nextDouble();
        for(double ctr=1; ctr<=n; ctr++)
		{
			if(ctr<=n-1)
                System.out.print("0, ");
			else
				System.out.print("0.");	
		}
	}
}
