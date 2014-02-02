import java.util.*;
import java.io.*;
class project
{
    void title()
    {
        
        for(int i=1; i<=24; i++)
        {
            if(i==1 || i==24)
                for(int j=1; j<=79; j++)
                    if(j%4==0)
                        System.out.print((char)30);
                    else if(j%2==0)
                        System.out.print((char)31);
                        else
                        	System.out.print(" ");                        	
                       
            else if(i==7)
                System.out.print((char)16+"   M         M       M    M A T M R I X  M       M A T M R I X  M         M  "+(char)17);
            else if(i==8)                                                             
                System.out.print((char)17+"   AA       AA      A A         A        A A           A         A       A   "+(char)16);
            else if(i==9)
                System.out.print((char)16+"   T T     T T      T T         T        T  T          T          T     T    "+(char)17);
            else if(i==10)
                System.out.print((char)17+"   R  R   R  R     R   R        R        R   R         R           R   R     "+(char)16);
            else if(i==11)
                System.out.print((char)16+"   I   I I   I     I   I        I        I  I          I            I I      "+(char)17);
            else if(i==12)
                System.out.print((char)17+"   X    X    X    X A T X       X        X X           X             X       "+(char)16);
            else if(i==13)              
                System.out.print((char)16+"   I         I    I     I       I        I I           I            I I      "+(char)17);
            else if(i==14)
                System.out.print((char)17+"   R         R   R R I X R      R        R R           R           R   R     "+(char)16);
            else if(i==15)                                                      
                System.out.print((char)16+"   T         T   T       T      T        T  T          T          T     T    "+(char)17);
            else if(i==16)
                System.out.print((char)17+"   A         A  A         A     A        A   A         A         A       A   "+(char)16);
            else if(i==17)                                                                      
                System.out.print((char)16+"   M         M  M         M     M        M    M  M A T M R I X  M         M  "+(char)17);
            else if(i%2==1)
                for(int j=1; j<=79; j++)
                	if(j==1)
                    	System.out.print((char)16);
                    else if(j==79)
                        System.out.print((char)17);
                        else
                            System.out.print(" ");
            else
                for(int j=1; j<=79; j++)
                    if(j==1)
                        System.out.print((char)17);
                    else if(j==79)
                        System.out.print((char)16);
                    else
                        System.out.print(" ");
                    
            System.out.println();
            
        }
    }
    
    void menu()throws Exception
    {    	
    	Scanner sc=new Scanner(System.in);
    	int ch=0;
    	do
    	{
    		for(int i=1; i<=24; i++)
	        {
    	        if(i==1 || i==24)
    	            for(int j=1; j<=79; j++)
            	        if(j%4==0)
                        System.out.print((char)30);
                    else if(j%2==0)
                        System.out.print((char)31);
                        else
                        	System.out.print(" "); 
                
            	else if(i==7)
                    System.out.print((char)17+"\t\t\t\tMain  Menu\t\t\t\t      "+(char)16);
            	else if(i==8)
                    System.out.print((char)16+"\t\t\t\t====  ====\t\t\t\t      "+(char)17);
                else if(i==12)
                    System.out.print((char)16+"\t\t\t\t1. Exit\t\t\t\t\t      "+(char)17);
                else if(i==14) 
                    System.out.print((char)16+"\t\t\t\t2. Continue\t\t\t\t      "+(char)17);                
                else
                {
                    if(i%2==0)
                        for(int j=1; j<=79; j++)
                            if(j==1)
                                System.out.print((char)16);
                            else if(j==79)
                                System.out.print((char)17);
                                else
                                    System.out.print(" ");                    
                    else               
                        for(int j=1; j<=79; j++)
                            if(j==1)
                                System.out.print((char)17);
                            else if(j==79)
                                System.out.print((char)16);
                                else
                                    System.out.print(" ");
                }
	        	System.out.println();
	        }	        
	        System.out.print("Enter your choice (1/2): ");
	        ch=sc.nextInt();	
        }while(ch<0 || ch>2);
		
		if(ch==1)
		{
			for(int i=0; i<24; i++)
				System.out.println();
			System.exit(0);
		}
		else
			matrix();	
	}
	
	void matrix()throws Exception
	{		
        DataInputStream dis=new DataInputStream(System.in);
        Scanner sc=new Scanner(System.in);
    	int r=0, cont=0;
		boolean flag=false;
		for(int i=1; i<25; i++)
	        System.out.println();
	// Entering number of rows
    	do
    	{
    		System.out.print("Enter the Number of Rows (3-20): ");
    		r=sc.nextInt();
    	}while(r<3 || r>20);
    	int m[][]=new int[r][r];	
		System.out.println();
	// Entering Elements in the array
        boolean fl=false;

    	for(int i=0; i<r; i++)
    		for(int j=0; j<r; j++)
    		{
                
                while(true)
                {
                    fl=false;
                        try
                        {
                            System.out.print("m["+(i+1)+"]["+(j+1)+"]: ");
                            m[i][j]=Integer.parseInt(dis.readLine());
                            System.out.println("ccc");
                        }catch(NumberFormatException e)
                        {     
                            fl=true;
                        }

                        if(fl)
                            continue;

                        if(m[i][j]>=0)
                            break;
                    
                }
    		}
    	System.out.println();

	// Printing the matrix		
		System.out.println();
		System.out.println("Matrix:-");
		System.out.println();
		for(int i=0; i<r; i++)
    	{
	    	System.out.print("| ");
    		for(int j=0; j<r; j++)
    			if(m[i][j]>999)
    				System.out.print(m[i][j]+" ");
    			else if(m[i][j]>99)
    				System.out.print(m[i][j]+"  ");
   	 				else if(m[i][j]>9)
    					System.out.print(m[i][j]+"   ");
    					else
    						System.out.print(m[i][j]+"    ");
    		System.out.println("|");
    	}
    	Thread.sleep(2000);
    	System.out.println();
    	System.out.println();
    	System.out.print("Enter any NUMBER to continue... ");
	    cont=sc.nextInt();
    	for(int i=1; i<25; i++)
    		System.out.println();
    	    	
	// Saddle Point    	
        int n=0, min=m[0][0], max=0;
        for(int i=0; i<r; i++)
	    {
    		max=0;
            min=m[i][r-1];
           	for(int j=0; j<r; j++)
           	{	
               	min=Math.min(min, m[i][j]);                
               	if(min==m[i][j])
                   	n=j;
           	}
	        for(int j=0; j<r; j++)
	        	max=Math.max(max, m[j][n]);
	        	    
    	    if(max==min)
        	{                
               	flag=true;
               	break;
	        }
        }
    	for(int i=0; i<r; i++)
    	{
	    	System.out.print("\t| ");
    		for(int j=0; j<r; j++)
    			if(m[i][j]>999)
    				System.out.print(m[i][j]+" ");
    			else if(m[i][j]>99)
    				System.out.print(m[i][j]+"  ");
   	 				else if(m[i][j]>9)
    					System.out.print(m[i][j]+"   ");
    					else
    						System.out.print(m[i][j]+"    ");
    		System.out.println("|");
    	}
    	System.out.println();
    	System.out.println();
    	System.out.println();
    	if(flag)
    		System.out.println("\tSaddle Point Found: "+min);
    	else
    		System.out.println("\tNo Saddle Point Found ");
    	System.out.println();
    	System.out.println();
    	Thread.sleep(2000);
        System.out.print("Enter any NUMBER to continue... ");
    	cont=sc.nextInt();
        for(int i=0 ; i<24; i++)
    		System.out.println();
    	
    	
    // Arranging Elements of the Principle Diagnol in Ascending Order	
    	int d[]=new int[r];
    	for(int i=0; i<r; i++)
    		d[i]=m[i][i];
    	for(int i=0; i<r; i++)
    		for(int j=0; j<r-1; j++)
    			if(d[i]<d[j])
    			{
    				d[i]+=d[j];
    				d[j]=d[i]-d[j];
    				d[i]-=d[j];
    			}
    	for(int i=0; i<r; i++)
    		m[i][i]=d[i];
        System.out.println("Elements of the Principle Diagonal in Ascending Order");
    	for(int i=0; i<r; i++)
    	{
	    	System.out.print("\t| ");
    		for(int j=0; j<r; j++)
    			if(m[i][j]>999)
    				System.out.print(m[i][j]+" ");
    			else if(m[i][j]>99)
    				System.out.print(m[i][j]+"  ");
   	 				else if(m[i][j]>9)
    					System.out.print(m[i][j]+"   ");
    					else
    						System.out.print(m[i][j]+"    ");
    		System.out.println("|");
    		
    	}

    	for(int i=0; i<24-r-8; i++)
    		System.out.println();
    	
    	System.out.print("Enter any NUMBER to continue... ");
    	cont=sc.nextInt();	
	}
}
