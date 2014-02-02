import java.io.*;
class vowels
{
	public static void main(String abc[])throws Exception
	{
		char a=' ';
		DataInputStream dis= new DataInputStream(System.in);
		System.out.print("enter character: ");
		a=dis.readLine().charAt(0);
		if(a=='a' || a=='A')
		System.out.println("vowels");
	}
}