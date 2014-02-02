import java.io.*;
class binarysys
{
    public static void main(String args[])throws Exception
    {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int ch=0;
    for(;;)
    {
    System.out.println();
    System.out.println();
    System.out.println("  MENU");
    System.out.println();
    System.out.println(" 1.ADD");
    System.out.println();
    System.out.println(" 2.SUBTRACT");
    System.out.println();
    System.out.println(" 3.EXIT");
    System.out.println();
    System.out.print(" Enter your choice: ");
    ch=Integer.parseInt(br.readLine());
    System.out.println();
    System.out.println();
    int a=0,b=0,n=0;
    if(ch==1)
      {
      System.out.println();
      System.out.print(" Enter the 1st number: ");
      a=Integer.parseInt(br.readLine());
      System.out.println();
      System.out.print(" Enter the 2nd number: ");
      b=Integer.parseInt(br.readLine());
      if(b>a)
        {
        int c=b;
        b=a;
        a=c;
        }
      while(Math.pow(2,n)<a)
             {
             n++;
             }
        n++;
        int aa[]=new int[n];
        int sum[]=new int[n];
        int bb[]=new int[n];
        int bor[]=new int[n];
        for(int q=a,z=n-1;q!=0;z--)
           {
           aa[z]=q%2;
           q/=2;
           }

        for(int q=b,z=n-1;q!=0;z--)
           {
           bb[z]=q%2;
           q/=2;
           }
           System.out.println();
        for(int z=0;z<n;z++)
           {
           System.out.println();
           }
       

       for(int z=n-1;z>-1;z--)
          {
          if(bor[z]==0 && aa[z]==0)
            sum[z]=0;
          else if(bor[z]==0 && aa[z]==1)
            sum[z]=1;
          else if(bor[z]==1 && aa[z]==0)
            sum[z]=1;
          else if(bor[z]==1 && aa[z]==1)
            sum[z]=10;

          if(sum[z]==0 && bb[z]==0)
            sum[z]=0;
          else if(sum[z]==0 && bb[z]==1)
            sum[z]=1;
          else if(sum[z]==1 && bb[z]==0)
            sum[z]=1;
          else if(sum[z]==1 && bb[z]==1)
            {
            if(z!=0)
              {
              sum[z]=0;
              bor[z-1]=1;
              }
            else
              sum[z]=10;
            }
          else if(sum[z]==10 && bb[z]==0)
            {
            if(z!=0)
              {
              sum[z]=0;
              bor[z-1]=1;
              }
            else
              sum[z]=10;
            }
          else if(sum[z]==10 && bb[z]==1)
            {
            if(z!=0)
              {
              sum[z]=1;
              bor[z-1]=1;
              }
            else
              sum[z]=11;
            }
          }
       System.out.println();
       for(int m=0;m<n;m++)
          {
          System.out.print(bor[m]+"  ");
          }       
       System.out.println();
       for(int m=0;m<n;m++)
          {
          System.out.print(aa[m]+"  ");
          }                        
       System.out.println();
       System.out.print("+");
       System.out.println();
       for(int m=0;m<n;m++)
          {
          System.out.print(bb[m]+"  ");
          }       
       System.out.println();
       System.out.print("--------------------------");
       System.out.println();
       for(int m=0;m<n;m++)
          {
          if(sum[m]<10)
            System.out.print(sum[m]+"  ");
          else
            System.out.print(sum[m]+" ");

          }


        double sum1=0;
        for(int z=0,zz=n-1;zz>-1;z++,zz--)
           {
           if(zz!=0)
             sum1+=Math.pow(2,z)*sum[zz];
           else
             {
             if(sum[zz]==10)
               sum1+=Math.pow(2,z+1);
             else if(sum[zz]==11)
               sum1+=Math.pow(2,z)+Math.pow(2,z+1);
             else if(sum[zz]==1)
               sum1+=Math.pow(2,z);
             break;
             }
           }
       System.out.println();
       System.out.println();
       System.out.println();
       System.out.println("         The  sum is : "+sum1);
       System.out.println();


      }
    else if(ch==2)
           {
            do
            {
            System.out.println();
            System.out.println(" Enter the 1st number: ");
            a=Integer.parseInt(br.readLine());
            System.out.println();
            System.out.println(" Enter the 2nd number: ");
            b=Integer.parseInt(br.readLine());
            }while(a<b);



           }

    else if(ch==3)
           System.exit(0);

     }
    }
}
