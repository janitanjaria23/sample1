import java.util.*;
class ascii
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int l=sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int u=sc.nextInt();
        for(int i=l;i<u;i++)
        {
            System.out.print(i+" "+(char)i+"\t");
            Thread.sleep(1000);
        }
     }
}
