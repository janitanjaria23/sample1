import java.io.*;
import java.util.*;
class age
{
    public static void main(String args[])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String m[]={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        System.out.println();System.out.println();System.out.println();
        System.out.println("Enter your Birthdate in following way:");
        System.out.print("Date: ");
        String d=br.readLine();
        System.out.print("Enter month in nos.: ");
        d+=" "+m[(Integer.parseInt(br.readLine()))-1];
        System.out.print("Year: ");
        d+=" "+br.readLine();
        System.out.println();System.out.println();System.out.println();
        Date q=new Date();
        String p=q.toString();
        p=p.substring(8,10)+" "+p.substring(4,7)+" "+p.substring(24);
        System.out.println("Today's Date is "+p);
        System.out.println();System.out.println();
        System.out.print("Your Birthdate is "+d);
        System.out.println();System.out.println();

    }
}
