import java.util.*;
class getcal1
{
    public static void main(String args[])

    {
    Date d=new Date();
    String s=d.toString();
	s=s.substring(4,7)+"_"+s.substring(8,10)+"_"+s.substring(24);
	System.out.println(s);
    }
}
