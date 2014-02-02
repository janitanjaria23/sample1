import java.util.*;
class magicSquare2
{
    void title()throws Exception
    {
        for(int i=0;i<10;i++)
            System.out.println();
        System.out.println("              **   **   *******   *******   *******   *******");
        System.out.println("              *** ***   *******   *******   *******   *******");
        System.out.println("              ** * **   **   **   **           **     **     ");
        System.out.println("              **   **   **   **   **           **     **     ");
        System.out.println("              **   **   *******   **   **      **     **     ");
        System.out.println("              **   **   *******   **   **      **     **     ");
        System.out.println("              **   **   **   **   *******   *******   *******");
        System.out.println("              **   **   **   **   *******   *******   *******");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("	*******    *******    **   **    *******    *******    *******");
        System.out.println("	*******    *******    **   **    *******    *******    *******");
        System.out.println("	**         **   **    **   **    **   **    **   **    **     ");
        System.out.println("	*******    **   **    **   **    **   **    *******    *******");
        System.out.println("	*******    **   **    **   **    *******    *******    *******");
        System.out.println("	     **    **  * *    **   **    *******    ****       **     ");
        System.out.println("	*******    **** *     *******    **   **    ** **      *******");
        System.out.println("	*******    ***** *    *******    **   **    **  **     *******");
        Thread.sleep(5000);
        for(int i=0;i<10;i++)
            System.out.println();
    }
    void menu()throws Exception
    {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        for(;;)
        {
            for(int i=0;i<39;i++)
                System.out.print((char)(30)+""+(char)(31));
            System.out.println((char)(30));
            System.out.println((char)(16)+"\t\t          *   *\t****\t*   *\t*   *\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t          ** **\t*   \t**  *\t*   *\t\t             "+(char)(17));
            System.out.println((char)(16)+"\t\t          * * *\t****\t* * *\t*   *\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t          *   *\t*   \t*  **\t*   *\t\t             "+(char)(17));
            System.out.println((char)(16)+"\t\t          *   *\t****\t*   *\t*****\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));
            System.out.println((char)(16)+"\t1.Method 1     \t\t\t\t\t                     "+(char)(16));
            System.out.println((char)(17)+"\t2.Method 2     \t\t\t\t\t                     "+(char)(17));
            System.out.println((char)(16)+"\t3.Method 1(Entering the sum)\t\t\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t4.Method 2(Entering the sum)\t\t\t\t             "+(char)(17));
            System.out.println((char)(16)+"\t5.Exit\t\t\t\t\t\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));
            System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));
            System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));
            do
            {
                System.out.print((char)(16)+"Enter your choice(1-5): ");
                ch=sc.nextInt();
            }while(ch<0 || ch>5);
            for(int i=0;i<39;i++)
                System.out.print((char)(30)+""+(char)(31));
            System.out.println((char)(30));
            if(ch==5)
            	    System.exit(0);
            if(ch==1 || ch==2 || ch==3 || ch==4)
                menu1(ch);
        }
    }
    void menu1(int chm)throws Exception
    {
        int ch=0,a=0,x=0;
        Scanner sc=new Scanner(System.in);
        for(;;)
        {
            for(int i=0;i<39;i++)
                System.out.print((char)(30)+""+(char)(31));
            System.out.println((char)(30));
            System.out.println((char)(16)+"\t\t          *   *\t****\t*   *\t*   *\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t          ** **\t*   \t**  *\t*   *\t\t             "+(char)(17));
            System.out.println((char)(16)+"\t\t          * * *\t****\t* * *\t*   *\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t          *   *\t*   \t*  **\t*   *\t\t             "+(char)(17));
            System.out.println((char)(16)+"\t\t          *   *\t****\t*   *\t*****\t\t             "+(char)(16));
            System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));
            System.out.println((char)(16)+"\tEnter the Row/Column to start with from following options\t     "+(char)(16));
            System.out.println((char)(16)+"\t1.Right     \t\t\t\t\t\t\t     "+(char)(16));
            System.out.println((char)(17)+"\t2.Left     \t\t\t\t\t\t\t     "+(char)(17));
            System.out.println((char)(16)+"\t3.Top     \t\t\t\t\t\t\t     "+(char)(16));
            System.out.println((char)(17)+"\t4.Bottom     \t\t\t\t\t\t\t     "+(char)(17));
            System.out.println((char)(16)+"\t5.Back to Main Menu\t\t\t\t\t\t     "+(char)(16));
            System.out.println((char)(17)+"\t6.Exit\t\t\t\t\t\t\t\t     "+(char)(17));
            System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));System.out.println((char)(16)+"\t\t\t\t\t\t\t\t\t     "+(char)(16));System.out.println((char)(17)+"\t\t\t\t\t\t\t\t\t     "+(char)(17));
            do
            {
                System.out.print((char)(16)+"Enter your choice(1-6): ");
                ch=sc.nextInt();
            }while(ch<0 || ch>6);
            for(int i=0;i<39;i++)
                System.out.print((char)(30)+""+(char)(31));
            System.out.println((char)(30));
            if(ch==6)
                System.exit(0);
            if(ch==5)
                menu();
            break;
        }
        if(chm==1)
           method1(input(),ch);
        if(chm==2)
           method2(input(),ch);
        if(chm==3)
        {
            for(;;)
            {
                do
                {
                    System.out.print("Enter the sum(15-3439): ");
                    a=sc.nextInt();
                }while(a<15 || a>3439);
                for(int j=3;j<20;j+=2)
                    if((j*j*j+j)/2==a)
                    {
                        x++;method1(j,ch);break;
                    }
                if(x==1)
                    break;
            }
        }
        if(chm==4)
        {
            for(;;)
            {
                do
                {
                    System.out.print("Enter the sum(15-3439): ");
                    a=sc.nextInt();
                }while(a<15 || a>3439);
                for(int j=3;j<20;j+=2)
                    if((j*j*j+j)/2==a)
                    {
                        x++;method2(j,ch);break;
                    }
                if(x==1)
                    break;
            }
        }
    }
    int input()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=0;
        do
        {
            System.out.print("Enter the odd no. of rows(3-19): ");
            n=sc.nextInt();
        }while((n<3 || n>19) || n%2==0);
        return n;
    }
    void method1(int n,int ch)throws Exception
    {
        int[][] a=new int[n][n];    
        int r=0,c=n/2,m=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n*n;)
        {   
            
            if(a[r][c]==0)
                a[r][c]=i+1;
            else
            {   
                r++;c--;
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
                    a[r][c]=i+1;
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
        if(ch==1)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=0;i<n;i++)
            {
                for(int j=n-1;j>=0;j--)
                    if(a[j][i]>99)
                        System.out.print(a[j][i]+" ");
                    else if(a[j][i]>9)
                        System.out.print(a[j][i]+"  ");
                    else
                        System.out.print(a[j][i]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
	}
        if(ch==2)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=n-1;i>=0;i--)
            {
                for(int j=0;j<n;j++)
                    if(a[j][i]>99)
                        System.out.print(a[j][i]+" ");
                    else if(a[j][i]>9)
                        System.out.print(a[j][i]+"  ");
                    else
                        System.out.print(a[j][i]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
        }
        if(ch==3)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    if(a[i][j]>99)
                        System.out.print(a[i][j]+" ");
                    else if(a[i][j]>9)
                        System.out.print(a[i][j]+"  ");
                    else
                        System.out.print(a[i][j]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
	}
        if(ch==4)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=n-1;i>=0;i--)
            {
                for(int j=n-1;j>=0;j--)
                    if(a[i][j]>99)
                        System.out.print(a[i][j]+" ");
                    else if(a[i][j]>9)
                        System.out.print(a[i][j]+"  ");
                    else
                        System.out.print(a[i][j]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
        }
    }
    void method2(int n,int ch)throws Exception
    {
        int[][] a=new int[n][n];    
        int r=0,c=n/2,m=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n*n;)
        {   
            if(a[r][c]==0)
                a[r][c]=i+1;
            else
            {   

                r++;c++;
                
                if(r>n-1)
                    r=0;
                if(r<0)
                    r=n-1;
                if(c<0)
                    c=n-1;
                if(c>n-1)
                    c=0;
                r++;
                if(r>n-1)
                    r=0;
                if(a[r][c]==0)
                    a[r][c]=i+1;
                else
                    continue;
            }
            r--;c--;
            if(r<0)
                r=n-1;
            if(c<0)
                c=n-1;
            i++;
        }
        if(ch==1)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=0;i<n;i++)
            {
                for(int j=n-1;j>=0;j--)
                    if(a[j][i]>99)
                        System.out.print(a[j][i]+" ");
                    else if(a[j][i]>9)
                        System.out.print(a[j][i]+"  ");
                    else
                        System.out.print(a[j][i]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
        }
        if(ch==2)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=n-1;i>=0;i--)
            {
                for(int j=0;j<n;j++)
                    if(a[j][i]>99)
                        System.out.print(a[j][i]+" ");
                    else if(a[j][i]>9)
                        System.out.print(a[j][i]+"  ");
                    else
                        System.out.print(a[j][i]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
        }
        if(ch==3)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                    if(a[i][j]>99)
                        System.out.print(a[i][j]+" ");
                    else if(a[i][j]>9)
                        System.out.print(a[i][j]+"  ");
                    else
                        System.out.print(a[i][j]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
        }
        if(ch==4)
        {
            for(int i=0;i<7;i++)
                System.out.println();
            for(int i=n-1;i>=0;i--)
            {
                for(int j=n-1;j>=0;j--)
                    if(a[i][j]>99)
                        System.out.print(a[i][j]+" ");
                    else if(a[i][j]>9)
                        System.out.print(a[i][j]+"  ");
                    else
                        System.out.print(a[i][j]+"   ");
                System.out.println();
            }
            System.out.println("Enter any no. to continue: ");
            m=sc.nextInt();
        }
    }
} 
