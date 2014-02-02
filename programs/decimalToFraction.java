import java.util.*;
class decimalToFraction
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        double a=0;

        do
        {
            System.out.print("Enter a Decimal number:");
            a=sc.nextDouble();
        }while(a<0 || a>1);

        for(int z=0, x=1; x<=1000; x++)
        {
            for(int y=1; y<=1000; y++)
            {
                z=x/y;

                if(z==a)
                    System.out.print("The simplest form of the decimal you entered is :" +x+ " /" +y);

            }}}}



                

