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
     double a=0,b=0,x=0;
     byte n=0;
     System.out.print("Enter your choice: ");
     n=sc.nextByte();
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
                        System.out.print("Enter Divident: ");
                        a=sc.nextDouble();
                        System.out.print("Enter Diviser: ");
                        b=sc.nextDouble();
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
     }                      
}        
       

