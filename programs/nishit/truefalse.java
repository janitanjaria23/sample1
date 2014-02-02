import java.io.*;
import java.util.*;
//ch-1 0-0
//ch-2 1-39
//ch-3 40-55
//ch-4 56-71
//ch-5 72-106
//ch-6 107-133
//ch-7 134-164
//ch-8 165-184
//ch-9 185-215
//ch-10 216-248
//ch-11 249-272
//ch-12 273-293
//ch-13 294-327
//ch-14 328-339
//ch-15 340-344
//ch-16 345-360
//ch-17 361-377
//ch-18 378-382
//ch-19 382-382
//ch-20 383-398
//ch-21 399-409
//ch-22 410-422
//ch-23 423-433
//ch-24 434-468
//ch-25 469-485
//ch-26 486-514
class truefalse
{
    public static void main(String args[])throws IOException
    {
        FileReader fr=new FileReader("tufal.dat");
        Scanner sc=new Scanner(System.in);
        StreamTokenizer st=new StreamTokenizer(fr);
        Random ran=new Random();
        st.eolIsSignificant(true);
        String s="";
        int tok=0;

        System.out.print("Total marks:");
       	float tm=sc.nextFloat();
       	int bl=(int)(tm*2);
       	
      
        int b[]=new int[bl];
        int e[]=new int[bl];

        System.out.print("Number of chapters:");
        int ch=sc.nextInt();
        int a[]=new int[ch];
        int c[]=new int[ch];

        for(int i=0;i<a.length;++i)
        {
            do{
            	System.out.print("Enter ch no:");
            	a[i]=sc.nextInt();
            }while(a[i]==1 || a[i]==19);	
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
                e[i]=(int)((y*0));
            }
            else if(b[i]==2)
            {
                e[i]=(int)((y*38)+1);
            }
            else if(b[i]==3)
            {
                e[i]=(int)((y*15)+40);
            }
            else if(b[i]==4)
            {
                e[i]=(int)((y*15)+56);
            }
            else if(b[i]==5)
            {
                e[i]=(int)((y*34)+72);
            }
            else if(b[i]==6)
            {
                e[i]=(int)((y*26)+107);
            }
            else if(b[i]==7)
            {
                e[i]=(int)((y*30)+134);
            }
            else if(b[i]==8)
            {
                e[i]=(int)((y*19)+165);
            }
            else if(b[i]==9)
            {
                e[i]=(int)((y*30)+185);
            }
            else if(b[i]==10)
            {
                e[i]=(int)((y*32)+216);
            }
            else if(b[i]==11)
            {
                e[i]=(int)((y*23)+249);
            }
            else if(b[i]==12)
            {
                e[i]=(int)((y*20)+273);
            }
            else if(b[i]==13)
            {
                e[i]=(int)((y*33)+294);
            }
            else if(b[i]==14)
            {
                e[i]=(int)((y*11)+328);
            }
            else if(b[i]==15)
            {
                e[i]=(int)((y*4)+340);
            }
            else if(b[i]==16)
            {
                e[i]=(int)((y*15)+345);
            }
            else if(b[i]==17)
            {
                e[i]=(int)((y*16)+361);
            }
            else if(b[i]==18)
            {
                e[i]=(int)((y*4)+378);
            }
            else if(b[i]==20)
            {
                e[i]=(int)((y*15)+383);
            }
            else if(b[i]==21)
            {
                e[i]=(int)((y*10)+399);
            }
            else if(b[i]==22)
            {
                e[i]=(int)((y*12)+410);
            }
            else if(b[i]==23)
            {
                e[i]=(int)((y*10)+423);
            }
            else if(b[i]==24)
            {
                e[i]=(int)((y*34)+434);
            }
            else if(b[i]==25)
            {
                e[i]=(int)((y*16)+469);
            }
            else if(b[i]==26)
            {
                e[i]=(int)((y*28)+486);
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
            
        System.out.println("True or False:-");    
       int d=1,ctr=0,qn=1,h=0;
        while((tok=st.nextToken())!=-1)
        {
            switch(tok)
            {
                case -3:{
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

			                           	System.out.println(qn+" "+s);
			                            qn++;
			                            
			                        }
			                        
		                    }   
		                    h=0;    
		                    ctr++;
                        	s="";
                        	break;
                        
                        }

            }
       }     
            
        	
    }
}        	