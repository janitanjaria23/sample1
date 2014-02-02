import java.util.*;

class triangle90{
    public static void main(String args[])
    {
        int r= 0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter r:");
            r=sc.nextInt();
            }while(r<6 || r>24);
         for(int i=1;i<r+1;++i)
         {
          for(int j=1;j<i+1;++j)
            System.out.print("* ");
            System.out.println(" ");
            }
            }}

