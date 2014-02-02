import java.io.*;
import java.util.*;
class salary
{
    public static void main(String sda[])throws IOException
    {

        DataInputStream dis=new DataInputStream(System.in);
        double bs=0;int ctr=1,ch=0;
        double hra=0,pf=0,da=0,nt=0;
        String name="",nn="",eno="",grade="",name1="",eno1="",desig1="",grade1="";
        int nt1=0;
        FileReader fr=new FileReader("mf.dat");
        char c=' ';
        StreamTokenizer st=new StreamTokenizer(fr);

        st.eolIsSignificant(true);
        int tok=st.nextToken();
        StringTokenizer stt;
        do
        {
        	System.out.println();
        	System.out.println("Do you want payslip with  name or employee no.");
        	System.out.println();
        	System.out.print("Enter 1 to find with employee no. and 2 to find with name:");
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
                	             {
                	         
                                     System.out.println();
		                             System.out.println("\t\t\tCENTRAL SOFTWARE");
		                             System.out.println();
		                             System.out.println("Employee No.: "+eno+"\t"+"\tName: "+name);
		                             if(grade.equals("M1"))
		                             	System.out.print("Designation: G.M.");
		                             if(grade.equals("M2"))
		                             	System.out.print("Designation: Asst G.M.");
		                             if(grade.equals("E1"))
		                             	System.out.print("Designation: Sr. Manager");
		                             if(grade.equals("E2"))
		                             	System.out.print("Designation: Corp. Maanager");
		                             if(grade.equals("E3"))
		                             	System.out.print("Designation: Clerk");
		                             
		                             System.out.println("\t\tGrade: "+grade);
		                             System.out.println();
		                             System.out.println("Basic salary: "+bs);
		                             System.out.println();
		                             System.out.println("Allowance"+"\t\t\t"+"Deductions");
		                             if(grade.equals("M1"))
		                             {
		                             	hra=((70*bs)/100);
		                             	da=((120*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Ceilo with a shroffer and Rs 10000 petrol allowances");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             	
		                             }
		                             if(grade.equals("M2"))
		                             {
		                             	hra=((50*bs)/100);
		                             	da=((80*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Maruti 800 without a shroffer and Rs 8000 petrol allowances");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }
		                             if(grade.equals("E1"))
		                             {
		                             	hra=((40*bs)/100);
		                             	da=((70*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Maruti Van without a shroffer and Rs 4000 petrol allowances");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }
		                             if(grade.equals("E2"))
		                             {
		                             	hra=((30*bs)/100);
		                             	da=((60*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Rs 2500 petrol allowances if he/she owns a vehicle ");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }
		                             if(grade.equals("E3"))
		                             {
		                             	hra=((20*bs)/100);
		                             	da=((40*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: No vehicle allowance ");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }

                             
                                  }
                             }
                             if(ch==2)
                	         {
                	         
                	         if(name.equalsIgnoreCase(name1) && grade1.equalsIgnoreCase(grade))
                             {
                	         
                                     System.out.println();
		                             System.out.println("\t\t\tCENTRAL SOFTWARE");
		                             System.out.println();
		                             System.out.println("Employee No.: "+eno+"\t"+"\tName: "+name);
		                             if(grade.equals("M1"))
		                             	System.out.print("Designation: G.M.");
		                             if(grade.equals("M2"))
		                             	System.out.print("Designation: Asst G.M.");
		                             if(grade.equals("E1"))
		                             	System.out.print("Designation: Sr. Manager");
		                             if(grade.equals("E2"))
		                             	System.out.print("Designation: Corp. Maanager");
		                             if(grade.equals("E3"))
		                             	System.out.print("Designation: Clerk");
		                             
		                             System.out.println("\t\tGrade: "+grade);
		                             System.out.println();
		                             System.out.println("Basic salary: "+bs);
		                             System.out.println();
		                             System.out.println("Allowance"+"\t\t\t"+"Deductions");
		                             if(grade.equals("M1"))
		                             {
		                             	hra=((70*bs)/100);
		                             	da=((120*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Ceilo with a shroffer and Rs 10000 petrol allowances");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }
		                             if(grade.equals("M2"))
		                             {
		                             	hra=((50*bs)/100);
		                             	da=((80*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Maruti 800 without a shroffer and Rs 8000 petrol allowances");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }
		                             if(grade.equals("E1"))
		                             {
		                             	hra=((40*bs)/100);
		                             	da=((70*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Maruti Van without a shroffer and Rs 4000 petrol allowances");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             	
		                             }
		                             if(grade.equals("E2"))
		                             {
		                             	hra=((30*bs)/100);
		                             	da=((60*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: Rs 2500 petrol allowances if he/she owns a vehicle ");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             }
		                             if(grade.equals("E3"))
		                             {
		                             	hra=((20*bs)/100);
		                             	da=((40*bs)/100);
		                             	pf=((12*bs)/100);
		                             	nt=((bs+hra+da)-pf);
		                             	nt1=(int)Math.rint((nt)/0.01);
		                                nt=((double)nt1/100);
		                             	
		                             	System.out.println();
		                             	System.out.println("HRA: "+hra+"\t\t"+"  "+"\t"+"PF : "+pf);
		                             	System.out.println("DA: "+da);
		                             	System.out.println("VA: No vehicle allowance ");
		                             	System.out.println();
		                             	System.out.println("Net salary : "+nt);
		                             }

                             
                                  }
                             
                             }
                             nn="";name="";
                             }
          }

          tok=st.nextToken();

          }
          
         
     }
 }

