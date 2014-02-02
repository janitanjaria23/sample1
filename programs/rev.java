import java.util.*;
class rev
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any no. : ");
        int n=sc.nextInt();
        System.out.println("The rev of "+n+" is "+(n%10*10+n/10));
    }
}

