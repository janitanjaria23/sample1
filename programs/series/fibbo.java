import java.util.*;
class fibbo
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                int c=0, a=1, b=0, ctr=1;
                System.out.print("Enter the no. of terms: ");
                int n=sc.nextInt();
                do
                {
                        c=a+b;
                        b=a;
                        a=c;
                        ctr++;
                        System.out.print(c+", ");

                }while(ctr!=n);
                c=a+b;
                System.out.print(c+".");
                }
                }
