import java.io.*;

class fr
{
        public static void main(String args[])throws Exception
        {
                FileInputStream fos=new FileInputStream("Emp.dat");
                BufferedInputStream bos=new BufferedInputStream(fos);
                DataInputStream dos=new DataInputStream(bos);

                System.out.println(dos.readInt()+" "+dos.readUTF()+" "+dos.readInt());

                dos.close();
                bos.close();
                fos.close();
        }
}
