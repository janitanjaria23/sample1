import java.io.*;
import java.util.*;
class modification
{
    public static void main(String dap[])throws IOException
    {
        int b=0,ctr=1,ptr=0,tok=0;
        String name="",nn="",eno="",eno1="",grade="",grade1="",desig="",desig1="",name1="",s="";
        double bs=0,bs1=0;char c=' ';
        
        FileOutputStream fos=new FileOutputStream("mf1.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        
        DataInputStream dis=new DataInputStream(System.in);
        
        FileReader fr=new FileReader("mf.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter emp no. you want to modify :");
        
        eno1=br.readLine().trim();
        System.out.print("If you want to change the name press 1 ");
        int ch=Integer.parseInt(dis.readLine());
        System.out.print("If you want to change the salary press 1 ");
        int ch1=Integer.parseInt(dis.readLine());
        System.out.print("If you want to change the designation press 1 ");
        int ch2=Integer.parseInt(dis.readLine());
        if(ch==1)
        {
        	System.out.print("Enter the new name :  ");
            name1=dis.readLine().trim();
        }
        
        
        if(ch2==1)
        {
        	System.out.print("Enter the new designation :  ");
            desig1=dis.readLine().trim();

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
						
     	tok=st.nextToken();ctr=1;
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
                            if(eno1.equals(eno))
                            {
                            	dos.writeUTF(eno.trim());
                            	if(ch==1)
                            	{
                                    dos.writeUTF(name1.trim());
                                }
                                else
                                {
                                 	dos.writeUTF(name.trim());
                                    
                                }
                                if(ch1==1)
                                {
                                    for(;;)
                                 	{
                                 		
                                 		
	                                 		
	                                 		System.out.print("Enter the new salary :  ");
	            							s=dis.readLine().trim();
											
									    
										
								        ptr=(int)Math.rint((Double.parseDouble(s)/0.01));
								        bs1=((double)ptr/100);
								        
								        
								        if(grade1.equalsIgnoreCase("M1")==true)
							        	{
							        			if(!(bs1>20000 && bs1<=30000))
							        				continue;
							        			
							        			
							        				
							        	}	
								    	else if(grade1.equalsIgnoreCase("M2"))
								    	{	
								    		if(!(bs1>15000 && bs1<=20000))
								        				continue;
								        				
								        				
								        }				
										else if(grade1.equalsIgnoreCase("E1"))
										{	
											if(!(bs1>10000 && bs1<=15000))
								        				continue;	
								        				
								        				
								        }								
										else if(grade1.equalsIgnoreCase("E2"))
										{	
											if(!(bs1>5000 && bs1<=10000))
								        				continue;
								        				
								        }
										else if(grade1.equalsIgnoreCase("E3"))
										{	
											if(!(bs1>0 && bs1<=5000))
								        				continue;
								        				
								        }
								        else if(grade.equalsIgnoreCase("M1"))
							        	{
							        			if(!(bs1>20000 && bs1<=30000))
							        				continue;
							        			
							        	}	
								    	else if(grade.equalsIgnoreCase("M2"))
								    	{	
								    		if(!(bs1>15000 && bs1<=20000))
								        				continue;
								        			
								        }				
										else if(grade.equalsIgnoreCase("E1"))
										{	
											if(!(bs1>10000 && bs1<=15000))
								        				continue;	
								        			
								        }								
										else if(grade.equalsIgnoreCase("E2"))
										{	
											if(!(bs1>5000 && bs1<=10000))
								        				continue;
								        				
								        }
										else if(grade.equalsIgnoreCase("E3"))
										{	
											if(!(bs1>0 && bs1<=5000))
								        				continue;
								        				
								        }
									    
								        break;						
            						}	
                                    dos.writeUTF(String.valueOf(bs1).trim());
                                    
                                 }
                                 else
                                 {
                                 	
                                      dos.writeUTF(String.valueOf(bs).trim());
                                 }
                                 if(ch2==1)
                                 {
                                    
                                    dos.writeUTF(grade1);
                                    
                                 }
                                 else
                                 {
                                 	dos.writeUTF(grade);
                                 }
                                 dos.writeUTF(String.valueOf("\n"));

                            }
                            else
                            {
                        		dos.writeUTF(eno.trim());
                                dos.writeUTF(name.trim());
                                dos.writeUTF(String.valueOf(bs).trim());
                                dos.writeUTF(grade);
                                dos.writeUTF(String.valueOf("\n"));
                            }
                            
                            
                            
                        }
          		}
          		tok=st.nextToken(); 
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

