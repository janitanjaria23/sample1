import java.io.*;
class antibinary2
{
	public static void main(String args[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		int n=0,r=0,p=0,ni=0,e=0;
		double v=0;
		String s="";
		System.out.print("Enter binary code: ");
 		n=Integer.parseInt(dis.readLine());
 		ni=n;
 		while(ni>0)
 		{
 			e=ni%10;
 			ni=ni/10;
 			if(e>1)
 			{
 				System.out.println("INVALID!!");
 				break;
 			}	
 		}
 		while(ni==0)
 		{		
 			while(true)
 			{
 				r=n%10;
 				n=n/10;
 				v=Math.pow(2,p)*r+v;
 				p++;
 				if(n==0)
 					break;
 			}
 			ni=8;
 		}
 		if(n==0)
			System.out.println(v);	                                  
	}
}
