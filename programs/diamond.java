import java.util.*;
import java.io.*;
class diamond
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        int n=0;
        do
        {
            System.out.print("Enter no. of rows: ");
            n=sc.nextInt();
        }while(n<3 || n>12);
        System.out.print("Enter character you want: ");
        char c=dis.readLine().charAt(0);
        for(int i=1,sp=n-1; i<=n;i++,sp--)
        {
            for(int k=sp;k>=0;k--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(c+" ");
            System.out.println();
        }
        for(int i=(n-1),sp=1; i>=1;i--,sp++)
        {

            for(int k=sp;k>=0;k--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(c+" ");
            System.out.println();
        }

    }
}
