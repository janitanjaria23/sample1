import java.util.*;
class fibbo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the length: ");
        int n=sc.nextInt();
        int a=1,b=1,c=a+b;
        System.out.print(a+" "+b+" ");
        a=b;b=c;
        for(int i=3;i<=n;i++,c=a+b,a=b,b=c)
            System.out.print(c+" ");
    }
}
