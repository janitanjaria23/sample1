import java.util.Scanner;
class simpleInterest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float si=0,amt=0,p=0,r=0,t=0;

        System.out.print("Enter Principal: ");
        p=sc.nextFloat();

        System.out.print("Enter Rate: ");
        r=sc.nextFloat();

        System.out.print("Enter Time: ");
        t=sc.nextFloat();

        si=p*r*t/100;
        System.out.println("SImple Interest:Rs. "+si);
        amt=si+p;
        System.out.println("Amount:Rs. "+amt);
    }
}
