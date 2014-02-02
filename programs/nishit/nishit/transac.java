import java.io.*;
import java.util.*;
class transac
{
	public static void main(String args[])throws IOException
	{
		check ck=new check();
		BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));
		String enc[]=ck.chk();
		char c=' ';
		int ctr=0,n=0,ltr=0;
		String s="",eno="",l="";
		for(;;)
		{
			ctr=0;
			c=' ';
			System.out.print("Enter the Emp no : ");
			eno=dis.readLine().trim();
			if(eno.charAt(0)!='E')
				continue;
			for(int i=1;i<eno.length();i++)
			{	c=eno.charAt(i);
				if(!(c>='0' && c<='9'))
					break;
				c=' ';	
			}
			if(c!=' ')
				continue;	
			for(int i=0;i<enc.length;i++)
			{
				if(enc[i].equals(eno))
					ctr=1;
					
			}
			if(ctr!=1)
				continue;
			break;		
		}
		FileOutputStream fos=new FileOutputStream("tf1.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
		DataOutputStream dos=new DataOutputStream(bos);
			
		FileReader fr=new FileReader("tf.dat");

        StreamTokenizer st=new StreamTokenizer(fr);
		ctr=1;
        st.eolIsSignificant(true);
        int tok=st.nextToken();
        int la[]=new int[4];
        String eno1="";
        while(tok!=-1)
        {
            switch(tok)
            {
                case -3:
                {
                	eno1=st.sval;    
                    break;
                }
                case -2:
                { 
                	if(ctr==1)
                	{
                		la[0]=(int)st.nval;
                		ctr=2;
                	}
                	else if(ctr==2)
                	{
                		la[1]=(int)st.nval;
                		ctr=3;
                	}
                	else if(ctr==3)
                	{
                		la[2]=(int)st.nval;
                		ctr=4;
                	}
                	else if(ctr==4)
                	{
                		la[3]=(int)st.nval;
                		ctr=1;
                	}
                	break;
                }
                case 10:
                {
                	if(eno.equals(eno1))
                	{
                		System.out.println();
                		System.out.println("Available Leaves:");
                		System.out.println();
                		System.out.println("cl="+la[0]+"\t\t\t\tsl="+la[1]);
                		System.out.println("pl="+la[2]+"\t\t\t\tlwp="+la[3]);
                		
                		
                		
	            		for(;;)
						{
							System.out.print("Enter the type of leave(cl/sl/pl/lwp):");
							l=dis.readLine().trim();
							
							if(l.equals("cl")==false && l.equals("sl")==false && l.equals("pl")==false && l.equals("lwp")==false)
								continue;
							break;
						}	
						for(;;)
						{	
							System.out.print("Enter no. of leaves to be taken:");
							n=Integer.parseInt(dis.readLine().trim());
							
							if(l.equals("cl"))
							{
								ltr=0;
								if(n>2)
								{
									System.out.print("Re-");
									continue;
								}
								else 
								{	
									la[0]=la[0]-n;
									if(la[0]<0)
									{
										if(la[3]>=Math.abs(la[0]))
										{
											la[3]=la[3]+la[0];
											la[0]=0;
										}
										else 
										{
												System.out.println("Cannot take the leave");
												ltr++;
										}
										
										
									}
								}
								if(ltr>0)
									continue;
								ltr=0;
										
							}
							else if(l.equals("sl"))
							{
								ltr=0;
								la[1]=la[1]-n;
								if(la[1]<0)
								{
									if(la[3]>=Math.abs(la[1]))
									{
										la[3]=la[3]+la[1];
										la[1]=0;
									}
									else 
									{
											System.out.println("Cannot take the leave");
											ltr++;
									}
									
									
								}
								
								if(ltr>0)
									continue;
								ltr=0;			
							}
							if(l.equals("pl"))
							{
								ltr=0;
								if(n<7)
								{
									System.out.print("Re-");
									continue;
								}
								else 
								{
									la[2]=la[2]-n;
									if(la[2]<0)
									{
										if(la[3]>=Math.abs(la[2]))
										{
											la[3]=la[3]+la[2];
											la[2]=0;
										}
										else 
										{
												System.out.println("Cannot take the leave");
												ltr++;
										}
										
										
									}
								}
								if(ltr>0)
									continue;
								ltr=0;	
											
							}
								
							break;
						}
                		
                		
                	}
                	dos.writeUTF(eno1);
                	dos.writeUTF(String.valueOf(la[0]));
					dos.writeUTF(String.valueOf(la[1]));
					dos.writeUTF(String.valueOf(la[2]));
					dos.writeUTF(String.valueOf(la[3]));
					dos.writeUTF("\n");
                	break;
                              	
          		}
			}
          tok=st.nextToken();

          
          
		}
		dos.close();
  		bos.close();
  		fos.close();
  		fr.close();
  		
		File f1=new File("tf.dat");
		File f2=new File("tf1.dat");
		
		f1.delete();
		f2.renameTo(f1);
	}
}