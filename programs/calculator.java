import java.util.*;
class calculator
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("1.Add");
     System.out.println("2.Substarct");
     System.out.println("3.Multiply");
     System.out.println("4.Divide");
     System.out.println("5.Square");
     System.out.println("6.Square root");
     System.out.println("7.sin of any angle");
     System.out.println("8.cos of any angle");
     System.out.println("9.tan of any angle");
     System.out.println("10.cosec of any angle");
     System.out.println("11.sec of any angle");
     System.out.println("12.cot of any angle");
     double a=0,b=0,x=0;
     short n=0;
     System.out.print("Enter your choice: ");
     n=sc.nextShort();
     if(n==1)
        {
         System.out.print("Enter 1 number: ");
         a=sc.nextDouble();
         System.out.print("Enter 2 number: ");
         b=sc.nextDouble();
         x=a+b;
         System.out.println("Sum: "+x);
        }
     else if(n==2)
             {
              System.out.print("Enter 1 number: ");
              a=sc.nextDouble();
              System.out.print("Enter 2 number: ");
              b=sc.nextDouble();
              x=a-b;
              System.out.println("Difference: "+x);
             }  
          else if(n==3)
                  {
                   System.out.print("Enter 1 number: ");
                   a=sc.nextDouble();
                   System.out.print("Enter 2 number: ");
                   b=sc.nextDouble();
                   x=a*b;
                   System.out.println("Product: "+x);
                  } 
               else if(n==4)
                       {
                        System.out.print("Enter Dividend: ");
                        b=sc.nextDouble();
                        System.out.print("Enter Divisor: ");
                        a=sc.nextDouble();
                        x=a/b;
                        System.out.println("quotiont: "+x);
                       }
                    else if(n==5)
                            {
                             System.out.print("Enter number: ");
                             a=sc.nextDouble();
                             x=a*a;
                             System.out.print("Square is: "+x);
                            }
                          else if(n==6)
                          {
                          System.out.print("Enter number: ");
                          a=sc.nextDouble();
                          System.out.print("The square root of "+a+" is ");
                          a=Math.sqrt(a);
                          System.out.print(a);
                          }
                          else if(n==7)
                          {
                          System.out.print("Enter the value of angle: ");
                          a=sc.nextDouble();
                          System.out.print("The sin of "+a+"=");
                          a=Math.sin(a);
                          System.out.println(a);
                          }
                          else                          
                          System.out.println("INVALID");
     }                      
}        
       

