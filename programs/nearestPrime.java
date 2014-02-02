import java.util.*;
class nearestPrime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,d=0,y=0;
        do
        {
            System.out.print("Enter the no.");
            n=sc.nextInt();
        }while(n<30);
        for(int i=n-1,x=0,f=0;x<1;i--,f=0)
        {
            for(int k=1;k<=i;k++)
                if(i%k==0)
                    f++;
                if(f==2)
                {
                f=0;
                for(int k=1; k<=(i+2);k++)
                if((i+2)%k==0)
                f++;
                }
                if(f==2)
                {
                x=x+1;
                d=n-i;
                y=i;
                }
                }     
        for(int i=n+1,x=0,f=0;x<1;i++,f=0)
        {
            for(int k=1;k<=i;k++)
                if(i%k==0)
                    f++;
                if(f==2)
                {
                f=0;
                for(int k=1; k<=i+2;k++)
                if((i+2)%k==0)
                f++;
                }
                if(f==2)
                {
                x++;
                if(d>(i-n))
                System.out.print("("+i+","+(i+2)+")");
                else
                System.out.print("("+y+","+(y+2)+")");
                }
                }
               }
               }
