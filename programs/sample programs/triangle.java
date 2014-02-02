import java.util.*;

class triangle
{
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
      int n=0,ctr=0,a=0;
        System.out.print("enter number of statements: ");
        n=sc.nextInt();
        while(ctr<=n)
        {
            while(ctr>a)
            {
                
              a+=1;
              System.out.print(a);
              
            }

            ctr++;
            a=0;
            System.out.println(" ");
          }
      }
 }
