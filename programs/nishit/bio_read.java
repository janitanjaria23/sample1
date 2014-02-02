import java.io.*;
import java.util.*;
//001 to 107-ch1
//108 to 183-ch2
//184 to 280-ch3
//281 to 396-ch4
//397 to 532-ch5
//533 to 602-ch6
//603 to 646-ch7
//647 to 685-ch8
class bio_read
{
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader("fill.dat");
        Scanner sc=new Scanner(System.in);
        StreamTokenizer st=new StreamTokenizer(fr);
        Random ran=new Random();
        st.eolIsSignificant(true);
        String s="";
        int tok=0;

        System.out.print("Total marks:");
       	float tm=sc.nextFloat();
       	int bl=(int)(tm*2);
       	//System.out.println(bl);
        int b[]=new int[bl];
        int e[]=new int[bl];

        System.out.print("Number of chapters:");
        int ch=sc.nextInt();
        int a[]=new int[ch];
        int c[]=new int[ch];

        for(int i=0;i<a.length;++i)
        {
            System.out.print("Enter ch no:");
            a[i]=sc.nextInt();
        }

        int p=(int)(bl/ch);
        for(int i=0;i<c.length;++i)
            c[i]=p;

        int left=bl%ch;
        for(int i=0;left!=0;i++,left--)
            c[i]++;

        for(int i=0,k=0;i<b.length;++k)
        {
            for(int j=0;j<c[k];++j,++i)
            {
                b[i]=a[k];
            }
        }
        
        float y=0;int v=0;
        for(int i=0;i<b.length;)
        {
            y=ran.nextFloat();
            if(b[i]==1)
            {
                e[i]=(int)((y*106));
            }
            else if(b[i]==2)
            {
                e[i]=(int)((y*75)+107);
            }
            else if(b[i]==3)
            {
                e[i]=(int)((y*96)+76+107);
            }
            else if(b[i]==4)
            {
                e[i]=(int)((y*115)+76+107+97);
            }
            else if(b[i]==5)
            {
                e[i]=(int)((y*135)+76+107+97+116);
            }
            else if(b[i]==6) 
            {
                e[i]=(int)((y*70)+76+107+97+116+136);
            }
            else if(b[i]==7) 
            {
                e[i]=(int)((y*43)+76+107+97+116+136+71);
            }
            else if(b[i]==8) 
            {
                e[i]=(int)((y*38)+76+107+97+116+136+71+44);
            }
            for(int k=0;k<i;++k)
            {
            	if(e[i]==e[k])
            	{
            		v=1;
            		break;
            	}
            }
            if(v==1)
            {
            	v=0;
            	continue;
            }
            i++;
            
         }
			
         int temp=0;
         for(int i=0;i<e.length-1;++i)
            for(int j=i+1;j<e.length;++j)
            {
                if(e[j]<e[i])
                {
                    temp=e[j];
                    e[j]=e[i];
                    e[i]=temp;
                }
            }

      /* for(int i=0;i<e.length;i++)
        	System.out.println(e[i]+" "+i);*/
        String g[]=new String[b.length];
		int d=1,ctr=0,qn=1,h=0,f=0;int total=0,mrk=0;String msn="";
        while((tok=st.nextToken())!=-1)
        {
            switch(tok)
            {
                case -3:{
                			msn=st.sval;
                			if(msn.equals("qq"))
                			{
                				s=s+".........."+" ";
                				mrk=mrk+1;
                			}
                			else
                				s=s+st.sval+" ";	
                        	break;
                        }
                case -2:{	
                			d=(int)st.nval;
                			if(d==0)
                				s=s+".";
                			else if(d==999)
                				s=s.trim()+","+" ";
                			else
                				s=s+d+" ";		
                			break;
                		}        
                case 10:{
                			
	                		for(;h<e.length;h++)
		               		{
		               			if(ctr==e[h])
			                		{   
			                			//System.out.println(mrk);           	
				                		if(s.substring(0,3).compareTo("aaa")==0)
				                           	g[f]=(s.substring(3));
				                       	else
			                            	g[f]=(s);
			                            qn++;
			                            b[f]=mrk;
			                            total=total+mrk;
                						f++;
			                        }
			                        
		                    }   
		                    h=0;
		                    mrk=0;    
		                    ctr++;
                        	s="";
                        	break;
                        
                        }

            }
       }
       
       mrk=total-bl;
       //System.out.println(mrk+" "+total+" "+bl);
       for(int i=0;i<g.length;i++)
       {
       		if(b[i]<total)
       		{	g[i]="";
       			mrk=mrk-b[i];
       		}
       		if(mrk==0)
       			break;
       }
       qn=1;
       for(int i=0;i<b.length;i++)
       		if(g[i].length()!=0)
        	{
        			System.out.println(qn+" "+g[i]);
        			qn++;
        	}		
    }
    
}
