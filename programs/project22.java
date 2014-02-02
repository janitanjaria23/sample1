import java.io.*;

class project22
{
    public static void main(String args[])throws Exception
    {
         BufferedReader dis=new BufferedReader(new InputStreamReader(System.in));

		 boolean fl=false;
         int a1=0,a2=0;
         char c=' ';
         int n=0,z=0;
         String time="";
         int t=0,x=0,y=0;
         String a="",b="";
         String mh[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen","Twenty","Twenty one","Twenty two","Twenty three","zero"};
         

         for(;;)
         {
            
          System.out.println();
          System.out.println("                           *********************");
          System.out.print("                           *                   *");
          System.out.println();
          System.out.print("                           * TIME MENU PROGRAM *");
          System.out.println();
          System.out.println("                           *                   *");
          System.out.println("                           *********************");
         
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println();
          System.out.println("                                 1)24 hour format output");
          System.out.println("                                 2)12 hour format output");
          System.out.println("                                 3)Exit");

             //INPUTING OPTION
             while(true)
             	{
             		fl=false;
                	try
                	{
                	 	System.out.print("INPUT OPTION(1/2/3):");
                		n=Integer.parseInt(dis.readLine());
                	}catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(n>0 && n<=3)
                     	break;
            }
        
            System.out.println();
            switch(n)
            {
              case 1 :{
                        
                        
                        System.out.println("INPUT TIME IN 24 HOUR FORMAT");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println();
                       
                //INPUTING TIME
             while(true)
             	{
             		fl=false;
                	try
                	{
                         a1=0;
                         a2=0;
                         System.out.print("INPUT TIME(hh:mm)");
                         time=dis.readLine();
                         t=time.length();
                         for(int i=0;i<t;i++)
                         {
                            c=time.charAt(i);
                            if((c>='0' && c<='9') || (c==':'))
                            a1++;
                         }

                         for(int i=0;i<t;i++)
                         {
                            c=time.charAt(i);
                            if(c==':')
                            a2++;
                         }
                            if(a2!=1 || a1!=5)
                            a1=0;
                	}catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(t==5 && a1!=0)
                     	break;
            }

                        a=time.substring(0,2);
                        b=time.substring(3,5);
                       
                        x=Integer.parseInt(a);
                        y=Integer.parseInt(b);

                        while(x<0 || x>23 || y<0 || y>59 || time.charAt(2)!=':')
                        {
                        System.out.print("INPUT TIME(hh:mm)");
                        time=dis.readLine();

                        a=time.substring(0,2);
                        b=time.substring(3,5);
                       
                        x=Integer.parseInt(a);
                        y=Integer.parseInt(b);

                        }

                        System.out.println();

                        if(x<12)
                        {
                          if(x<10)
                            System.out.print("0"+x+":");
                          else
                            System.out.print(x+":");
                          if(y<10)
                            System.out.print("0"+y+" A.M.");  
                          else
                            System.out.print(y+" A.M.");
                        }
                        else
                        {
                            System.out.print(x+":");

                          if(y<10)
                            System.out.print("0"+y+" P.M.");  
                          else
                            System.out.print(y+" P.M.");
                        }

                        if(x<4)
                          System.out.print("\tMidnight");
                        else if(x<7)
                          System.out.print("\tEarly Morning");
                        else if(x<12)
                          System.out.print("\tMorning");
                        else if(x<16)
                          System.out.print("\tAfternoon");
                        else if(x<19)
                          System.out.print("\tEvening");
                        else
                          System.out.print("\tNight");

                        if(y==0)
                          System.out.print("    "+mh[x]+" O'Clock");
                        else if(y<15)
                          System.out.print("    "+mh[y]+" minutes past "+mh[x]+" hours");
                        else if(y==15)
                          System.out.print("     Quarter past "+mh[x]+" hours");
                        else if(y<20)
                          System.out.print("    "+mh[y]+" minutes past "+mh[x]+" hours");
                        else if(y==20)
                          System.out.print("    "+mh[20]+" "+" minutes past "+mh[x]+" hours");
                        else if(y<30)
                          System.out.print("    "+mh[20]+" "+mh[y%10]+" minutes past "+mh[x]+" hours");
                        else if(y==30)  
                          System.out.print("     Half past "+mh[x]+" hours");
                        else if(y<40)  
                          System.out.print("    "+"Thirty"+" "+mh[y%10]+" minutes past "+mh[x]+" hours");
                        else if(y<45)  
                          System.out.print("    "+mh[60-y]+" "+" minutes to "+mh[x+1]+" hours");
                        else if(y==45)  
                          System.out.print("     Quarter to "+mh[x+1]+" hours");
                        else  
                          System.out.print("    "+mh[60-y]+" minutes to "+mh[x+1]+" hours");

                        System.out.println();
                        System.out.println();
                        Thread.sleep(3000);
                        
                        for(int i=0;i<50;i++)
                            System.out.println();
                        break;
                      }

              case 2: { 
                        System.out.println("INPUT TIME IN 24 HOUR FORMAT");
                        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                        System.out.println();
                //INPUTING TIME
             while(true)
             	{
             		fl=false;
                	try
                	{
                         a1=0;
                         a2=0;
                         System.out.print("INPUT TIME(hh:mm)");
                         time=dis.readLine();
                         t=time.length();
                         for(int i=0;i<t;i++)
                         {
                            c=time.charAt(i);
                            if((c>='0' && c<='9') || (c==':'))
                            a1++;
                         }

                         for(int i=0;i<t;i++)
                         {
                            c=time.charAt(i);
                            if(c==':')
                            a2++;
                         }
                            if(a2!=1)
                            a1=0;
                	}catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(t==5 && a1!=0)
                     	break;
            }

                        
                        a=time.substring(0,2);
                        b=time.substring(3,5);
                       
                        x=Integer.parseInt(a);
                        y=Integer.parseInt(b);

                        while(x<0 || x>23 || y<0 || y>59 || time.charAt(2)!=':')
                        {
                        System.out.print("INPUT TIME(hh:mm)");
                        time=dis.readLine();

                        a=time.substring(0,2);
                        b=time.substring(3,5);
                       
                        x=Integer.parseInt(a);
                        y=Integer.parseInt(b);

                        }

                        System.out.println();

                        if(x<12)
                        {
                           if(x<10)
                              System.out.print("0"+x+":");
                           else
                              System.out.print(x+":");
                           if(y<10)
                              System.out.print("0"+y+" A.M.");  
                           else
                              System.out.print(y+" A.M.");
                        }

                        else
                        {
                          z=x-12;
                          if(z<10)
                             System.out.print("0"+z+":");
                          else
                             System.out.print((x-12)+":");
                          if(y<10)
                             System.out.print("0"+y+" P.M.");  
                          else
                             System.out.print(y+" P.M.");
                        }

                        if(x<4)
                          System.out.print("\tMidnight");
                        else if(x<7)
                          System.out.print("\tEarly Morning");
                        else if(x<12)
                          System.out.print("\tMorning");
                        else if(x<16)
                          System.out.print("\tAfternoon");
                        else if(x<19)
                          System.out.print("\tEvening");
                        else
                          System.out.print("\tNight");



                        if(x<12)
                        {
                          if(y==0)
                            System.out.print("    "+mh[x]+" O'Clock");
                          else if(y<15)
                            System.out.print("    "+mh[y]+" minutes past "+mh[x]+" hours");
                          else if(y==15)
                            System.out.print("     Quarter past "+mh[x]+" hours");
                          else if(y<20)
                            System.out.print("    "+mh[y]+" minutes past "+mh[x]+" hours");
                          else if(y==20)
                            System.out.print("    "+mh[20]+" "+" minutes past "+mh[x]+" hours");
                          else if(y<30)
                            System.out.print("    "+mh[20]+" "+mh[y%10]+" minutes past "+mh[x]+" hours");
                          else if(y==30)  
                            System.out.print("     Half past "+mh[x]+" hours");
                          else if(y<40)  
                            System.out.print("    "+"Thirty"+" "+mh[y%10]+" minutes past "+mh[x]+" hours");
                          else if(y<45)  
                            System.out.print("    "+mh[60-y]+" "+" minutes to "+mh[x+1]+" hours");
                          else if(y==45)  
                            System.out.print("     Quarter to "+mh[x+1]+" hours");
                          else  
                            System.out.print("    "+mh[60-y]+" minutes to "+mh[x+1]+" hours");
                        }    

                        else
                        {
                         if(y==0)
                            System.out.print("    "+mh[x-12]+" O'Clock");
                         else if(y<15)
                            System.out.print("    "+mh[y]+" minutes past "+mh[x-12]+" hours");
                         else if(y==15)
                            System.out.print("     Quarter past "+mh[x-12]+" hours");
                         else if(y<20)
                            System.out.print("    "+mh[y]+" minutes past "+mh[x-12]+" hours");
                         else if(y==20)
                            System.out.print("    "+mh[20]+" "+" minutes past "+mh[x-12]+" hours");
                         else if(y<30)
                            System.out.print("    "+mh[20]+" "+mh[y%10]+" minutes past "+mh[x-12]+" hours");
                         else if(y==30)  
                            System.out.print("     Half past "+mh[x-12]+" hours");
                         else if(y<40)  
                            System.out.print("    "+"Thirty"+" "+mh[y%10]+" minutes past "+mh[x-12]+" hours");
                         else if(y<45)  
                            System.out.print("    "+mh[60-y]+" minutes to "+mh[x-11]+" hours");
                         else if(y==45)  
                            System.out.print("     Quarter to "+mh[x-11]+" hours");
                         else  
                            System.out.print("    "+mh[60-y]+" minutes to "+mh[x-11]+" hours");
                       }

                       System.out.println();
                       System.out.println();
                       Thread.sleep(3000);
                       for(int i=0;i<50;i++)
                            System.out.println();

                       break;
                       
                   }
             
              case 3:{
                     System.out.println();
                     System.out.print("GOOD BYE");
                     System.out.println();
                     Thread.sleep(1000);
                     System.exit(0);
                     break;
                   }

            }
         }

       }}
