import java.io.*;

class f
{
        public static void main(String args[])throws Exception
        {
                FileOutputStream fos=new FileOutputStream("Emp.dat");
                BufferedOutputStream bos=new BufferedOutputStream(fos);
                DataOutputStream dos=new DataOutputStream(bos);

                dos.writeInt(25);
                dos.writeUTF("oefdfg");
                dos.writeInt(52);

                dos.close();
                bos.close();
                fos.close();
        }
}
