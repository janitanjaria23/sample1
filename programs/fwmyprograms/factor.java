import java.util.Scanner;
class factor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=1, p=2, a1=0, x=1;
        System.out.print("Enter the no: ");
        int a=sc.nextInt();
        a1=a;
        do
        {
            for(int ctr=2; ctr<=p; ctr++)
            {
                if(p%ctr==0)
                    x++;
            }
            if(x==2)
                if(a%p==0)
                {
                    f*=p;
                    a/=p;
                    x=1;
                    if(p<a1)
                        System.out.print(p+" * ");
                    else
                        System.out.print(" = "+p);
                }
                else
                {
                    p++;
                    x=1;
                }
            else
            {
                p++;
                x=1;
            }
        }while(p<a1);
        System.out.println(f);
    }
}


