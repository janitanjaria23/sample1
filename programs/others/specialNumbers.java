import java.util.*;
class specialNumbers
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);		
		System.out.print("Enter the number of terms: ");
		int x=sc.nextInt();
		int s=0;
		for(int n=6, t=1; t<=x; n++, s=0)
		{	
			for(int f=1; f<n; f++)
				if(n%f==0)
					s+=f;
			if(s==n)
			{	
				System.out.print(n+" ");
				t++;
			}			
		}
	}
}
       
