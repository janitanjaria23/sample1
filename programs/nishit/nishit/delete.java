
import java.io.*;
import java.util.*;
class delete
{
    public static void main(String asdp[])throws IOException
    {
        double bs=0;int ctr=1;int tok=0;
        String name="",eno="",eno1="",grade="",name1="",desig1="",grade1="";
        char c=' ';
        int ch=0;
        FileOutputStream fos=new FileOutputStream("mf1.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);

        FileReader fr=new FileReader("mf.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dis=new DataInputStream(System.in);
        do
        {
        	System.out.print("Do you want to delete the record with respect to name or employ no. ?");
        	System.out.println();
        	System.out.println("Enter 1 find with employ no. and 2 to find with name ");
            ch=Integer.parseInt(dis.readLine());
        }while(ch!=1 && ch!=2);
       
        
        if(ch==1)
        {
        	        for(;;)
					{
			            System.out.print("Enter the Employee no : ");
						eno1=dis.readLine().trim();
						if(eno1.charAt(0)!='E')
							continue;
						for(int i=1;i<eno1.length();i++)
						{	c=eno1.charAt(i);
							if(!(c>='0' && c<='9'))
								break;
							c=' ';	
						}
			            if(c!=' ')
							continue;
			            break;
					}	
        }
        	        
        if(ch==2)
        {
        	        for(;;)
					{
						System.out.print("Enter the name : ");
						name1=dis.readLine().trim();
			            for(int i=0;i<name1.length();i++)
						{	
						    c=name1.charAt(i);
							if(!(c>='a' && c<='z') && !(c>='A' && c<='Z'))
								break;
			                c='~'; 
						}
			            if(c!='~')
							continue;
			            break;
					}
        			for(;;)
					{
						System.out.print("Enter the designation: ");
						desig1=dis.readLine().trim();
						if(!(desig1.equalsIgnoreCase("G.M.")) && !(desig1.equalsIgnoreCase("Asst. G.M.")) && !(desig1.equalsIgnoreCase("Sr. Manager")) && !(desig1.equalsIgnoreCase("Corp. manager")) && !(desig1.equalsIgnoreCase("clerk")))
							continue;
				        break;
					}
					if(desig1.equalsIgnoreCase("G.M."))
	        			grade1="M1";
			    	else if(desig1.equalsIgnoreCase("Asst. G.M."))
			    		grade1="M2";
					else if(desig1.equalsIgnoreCase("Sr. Manager"))
						grade1="E1";					
					else if(desig1.equalsIgnoreCase("Corp. manager"))
						grade1="E2";
					else if(desig1.equalsIgnoreCase("clerk"))
						grade1="E3";	
        
        }
        while((tok=st.nextToken())!=-1)
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
                	        if((eno1.equals(eno)|| (name1.equalsIgnoreCase(name) && grade1.equalsIgnoreCase(grade))))
                	        {}
                            else
                            {   
							    dos.writeUTF(String.valueOf(eno).trim());
							    dos.writeUTF(name.trim());
							    dos.writeUTF(String.valueOf(bs).trim());
							    dos.writeUTF(grade.trim());
                                                    
                                dos.writeUTF(String.valueOf("\n"));
                            }
                            break;
               
               
          			    } 
          		 }
          
          }
          dos.close();
          bos.close();
          dos.close();
          fr.close();

          File f1=new File("mf.dat");
          File f2=new File("mf1.dat");

          f1.delete();
          f2.renameTo(f1);
      
}
}
