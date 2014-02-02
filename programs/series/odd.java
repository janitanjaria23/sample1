import java.util.*;
class odd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        double a=-1;
		System.out.print("Enter the no. of odd numbers: ");
        double x=sc.nextDouble();
        for(double ctr=1; ctr<=x; ctr++)
		{
            if(ctr<=x-1)
			{
                a+=2;
                System.out.print(x+", ");
			}
			else
			{
                a+=2;
                System.out.print(x+" ."); 
			}
		}
	}
}
