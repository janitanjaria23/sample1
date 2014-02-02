import java.util.*;
class ascending
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double min=0,a=0,b=0,c=0,max=0,inter=0;
        System.out.print("enter number: ");
        a=sc.nextDouble();
        System.out.print("enter second number: ");
        b=sc.nextDouble();
        System.out.print("enter third number: ");
        c=sc.nextDouble();
        if(a>b)
          {
            min=b;
            max=a;
          }
        else
          {
            min=a;
            max=b;
          }
        if(min>c)
           {
            inter=min;
            min=c;
           }
            
         else 
         	inter=c;
            
        System.out.println("1st no."+min);
        if(max>inter)
           {
             System.out.println("2nd no."+inter);
             System.out.println("3rd no."+max);
           }

         else
           {
            System.out.println("2nd no."+max);
            System.out.println("3rd no."+inter);
           }
        }
}




            

