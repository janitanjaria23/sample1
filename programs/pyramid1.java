import java.util.*;

class pyramid1{
    public static void main(String args[])
    {
        int r= 0,sp;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter r:");
            r=sc.nextInt();
            }while(r<6 || r>24);
         sp=r-1;
         for(int i=1;i<r+1;++i)
         {
          for(int j=1;j<sp+1;++j)
            System.out.print(" ");
          for(int j=1;j<i+1;++j)
            System.out.print("* ");
            sp--;
            System.out.println(" ");
            }
            }}

