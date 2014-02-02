import java.util.*;
class descending
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float a=0, b=0, c=0;
		System.out.print("Enter 1st no: ");
		a=sc.nextFloat();
		System.out.print("Enter 2nd no: ");
		b=sc.nextFloat();		
		System.out.print("Enter 3rd no: ");
		c=sc.nextFloat();
		if(a>b)
			if(a>c)
				if(b>c)
                    System.out.println(a+" > " +b+ " > " +c);
                else if(b==c)
                    System.out.println(a+ " > " +b+ " = " +c);
					else
                        System.out.println(a+ " > " +c+ " > " +b);
			else if(a==c)
                System.out.println(a+ " = " +c+ " > " +b);
				else
                    System.out.println(c+ " > " +a+ " > " +b);   
		else if(a==b)
			if(a>c)
                System.out.println(a+ " = " +b+ " > " +c);   
			else if(a==c)
                System.out.println(a+ " = " +b+ " = " +c);
				else
                    System.out.println(c+ " > " +a+ " = " +b);
			else if(a==c)
                System.out.println(b+ " > " +a+ " = " +c);
				else if(b>c)
                    System.out.println(b+ " > " +a+ " > " +c);
					else if(b==c)
                        System.out.println(b+ " = " +c+ " > " +a);
						else
                            System.out.println(c+ " > " +b+ " > " +a);                                            
	}
}
	               
