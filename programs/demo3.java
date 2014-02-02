import java.util.*;
class demo3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[6];
        System.out.println((int)'A');
        System.out.println((int)'a');
        System.out.println((int)'Z');
        System.out.println((int)'z');
        for(int i=0;i<5;i++);;
        {
            System.out.println((int)'Z');System.out.println((int)'z');
        }
        for(int i=0;i<6;i++)
        {
            System.out.print("a["+i+"]= ");
            a[i]=sc.nextInt();
        }
        int t=0;
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<6;j++)
                if(a[i]>a[j])
                {
                    t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
        }
        for(int i=0;i<6;i++)
        {
            System.out.print("a["+i+"]= "+a[i]);
            System.out.println();
        }
    }
}
