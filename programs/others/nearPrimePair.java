import java.util.Scanner;
class nearPrimePair
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int n=sc.nextInt();
		for(int i=n, j=n, d=1, f=1, m=1, c=1, a=0, b=0; c!=0; i--, j++, d=1, f=1, m=1)
		{
			while(j>=d)
			{
				if(i%d==0)
					f++;
				if(j%d==0)
					m++;	
			}
			if(f==2 && m==2)
			{
				d=1;
				f=1;
				m=1;
				for(int e=1; e<=2; e++)
					while(d<=b)
					{
						if(a%d==0)
							f++;
						if(b%d==0)
							m++;	
					}
				if(f==2 && m==2)				
				{	
					System.out.println("("+a+", "+i+")"+" ,"+"("+a+", "+i+")");
					c++;
				}
				else if(f==2)
				{	
					System.out.println("("+a+", "+i+")");
					c++;
				}
					else if(m==2)
					{	
						System.out.println("("+j+", "+b+")");
						c++;
					}
			}
			else if(f==2)
			{
				d=1;
				f=1;
				for(int e=1; e<=2; e++)
					while(d<=a)
						if(a%d==0)
							f++;
					if(f==2)
						System.out.println("("+a+", "+i+")");		
			}
			else if(m==2)
			{
				d=1;
				m=1;
				for(int e=1; e<=2; e++)
					while(d<=b)
						if(b%d==0)
							m++;
					if(m==2)
						System.out.println("("+j+", "+b+")");	
			}
		}
	}
}