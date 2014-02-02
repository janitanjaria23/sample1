import java.util.Scanner;
class primes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);        
        System.out.print("Starting from: ");
        int x=sc.nextInt();
        System.out.print("Till: ");
        int n=sc.nextInt();       
        for(int f=1; x<n; x++,f=1)
        {
        	for(int d=2; d<=x; d++)
		    {
		    	if(x%d==0)			        
		        	f++;    	
		    }
		    if(f==2)
		    {	
		    	System.out.print(x+" "); 
		    	
		    }
        }             
    }
}