import java.util.*;
class catalonseries
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=0;
    do
    {
    System.out.println();
    System.out.println();
    System.out.print("  Enter no. of terms: ");
    n=sc.nextInt();
    }while(n<3 || n>15);

    int aa[]=new int[n];

    aa[0]=1;
    aa[1]=1;

    // the series



    for(int i=3,a1=0,b1=0,k=2;i<=n;i++,k++)
       {
       if(i%2==0)
         {
         a1=0;
         b1=k-1;
         for(int m=0;m<(k-1)/2;m++,a1++,b1--)
            {
            aa[k]+=(aa[b1]*aa[a1])+(aa[b1]*aa[a1]);
            }
         aa[k]+=aa[k/2]*aa[k/2];
         }
       else
         {
         a1=0;
         b1=k-1;
         for(int m=0;m<k/2;m++,a1++,b1--)
            {
            aa[k]+=(aa[b1]*aa[a1])+(aa[b1]*aa[a1]);
            }
         }

       }

     // printing

       for(int i=0;i<n;i++)
          {
          System.out.print(","+aa[i]);
          }       
    }
}

