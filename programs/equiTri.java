import java.util.*;
import java.io.*;
class equiTri
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
        }while(n<3 || n>40);
        System.out.print("Enter character you want: ");
        char c=dis.readLine().charAt(0);
        for(int i=1,sp=35; i<=n;i++,sp--)
        {
            for(int k=sp;k>=0;k--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(c+" ");
            System.out.println();
        }

    }
}
