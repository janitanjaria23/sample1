import java.util.*;
class NoFactor
{
        public static void main(String args[])
        {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter no:");
                int n=sc.nextInt();
                        System.out.print(n +  "=");

                        for(int y=1;y<=n;++y)
                           {     if(n%y==0)
                                System.out.print(" "+y);
                            }
                                System.out.println();

                            }}
