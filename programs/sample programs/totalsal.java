import java.util.*;
class totalsal
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double b=0,va=0,ts=0;
        System.out.print("enter salary: ");
        b=sc.nextDouble();
        if(b>25000)
         va=(0.25*b);
        else if(b>15000)
            va=(0.15*b);
        else if(b>10000)
            va=(0.07*6);
        else
            va=0;
        ts=(b+va);
        System.out.println("total salary for the basic salary "+b+" vehicle allowance "+va+"= "+ts);
    }
}

            

