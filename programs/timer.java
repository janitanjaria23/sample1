import java.util.*;
import java.io.*;
class timer
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        int c=0;
        do
        {
        System.out.println("    TIMER");
        System.out.println();
        System.out.println("1. Stop Watch");
        System.out.println("2. Count Down");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        c=sc.nextInt();
        if(c==1)
          {
          char sp=' ';
          int l=0,o=0,n=0;
          System.out.print("Enter minutes: ");
          l=sc.nextInt();
          System.out.print("Enter seconds: ");
          o=sc.nextInt();
          System.out.print("Enter micro seconds: ");
          n=sc.nextInt();          
          System.out.print("Press alphabet 's' to start ");
          sp=dis.readLine().charAt(0);
          int i=0;
          if(sp=='s' || sp=='S')
            {
            for(int m=0,s=0,cms=0;;cms++)
               {
               if(cms==100)
                  {
                  cms=0;
                  s++;
                  }
               if(s==60)
                 {
                 s=0;
                 m++;
                 }
               Thread.sleep(10);
               if(cms%10==0)
                 {
                 System.out.println(m+":"+s+":"+cms);
                 }
               if(m==l && s==o && cms==n)
                 break;              
               }
            System.out.print((char)7);
            System.out.print((char)7);
            }
          }
        else if(c==2)
               {
               int m=0,s=0,x=0;               
               System.out.println();
               System.out.print("Enter no of minutes: ");
               m=sc.nextInt();
               System.out.print("Enter no of seconds: ");
               s=sc.nextInt();
               for( ;;)
                  {
                  s--;
                  if(s<0)
                     {
                     m--;
                     s=59;
                     }
                  Thread.sleep(1000);
                  System.out.println(m+":"+s);
                  if(m==0)
                    break;
                  }
               m=x;
               s--;
               for(;m==0 && s!=0;s--)
                    {
                    Thread.sleep(1000);
                    System.out.println(m+":"+s);
                    if(s<10)
                       System.out.print((char)(7));
                    }
               for(int i=0;i<=20;i++)
                  System.out.print((char)(7));
               }
             else if(c!=3)
                      {
                      System.out.print(" Lunatic user has entered a wrong choice");
                      }
        }while(c!=3);
    }
}
