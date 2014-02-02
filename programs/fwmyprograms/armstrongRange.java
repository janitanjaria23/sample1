import java.util.Scanner;
class armstrongRange
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Lower limit: ");
		int x=sc.nextInt();
		System.out.print("Upper limit: ");
		int u=sc.nextInt();		
		for(int s=0, x1=x, r=0; x<=u; x++, s=0, x1=x)
		{			
			while(x1!=0)
			{
				r=x1%10;
				s+=r*r*r;
				x1/=10;
			}
			if(s==x)
				System.out.println(x+" is an Armstrong");				
		}
	}
}