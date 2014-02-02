import java.util.*;
import java.io.*;
class inventory
{
    String ino="",des="";
    int qoh=0,rol=0,roq=0;
    boolean a=false,b=false;
    void menu()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<60;i++)
            System.out.println();
        String[] aaa={"fs","fd"};
        pro11th.main(aaa);
        Thread.sleep(1000);
        int ch=0,ch1=0,ch4=0,ne=0,m=0,da=0;
        char c=' ';
        String in="",re="";
        boolean v=false,v1=false;
        for(;;)
        {
        System.out.print("Press Enter to continue..");
        br.readLine();

        for(int i=0;i<60;i++)
            System.out.println();

        System.out.println("Select any one of the following options: ");
        System.out.println("1.Modify Records");
        System.out.println("2.Sell Products");
        System.out.println("3.Veiw Records");
        System.out.println("4.Search for Records");
        System.out.println("5.Exit");
        do
        {
            while(true)
        	{        	
        	try
        	{
        	
				System.out.print("Enter your choice: ");
                ch=Integer.parseInt(br.readLine().trim());
           	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
      		}
        }while(ch<1 || ch>5);
        for(int i=0;i<60;i++)
            System.out.println();
        if(ch==1)
        {
            System.out.println("Select any one of the following options: ");
            System.out.println("1.Add Records");
            System.out.println("2.Delete Records");
            System.out.println("3.Change Re-Order Quantity");
            System.out.println("4.Change Re-Order Level");
            System.out.println("5.Check Quantity On Hand with Re-Order Level");
            do
            {
                
            while(true)
        	{        	
        	try
        	{
        	
				System.out.print("Enter your choice: ");
                ch1=Integer.parseInt(br.readLine().trim());
           	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
      		}
            }while(ch1<1 || ch1>5);
            for(int i=0;i<60;i++)
                System.out.println();
            if(ch1==1)
            {
                for(;;)
                {
                    input();
                    write();
                    sort(inoc());
                    System.out.print("Do you have more records to enter: ");
                    c=br.readLine().trim().charAt(0);
                    if(c=='n' || c=='N')
                        break;
                }
                sort(inoc());
            }
            if(ch1==2)
            {
                for(;;)
                {
                    System.out.print("Enter the item number you want to delete: ");
                    in=br.readLine().trim();
                    v1=validate(in);
                    if(v1)
                    {
                        for(;;)
                        {
                            v=true;
                            System.out.print("Enter the reason for deletion: ");
                            re=br.readLine().trim();
                            if(re.length()>15)
                                v=false;
                            for(int i=0;i<re.length();i++)
                            {       
                                c=re.charAt(i);
                                if(!((c>='A' && c<='Z') || (c==' ') || (c>='a' && c<='z') || (c>'0' && c<='9')))
                                    v=false;
                            }
                            if(v)
                                break;
                        }
                        re=spaces(re," ").trim();
                        re=re.substring(0,re.length()-2);
                        delete(in,re);
                        break;
                    }
                    else
                        System.out.println("Invalid Item Number!");
                }
            }
            if(ch1==3)
            {
                for(;;)
                {
                    System.out.print("Enter the item number for changing ROQ: ");
                    in=br.readLine().trim();
                    v1=validate(in);
                    if(v1)
                        break;
                    else
                        System.out.println("Invalid Item Number!");
                }
                do
                {
                    
                    //ne=Integer.parseInt(br.readLine().trim());
                       while(true)
        {        	
        	try
        	{
        	
            	System.out.print("Enter the new ROQ: ");
            	ne=Integer.parseInt(br.readLine().trim());
        	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
        }
                }while(ne<2);
                update(in,2,ne);
            }
            if(ch1==4)
            {
                for(;;)
                {
                    System.out.print("Enter the item number for changing ROL: ");
                    in=br.readLine().trim();
                    v1=validate(in);
                    if(v1)
                        break;
                    else
                        System.out.println("Invalid Item Number!");
                }
                do
                {
                    
                    while(true)
        {        	
        	try
        	{
        	
            	System.out.print("Enter the new ROL: ");
            	ne=Integer.parseInt(br.readLine().trim());
        	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
        }
                    //ne=Integer.parseInt(br.readLine().trim());
                }while(ne<2);
                update(in,1,ne);
            }
            if(ch1==5)
            {
                rolc(inoc());
            }
        }
        if(ch==2)
        {
            File f1=new File("master.dat");
            if(f1.exists())
            {
                sell();
                sort(inoc());
            }
        }
        if(ch==4)
        {
            File f1=new File("master.dat");
            if(f1.exists())
            {
                    System.out.print("Enter the item number for searching: ");
                    in=br.readLine().trim();
                    v1=validate(in);
                    if(v1)
                        System.out.println("Record Found!");
                    else
                        System.out.println("Record Not Found!");
            }
        }
        if(ch==3)
        {
            System.out.println("Select any one of the following options: ");

            System.out.println("1.Master File");
            System.out.println("2.Sales File");
            System.out.println("3.Reorder File");
            System.out.println("4.Deletion File");
            System.out.println("5.Daily Report");
            System.out.println("6.Monthly Report");

            do
            {
                while(true)
        {        	
        	try
        	{
        	
            	System.out.print("Enter your choice: ");
            	ch4=Integer.parseInt(br.readLine().trim());
        	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
        }
                //ch4=Integer.parseInt(br.readLine().trim());
            }while(ch4<1 || ch4>6);
            for(int i=0;i<60;i++)
                System.out.println();
            if(ch4>=1 && ch4<=4)
                read(ch4);
            else
            {
                do
                {
                    while(true)
                    {         
                    try
                    {
        	
                        System.out.print("Enter the month no. ");
                        m=Integer.parseInt(br.readLine().trim());
                    }catch(NumberFormatException ravi)
                    {            
                        continue;
                    }
                    break;
                    }
                }while(m<1 || m>12);
                if(ch4==6)
                {
                    repor(m,-1);
                }
                else
                {
                    int[] aa={31,29,31,30,31,30,31,31,30,31,30,31};
                do
                {
                    while(true)
                    {         
                    try
                    {
        	
                        System.out.print("Enter the date: ");
                        da=Integer.parseInt(br.readLine().trim());
                    }catch(NumberFormatException ravi)
                    {            
                        continue;
                    }
                    break;
                    }
                }while(da<1 || da>aa[m-1]);
                repor(m,da);    
                }
            }
        }
        if(ch==5)
            System.exit(0);
        }
    }

    // accepts data from user and stores it in properties
    // --------------------------------------------------

    void input()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean v=true;
        int ctr1=0;
        char c=' ';
        /*for(;;)
        {
            v=true;
            ctr1=0;
            System.out.print("Enter Item Number(eg. I001): ");
            ino=br.readLine().trim().toUpperCase();
            if(ino.length()!=4)
            {
                v=false;
                continue;
            }
            if(ino.charAt(0)!='I' && ino.charAt(0)!='i')
                v=false;
            for(int i=1;i<4;i++)
            {
                if(!(ino.charAt(i)>='0' && ino.charAt(i)<='9'))
                    v=false;
            }
            if(!(validate(ino)) && v)
                break;
            
        }*/
        for(;;)
        {
            v=true;
            ctr1=0;
            System.out.print("Enter the Description: ");
            des=br.readLine().trim();
            if(des.length()>15)
                v=false;
            for(int i=0;i<des.length();i++)
            {
                c=des.charAt(i);
                if(!((c>='A' && c<='Z') || (c>='a' && c<='z') || (c==' ') || (c>'0' && c<='9')))
                    v=false;
                if(c>='0' && c<='9')
                    ctr1++;
            }
            if(ctr1==des.length())
            {
                v=false;
            }
            if(v)
                break;
        }
        des=spaces(des," ").trim();
        des=des.substring(0,des.length()-2);
        String t1="";
        ctr1=0;
        while(true)
        {        	
        	try
        	{
        	
            	System.out.print("Enter Quantity on Hand: ");
            	qoh=Integer.parseInt(br.readLine().trim());
        	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
        }
        
               
        ctr1=0;
        do
        {
            System.out.print("Enter Re-order level: ");
            t1=br.readLine().trim();
            ctr1=0;
            for(int i=0;i<t1.length();i++)
            {
                c=t1.charAt(i);
                if(c>='0' && c<='9')
                    ctr1++;
            }
            if(!(ctr1==t1.length()))
            {
                continue;
            }
            rol=Integer.parseInt(t1);
        }while(rol<2);
        ctr1=0;
        do
        {
            System.out.print("Enter Re-order quantity: ");
            t1=br.readLine().trim();
            ctr1=0;
            for(int i=0;i<t1.length();i++)
            {
                c=t1.charAt(i);
                if(c>='0' && c<='9')
                    ctr1++;
            }
            if(!(ctr1==t1.length()))
            {
                continue;
            }
            roq=Integer.parseInt(t1);
        }while(roq<rol);
    }

    // checks weather or not the item numer exists in master file or not
    //------------------------------------------------------------------

    boolean validate(String in)throws Exception
    {
        boolean v=false;
        int to=0,ctr=0;
        File f=new File("master.dat");
        if(f.exists())
        {
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            while(to!=-1)
            {
                to=st.nextToken();
                if(in.equalsIgnoreCase(st.sval))
                    v=true;
                to=st.nextToken();
                to=st.nextToken();
                to=st.nextToken();
                while(to!=10 && to!=-1)
                {
                    to=st.nextToken();
                }
            }
            fr.close();
        }
        else
            v=false;
        return v;
    }

    // reads the file and prints the records
    // -------------------------------------

    void read(int x)throws Exception
    {
        String s="";
        if(x==1)
            s="master.dat";
        if(x==2)
            s="sell.dat";
        if(x==3)
            s="reorder.dat";
        if(x==4)
            s="deleted.dat";
        File f=new File(s);
        if((f.exists()))
        {
            int to=0,ctr=1;
            String[] ou;
            FileReader fr=new FileReader(s);
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            if(x==1)
            {
                System.out.println("Ino\tDes\t\t  Roq\tQoh\tRol");
            }
            if(x==2)
            {
                System.out.println("Date\t\t  Ino\tQs");
            }
            if(x==3)
            {
                System.out.println("ino\tDate\t\t  Times Reorder\tGrade");
            }
            if(x==4)
            {
                System.out.println("Dat\t\t  Ino\tDes\t\t  Res");
            }
                int sp=0;
                while(to!=-1)
                {
                    sp=0;
                    if(to==-3)
                    {
                        if(x==1 || x==3)
                            if(ctr==1)
                                System.out.print(st.sval+"\t");
                            else
                            {
                                ou=st.sval.split("00");
                                for(int i=0;i<ou.length;i++)
                                {
                                    System.out.print(ou[i]+" ");
                                    sp+=ou[i].length()+1;
                                }
                                sp=18-sp-1;
                                for(int i=0;i<=sp;i++)
                                    System.out.print(" ");
                            }
                        else
                        {
                        	//System.out.println("\n"+st.sval);
                            if(ctr==2)
                                System.out.print(st.sval+"\t");
                            else
                            {
                                ou=st.sval.split("00");
                                for(int i=0;i<ou.length;i++)
                                {
                                    System.out.print(ou[i]+" ");
                                    sp+=ou[i].length()+1;
                                }
                                sp=18-sp-1;
                                for(int i=0;i<=sp;i++)
                                    System.out.print(" ");
                            }
    					}
                            ctr++;
                    }
                    if(to==-2)
                    {
                        System.out.print((int)st.nval+"\t");
                        ctr++;
                    }
                    if(to==10)
                    {
                        ctr++;
                        if(x==1)
                            if(ctr==7)
                            {
                                System.out.println();
                                ctr=1;
                            }
                            else
                                ctr--;
                        if(x==2)
                            if(ctr==5)
                            {
                                System.out.println();
                                ctr=1;
                            }
                            else
                                ctr--;
                        if(x==3)
                            if(ctr==6)
                            {
                                System.out.println();
                                ctr=1;
                            }
                            else
                                ctr--;
                        if(x==4)
                            if(ctr==6)
                            {
                                System.out.println();
                                ctr=1;
                            }
                            else
                                ctr--;
                    }
                    to=st.nextToken();
                }
            fr.close();
        }   
    }
    String inoe(int ctr1) throws Exception
    {
        String t1="I";
        int ctr=1,nu=1,str=1,to=0,k=0;
        File f1=new File("master.dat");
        if(f1.exists())
        {
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            to=st.nextToken();
            ctr1=inoc();
            String[] ino=new String[ctr1];
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(str==1)
                    {
                        str++;
                        ino[k]=st.sval;
                        k++;
                    }
                    else if(str==2)
                    {
                        str=1;
                    }
                }
                to=st.nextToken();
            }
            fr.close();
            //System.out.println(Integer.parseInt(ino[ino.length-1].substring(1))+1);
            int t2=Integer.parseInt(ino[ino.length-1].substring(1))+1;
            if(t2<10)
                t1+="00"+String.valueOf(t2);
            else if(t2<100)
                t1+="0"+String.valueOf(t2);
            else
                t1+=String.valueOf(t2);
        }
        else
            t1="I001";
        return t1;
    }

    // writes the properties into master file
    // --------------------------------------

    void write()throws Exception
    {
        FileOutputStream fos=new FileOutputStream("master.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        ino=inoe(0);
        System.out.println("The INO Generated is "+ino);
        dos.writeUTF(ino.trim());
        dos.writeUTF(des);
        dos.writeUTF(String.valueOf(roq));
        dos.writeUTF(String.valueOf(qoh));
        dos.writeUTF(String.valueOf(rol));
        dos.writeUTF("\n");

        dos.close();
        bos.close();
        fos.close();
    }

    // change spaces to 00 using string tokenizer
    //-------------------------------------------

    String spaces(String d,String c)
    {
        String t="";
        StringTokenizer st;st=new StringTokenizer(d,c);
        while(st.hasMoreTokens())  
        {
            if(c.equals(" "))
                t+=st.nextToken()+"00";
            if(c.equals("00"))
                t+=st.nextToken()+" ";
        }
        //System.out.println(d+"\n"+t);
        return t;
    }

    //
    //

    void repor(int m,int da)throws Exception
    {
        int ctr1=0,sp=0;
        int ctr=1,nu=1,str=1,to=0,k=0;
        String[] ou;
        //File f1=new File("master.dat");
        //if(f1.exists())
        //{
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            to=st.nextToken();
            ctr1=inoc();
            int[] qoh=new int[ctr1];
            String[] ino=new String[ctr1];
            String[] des=new String[ctr1];
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(str==1)
                    {
                        str++;
                        ino[k]=st.sval;
                    }
                    else if(str==2)
                    {
                        str=1;
                        des[k]=st.sval;
                    }
                }
                if(to==-2)
                {
                    if(nu==1)
                    {
                        nu++;
                    }
                    else if(nu==2)
                    {
                        qoh[k]=(int)st.nval;
                        nu++;
                    }
                    else if(nu==3)
                    {
                        nu=1;
                        k++;
                    }
                }
                to=st.nextToken();
            }
            fr.close();
        //}
        ctr=1;nu=1;str=1;to=0;k=0;
        //File f2=new File("sell.dat");
        //if(f2.exists())
        //{
            a=true;
            ctr1=inoc();
            FileReader fr1=new FileReader("sell.dat");
            StreamTokenizer st1=new StreamTokenizer(fr1);
            st1.eolIsSignificant(true);
            to=st1.nextToken();
            int[] qs=new int[ctr1];
            String[] dat=new String[ctr1];
            String[] ino1=new String[ctr1];
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(str==1)
                    {
                        dat[k]=st1.sval;
                        str++;
                    }
                    else if(str==2)
                    {
                        str=1;
                        ino1[k]=st1.sval;
                    }
                }
                if(to==-2)
                {
                    qs[k]=(int)st1.nval;
                    k++;
                }
                to=st1.nextToken();
            }
            fr1.close();
        //}
        String[] mo={"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        ctr=1;nu=1;str=1;to=0;k=0;
        File f3=new File("reorder.dat");
        //if(f3.exists())
        //{
            b=true;
            ctr1=inoc();
            FileReader fr2=new FileReader("reorder.dat");
            StreamTokenizer st2=new StreamTokenizer(fr2);
            st2.eolIsSignificant(true);
            to=st2.nextToken();
            String[] ino2=new String[ctr1];
            String[] gra=new String[ctr1];
            String[] dat1=new String[ctr1];
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(str==2)
                    {
                        dat1[k]=st2.sval;
                        str++;
                    }
                    else if(str==1)
                    {
                        str++;
                        ino2[k]=st2.sval;
                    }
                    else if(str==3)
                    {
                        str=1;
                        gra[k]=st2.sval;
                        k++;
                    }
                }
                to=st2.nextToken();
            }
            fr2.close();
        //}
        int qs1=0,b=0;
        System.out.println("INO\tDES\t\t  QOH\tQS\tGRADE");
        for(int i=0;i<ino.length;i++,qs1=0,b=0,sp=0)
        {   /*
            System.out.print(ino[i]+"\t");
            ou=des[i].split("00");
            for(int i=0;i<ou.length;i++)
            {
                System.out.print(ou[i]+" ");
                sp+=ou[i].length()+1;
            }
            sp=15-sp-1;
            for(int i=0;i<=sp;i++)
                System.out.print(" ");
            System.out.print(qoh[i]+"\t");
            */
            if(da==-1)
            {
                for(int j=0;j<ino1.length;j++)
                {
                    if((dat[j].substring(0,3)).equalsIgnoreCase(mo[m-1]))
                        if(ino1[j].equalsIgnoreCase(ino[i]))
                            qs1+=qs[j];
                }
                    //System.out.print(qs1+"\t");

                if(qs1!=0)
                {
                    System.out.print(ino[i]+"\t");
                    ou=des[i].split("00");
                    for(int q=0;q<ou.length;q++)
                    {
                        System.out.print(ou[q]+" ");
                        sp+=ou[q].length()+1;
                    }
                    sp=18-sp-1;
                    for(int q=0;q<=sp;q++)
                        System.out.print(" ");
                    System.out.print(qoh[i]+"\t");
                    System.out.print(qs1+"\t");
                }
                for(;b<ino2.length;b++)
                {
                    if((dat1[b].substring(0,3)).equalsIgnoreCase(mo[m-1]))
                        if(ino[b].equalsIgnoreCase(ino[i]))
                        {                
                            if(qs1!=0)
                            System.out.println(gra[b]);
                            break;
                        }
                }
                if(b>=ino2.length)
                    if(qs1!=0)
                        System.out.println("Poor");
            }
            else
            {
                for(int j=0;j<ino1.length;j++)
                {
                    if((dat[j].substring(0,3)).equalsIgnoreCase(mo[m-1]))
                        if(Integer.parseInt((dat[j].substring(5,7)))==da)
                            if(ino1[j].equalsIgnoreCase(ino[i]))
                                qs1+=qs[j];
                }
                    //System.out.print(qs1+"\t");

                if(qs1!=0)
                {
                    System.out.print(ino[i]+"\t");
                    ou=des[i].split("00");
                    for(int q=0;q<ou.length;q++)
                    {
                        System.out.print(ou[q]+" ");
                        sp+=ou[q].length()+1;
                    }
                    sp=18-sp-1;
                    for(int q=0;q<=sp;q++)
                        System.out.print(" ");
                    System.out.print(qoh[i]+"\t");
                    System.out.print(qs1+"\t");
                }
                for(;b<ino2.length;b++)
                {
                    if((dat1[b].substring(0,3)).equalsIgnoreCase(mo[m-1]))
                        if(Integer.parseInt((dat1[b].substring(5,7)))==da)
                            if(ino[b].equalsIgnoreCase(ino[i]))
                            {
                            if(qs1!=0)
                                System.out.println(gra[b]);
                                break;
                            }
                }
                if(b>=ino2.length)
                            if(qs1!=0)
                    System.out.println("Poor");
            }
            
        }
    }

    // deletes the ino which is recieved in parameter
    // ----------------------------------------------

    void delete(String in,String re)throws Exception
    {
        int to=0;
        FileReader fr=new FileReader("master.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);

        FileOutputStream fos=new FileOutputStream("master2.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        
        FileOutputStream f=new FileOutputStream("deleted.dat",true);
        BufferedOutputStream b=new BufferedOutputStream(f);
        DataOutputStream d=new DataOutputStream(b);
        
        while(to!=-1)
        {
            to=st.nextToken();
            if(to==-1)
                break;
            if(in.equalsIgnoreCase(st.sval))
            {
                Date da=new Date();
                String s=da.toString();
                s=s.substring(4,7)+"00"+s.substring(8,10)+"00"+s.substring(24);
                d.writeUTF(s.trim());
                d.writeUTF(st.sval.trim());
                to=st.nextToken();
                if(to==-1)
                    break;
                if(to==10)
                    to=st.nextToken();
                d.writeUTF(st.sval.trim());
                
                d.writeUTF(re.trim());
                d.writeUTF("\n");
                to=st.nextToken();
                to=st.nextToken();
                while(to!=10 && to!=-1)
                {
                    to=st.nextToken();
                }
            }
            else
            { 
                dos.writeUTF(st.sval.trim());
                to=st.nextToken();
                if(to==-1)
                    break;
                if(to==10)
                    to=st.nextToken();
                dos.writeUTF(st.sval.trim());
                to=st.nextToken();
                if(to==-1)
                    break;
                if(to==10)
                    to=st.nextToken();
                dos.writeUTF(String.valueOf(st.nval).trim());
                to=st.nextToken();
                if(to==10)
                    to=st.nextToken();
                dos.writeUTF(String.valueOf(st.nval).trim());
                to=st.nextToken();
                if(to==10)
                    to=st.nextToken();
                dos.writeUTF(String.valueOf(st.nval).trim());
                to=st.nextToken();
                dos.writeUTF("\n");
            }
        }

        d.close();
        b.close();
        f.close();
        
        dos.close();
        bos.close();
        fos.close();

        fr.close();
        File f1=new File("master.dat");
        File f2=new File("master2.dat");
        f1.delete();
        f2.renameTo(f1);
        f2.delete();

    }
    void rolc(int ctr1)throws Exception
    {
        int ctr=1,nu=1,str=1,to=0,k=0;
        char c=' ';
        File f1=new File("master.dat");
        if(f1.exists())
        {
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            to=st.nextToken();
            int[] roq=new int[ctr1];
            int[] qoh=new int[ctr1];
            int[] rol=new int[ctr1];
            String[] ino=new String[ctr1];
            String[] des=new String[ctr1];
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(str==1)
                    {
                        str++;
                        ino[k]=st.sval;
                    }
                    else if(str==2)
                    {
                        str=1;
                        des[k]=st.sval;
                    }
                }
                if(to==-2)
                {
                    if(nu==1)
                    {
                        roq[k]=(int)st.nval;
                        nu++;
                    }
                    else if(nu==2)
                    {
                        qoh[k]=(int)st.nval;
                        nu++;
                    }
                    else if(nu==3)
                    {
                        rol[k]=(int)st.nval;
                        nu=1;
                        k++;
                    }
                }
                to=st.nextToken();
            }
            fr.close();

            for(int i=0;i<ctr1;i++)
            {
                if(qoh[i]<rol[i])
                {
                    System.out.print("The qoh for "+ino[i]+" is lesser than Rol, Do you want to reorder? ");    
                    c=br.readLine().trim().charAt(0);
                    if(c=='y' || c=='Y')
                        update(ino[i],3,0);
                }
            }
        }
    }
    void sort(int ctr1)throws Exception
    {
        int ctr=1,nu=1,str=1,to=0,k=0;
        File f1=new File("master.dat");
        if(f1.exists())
        {
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            to=st.nextToken();

            int[] roq=new int[ctr1];
            int[] qoh=new int[ctr1];
            int[] rol=new int[ctr1];
            String[] ino=new String[ctr1];
            String[] des=new String[ctr1];
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(str==1)
                    {
                        str++;
                        ino[k]=st.sval;
                    }
                    else if(str==2)
                    {
                        str=1;
                        des[k]=st.sval;
                    }
                }
                if(to==-2)
                {
                    if(nu==1)
                    {
                        roq[k]=(int)st.nval;
                        nu++;
                    }
                    else if(nu==2)
                    {
                        qoh[k]=(int)st.nval;
                        nu++;
                    }
                    else if(nu==3)
                    {
                        rol[k]=(int)st.nval;
                        nu=1;
                        k++;
                    }
                }
                to=st.nextToken();
            }
            fr.close();
            String t1="";
            int t2=0;
            for(int i=0;i<ctr1;i++)
                for(int j=0;j<ctr1-1;j++)
                {
                    if(ino[j].compareTo(ino[j+1])>0)
                    {
                        t1=ino[j+1];
                        ino[j+1]=ino[j];
                        ino[j]=t1;

                        t1=des[j+1];
                        des[j+1]=des[j];
                        des[j]=t1;

                        t2=roq[j+1];
                        roq[j+1]=roq[j];
                        roq[j]=t2;

                        t2=qoh[j+1];
                        qoh[j+1]=qoh[j];
                        qoh[j]=t2;

                        t2=rol[j+1];
                        rol[j+1]=rol[j];
                        rol[j]=t2;
                    }
                }
            FileOutputStream fos=new FileOutputStream("master2.dat",true);
            BufferedOutputStream bos=new BufferedOutputStream(fos);
            DataOutputStream dos=new DataOutputStream(bos);
            for(int i=0;i<ctr1;i++)
            {
                dos.writeUTF(ino[i]);
                dos.writeUTF(des[i]);
                dos.writeUTF(String.valueOf(roq[i]));
                dos.writeUTF(String.valueOf(qoh[i]));
                dos.writeUTF(String.valueOf(rol[i]));
                dos.writeUTF("\n");
            }
            dos.close();
            bos.close();
            fos.close();

            File f2=new File("master2.dat");
            f1.delete();
            f2.renameTo(f1);
            f2.delete();

        }
    }

    // counts the no. of records
    // -------------------------

    int inoc()throws Exception
    {
        int ctr=1,ctr1=0;
        int to=0;
        String s1="";
        if(a)
            s1="sell.dat";
        else if(b)
            s1="reorder.dat";
        else
            s1="master.dat";
        File f=new File(s1);
        if(f.exists())
        {
            FileReader fr=new FileReader(s1);
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            while(to!=-1)
            {
                to=st.nextToken();
                if(to==-1)
                    break;
                if(to==-3)
                {
                    if(ctr==1)
                    {
                        ctr1++;
                        ctr++;
                    }           
                    else if(ctr==2)
                    {
                        if(!b)
                            ctr=1;
                        else
                            ctr++;
                    }
                    else if(ctr==3)
                        ctr=1;
                }
            }           
            fr.close();
        }
        a=false;
        b=false;
        return ctr1;
    }

    //
    //
    //

    void update(String in,int t,int ch)throws Exception
    {
        int to=0,ro=0;
        int ctr1=1,ctr2=1,k=0;
        boolean f=false;

        File f1=new File("master.dat");
        if(f1.exists())
        {
        FileReader fr=new FileReader("master.dat");
        StreamTokenizer st=new StreamTokenizer(fr);
        st.eolIsSignificant(true);

        FileOutputStream fos=new FileOutputStream("master2.dat",true);
        BufferedOutputStream bos=new BufferedOutputStream(fos);
        DataOutputStream dos=new DataOutputStream(bos);
        while(to!=-1)
        {
            if(to==-3)
            {
                if(ctr1==1)
                {
                    dos.writeUTF(st.sval.trim());
                    ctr1++;
                    if(in.equalsIgnoreCase(st.sval))
                    {
                        f=true;
                        in=st.sval;
                    }
                }
                else if(ctr1==2)
                {
                    dos.writeUTF(st.sval.trim());
                    ctr1=1;
                }
            }
            if(to==-2)
            {
                if(ctr2==1)
                {
                    if(f)
                    {
                        ro=(int)st.nval;
                        if(t==2)
                            dos.writeUTF(String.valueOf(ch).trim());
                        else
                            dos.writeUTF(String.valueOf(st.nval).trim());
                    }
                    else
                        dos.writeUTF(String.valueOf(st.nval).trim());
                    ctr2++;
                }
                else if(ctr2==2)
                {
                    ctr2++;
                    if(f)
                    {
                        if(t==3)
                        {
                            dos.writeUTF(String.valueOf((st.nval+ro)).trim());
                        }
                        else if(t==4)
                        {
                            dos.writeUTF(String.valueOf((st.nval-ch)).trim());
                            System.out.println((st.nval-ch));
                        }
                        else
                            dos.writeUTF(String.valueOf(st.nval).trim());
                    }
                    else
                        dos.writeUTF(String.valueOf(st.nval).trim());
                            
                }

                else if(ctr2==3)
                {
                    ctr2=1;
                    if(f)
                    {
                        if(t==1)
                        {
                            dos.writeUTF(String.valueOf(ch).trim());
                        }
                        else
                            dos.writeUTF(String.valueOf(st.nval).trim());
                    }
                    else
                        dos.writeUTF(String.valueOf(st.nval).trim());
                }
            }
            if(to==10)
            {
                if(f)
                    f=false;
                dos.writeUTF("\n");
            }
            to=st.nextToken();
        }

        dos.close();
        bos.close();
        fos.close();

        fr.close();
        File f2=new File("master2.dat");
        f1.delete();
        f2.renameTo(f1);
        f2.delete();
        if(t==3)
        {
        FileOutputStream fo=new FileOutputStream("reorder2.dat",true);
        BufferedOutputStream bo=new BufferedOutputStream(fo);
        DataOutputStream d=new DataOutputStream(bo);
        String s="";
        int t3=0;
        File f3=new File("reorder.dat");
        if(f3.exists())
        {
            int ctr=1;
            boolean z=false,x=false;
            FileReader fr1=new FileReader("reorder.dat");
            StreamTokenizer st1=new StreamTokenizer(fr1);
            st1.eolIsSignificant(true);
            to=st1.nextToken();
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(ctr==1)
                    {
                        ctr++;
                        d.writeUTF(st1.sval.trim());
                        if(in.equalsIgnoreCase(st1.sval))
                        {
                            z=true;
                            x=true;
                        }
                    }
                    else if(ctr==2)
                    {
                        if(z)
                        {
                            Date d1=new Date();
                            s=d1.toString();
                            s=s.substring(4,7)+"00"+s.substring(8,10)+"00"+s.substring(24);
                            d.writeUTF(s.trim());
                        }
                        else
                            d.writeUTF(st1.sval.trim());  
                        ctr++;
                    }
                    else if(ctr==3)
                    {
                        ctr=1;
                        /*if(z)
                            t3=(int)(st1.nval+1);
                        else
                            t3=(int)st1.nval;
                        */
                        if(t3>2)
                            d.writeUTF("Excellent");
                        else if(t3>1)
                            d.writeUTF("Good");
                        else if(t3>0)
                            d.writeUTF("Average");
                        else
                            d.writeUTF("Poor");
                    }
                }
                if(to==-2)
                {
                    if(z)
                    {
                        d.writeUTF(String.valueOf((t3=(int)(st1.nval+1))));
                    }
                    else
                    {
                        d.writeUTF(String.valueOf(t3=(int)st1.nval));
                    }
                }
                if(to==10)
                {
                    d.writeUTF("\n");
                    if(ctr==1)
                        z=false;
                }
                to=st1.nextToken();
            }
            if(!x)
            {
                Date d3=new Date();
                s=d3.toString();
                s=s.substring(4,7)+"00"+s.substring(8,10)+"00"+s.substring(24);
                d.writeUTF(in.trim());
                d.writeUTF(s.trim());
                d.writeUTF(String.valueOf((t3=(rotc(in)+1))).trim());
                if(t3>2)
                    d.writeUTF("Excellent");
                else if(t3>1)
                    d.writeUTF("Good");
                else if(t3>0)
                    d.writeUTF("Average");
                else
                    d.writeUTF("Poor");
                d.writeUTF("\n");
            }
            fr1.close();
        }
        else
        {
            Date d2=new Date();
            s=d2.toString();
            s=s.substring(4,7)+"00"+s.substring(8,10)+"00"+s.substring(24);
            d.writeUTF(in.trim());
            d.writeUTF(s.trim());
            d.writeUTF(String.valueOf((t3=(rotc(in)+1))).trim());
            if(t3>2)
                d.writeUTF("Excellent");
            else if(t3>1)
                d.writeUTF("Good");
            else if(t3>0)
                d.writeUTF("Average");
            else
                d.writeUTF("Poor");
            d.writeUTF("\n");
        }
        d.close();
        bo.close();
        fo.close();
        File f4=new File("reorder2.dat");
        f3.delete();
        f4.renameTo(f3);
        f4.delete();
        }
        }
    }

    //
    //
    //
    int rotc(String in)throws Exception
    {
        File f1=new File("reorder.dat");
        int k=0;
        if(f1.exists())
        {
            FileReader fr=new FileReader("reorder.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            int to=st.nextToken();
            int ctr=1;
            boolean f=false;
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(ctr==2)
                        ctr++;
                    else if(ctr==1)
                    {
                        if(in.equalsIgnoreCase(st.sval))
                            f=true;
                        ctr++;
                    }
                    else if(ctr==3)
                        ctr=1;
                }
                if(to==-2)
                    if(f)
                        k=(int)st.nval;
                to=st.nextToken();
            }

            fr.close();
        }
        return k;
    }
    //
    //check weather the input quantity(qs) of item no.(in) is less than t=1 ->qoh t=2 ->rol
    //-------------------------------------------------------------------------------------

    boolean qcheck(String in,int qs,int t)throws Exception
    {
        int to=0;
        boolean v=false,f=false;
        File f1=new File("master.dat");
        if(f1.exists())
        {
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            int ctr1=1,ctr2=1;
            //redo
            to=st.nextToken();
            while(to!=-1)
            {
                if(to==-3)
                {
                    if(ctr1==1)
                    {
                        ctr1++;
                        if(in.equalsIgnoreCase(st.sval))
                            f=true;
                    }
                    else if(ctr1==2)
                    {
                        ctr1=1;
                    }
                }
                if(to==-2)
                {
                    if(ctr2==1)
                    {
                        ctr2++;
                    }
                    else if(ctr2==2)
                    {
                        ctr2++;
                        if(f)
                            if(t==1)
                            {
                                if(qs<=st.nval)
                                    v=true;
                            }
                            else if(t==2)
                            {
                                qs=(int)st.nval;
                            }
                    }
                    else if(ctr2==3)
                    {
                        ctr2=1;
                        if(f)
                            if(t==2)
                                if(qs<=st.nval)
                                {
                                    v=true;
                                }
                    }
                }
                if(to==10)
                    if(f)
                        f=false;
                to=st.nextToken();
            }
            fr.close();
        }
        return v;
    }
    void sell()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean v=true;
        File f=new File("master.dat");
        if(f.exists())
        {
            FileReader fr=new FileReader("master.dat");
            StreamTokenizer st=new StreamTokenizer(fr);
            st.eolIsSignificant(true);
            String in="";
            int to=0,qs=0;
            for(;;)
            {
                for(;;)
                {
                    v=true;
                    System.out.print("Enter Item Number(eg. I001): ");
                    in=br.readLine().trim();
              
                    if(in.length()!=4)
                    {
                      v=false;
                      continue;
                    }       
                    if(in.charAt(0)!='I' && in.charAt(0)!='i')
                        v=false;
                    for(int i=1;i<4;i++)
                    {
                        if(!(in.charAt(i)>='0' && in.charAt(i)<='9'))
                            v=false;
                    }
                    v=(validate(in) && v);
                    if(!v)
                    {
                        System.out.println("Invalid Item Number!");
                    }
                    if(v)
                        break;
                }
                v=false;
                for(;;)
                {
            while(true)
        	{        	
        	try
        	{
        	
                    System.out.print("Enter the Quatity Sold: ");
                    qs=Integer.parseInt(br.readLine().trim());
           	}catch(NumberFormatException ravi)
        	{        		
        		continue;
        	}
       		break;
      		}
                    

                    v=qcheck(in,qs,1);
                    if(!v)
                    {
                        System.out.println("Insufficient quantity on hand!");
                        continue;
                    }
                    break;
                }
                Date d=new Date();
                String s=d.toString();
                s=s.substring(4,7)+"00"+s.substring(8,10)+"00"+s.substring(24);
                FileOutputStream fos=new FileOutputStream("sell.dat",true);
                BufferedOutputStream bos=new BufferedOutputStream(fos);
                DataOutputStream dos=new DataOutputStream(bos);
                dos.writeUTF(s.trim());
                dos.writeUTF(in.trim());
                dos.writeUTF(String.valueOf(qs).trim());
                dos.writeUTF("\n");
                
                dos.close();
                bos.close();
                fos.close();
                break;
            }
            fr.close();
            update(in,4,qs);

        }
    }
}
/*
File Structures

File 1(Master File)
_______________________________
| INO | Des | ROQ | QOH | ROL |
|-----|-----|-----|-----|-----|
|     |     |     |     |     |
|     |     |     |     |     |
|_____|_____|_____|_____|_____|

File 2(Sales File)
___________________
| Date | INO | Qs |
|------|-----|----|
|      |     |    | 
|      |     |    | 
|______|_____|____|

File 3(Reorder File)
________________________________________
| INO | Date | Times reordered | Grade |
|-----|------|-----------------|-------| 
|     |      |                 |       |
|     |      |                 |       |
|_____|______|_________________|_______|

File 4(Deletion File)
_____________________________
| Date | INO | Des | Reason |
|------|-----|-----|--------| 
|      |     |     |        | 
|      |     |     |        | 
|______|_____|_____|________|

*/
