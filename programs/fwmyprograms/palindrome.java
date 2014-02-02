import java.util.*;
class palindrome
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                long n1=0, d=1, r=0, p=10, s=0;
                System.out.print("Enter the no: ");
                long n=sc.nextLong();
                n1=n;
                do
                {
                        d*=10;
                }while(n/d!=0);
                do
                {
                        d/=10;
                        n=n/p;
                        r=n1-(n*p);
                        s=s+(r*d);
                        n1/=10;
                        
                }while(d!=0);
                System.out.println(s);
        }
}




