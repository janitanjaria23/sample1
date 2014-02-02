import java.util.Scanner;
import java.io.*;
class prime
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        double n=0, d=1, f=0;
        char c=' ';
        do
        {
	        System.out.print("Do you want to continue: ");
	        c=dis.readLine().charAt(0);
	        if(c=='y')
	        {
		        System.out.print("Enter the No.: ");
		        n=sc.nextDouble();
		        for(double ctr=0; ctr<=n; ctr++)
		        {
		        	if(n%d==0)
		        	{
		        		f++;
		        		d++;
		        	}
		        	else
		        		d++;	
		        }
		        if(f==2)
		            System.out.println("Prime Number");
		        else
		            System.out.println("Composite Number"); 
        	}
        }while(c=='y');   	    
    }
}    
