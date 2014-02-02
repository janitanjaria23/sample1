import java.util.*;
class armstrong
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		int n1=0, s=0, r=0;
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		n1=n;
		while(n>0)
		{
			r=n%10;
			s+=Math.pow(r,3);
			n/=10;
		}
		if(s==n1)
			System.out.println("Armstrong");
	}
}
