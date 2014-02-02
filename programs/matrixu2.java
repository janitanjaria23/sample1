import java.util.*;
class matrixu2
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


     int x=0,y=0;
     int ctr=0;
     int xx=0;

     for(int i=0;i<n;i++)
        {
          do
          {
             f=ran.nextFloat();
             x=(int)(f*50);
          }while(x<0);
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
               for(int k=0;k<60;k++)
                  {
                  if(k>x && k<y)
                   {
                   
                      f=ran.nextFloat();
                     
                     f*=200;
                     t=(int)(f);
                    
                   a[k][m]=t;
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
