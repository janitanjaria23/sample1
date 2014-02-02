import java.io.*;
class antibinary
{
	public static void main(String args[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		int n=0,r=0,p=0;
		double v=0;
		String s="";
		System.out.print("Enter binary code: ");
 		n=Integer.parseInt(dis.readLine());
 		while(true)
 		{
 			r=n%10;
 			n=n/10;
 			v=Math.pow(2,p)*r+v;
 			p++;
 			if(n==0)
 				break;
 		}
 		System.out.println(v);	                                  
	}
}