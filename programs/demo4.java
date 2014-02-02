import java.util.*;
import java.io.*;
class demo4
{
    public static void main(String args[])
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the no. ");
        int n=sc.nextInt();
        int s=0, n1=0;
        while(n>9)
        {
            s=0;
            n1=n;
            while(n1!=0)
            {
                s+=n1%10;
                n1/=10;
            }
            n=s;
        }
        if(n==1)
            System.out.println("Magic Number");
        else
            System.out.println("Not Magic Number");
        int i=4,k=2;
        String s1="HARSHIL";
        System.out.println(s1.indexOf('q'));
    }                                  
}

