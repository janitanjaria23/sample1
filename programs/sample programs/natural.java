import java.util.*;

class natural
{
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        int n=0,s=0,n1=0;
        do
        {
            System.out.print("enter number: ");
            n1=sc.nextInt();
        }while(n1<5 || n1>50);
        while(n!=n1)
        {
        n++;
        s+=n;
        }
         System.out.println(s);
     }
}
