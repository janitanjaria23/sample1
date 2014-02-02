import java.util.Scanner;
class prime
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double f=1;
		System.out.print("Enter a number: ");
		double n=sc.nextDouble();
		for(double d=2; d<n; d++)
			if(n%d==0)
				f++;
		if(f==1)
			System.out.println("Prime number");
		else
			System.out.println("Composite number");			
	}
}