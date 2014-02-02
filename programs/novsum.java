import java.io.*;
class novsum
{
     public static void main(String args[])throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.println("Enter 2 no.'s: ");
        System.out.println(Integer.parseInt(dis.readLine())+Integer.parseInt(dis.readLine()));
    }
}
