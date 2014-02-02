import java.util.*;
class trapizium
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
            System.out.print("Enter the no. of rows: ");
            n=sc.nextInt();
        }while(n<4 || n>14);
        for(int i=1,sp=2*n-2,j=n;i<=n;i++,j+=2,sp-=2)
        {
            for(int k=sp;k>=1;k--)
                System.out.print(" ");
            for(int k=j;k>=1;k--)
                System.out.print("* ");
            System.out.println();
        }}}
