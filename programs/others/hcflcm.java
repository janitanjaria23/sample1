import java.util.*;
class hcflcm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the number: ");
		int x=sc.nextInt();
		System.out.print("Enter the number: ");
		int y=sc.nextInt();
		int h=1, l=1;
		for(int d=2; d<=x || d<=y;)
			if(x%d==0 && y%d==0)
			{
				h*=d;
				l*=d;
				x/=d;
				y/=d;
			}
			else if(x%d==0)
			{
				l*=d;
				x/=d;
			}
				else if(y%d==0)
				{
					l*=d;
					y/=d;
				}
					else
						d++;
		System.out.println(h+" "+l);
	}
}