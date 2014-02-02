import java.util.*;
class screen
{
    public static void main(String args[])throws Exception
    {
        Random ran=new Random();
        bubble b=new bubble();
        int x=0,ctr=0,r=0;
        int[] v=new int[10];
        int[] v2=new int[10];
        int[][] a=new int[50][40];
        boolean flag=false;

        for(;;)
        {
            ctr=0;
            for(int i=0;i<10;i++)
            {   
                do
                {
                    ctr=0;
                    do
                    {
                        v[i]=(int)Math.abs(ran.nextInt()%40);
                    }while(v[i]==0);
                    for(int k=0;k<=i;k++)
                        if(v[i]==v[k])
                        {
                            ctr++;break;
                        }
                
                }while(ctr!=1);
            }
            for(int i=0;i<10;i++)
            {
                    
                    do
                    {
                        v2[i]=(int)Math.abs(ran.nextInt()%250);
                    }while(v2[i]==0);
                
            }
            
            v=b.s(v);
            v2=b.s(v2);
            for(int i=0;i<50;i++)
            {
                for(int k=0;k<40;k++)
                    do
                    {
                        a[i][k]=(int)Math.abs(ran.nextInt()%10);
                    }while(a[i][k]==0);
            }
            int t=0,t1=0;
            for(int q=0,e=0;q<v2[9];q++,e++)
            {
                for(int w=0;w<10;w++)
                {
                    if(e>=50)
                        e=0;
                    a[q][v[w]]=(int)Math.abs(ran.nextInt()%10);
                    for(int i=0;i<40;i++)
                    {
                        flag=b.se(v,i)
                        if(flag)
                        {
                            continue;    
                        }
                        else
                        {
                            for(int j=0;j<50;j++)
                            {
                                //shift down
                                for(int y=0;y<40;y++)
                                {
                                    if(y%2==0)
                                    {
                                        if(y+1<=40)
                                        {       
                                            t=a[j][y+1];
                                            a[j][y+1]=a[j][y];
                                        }
                                    }
                                    else
                                    {
                                        if(y+1<=40)
                                        {
                                            t1=a[j][y+1];
                                            a[j][y+1]=a[j][y];
                                        }
                                        else
                                        {
                                            
                                        }
                                    }
                                    if(y%2==0)
                                    {
                                        if(y!=0)
                                            a[j][y]=t
                                    }
                                    else
                                        a[j][y]=t1;
                                }
                            }
                        }
                    }
                    
                }
                for(int i=0;i<50;i++)
                {
                    for(int k=0;k<40;k++)
                        System.out.print(a[i][k]%10+" ");
                    Thread.sleep(100);
                    System.out.println();
                }
                
            }
        }
    }
}
