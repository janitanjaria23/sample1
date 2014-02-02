import java.util.*;

class pyramid2{
    public static void main(String args[])
    {
        int r= 0,sp,e=1,d=0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter r:");
            r=sc.nextInt();
            }while(r<6 || r>24);
         sp=r-1;
         for(int i=1;i<r;++i)
         {
          for(int j=1;j<sp+1;++j)
            System.out.print(" ");
            System.out.print("*");
            for(int j=1;j<d;++j)
            System.out.print(" ");
            if(e>1)
            System.out.print("*");
            ++e;
            sp--;
            d++;
            d++;
            System.out.println(" ");
            }
            
            for(int t=1;t<r+1;++t)
            System.out.print("* ");
            
            }}

