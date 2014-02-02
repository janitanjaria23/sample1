
import java.io.*;
class alphabet
{
    public static void main(String args[])throws Exception
    {
        char c=' ';
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print("Enter any character : ");
        c=dis.readLine().charAt(0);
        if(c>='a' && c<='z')
            System.out.println("lower case");
            else if(c>='A' && c<='Z')
                 System.out.println("upper case");
                 else
                 System.out.print("not alphabet");
    }
}
