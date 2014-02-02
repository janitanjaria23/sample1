import java.util.Scanner;
class hcflcm
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                int f=1, m=1;
                System.out.print("Enter no.: ");
                int a=sc.nextInt();
                System.out.print("Enter no.: ");
                int b=sc.nextInt();
                
                for(int ctr=2; ctr<=a || ctr<=b;)
                {
                        if(a%ctr==0 || b%ctr==0)
                                if(b%ctr==0 && a%ctr==0)
                                {
                                        f*=ctr;
                                        m*=ctr;
                                        a/=ctr;
                                        b/=ctr;

                                }
                                else
                                {
                                        m*=ctr;
                                        ctr++;
                                }
                        else
                                ctr++;
                }
                System.out.println("HCF: "+f);
                System.out.println("LCM: "+m);
        }
}
