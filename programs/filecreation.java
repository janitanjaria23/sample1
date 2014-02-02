import java.io.*;
class filecreation
{
    public static void main(String args[])throws IOException
    {
        FileOutputStream fos=new FileOutputStream("Emp.dat");
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ctr=0,e=0,b=0,n=0;
        String name="";
        System.out.println("Enter total no. :");
        n=Integer.parseInt(br.readLine());
        while(ctr<n)
        {
            System.out.print("Enter Enrolment No.: ");
            e=Integer.parseInt(br.readLine());
            dos.writeInt(e);
            System.out.println();
            System.out.print("Enter Name: ");
            name=br.readLine();
            dos.writeUTF(name);
            System.out.println();
            System.out.print("Enter Basic Salary.: ");
            b=Integer.parseInt(br.readLine());
            dos.writeInt(b);
            ctr++;
        }
        bos.close();
        fos.close();
        dos.close();
    }
}
