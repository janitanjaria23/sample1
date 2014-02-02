import java.io.*;
import java.util.*;
class querry
{
    public static void main(String sda[])throws IOException
    {

        DataInputStream dis=new DataInputStream(System.in);
        double bs=0;int ctr=1,ch=0;int v=0;
        String c="";
        
 
        String name="",nn="",eno="",grade="",name1="",eno1="";
        FileReader fr=new FileReader("mf.dat");
        int sal=0,qw=0;
        StreamTokenizer st=new StreamTokenizer(fr);
        String ch1="",gr1="";
        st.eolIsSignificant(true);
        int tok=st.nextToken();
        StringTokenizer stt;
        do
       {
        	System.out.print("Do you want to find the record with respect to name or eno : (Enter 1 for eno and 2 for name) ");
            ch=Integer.parseInt(dis.readLine());
        }while(ch!=1 && ch!=2 && ch!=3 && ch!=4 && ch!=5);
       
        
        if(ch==1)
        {
        	        System.out.print("Enter the record no u want to print : ");
        	        eno1=dis.readLine().trim();
        }
        	        
        if(ch==2)
        {
        	        System.out.print("Enter the name no u want to print : ");
        			name1=dis.readLine().trim();
        }
        if(ch==3)
        {
        	System.out.print("Enter the part of the name  u want to print : ");
        			ch1=dis.readLine().trim();
        }
        if(ch==4)
        {
        	System.out.print("Enter the basic salary : ");
        	sal=Integer.parseInt(dis.readLine());
        	System.out.print("Do you want the employees with salary greater less or equal to "+sal);
        	System.out.print("For lesser press '1',For equal '2' and For greater '3'");
        	qw=Integer.parseInt(dis.readLine());
        }
        if(ch==5)
        {
        	System.out.print("Enter the grade ");
        	gr1=dis.readLine();
        }
        while(tok!=-1)
        {
            switch(tok)
            {
                case -3:
                {
                    if(ctr==1)
                    { 
                        eno=st.sval;
                        ctr=2;
                            
                            
                    }
                    else if(ctr==2)
                    {
                      
                      name=st.sval; 
                      ctr=3;
                    }
                    else if(ctr==3)
                    {
                    	grade=st.sval;
                    	ctr=1;
                    }
                    break;
                }
                case -2:{ 
                        bs=(double)st.nval;
                         break;
                     }
                case 10:{
                	         if(ch==1)
                	         {
                	         
                	         if(eno.equalsIgnoreCase(eno1))
                             System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
                             }
                             if(ch==2)
                	         {
                	         
                	         if(name.equalsIgnoreCase(name1))
                             System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
                             }
                             if(ch==3)
                             {
                             	for(int i=0;i<name.length();i++)
        						{
						        	c=String.valueOf(name.charAt(i));
						        	if(c.equalsIgnoreCase(ch1))
						        	{
						                System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
									    break;
									}
						        	for(int j=i+1;j<name.length();j++)
						        	{
						                c+=String.valueOf(name.charAt(j));
						        		if(c.equalsIgnoreCase(ch1))
						        		{
						        		    v++;
						        		    System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
						        		}
						        	}
						        		if(v>0)
						        			break;
					        	}
					                             
					        }
					        if(ch==4 && qw==1)
					        {
					        	if(bs<sal)
					        		System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
						        			
					        }
					        if(ch==4 && qw==2)
					        {
					        	if(bs==sal)
					        		System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
						        		
					        }
					        if(ch==4 && qw==3)
					        {
					        	if(bs>sal)
					        		System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
						        		
					        }
					        if(ch==5)
					        {
					        	if(gr1.equals(grade))
					        	System.out.println(eno+"\t"+name+"\t"+bs+"\t"+grade);
					        }
                             nn="";name="";
                             }
          }

          tok=st.nextToken();

          }
          
         
     }
 }

