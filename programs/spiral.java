import java.util.*;
class spiral
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
        System.out.println();
        System.out.print("Enter a number : ");
        n=sc.nextInt();
        }while(n<1 || n>28);
        int a[][]=new int[n][n];
        // Storing the values
        for(int i=0,cc=1,ctr=0,ctr1=n-1,j=0,k=0;i<(n*2);i++)
           {
           ctr++;
           if(ctr==1)
             {
             for(int aa=0;aa<ctr1;aa++,k++,cc++)
                {
                a[j][k]=cc;
                }
             }
           else if(ctr==2)
                  {
                  for(int aa=0;aa<ctr1;aa++,j++,cc++)
                     {
                     a[j][k]=cc;
                     }

                  }
                else if(ctr==3)
                       {
                       for(int aa=0;aa<ctr1;aa++,k--,cc++)
                          {
                          a[j][k]=cc;
                          }

                       }
                     else if(ctr==4)
                            {
                            for(int aa=0;aa<ctr1;aa++,j--,cc++)
                               {
                               a[j][k]=cc;
                               }
                            ctr=0;
                            j++;
                            k++;
                            ctr1-=2;
                            }

           }
        // printing the array
        System.out.println();
        if(n%2!=0)
          a[n/2][n/2]=n*n; 
        for(int i=0;i<n;i++)
           {
           for(int j=0;j<n;j++)
              {
               if(a[i][j]<10) 
                System.out.print("    "+a[i][j]);
               else if(a[i][j]<100) 
                          System.out.print("   "+a[i][j]);
                        else if(a[i][j]<1000)  
                                   System.out.print("  "+a[i][j]);                 
              }
           System.out.println();
           System.out.println();
           System.out.println();
           }
    }
}
