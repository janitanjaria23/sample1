import java.util.*;
import java.io.*;
class itemw
{
    public static void main(String args[])throws IOException
    {
        int qoh=0,ctr=1,rol=0,roq=0;
        double p=0;
        String n="",d="",ino="";
        char c=' ';
        FileOutputStream fos=new FileOutputStream("item.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        DataInputStream dis=new DataInputStream(System.in);
        StringTokenizer st;
        while(true)
        {
            System.out.print("Item no: ");
            ino=dis.readLine().trim();
            dos.writeUTF(ino);
            System.out.print("Description: ");
            d=dis.readLine().trim();
            st=new StringTokenizer(d," ");
            n=st.nextToken();
            while(st.hasMoreTokens())
            {
                n=n+"_"+st.nextToken();
            }
            dos.writeUTF(n);
            System.out.print("QOH: ");
            qoh=Integer.parseInt(dis.readLine());
            dos.writeUTF(String.valueOf(qoh));
            System.out.print("Price: ");
            =Double.parseDouble(dis.readLine());
            dos.writeUTF(String.valueOf(qoh));
            System.out.print("QOH: ");
            qoh=Integer.parseInt(dis.readLine());
            dos.writeUTF(String.valueOf(qoh));
            System.out.print("QOH: ");
            qoh=Integer.parseInt(dis.readLine());
            dos.writeUTF(String.valueOf(qoh));



            System.out.print("Do u have any more records: ");
            c=dis.readLine().charAt(0);
            dos.writeUTF("\n");
            nn="";
            if(c=='n')
                break;
        }
        dos.close();
        bos.close();
        fos.close();
   }
}
