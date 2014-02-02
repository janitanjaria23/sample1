import java.util.*;
class bank
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double p=0,t=0,ta=0;
        System.out.print("enter principle amount: ");
        p=sc.nextDouble();
        System.out.print("time: ");
        t=sc.nextDouble();
        if(p<2000 && t>=2 && t<5)
            ta=p*t*0.05;
        else if(p>2000 && p<6000 && t>=2 && t<5)
            ta=0.07*p*t;
        else if(p>6000 && t>=1 && t<5)
            ta=0.08*p*t;
        else if(t>=5)
            ta=0.1*t*p;
        else if ta=0.03*p*t;
        	 System.out.println("Total Amount"+(ta+p));

    }
        
}

     
