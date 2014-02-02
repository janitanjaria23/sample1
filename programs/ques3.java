import java.io.*;
class ques3
{
    public static void main(String args[]) throws Exception{
    {
        DataInputStream dis=new DataInputStream(System.in);
        int a=0, b=0;
        System.out.print("a: ");
        a=Integer.parseInt(dis.readLine());
        b=a-1;
        for(int i=0; i<a ; i++)
        {
            for(int j=0; j<b; j++)
                System.out.print(" ");

            for(int j=0; j<=i; j++)
                System.out.print("a"+" ");
            b--;
            System.out.println();
        }
        b=1; a=a-1;

        for(int i=a i>=0; i--)
        {
            for(int j=0; j<b; j++)
                System.out.print(" ");

            for(int j=0; j<i; j++)
                System.out.print("a"+" ");

            b++;
            System.out.println();
        }
    }
}
