import java.util.*;

class sincos
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double h=0, b=0, p=0, sin=0, cos=0;
        System.out.print("Enter hypo: ");
        h=sc.nextDouble();
        System.out.print("Enter side: ");
        b=sc.nextDouble();
        System.out.print("Enter side: ");
        p=sc.nextDouble();
        sin=p/h;
        sin*=sin;
        cos=b/h;
        cos=cos*cos;
        System.out.println("Sin^2 + cos^2= "+(sin+cos));
    }
}











