import java.util.Scanner;
class primes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);        
        System.out.print("Enter the no of prime numbers: ");
        int n=sc.nextInt();       
        for(int x=2,f=1; n>0; x++,f=1)
        {
        	for(int d=2; d<=x; d++)
		    {
		    	if(x%d==0)			        
		        	f++;    	
		    }
		    if(f==2)
		    {	
		    	System.out.print(x+" "); 
		    	n--;
		    }
        }             
    }
}

