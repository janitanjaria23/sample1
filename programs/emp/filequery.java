import java.io.*;
import java.util.*;
class filequery
{
    filequery()throws IOException
    {
        int b=0,ctr=1,z=0;
        String n="",nn="",eno="";
        FileReader fr=new FileReader("emp.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        int tok=st.nextToken();
        StringTokenizer stt;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter emp no. :");
        String eno1=br.readLine().trim();
        while(tok!=-1)
        {
            switch(tok)
            {
                case -3:
                {
                    if(ctr==1)
                    { eno=st.sval;
                        ctr++;
                            break;
                    }
                    else
                    {
                      ctr=1;
                      n=st.sval; stt=new StringTokenizer(n,"_");
                        while(stt.hasMoreTokens())
                        {
                            nn=nn+stt.nextToken()+" ";
                        }
                    }
                    break;
                }
                case -2:{ 
                        b=(int)st.nval;
                         break;
                     }
                case 10:{
                            if(eno.equalsIgnoreCase(eno1))                          
                            {
                                System.out.println(eno+"\t"+nn+"\t"+b);nn="";n="";
                                z++;
                            }
          }              }
          tok=st.nextToken();
          }
          if(z==0)
            System.out.println("Record not found");
     }
}
