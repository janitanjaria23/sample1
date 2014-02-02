import java.io.*;
import java.util.*;
class valid
{
	char c;
	String name()throws IOException
	{		
		BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
		String n="";			
			for(;;)
			{
				System.out.print("Enter the name : ");
				n=dis.readLine().trim();
	            for(int i=0;i<n.length();i++)
				{	
				    c=n.charAt(i);
					if(!(c>='a' && c<='z') && !(c>='A' && c<='Z'))
						break;
	                c='~'; 
				}
	            if(c!='~')
					continue;
	            break;
			}
			return n;
	}				
	
	double basic()throws IOException 
	{
		String s="";
		int ctr=0;
		double bs=0;
		BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));				
		for(;;)
		{
			for(;;)
			{
		
				ctr=0;
				System.out.print("Enter the basic salary: ");
				s=dis.readLine().trim();
				for(int i=0;i<s.length();i++)
				{
					c=s.charAt(i);
					if(c=='.')
						ctr++;
					if(!(c>='0' && c<='9') && c!='.')
						break;
					c=' ';	
				}
				if(c!=' ')
					continue;
				else if(ctr>1)
					continue;	
	            break;
			}
		ctr=0;
       ctr=(int)Math.rint((Double.parseDouble(s)/0.01));
        bs=((double)ctr/100);
        if(bs>30000 || bs<500)
        	continue;
        break;
        
        }	
        return bs;
	}		        	
		      	
	String gd(double bs)throws IOException
	{
      	String grade="";
      	if(bs>20000 && bs<=30000)
      		grade="M1";
      	else if(bs>15000 && bs<=20000)
      		grade="M2";
      	else if(bs>10000 && bs<=15000)
      		grade="E1";
      	else if(bs>5000 && bs<=10000)
      		grade="E2";
		else if(bs>0 && bs<=5000)
			grade="E3";	
		return grade;
	}
	
	String empno()throws IOException
	{
		String s="";
		check ck=new check();
		String e[]=ck.chk();
		if(e.length>0)
		{s=e[e.length-1];
		s=s.substring(1);
		int a=Integer.parseInt(s);
		a++;
		if(a>100)
			a=0;
		s="";
		if(a<10)
			s="E00"+String.valueOf(a);		
		else if(a>=10 && a<100)
			s="E0"+String.valueOf(a);
		else if(a>=100)
			s="E"+String.valueOf(a);}
		else
			s="E001";	
		return s;	
				
	}	
	
	void lev(String gd,String eno)throws IOException
	{
		FileOutputStream fos=new FileOutputStream("tf.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
		int pl=0,lwp=0;
		if(gd.equalsIgnoreCase("M1"))
		{
			pl=40;
			lwp=10;
		}	
		else if(gd.equalsIgnoreCase("M2"))
		{
			pl=30;
			lwp=15;
		}
		else if(gd.equalsIgnoreCase("E1"))
		{
			pl=22;
			lwp=20;
		}
		else if(gd.equalsIgnoreCase("E2"))
		{
			pl=18;
			lwp=25;
		}
		else if(gd.equalsIgnoreCase("E3"))
		{
			pl=13;
			lwp=30;
		}
		dos.writeUTF(eno);
		dos.writeUTF(String.valueOf("12"));
		dos.writeUTF(String.valueOf("8"));
		dos.writeUTF(String.valueOf(pl));
		dos.writeUTF(String.valueOf(lwp));
		dos.writeUTF("\n");
		dos.close();
  		bos.close();
  		fos.close();
	}			
	
		
}											