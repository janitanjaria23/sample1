import java.util.*;
class insitu
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
            System.out.print("Enter the no. of rows: ");
            n=sc.nextInt();
        }while(n<3 || n>12);
        for(int i=1,sp=1;i<=n;i++,sp++)
        {
            if(i==1 || i==n)
                for(int k=2*n;k>0;k--)
                    System.out.print("*");
            System.out.println();}}}
