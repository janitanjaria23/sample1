import java.io.*;
class fieldcount
{
    int count()throws IOException
    {
        int b=0,ctr=0;
        String n="",nn="",eno="";
        FileReader fr=new FileReader("emp.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        int tok=st.nextToken();
        while(tok!=-1)
        {
            switch(tok)
            {
                case 10:{
                            ctr++;
                        }
            }
          tok=st.nextToken();
          }
        fr.close();

          return ctr;
     }
}
