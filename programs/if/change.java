import java.util.*;
import java.io.*;
class change
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        char c=' ';
        do
        {
	        System.out.print("Do you want to continue: ");
	        c=dis.readLine().charAt(0);
	        if(c=='y')
	        {
	        	System.out.print("Enter the no: ");
		        int a=sc.nextInt();
		        System.out.print("Enter the no: ");
		        int b=sc.nextInt();
		        a+=b;
		        b=a-b;
		        a-=b;
		        System.out.println(a);
		        System.out.println(b)
		    }
        }while(c=='y');    	      
    }
}

