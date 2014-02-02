import java.util.*;
class reverse
{
    public static void main(String abc[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter no:");
        int a=sc.nextInt();
        if(a>=10)
            if(a<=99)
            {
                System.out.print("reverse of"+a+"=");
                a=(a%10)*10+a/10;
                System.out.println(a);
             }
             else
                System.out.println(a+"is greater than 99");
         else
            System.out.println(a+"is less than 10");

     }
}
