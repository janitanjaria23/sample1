import java.io.*;
class InfinityDataType
{
	String s;
	char c=' ';
	void input(String s1)
	{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>'9' && s1.charAt(i)<'0')
			{
				if(i==0)
				{
					
					if(s1.charAt(i)!='+' && s1.charAt(i)!='-')
					{
						System.out.println("NUMBER FORMATE EXCEPTION");
						System.exit(0);
					}
				}
				else
				{
					System.out.println("NUMBER FORMATE INVALID");
					System.exit(0);
				}
			}
		}
		if(s1.charAt(0)=='+' || s1.charAt(0)=='-')
		{
			c=s1.charAt(0);
			s1=s1.substring(1);
		}
		else
			c='+';
		
		while(s1.charAt(0)=='0' && s1.length()!=1)
		{
			s1=s1.substring(1);
		}
		s=s1;
	}
	void input()throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		String s="";
		input(s=dis.readLine().trim());
	}
	void print()
	{
		while(s.charAt(0)=='0' && s.length()!=1)
		{
			s=s.substring(1);
		}
		if(c=='-')
			System.out.print(c);
		System.out.print(s);
	}
	short[] StringToArray(String s)
	{
		while(s.charAt(0)=='0' && s.length()!=1)
		{
			s=s.substring(1);
		}
		short arr[]=new short[s.length()];
		for(int i=0;i<s.length();i++)
			arr[i]=Short.parseShort(String.valueOf(s.charAt(i)));
		return arr;
	}
	String ArrayToString(short arr[])
	{
		String s="";
		for(int i=0;i<arr.length;i++)
			s+=String.valueOf(arr[i]);
		while(s.charAt(0)=='0' && s.length()!=1)
		{
			s=s.substring(1);
		}
		return s;
	}
	InfinityDataType plus(InfinityDataType b)
	{
		InfinityDataType d=new InfinityDataType();
		InfinityDataType d1=new InfinityDataType();
		d1.s=s;
		d1.c=c;
		short a_arr[]=StringToArray(s);
		short b_arr[]=StringToArray(b.s);
		int a_length=a_arr.length;
		int b_length=b_arr.length;
		int x=0;
		if(a_arr.length>b_arr.length)
			x=a_arr.length;
		else
			x=b_arr.length;
		short d_arr[]=new short[x];
		if((c=='-' && b.c=='-')||(c=='+' && b.c=='+'))
		{
			if(a_length>b_length)
			{
				for(int ai=a_length-1,bi=b_length-1;ai>=0;ai--,bi--)
				{
					if(bi>=0)
						d_arr[ai]=(short)(a_arr[ai]+b_arr[bi]);
					else
						d_arr[ai]=a_arr[ai];
				}
			}
			else
			{
				for(int ai=a_length-1,bi=b_length-1;bi>=0;ai--,bi--)
				{
					if(ai>=0)
						d_arr[bi]=(short)(a_arr[ai]+b_arr[bi]);
					else
						d_arr[bi]=b_arr[bi];
				}
			}
			d.c=c;
		}
		else if(d1.GreaterThan(b))
		{
			for(int id=x-1,ia=a_length-1,ib=b_length-1;ia>=0;ib--,ia--,id--)
				if(ib>=0)
					d_arr[id]=(short)(a_arr[ia]-b_arr[ib]);
				else
					d_arr[id]=a_arr[ia];
			d.c=c;
		}
		else if(d1.LesserThan(b))
		{
			for(int id=x-1,ia=a_length-1,ib=b_length-1;ib>=0;ib--,ia--,id--)
				if(ia>=0)
					d_arr[id]=(short)(b_arr[ib]-a_arr[ia]);
				else
					d_arr[id]=b_arr[ib];
			d.c=b.c;
		}
		for(int i=x-1;i>0;i--)
			if(d_arr[i]>9)
			{
				d_arr[i-1]+=(d_arr[i]/10);
				d_arr[i]%=10;
			}
		for(int i=x-1;i>0;i--)
			if(d_arr[i]<0)
			{
				
				d_arr[i-1]-=1;
				d_arr[i]+=10;
			}
			
		d.s=ArrayToString(d_arr);
		return d;
	}
	InfinityDataType minus(InfinityDataType b)
	{
		InfinityDataType d=new InfinityDataType();
		d.s=b.s;
		d.c=b.c;
		InfinityDataType d1=new InfinityDataType();
		d1.s=s;
		d1.c=c;
		if(d.c=='+')
			d.c='-';
		else
			d.c='+';
		d=d.plus(d1);
		return d;
	}
	InfinityDataType multiply(InfinityDataType b)
	{
		InfinityDataType d=new InfinityDataType();
		short a_arr[]=StringToArray(s);
		short b_arr[]=StringToArray(b.s);
		int a_length=a_arr.length;
		int b_length=b_arr.length;
		int d_length=a_length+b_length;
		short d_arr[]=new short[d_length];
		for(int ci=-1,i=b_length-1;i>=0;i--,ci--)
			for(int k=a_length-1,c=d_length+ci;k>=0;k--,c--)
				d_arr[c]+=(b_arr[i]*a_arr[k]);
		for(int i=d_length-1;i>0;i--)
			if(d_arr[i]>9)
			{
				d_arr[i-1]+=(d_arr[i]/10);
				d_arr[i]%=10;
			}
		d.input(d.ArrayToString(d_arr));
		if(c=='-' && b.c=='-')
			d.c='+';
		else if(c=='-' || b.c=='-')
			d.c='-';
		else
			d.c='+';
		return d;
	}
	InfinityDataType divide(InfinityDataType b)throws Exception
	{
		InfinityDataType b1=new InfinityDataType();
		InfinityDataType d=new InfinityDataType();
		InfinityDataType d1=new InfinityDataType();
		InfinityDataType d2=new InfinityDataType();
		d2.input("1");
		d.input("0");
		b1.s=b.s;
		b1.c='+';
		d1.s=s;
		d1.c='+';
		while(d1.GreaterThan(b) || d1.EqualTo(b))
		{
			d=d.plus(d2);
			d1=d1.minus(b1);
			b1.s=b.s;
		}
		if(c=='-' && b.c=='-')
			d.c='+';
		else if(c=='-' || b.c=='-')
			d.c='-';
		else
			d.c='+';
		return d;
	}
	boolean EqualTo(InfinityDataType b)
	{
		short a_arr[]=StringToArray(s);
		short b_arr[]=StringToArray(b.s);
		int a_length=a_arr.length;
		int b_length=b_arr.length;
		if(a_length!=b_length)
			return false;
		boolean flag=true;
		for(int i=0;i<b_length;i++)
			if(a_arr[i]!=b_arr[i])
			{
				flag=false;
				break;
			}
		return flag;
	}
	boolean GreaterThan(InfinityDataType b)
	{
		short a_arr[]=StringToArray(s);
		short b_arr[]=StringToArray(b.s);
		int a_length=a_arr.length;
		int b_length=b_arr.length;
		if(a_length>b_length)
			return true;
		if(a_length<b_length)
			return false;
		boolean flag=false;
		for(int i=0;i<b_length;i++)
			if(a_arr[i]>b_arr[i])
			{
				flag=true;
				break;
			}
			else if(a_arr[i]<b_arr[i])
			{
				flag=false;
				break;
			}
		return flag;
	}
	boolean LesserThan(InfinityDataType b)
	{
		short a_arr[]=StringToArray(s);
		short b_arr[]=StringToArray(b.s);
		int a_length=a_arr.length;
		int b_length=b_arr.length;
		if(a_length>b_length)
			return false;
		if(a_length<b_length)
			return true;
		boolean flag=false;
		for(int i=0;i<b_length;i++)
			if(a_arr[i]<b_arr[i])
			{
				flag=true;
				break;
			}
			else if(a_arr[i]<b_arr[i])
			{
				flag=false;
				break;
			}
		return flag;
	}
	boolean IsGreaterThan(InfinityDataType b)
	{
		boolean flag=true;
		if((c=='-' && b.c=='-') || (c=='+' && b.c=='+'))
			flag=GreaterThan(b);
		else if(c=='-' && b.c=='+')
			flag=false;
		else
			flag=true;
		return flag;
	}
	boolean IsLesserThan(InfinityDataType b)
	{
		boolean flag=true;
		if((c=='-' && b.c=='-') || (c=='+' && b.c=='+'))
			flag=LesserThan(b);
		else if(c=='-' && b.c=='+')
			flag=true;
		else
			flag=false;
		return flag;
	}
}
//--------------------------demo begins--------------------------\\
class demo
{
	public static void main(String args[])throws Exception
	{
		DataInputStream dis=new DataInputStream(System.in);
		InfinityDataType n=new InfinityDataType();
		System.out.print("Enter the number x: ");
		n.input();
		
		InfinityDataType n1=new InfinityDataType();
		System.out.print("Enter the number y: ");
		n1.input();
		
		InfinityDataType check=new InfinityDataType();
		check.input("0");
		
		InfinityDataType n2=new InfinityDataType();
		
		System.out.print("x+y: ");
		n2=n.plus(n1);
		n2.print();
		System.out.println();
		
		System.out.print("x*y: ");
		n2=n.multiply(n1);
		n2.print();
		System.out.println();
		
		System.out.print("x-y: ");
		n2=n.minus(n1);
		n2.print();
		System.out.println();
		
		if(check.EqualTo(n1))
		{
			System.out.print("the number y should not be 0 enter again: ");
			n1.input();
		}
		System.out.print("x/y: ");
		n2=n.divide(n1);
		n2.print();
		System.out.println();
	}
}/*
		InfinityDataType n=new InfinityDataType();
		InfinityDataType n1=new InfinityDataType();
		n.input("1");
		String asd="";
		for(int i=1;i<111111111;i++)
		{
			n1.input(String.valueOf(i));
			n=n.multiply(n1);
			if(i%100==0)
			{
				System.out.print(i+"!=");
				n.print();
				asd=dis.readLine();
			}
		}
	}
}/*
import java.util.*;
class demo
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter: ");
		int n=sc.nextInt();
		String o[]={"one","two","three","four","five","six","seven","eight","nine"};
		String e[]={"eleven","tweleve","thirteen","fourteen","fifeteen","sixteen","seventeen","eighteen","nineteen"};
		String t[]={"ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
		String h[]={"hundred","thousand"};
		int a=n,r=0;
		if(n>999)
		{
			r=n/1000;
			if(r>19 || r==10)
			{
				System.out.print(t[(r/10)-1]+" ");
				if(r%10!=0)
					System.out.print(o[(r%10)-1]+" ");
			}
			else if(r>10)
				System.out.print(e[(r%10)-1]+" ");
			else
				System.out.print(o[(r%10)-1]+" ");
			System.out.print(h[1]+" ");
		}
		n=n%1000;
		
		if(n>99)
			System.out.print(o[(n/100)-1]+" hundred ");
		n=n%100;
		if(n>19 || n==10)
			{
				System.out.print(t[(n/10)-1]+" ");
				if(n%10!=0)
					System.out.print(o[(n%10)-1]+" ");
			}
			else if(n>10)
				System.out.print(e[(n%10)-1]+" ");
			else
				System.out.print(o[(n%10)-1]+" ");
	}
}*/