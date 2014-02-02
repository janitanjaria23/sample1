import java.util.*;
class xn
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        double n1=0;
        System.out.print("Enter the no: ");
        double n=sc.nextByte();
        System.out.print("Enter the power: ");
        double x=sc.nextByte();
        n1=n;
        for(double ctr=1;ctr<x; ctr++)
        {
            n*=n1;
        }
        System.out.println(n);
    }
}
