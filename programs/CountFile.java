import java.io.*;
class CountFile
{
    public static void main(String args[])
        throws Exception
        {
            int count=-2;
            InputStream is;

            if (args.length == 1)
                is = new FileInputStream(args[1]);
            else
                is = System.in;

            while (is.read() !=-1)
                count++;
            if(args.length == 1)
                System.out.println(args[0] + " has " + count + " chars.");
            else
                System.out.println("Input has" +count + " chars.");
         }}

