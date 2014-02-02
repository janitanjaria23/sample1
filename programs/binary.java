import java.io.*;
class binary
{
	public static void main(String args[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		int n=0, r=0;
		String s="";
		System.out.print("Enter no. to be converted: ");
		n=Integer.parseInt(dis.readLine());
		while(true)
		{
			r=n%2;
			n=n/2;
			s=String.valueOf(r)+s;
			if(n==0)
				break;

		}
		System.out.println(s);

	}
}	