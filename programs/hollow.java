import java.util.*;
class hollow
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
            System.out.print("Enter the no. of rows: ");
            n=sc.nextInt();
        }while(n<4 || n>24);
        for(int i=1,sp=2*n-2,sp1=3;i<=n;i++,sp-=2)
        {
            for(int k=sp;k>=1;k--)
                System.out.print(" ");
            if(i!=n)
            System.out.print("* ");
            if(i!=1 && i!=n)
            {
                for(int k=sp1;k>1;k--)
                    System.out.print(" ");
                System.out.print("* ");
                
             }
             
             if(i>1)
             sp1+=4;
             if(i==n)
             for(int k=2*n-1;k>=1;k--)
                System.out.print("* ");
                System.out.println();
         }

    }
}
