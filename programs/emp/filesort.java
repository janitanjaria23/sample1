import java.io.*;
class filesort
{
    void sort()throws IOException
    {

        int b=0,ctr=1,fctr=0;
        String n="",nn="",eno="";

        fieldcount fc=new fieldcount();
        int no=fc.count();

        String e[]=new String[no];
        String nm[]=new String[no];
        int bs[]=new int[no];

        FileReader fr=new FileReader("emp.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);

        int tok=st.nextToken();
        while(tok!=-1)
        {
            switch(tok)
            {
                case -3:
                {
                    if(ctr==1)
                    { 
                      e[fctr]=st.sval;
                      ctr++;
                    }
                    else
                    {
                      ctr=1;
                      nm[fctr]=st.sval;
                    }
                    break;
                }
                case -2:{ 
                        bs[fctr]=(int)st.nval;
                         break;
                     }
                case 10:{}
                fctr++;
            }
          tok=st.nextToken();
          }
          String temp="";int tem=0;
          for(int i=0;i<no;i++)
            for(int j=0;j<no;j++)
            {
                if(e[i].compareTo(e[j])<0)
                {
                    temp=e[i];
                    e[i]=e[j];
                    e[j]=temp;

                    temp=nm[i];
                    nm[i]=nm[j];
                    nm[j]=temp;

                    tem=bs[i];
                    bs[i]=bs[j];
                    bs[j]=tem;
                 }
             }       
        for(int i=0;i<no;i++)
         System.out.println(e[i]);
        fr.close();
        FileOutputStream fos=new FileOutputStream("emp1.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        for(int i=0;i<no;i++)
        {
            dos.writeUTF(e[i]);
            dos.writeUTF(nm[i]);
            dos.writeUTF(String.valueOf(bs[i]));
            dos.writeUTF("\n");
        }
          dos.close();
          bos.close();
          dos.close();

          File f1=new File("emp.dat");
          File f2=new File("emp1.dat");

          f1.delete();
          f2.renameTo(f1);
         

     }
}
