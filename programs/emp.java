import java.io.*;
class emp
{
    public static void main(String args[])throws Exception
    {
        FileOutputStream fos=new FileOutputStream("emp.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        /*
        dos.writeUTF("e001");
        dos.writeUTF("abc");
        dos.writeUTF("1000");
        dos.writeUTF("\n");
        dos.writeUTF("e002");
        dos.writeUTF("abc");
        dos.writeUTF("10000");
        dos.writeUTF("\n");
        dos.writeUTF("e003");
        dos.writeUTF("asd");
        dos.writeUTF("100000");
        dos.writeUTF("\n");
        dos.close();bos.close();fos.close();

        */
        FileReader fr=new FileReader("emp2.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        int to=st.nextToken();
        dos.writeUTF(st.sval);
        to=st.nextToken();
        dos.writeUTF(st.sval);
        to=st.nextToken();
        System.out.println(to);
        dos.writeUTF(String.valueOf(st.nval));
        System.out.println(to);
        to=st.nextToken();
        to=st.nextToken();
        to=st.nextToken();
        to=st.nextToken();
        to=st.nextToken();
        to=st.nextToken();
        System.out.println(to);

        dos.writeUTF(st.sval);
        to=st.nextToken();
        dos.writeUTF(st.sval);
        to=st.nextToken();
        dos.writeUTF(String.valueOf(st.nval));
        to=st.nextToken();

        dos.close();bos.close();fos.close();fr.close();
        File f1=new File("emp2.dat");
        File f2=new File("emp.dat");
        f1.delete();
        System.out.println(f1.exists());
        System.out.println(f2.exists());

        f2.renameTo(f1);
        System.out.println(f1.exists());
        System.out.println(f2.exists());

        f2.delete();
        System.out.println(f1.exists());
        System.out.println(f2.exists());
        
    }
}
