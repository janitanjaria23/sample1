import java.util.*;
class mandeep
{
    public static void main(String abc[])
   {
       Scanner sc=new Scanner(System.in);
        byte a=0;

          System.out.print("enter your age:");
            a=sc.nextByte();
            if(a<18)
                System.out.println("not eligible for driving");
            else
                System.out.println("eligible for driving");
        
   }
}
