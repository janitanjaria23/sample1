import java.io.*;
import java.util.*;
class projcet
{
	public static void main(String asd[])throws IOException
	{
		DataInputStream dis=new DataInputStream(System.in);
		String eno="",name="",desig="",grade="",s="";
        double bs=0;char c=' ';
        int ctr=0;
        
        
		FileOutputStream fos;
        BufferedOutputStream bos;
		DataOutputStream dos;
		valid v;
		for(;;)
		{
	      	fos=new FileOutputStream("mf.dat",true);
	      	bos=new BufferedOutputStream(fos);
	      	dos=new DataOutputStream(bos);
	      	v=new valid();
	      	eno=v.empno();
	      	name=v.name();
	      	bs=v.basic();
	      	grade=v.gd(bs);
	      	v.lev(grade,eno);
	      	dos.writeUTF(eno);
	      	dos.writeUTF(name);
	      	dos.writeUTF(String.valueOf(bs));
      		dos.writeUTF(grade);
      		dos.writeUTF("\n");
      		dos.close();
      		bos.close();
      		fos.close();
      		
      		System.out.print("continue:");
      		c=dis.readLine().charAt(0);
      		if(c=='y')
      			continue;
      		else if(c=='n')
      			break;	
      	}
      	

       

      	
	}
}	
