import java.io.*;
class fr
{
    public static void main(String args[])throws IOException
    {
        FileInputStream fis=new FileInputStream("Emp.dat");
        BufferedInputStream bis=new BufferedInputStream(fis);
        DataInputStream dis=new DataInputStream(bis);
        int ctr=0,b=0,e=0,l=fis.available();
        String name="";
        while(ctr<l)
        {
            e=dis.readInt();
            ctr+=4;
            name=dis.readUTF();
            ctr+=name.length();
            b=dis.readInt();
            ctr+=4;
            System.out.println(e+" "+name+" "+b);
        }
        dis.close();
        bis.close();
        fis.close();
    }
}
