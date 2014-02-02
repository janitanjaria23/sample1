import java.util.*;
class stc
{
    public static void main(String rgs[])throws Exception
    {
                Date da=new Date();
                String s=da.toString();
                s=s.substring(4,7)+"0a"+s.substring(8,10)+"0a"+s.substring(24);
        StringTokenizer st=new StringTokenizer(s,"0a",true);
        while(st.hasMoreTokens())
            System.out.println(st.nextToken());
    }
}
