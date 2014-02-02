import java.util.*;
import java.io.*;
class fileenhance
{
    fileenhance()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream fos=new FileOutputStream("emp.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        char c=' ';int b=0,ctr=0;
        String n="",n1="",eno="";
        StringTokenizer srt;
        while (true)
        {
            System.out.print("Enter the emp no:- ");
            eno=br.readLine();
            dos.writeUTF(String.valueOf(eno));

            
            for(;;)
            {
                System.out.print("Enter the name:- ");
                n=br.readLine();
                for(int i=0;i<n.length();i++)
                {
                    c=n.charAt(i);
                    if(c>='0' && c<='9')
                        ctr=1;
                }
                if(ctr==1)
                    continue;
                break;
             }
             c=' ';
            srt=new StringTokenizer(n," ");
            n1=srt.nextToken();
            while(srt.hasMoreTokens())
               n1=n1+"_"+srt.nextToken();

            dos.writeUTF(n1);
            n1="";
            n="";
            System.out.print("Enter the bs:- ");
            b=Integer.parseInt(br.readLine());
            dos.writeUTF(String.valueOf(b));
            dos.writeUTF("\n");

            System.out.print("continue:- ");
            c=br.readLine().charAt(0);
            if(c=='n')
                break;
         }
         dos.close();
         bos.close();
         fos.close();

         filesort fs=new filesort();
         fs.sort();
     }
}
