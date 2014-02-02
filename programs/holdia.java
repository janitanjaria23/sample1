import java.util.*;
class holdia
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int r=sc.nextInt();
        int sp=0;
        for(int i=1;i<=r;i++)
        {
            for(int j=r-(i-1);j>0;j--)
                System.out.print("* ");
            for(int k=1;k<=sp;k++)
                System.out.print("  ");
            if(i==1)
                sp++;
            else
                sp+=2;
            if(i!=1)
            {
                for(int j=r-(i-1);j>0;j--)
                    System.out.print("* ");
            }
            else
                for(int j=r-1;j>0;j--)
                    System.out.print("* ");
            System.out.println();
        }
        sp-=4;
        for(int i=2;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            for(int k=1;k<=sp;k++)
                System.out.print("  ");
            if(i==1)
                sp--;
            else
                sp-=2;
            if(i!=r)
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            else
            for(int j=2;j<=i;j++)
                System.out.print("* ");

            System.out.println();
        }
        
       
    }
}


/*
* * * * * * * * *  0
* * * *   * * * *  2
* * *       * * *  6
* *           * *  10
*               *  14
* *           * *  10
* * *       * * *  6
* * * *   * * * *  2
* * * * * * * * *  0


*/
