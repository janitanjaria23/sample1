import java.util.*;
class clock
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int h=0,m=0,s=0;
        do
        {
            System.out.print("Enter the hours: ");
            h=sc.nextInt();
            System.out.print("Enter the minutes: ");
            m=sc.nextInt();
        }while(h<0 || h>23 || m>60 ||m<0) ;
        for(;;s++)
        {
            if(h<9)
                System.out.print("0"+h+":");
            else
                System.out.print(h+":");
            if(m<=9)
            System.out.print(0);
            System.out.print(m+":");
            if(s<=9)
            System.out.print(0);
            System.out.print(s);
            Thread.sleep(999);
            if(s==60)
            {
                s=0;
                m++;
            }
            if(m==60)
            {
                m=0;
                h++;
            }
            if(h==24)
            h=0;
            for(int i=0;i<=50;i++)
                System.out.println();
       }}}
