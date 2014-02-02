import java.util.*;
class sal
{
    public static void main(String abs[])
    {
        Scanner sc=new Scanner(System.in);
       double ta=0,a=0;
        System.out.print("enter salary: ");
        a=sc.nextDouble();
        if(a>25000)
            ta=a+(a*0.25);
        else if(a>15000)
            ta=a+(a*0.15);
        else if(a>10000)
            ta=a+(a*0.07);
        else if(a<10000)
            ta=a+(a*0);

        System.out.println("total salary: "+ta);
     }
}
