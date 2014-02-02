import java.util.*;
class even
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                double a=0;
                System.out.print("Enter the no of terms: ");
                double n=sc.nextDouble();
                for(double ctr=1; ctr<n; ctr++)
                {
                        a+=2;
                        System.out.print(a+", ");
                }
                System.out.print((a+2)+" .");
         }
}
