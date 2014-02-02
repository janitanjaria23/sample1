import java.io.*;
import java.util.*;
class filemod
{
    filemod()throws IOException
    {
        int b=0,ctr=1,tok=0;
        String n="",eno="",eno1="";
       
        FileOutputStream fos=new FileOutputStream("emp1.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);

        FileReader fr=new FileReader("emp.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter emp no. :");
        eno1=br.readLine().trim();
        while((tok=st.nextToken())!=-1)
        {
            switch(tok)
            {
                case -3:{
                            if(ctr==1)
                          
                            {
                               eno=st.sval;
                               ctr++;
                            }
                            else
                            { 
                              ctr=1;
                                n=st.sval;
                            }
                             break;
                        }
                case -2:{ 
                                b=(int)st.nval;
                                break;
                             }
                case 10:{
                            if(eno1.equals(eno))
                                b+=1000;
                            dos.writeUTF(String.valueOf(eno).trim());
                            dos.writeUTF(n.trim());
                            dos.writeUTF(String.valueOf(b).trim());
                            dos.writeUTF(String.valueOf("\n"));
                            break;
                        }
          } }
          dos.close();
          bos.close();
          dos.close();
          fr.close();

          File f1=new File("emp.dat");
          File f2=new File("emp1.dat");

          f1.delete();
          f2.renameTo(f1);

          filesort fs=new filesort();
          fs.sort();

      
}
}
