import java.util.Scanner;
class clock
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);		
		byte h=0, m=0, s=0, ms=0;
		while(h<=23)
		{
			System.out.println(h+": "+m+": "+s+": "+ms+": ");
			Thread.sleep(10);
			ms++;
			if(ms==100)
			{
				ms=0;
				s++;
			}
			if(s==60)
			{	
				m++;
				s=0;
			}
			if(m==60)
			{
				m=0;
				h++;
			}	
		}		
	}
}
/*System.out.print("Enter hour: ");
		byte h=sc.nextByte();
		System.out.print("Enter minutes: ");
		byte m=sc.nextByte();
		System.out.print("Enter seconds: ");
		byte s=sc.nextByte();
 */