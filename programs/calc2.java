import java.io.*;
import java.util.*;
class calc2
{
    public static void main(String args[])throws Exception
    {
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        String s="";
        double a=0,b=0,c=0;
        System.out.print("Enter the no.: ");
        a=sc.nextDouble();
        System.out.println("Enter the sign: ");
        System.out.println("+ - add ");
        System.out.println("- - subtract");
        System.out.println("* - multiply ");
        System.out.println("/ - divide ");
        System.out.println("sq - square ");
        System.out.println("sqrt - squareroot");
        System.out.println("pow - any power");
        System.out.println("sin - sine of angle");
        System.out.println("cos - cosine of angle");
        System.out.println("tan - tan of angle");
        System.out.println("cosec - cosecant of angle");
        System.out.println("sec - secant of angle");
        System.out.println("cot - cot of angle");
        s=dis.readLine();
                if(s.equals("+"))
                {
                System.out.print("Enter other no.: ");
                b=sc.nextDouble();
                c=a+b;
                System.out.print(c);
                }
                else if(s.equals("-"))
                {
                System.out.print("Enter other no.: ");
                b=sc.nextDouble();
                c=a-b;
                System.out.print(c);
                }
                else if(s.equals("/"))
                {
                System.out.print("Enter other no.: ");
                b=sc.nextDouble();
                c=a/b;
                System.out.print(c);
                }
                else if(s.equals("*"))
                {
                System.out.print("Enter other no.: ");
                b=sc.nextDouble();
                c=a*b;
                System.out.print(c);
                }
                else if(s.equals("sq"))
                {
                c=a*a;
                
                System.out.print(c);
                }
                else if(s.equals("sqrt"))
                {
                          
                c=Math.sqrt(a);
                System.out.print(c);
                }
                else if(s.equals("pow"))
                {
                System.out.print("Enter power: ");       
                b=sc.nextDouble();
                c=Math.pow(a,b);
                System.out.print(c);
                }
                else if(s.equals("sin"))
                {
                a=(a*22/7)/180;
                c=Math.sin(a);
                System.out.print(c);
                }
                else if(s.equals("cos"))
                {
                a=(a*22/7)/180;
                c=Math.cos(a);
                System.out.print(c);
                }
                else if(s.equals("tan"))
                {
                a=(a*22/7)/180;
                c=Math.tan(a);
                System.out.print(c);
                }
                else if(s.equals("cot"))
                {
                a=(a*22/7)/180;
                c=Math.tan(a);
                c=1/c;
                System.out.print(c);
                }
                else if(s.equals("cosec"))
                {
                a=(a*22/7)/180;
                c=Math.sin(a);
                c=1/c;
                System.out.print(c);
                }
                else if(s.equals("sec"))
                {
                a=(a*22/7)/180;
                c=Math.cos(a);
                c=1/c;
                System.out.print(c);
                }


    }

}
   
