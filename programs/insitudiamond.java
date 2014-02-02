import java.util.*;
class insitudiamond
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows");
        int n=sc.nextInt();
        int j=1;
        for(int i=1; i<=(n*2)-1; i++)
            System.out.print("* ");
        System.out.println();
        for(int i=n-1; i>0; i--, j+=2)
        {
            for(int k=1; k<=i; k++)
                System.out.print("* ");
            for(int k=1; k<=j; k++)
                System.out.print("  ");
            for(int k=1; k<=i; k++)
                System.out.print("* ");
            System.out.println();
        }
        j-=4;
        for(int i=2; i<=n-1; i++, j-=2)
        {
            for(int k=1; k<=i; k++)
                System.out.print("* ");
            for(int k=1; k<=j; k++)
                System.out.print("  ");
            for(int k=1; k<=i; k++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=1; i<=(n*2)-1; i++)
            System.out.print("* ");
    }
}




/*
* * * * * * * * *
* * * *   * * * *
* * *       * * *
* *           * *
*               *
* *           * *  
*/
