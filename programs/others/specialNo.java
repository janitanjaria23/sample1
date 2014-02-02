import java.util.Scanner;
class specialNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=1;
        System.out.print("Enter the no: ");
        int a=sc.nextInt();
        for(int ctr=2; ctr<a; ctr++)
        {
            if(a%ctr==0)
                f+=ctr;
        }
        if(f==a)
            System.out.println("Special number");
        else
            System.out.println("Not a special number");
    }
}
