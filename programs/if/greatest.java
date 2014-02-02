import java.util.Scanner;
class greatest
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a=0,b=0,c=0;
        System.out.print("Enter 1st no: ");
        a=sc.nextFloat();
        System.out.print("Enter 2nd no: ");
        b=sc.nextFloat();
        System.out.print("Enter 3rd no: ");
        c=sc.nextFloat();
        if(a>b)
            if(a>c)
                System.out.println("Greatest Number = "+a);
            else
                System.out.println("Greatest Number = "+c);
        else if(b>c)
            System.out.println("Greatest Number = "+b);
             else
                System.out.println("Greatest Number = "+c);



            if(a>b)
                if(b>c)
                    System.out.println("Lowest Number = "+c);
                else
                    System.out.println("Lowest Number = "+b);
            else if(a>c)
                System.out.println("Lowest Number = "+c);
                 else
                    System.out.println("Lowest Number = "+a);
    }
}                    
                

