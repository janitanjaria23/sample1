import java.util.*;
class hollowtrap
{
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
		int n=0;
		do
		{
			System.out.print("Rows");
			n=sc.nextInt();
		}while(n>39 || n<3);
		
		int x=n;
		
		for(int i=1; i<=n; i++, x+=2)
		{
			for(int k=1; k<=n-i; k++)
				System.out.print("  ");
			
			for(int k=1; k<=x; k++)
			{
				if(k==1 || k==i)
                    System.out.print(" ");
				else	
                    
					System.out.print("* ");	
			}			 
			
			System.out.println();	
		}
		
		x-=4;
		
		for(int i=n-1; i>0; i--, x-=2)
		{
			for(int k=1; k<=n-i; k++)
				System.out.print("  ");
			
			for(int k=1; k<=x; k++)
			{
				if(k==1 || k==i)
					System.out.print("* ");	
				else
                   
					System.out.print("* ");
			}				
			
			System.out.println();	
		}
	}
}			
		


/*
      * * * *
    * * * * * *
  * * * * * * * *
* * * * * * * * * *
  * * * * * * * *
    * * * * * *
      * * * *	
*/
