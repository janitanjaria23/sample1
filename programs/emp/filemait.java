import java.io.*;
import java.util.*;
class filemait
{
    public static void main(String args[])throws IOException
    {
        filemod mod;
        fileenhance enhance;
        filequery query;
        filedel del;

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c=' ';
        for(;;)
        {
            System.out.println("\t\t\tFILE MAINTANENCE");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("a) Enhance");
            System.out.println("b) Delete record");
            System.out.println("c) Query");
            System.out.println("d) Modify");
            System.out.println("e) Quit");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            System.out.print("Enter your choice:");
            c=br.readLine().charAt(0);

            if(c=='a')
                enhance=new fileenhance();    
            else if(c=='b')
                del=new filedel();
            else if(c=='c')
                query=new filequery();
            else if(c=='d')
                mod=new filemod();
            else if(c=='e')
                System.exit(0);

               for(int i=0;i<=40;i++)
               System.out.println();
            }
         }
     }

