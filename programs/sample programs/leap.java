import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int y=0;
        System.out.print("enter year: ");
        y =sc.nextInt();
        if(y%4==0)
            if(y%100==0)
                if(y%400==0)
                System.out.println(y+"is a leap year");
                else
                 System.out.println(y+"is not a leap year");
              else
                 System.out.println(y+"is a leap year");
           else
            System.out.println(y+"is not a leap year");
     }
}
