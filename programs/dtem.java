import java.io.*;
class dtem
{
    public static void main(String args[])throws Exception
    {
        System.out.println("thr");
        File f1=new File("master.dat");
        File f2=new File("master2.dat");

        f1.delete();

        f2.renameTo(f1);

        f2.delete();
        
    }
}
