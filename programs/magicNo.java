import java.util.*;
class magicNo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter any no.: ");
        int n=sc.nextInt();
        int n1=0;
        while(n>9)
        {
            n1+=n%10;
            n=n/10;
        }
        n1+=n;
        if(n1==1)
            System.out.println("magic no.");
        else
            System.out.println("not magic no.");
    }
}

