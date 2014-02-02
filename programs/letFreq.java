import java.io.*;
class letFreq
{
    public static void main(String args[])throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        System.out.print("Enter any Sentence:");
        String s=dis.readLine().trim();
        char c=' ';
        int ctr=0;

        for(int i=0;i<s.length();i++,ctr=0)
        {
            for(int j=0;j<s.length();j++)
                if(s.charAt(i)!='~')
                    if(s.charAt(i)==s.charAt(j))
                        ctr++;
            if(s.charAt(i)==' ')
                System.out.println("Spaces\t"+ctr);
            if(s.charAt(i)!='~' && s.charAt(i)!=' ')
                System.out.println(s.charAt(i)+"\t"+ctr);
            s=s.replace(s.charAt(i),'~');
                
        }
    }
}
