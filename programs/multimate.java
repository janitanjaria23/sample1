import java.util.*;
class multimate
{
    public static void main(String args[])throws Exception
    {
    Random ran=new Random();
    int a[][]=new int[60][80];
    int n=0;
    float f=0;
    for(;;)
    {
      for(int i=0;i<60;i++)
         {
         for(int j=0;j<80;j++)
            a[i][j]=0;
         }

        do
        {
            f=ran.nextFloat();
            n=(int)(f*30);
        }while(n<12 || n>25);
        System.out.println(n);

    int v[]=new int[n];
    for(int i=0,ch=0;i<n;i++)
       {
        do
        {
          do
          {
             f=ran.nextFloat();
             v[i]=(int)(f*80);
          }while(v[i]<0 || v[i]>79);
         ch=0;
         for(int z=0;z<i;z++)
         {
                if(v[i]==v[z])
                    ch=1;
                else if(v[i]==(v[z]+1))
                    ch=1;
                else if(v[i]==(v[z]-1))
                    ch=1;

         }
        }while(ch==1);
       }
    /* arrangin that array in ascending order
       
     for(int i=0;i<n;i++)
       {
       for(int k=0,m=0,j=n-1;k<n-1;k++,j--)
          {
          if(v[j]<v[j-1])
            {
            m=v[j];
            v[j]=v[j-1];
            v[j-1]=m;
            }
          }
       }*/
     int x=0,y=0;
     int ctr=0;
     int xx=0;

     for(int i=0;i<n;i++)
        {
          do
          {
             f=ran.nextFloat();
             x=(int)(f*50);
          }while(x<0 || x>50);
          xx=x;
          do
          {
             f=ran.nextFloat();
             y=(int)(f*60);
             xx=0;
             if(x>=y)
                xx=60;
          }while(xx==60 || y>79);
          int t=0;
          for(int m=0;m<80;m++)
             {
             if(m==v[i])
               {
               for(int k=0;k<60;k++)
                  {
                  if(k>x && k<y)
                   {
                   do
                    {
                      ctr=0;
                      f=ran.nextFloat();
                     
                     f*=200;
                     t=(int)(f);
                     if(t>47 && t<58)
                       ctr++;
                     else if(t>64 && t<91)
                       ctr++;
                     else if(t>96 && t<124)
                       ctr++;
                    }while(ctr==0);
                   a[k][m]=t;
                   }
                  }
               }
             }
        }

      for(int i=0;i<60;i++)
         {
         for(int j=0;j<80;j++)
            {
             if(a[i][j]>0)
              System.out.print(a[i][j]%10);
             else
              System.out.print(" ");
            }
         System.out.println();
         Thread.sleep(100);
         }
    }
  }
}
