import java.util.Scanner;
class leapYear
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        short y=0;
        System.out.print("Enter Year: ");
        y=sc.nextShort();
        if(y%4==0)
            if(y%100==0)
            	if(y%400==0)
            		System.out.println(y+" is a leap year");
 				else
 					System.out.println(y+" is not a leap year");
 			else		
 				System.out.println(y+" is a leap year");
 		else		
 			System.out.println(y+" is not a leap year");	           
    }
}
