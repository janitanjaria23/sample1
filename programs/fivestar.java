import java.util.*;
class fivestar
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
            System.out.print("Enter the no. of rows: ");
            n=sc.nextInt();
        }while(n<0 || n>9);
        for(int i=1,sp=2*n-2; i<=n;i++,sp-=2)
        {
            for(int k=sp;k>=1;k--)
                System.out.print(" ");
            for(int k=i; k>=1;k--)
                System.out.print(k+" ");
            for(int k=2;k<=i;k++)
                System.out.print(k+" ");
            System.out.println();
        }
        for(int i=n-1,sp=2; i>=1;i--,sp+=2)
        {
            for(int k=sp;k>=1;k--)
                System.out.print(" ");
            for(int k=i; k>=1;k--)
                System.out.print(k+" ");
            for(int k=2;k<=i;k++)
                System.out.print(k+" ");
            System.out.println();
        }






    }
}
