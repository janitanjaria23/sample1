import java.io.*;
class demo_1
{
    public static void main(String args[])throws Exception
    {
        FileReader fr=new FileReader("master.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        int to=st.nextToken();
        while(to!=-1)
        {
            System.out.println(to);
            to=st.nextToken();
        }
    }
}
