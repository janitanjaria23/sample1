import java.io.*;
class magicSquare
{
    int n=0;
    //has the title printed
    //---------------------------------------------------------------------------------------------
    void title()throws Exception
    {
        for(int i=0;i<10;i++)
            System.out.println();
        System.out.println("               **   **   *******   *******   *******   *******");
        System.out.println("               *** ***   *******   *******   *******   *******");
        System.out.println("               ** * **   **   **   **           **     **     ");
        System.out.println("               **   **   **   **   **           **     **     ");
        System.out.println("               **   **   *******   **   **      **     **     ");
        System.out.println("               **   **   *******   **   **      **     **     ");
        System.out.println("               **   **   **   **   *******   *******   *******");
        System.out.println("               **   **   **   **   *******   *******   *******");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("       *******    *******    **   **    *******    *******    *******");
        System.out.println("       *******    *******    **   **    *******    *******    *******");
        System.out.println("       **         **   **    **   **    **   **    **   **    **     ");
        System.out.println("       *******    **   **    **   **    **   **    *******    *******");
        System.out.println("       *******    **   **    **   **    *******    *******    *******");
        System.out.println("            **    **  * *    **   **    *******    ****       **     ");
        System.out.println("       *******    **** *     *******    **   **    ** **      *******");
        System.out.println("       *******    ***** *    *******    **   **    **  **     *******");
        Thread.sleep(3000);
        for(int i=0;i<10;i++)
            System.out.println();
    }
    //method for printing the menu & invoke related methods
    //---------------------------------------------------------------------------------------------
    void menu()throws Exception
    {
        boolean fl=false;
        int ch=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        for(;;)
        {
            for(int i=0;i<75;i++)
                System.out.println();
            System.out.println(" \t\t\t*   *\t****\t*   *\t*   *");
            System.out.println(" \t\t\t** **\t*   \t**  *\t*   *");
            System.out.println(" \t\t\t* * *\t****\t* * *\t*   *");
            System.out.println(" \t\t\t*   *\t*   \t*  **\t*   *");
            System.out.println(" \t\t\t*   *\t****\t*   *\t*****");
            System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
            System.out.println("\t      1.Method 1(Entering both the sum & rows)");
            System.out.println();System.out.println();
            System.out.println("\t      2.Method 2(Entering only the sum)");
            System.out.println();System.out.println();
            System.out.println("\t      3.Method 3(Entering only the rows)");
            System.out.println();System.out.println();
            System.out.println("\t      4.Method 4(Entering only the rows for a square with decimal nos.)");
            System.out.println();System.out.println();
            System.out.println("\t      5.Exit");
            System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();System.out.println();
            //accepting the choice
            //---------------------------------------------------------------------------------------------
             while(true)
             {
             	fl=false;
                try
                {
                	System.out.print("Enter your choice(1-5): ");
                	ch= Integer.parseInt(br.readLine());
                }catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(ch>0 && ch<6)
                     	break;
            }
            if(ch==5)
            {
                for(int i=0;i<75;i++)
                    System.out.println();
                System.exit(0);
            }
            if(ch==1)
            {
                prime();
                printer(filler(method1()));
            }
            if(ch==2)
            {
                prime();
                printer(filler(method2()));
            }
            if(ch==3)
                printer(filler(method3()));
            if(ch==4)
            	decimal();
        }
    }
    //prints the final square
    //---------------------------------------------------------------------------------------------
    void printer(int a[][])throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0,d1=0,d2=0;
        char c=' ';
        String g="";
        for(int i=0;i<75;i++)
            System.out.println();
        //printing
        //---------------------------------------------------------------------------------------------
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                if(a[i][j]>999)
                    System.out.print(" "+a[i][j]);
                else if(a[i][j]>99)
                    System.out.print("  "+a[i][j]);
                else if(a[i][j]>9)
                    System.out.print("   "+a[i][j]);
                else
                    System.out.print("    "+a[i][j]);
            System.out.println();System.out.println();System.out.println();
        }
        System.out.print("Press any key to continue....");
        g=br.readLine();
        //calculating sum
    	//---------------------------------------------------------------------------------------------
        do
    	 {
    	 	System.out.print("Do you wish to see the sum of all rows columns & diagonals?(y/n) ");
            c=br.readLine().toLowerCase().charAt(0);
    	 }while(c!='y' && c!='n');
    	 if(c=='y')
    	 {
    	 	//rows
    	 	System.out.println("Rows:");
    	 	for(int i=0;i<n;i++)
    		{
    			for(int j=0;j<n;j++)
    				s+=a[i][j];
    			System.out.println("the sum of row "+(i+1)+" = "+s);
    			s=0;
    		}
    		//columns
    		Thread.sleep(2000);
    		System.out.println("Columns:");
    		for(int i=0;i<n;i++)
    		{
    			for(int j=0;j<n;j++)
    				s+=a[j][i];
    			System.out.println("the sum of column "+(i+1)+" = "+s);
    			s=0;
    		}
    		Thread.sleep(2000);
    		//diagonals
    		System.out.println("Diagonals:");
    	 	for(int i=0;i<n;i++)
        		for(int j=0;j<n;j++)
    				if(i==j)
    					d1+=a[i][j];
    		System.out.println("Sum of diagonal 1 = "+d1);
    		for(int i=0,j=n-1;i<n;j--,i++)
    			d2+=a[i][j];
    		System.out.println("Sum of diagonal 2 = "+d2);
    	 	Thread.sleep(2000);
    	 }
        n=0;
    }
    //calculating the nos. which can't make the magic square
    //---------------------------------------------------------------------------------------------
    void prime()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        char c=' ';
        String g="";
        int k=0,a=0,f=0,r=0;
        int b[]=new int[3909];
        //asking user weather he wants to see the list or not
        //---------------------------------------------------------------------------------------------
        do
        {
            System.out.print("Do you wish to see 3909 nos. you can't enter?(y/n) ");
            c=br.readLine().toLowerCase().charAt(0);
        }while(c!='y' && c!='n');
        //calculating the nos.
        //---------------------------------------------------------------------------------------------
        if(c=='y')
        {
            for(int i=15;i<=9999;i++)
            {
                for(int j=3;j<16;j+=2)
                    if(i%j==0)
                        if((((i-(j*j*j+j)/2)/j)+1)>0)
                        {
                            a++;break;
                        }
                if(a==0)
                {
                    b[k]=i;k++;
                }
                a=0;
            }
            //printing list
            //---------------------------------------------------------------------------------------------
            for(int i=0;i<b.length;i++)
            {
                if(b[i]>999)
                    System.out.print(b[i]+" ");
                else if(b[i]>99)
                    System.out.print(b[i]+"  ");
                else if(b[i]>9)
                    System.out.print(b[i]+"   ");
                else
                    System.out.print(b[i]+"    ");
                if(i==b.length-1)
                {
                    System.out.print("Press any key to continue....");
                    g=br.readLine();
                }
                f++;
                //for the screen fitting
                //---------------------------------------------------------------------------------------------
                if(f==16)
                {
                    System.out.println();
                    f=0;r++;
                }
                if(r==24)
                {
                    r=0;
                    System.out.print("Press any key to continue....");
                    g=br.readLine();
                }
            }
        }
    } 
    //inputing & some processing for option 1 of menu method
    //---------------------------------------------------------------------------------------------
    int method1()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        boolean fl=false;
        int m=0,a=0,x=0,f=0;
        char c=' ';
        for(;;)
        {
            for(int i=0;i<75;i++)
                System.out.println();
            //accepting sum
            //---------------------------------------------------------------------------------------------
            while(true)
            {
             	fl=false;
                try
                {
                	System.out.print("Enter the common sum of all rows & columns & diagonals(15-9,999): ");
                	s= Integer.parseInt(br.readLine());
                }catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(s>14 && s<=9999)
                     	break;
            }
            for(;;)
            {
                //accepting rows 
                //---------------------------------------------------------------------------------------------
                	while(true)
             		{
             			fl=false;
                		try
                		{
                			System.out.print("Enter the odd no. of rows(3-15): ");
                    		n= Integer.parseInt(br.readLine());
                    		if((n%2==0)||(n<3 || n>15))
                    			f++;
                		}catch(NumberFormatException e)
                 	   {     
                    	fl=true;
                       }
                   	   if(fl)
                           continue;
                       if(n>=3 && n<=15 && n%2==1)
                           break;
            		}
            	
                //checking wheather or not the sum is possible with the given rows
                //---------------------------------------------------------------------------------------------
                if(s%n==0)
                {
                    m=((s-((n*n*n+n)/2))/n)+1;
                    //neglecting negative nos.
                    //---------------------------------------------------------------------------------------------
                    if(m>0)
                        break;
                    else
                        f=f+1;
                }
                else
                    f=f+1;
                //making system to check wheather or not the square is possible, if possible & user accepts a square with calculated rows is made
                //-------------------------------------------------------------------------------------------------------------------------------
                if(f>4)
                {
                    do
                    {
                        System.out.print("Do you want system to analyse wheather square with sum is possible(y/n): ");
                        c=br.readLine().toLowerCase().charAt(0);
                    }while(c!='y' && c!='n');
                    if(c=='y')
                    {
                        for(int d=3;d<16;d+=2)
                            if(s%d==0)
                            	//neglecting negative nos.
                            	if((((s-((d*d*d+d)/2))/d)+1)>0)
                            	{
                                	//making square with calculated rows
                                	//---------------------------------------------------------------------------------------------
                                	System.out.println("The square is possible with rows as "+d);
                                	do
                                	{
                                    	System.out.print("Do you want a square with "+d+" rows(y/n): ");
                                    	c=br.readLine().toLowerCase().charAt(0);
                                	}while(c!='y' && c!='n');
                                	if(c=='y')
                                	{
                                    	n=d;x++;break;
                                	}
                                	else
                                    	a++;
                            	}
                            	else
                                	a++;
                           else
                           	a++;
                     }
                }
                if(x!=0)
                    break;
                //if the square isn't possible
                //---------------------------------------------------------------------------------------------
                if(a!=0)
                {
                    System.out.println("A square as per your wish isn't possible please re-enter");
                    n=1;
                    Thread.sleep(3000);break;
                }    
            }
            a=0;f=0;
            if(n>2)
            {
               	m=((s-((n*n*n+n)/2))/n)+1;
            	if(m>0)
                	break;
            }
        }
        return m;
    }
    //inputing & some processing for option 2 of menu method
    //---------------------------------------------------------------------------------------------
    int method2()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        int m=0,g=0;
        boolean fl=false;
        for(int i=0;;)
        {
            for(int k=0;k<75;k++)
                System.out.println();
            //accepting sum
            //---------------------------------------------------------------------------------------------
            while(true)
             {
             	fl=false;
                try
                {
					System.out.print("Enter the common sum of all rows & columns & diagonals(15-9,999): ");
                	s= Integer.parseInt(br.readLine());
                }catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(s>14 && s<=9999)
                     	break;
            }
            //checking wheather square is possible
            //---------------------------------------------------------------------------------------------
            for(int k=3;k<16;k+=2)
                if(s%k==0)
                {
                    m=((s-((k*k*k+k)/2))/k)+1;
                    //neglecting negative nos.
                    //---------------------------------------------------------------------------------------------
                    if(m>0)
                    {    
                        n=k;
                        g++;
                        break;
                    }
                }
                if(g>0)
                    break;
                else
                {
                    System.out.println("The sum is not possible please re-enter");
                    m=0;
                    n=0;
                    Thread.sleep(3000);
                    for(int k=0;k<75;k++)
                        System.out.println();
                }
        }
        return m;
    }
    //inputing & some processing for option 3 of menu method
    //---------------------------------------------------------------------------------------------
    int method3()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int s=0;
        int m=0;
        boolean fl=false;
        for(int i=0;i<75;i++)
            System.out.println();
        //accepting rows
        //---------------------------------------------------------------------------------------------
            	while(true)
             	{
             		fl=false;
                	try
                	{
                	 	System.out.print("Enter the odd no. of rows(3-15): ");
            			n= Integer.parseInt(br.readLine());
                	}catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(n>=3 && n<=15 && n%2==1)
                     	break;
            	}
        //accepting the no. to start with
        //---------------------------------------------------------------------------------------------
        		while(true)
             	{
             		fl=false;
                	try
                	{
                	 	System.out.print("Enter the least no. of the square(1-9773): ");
            			m= Integer.parseInt(br.readLine());
                	}catch(NumberFormatException e)
                    {     
                    	fl=true;
                    }
                    if(fl)
                    	continue;
                    if(m>0 && m<=9773)
                     	break;
            	}
        return m;
    }
	//making the square
	//---------------------------------------------------------------------------------------------
    int[][] filler(int m)
    {
        int[][] a=new int[n][n];
        int r=0,c=n/2;
        int[][] w=new int[n][n]; 
        for(int i=0;i<n*n;)
        {                
            if(a[r][c]==0)
            {
                a[r][c]=m;
                m++;
            }
            else
            {   
                r++;c--;
                //reinitialization of r & c if out of range
                //---------------------------------------------------------------------------------------------
                if(r>n-1)
                    r=0;
                if(r<0)
                    r=n-1;
                if(c<0)
                    c=n-1;
                if(c>n-1)
                    c=0;  
                r++;
                if(a[r][c]==0)
                {
                    a[r][c]=m;
                    m++;
                }
                else
                    continue;
            }
            r--;c++;
            if(r<0)
                r=n-1;
            if(c>n-1)
                c=0;
            i++;
        }
        return a;
        //return w;
    }
	//making the square with decimal nos.
	//---------------------------------------------------------------------------------------------
	void decimal()throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean fl=false; 
        char d=' ';
		String g="";
		double y=0,x=1,s=0,d1=0,d2=0;
        //accepting rows 
        //---------------------------------------------------------------------------------------------
        for(int i=0;i<75;i++)
            System.out.println();
        while(true)
        {
        	fl=false;
            try
            {
            	System.out.print("Enter the odd no. of rows(3-15): ");
                n= Integer.parseInt(br.readLine());
            }catch(NumberFormatException e)
            {     
            	fl=true;
            }
            if(fl)
            	continue;
            if(n>=3 && n<=15 && n%2==1)
            	break;
        }
        //making the square
		//---------------------------------------------------------------------------------------------
        double[][] a=new double[n][n];
        int r=0,c=n/2;
        for(int i=0;i<n*n;)
        {                
            if(a[r][c]==0)
            {
                a[r][c]=x+(y/10);
                y++;
      			if(y==10)
      			{
      				y=0;x++;
      			}
            }
            else
            {   
                r++;c--;
                //reinitialization of r & c if out of range
                //---------------------------------------------------------------------------------------------
                if(r>n-1)
                    r=0;
                if(r<0)
                    r=n-1;
                if(c<0)
                    c=n-1;
                if(c>n-1)
                    c=0;  
                r++;
                if(a[r][c]==0)
                {
                    a[r][c]=x+(y/10);
                    y++;
      				if(y==10)
      				{
      					y=0;x++;
      				}
                }
                else
                    continue;
            }
            r--;c++;
            if(r<0)
                r=n-1;
            if(c>n-1)
                c=0;
            i++;
        }
         //printing
         //---------------------------------------------------------------------------------------------
         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            	if(a[i][j]<10.0)
            		System.out.print("  "+a[i][j]);
            	else
            		System.out.print(" "+a[i][j]);	
            System.out.println();System.out.println();System.out.println();
    	 }
    	 System.out.print("Press any key to continue....");
         g=br.readLine();
    	 //calculating sum
    	 //---------------------------------------------------------------------------------------------
    	 do
    	 {
    	 	System.out.print("Do you wish to see the sum of all rows columns & diagonals?(y/n) ");
            d=br.readLine().toLowerCase().charAt(0);
    	 }while(d!='y' && d!='n');
    	 if(d=='y')
    	 {
    	 	//rows
    	 	System.out.println("Rows:");
    	 	for(int i=0;i<n;i++)
    		{
    			for(int j=0;j<n;j++)
    				s+=a[i][j];
    			System.out.println("the sum of row "+(i+1)+" = "+s);
    			s=0;
    		}
    		Thread.sleep(2000);
    		//columns
    		System.out.println("Columns:");
    		for(int i=0;i<n;i++)
    		{
    			for(int j=0;j<n;j++)
    				s+=a[j][i];
    			System.out.println("the sum of column "+(i+1)+" = "+s);
    			s=0;
    		}
    		Thread.sleep(2000);
    		System.out.println("Diagonals:");
    		//diagonals
    	 	for(int i=0;i<n;i++)
        		for(int j=0;j<n;j++)
    				if(i==j)
    					d1+=a[i][j];
    		System.out.println("Sum of diagonal 1 = "+d1);
    		for(int i=0,j=n-1;i<n;j--,i++)
    			d2+=a[i][j];
    		System.out.println("Sum of diagonal 2 = "+d2);
    	 	Thread.sleep(2000);
    	 }
		n=0;
	}
} 
