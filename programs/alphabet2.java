import java.io.*;
class alphabet2
{
    public static void main(String args[])throws Exception
    {
     char c=' ';
     DataInputStream dis=new DataInputStream(System.in);
     System.out.print("Enter alphabet: ");
     c=dis.readLine().charAt(0);
     if(c>='a' && c<='z')
       if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
         {
          System.out.println(c+"is lower case");
          System.out.println(c+"is a vowel");
         }
       else
          {
           System.out.println(c+"is lower case");
           System.out.println(c+"is a consonent");
          }
     else if(c>='A' && c<='Z')
                if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
                  {              
                   System.out.println(c+"is upper case");
                   System.out.println(c+"is a vowel");
                  }
                else
                  { 
                   System.out.println(c+"is upper case");
                   System.out.println(c+"is a consonent");
                  }
             else
                System.out.println(c+"is not a alphabet");
    }
}
