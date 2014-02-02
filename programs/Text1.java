/**
 * @(#)Text1.java
 *
 *
 * @author 
 * @version 1.00 2009/2/12
 */

import java.util.*;
class Text1 {

   	public static void main (String[] args)throws Exception
    {
    	int t=0,t1=0;
    	int[][] a=new int[50][40];
    	Random ran=new Random();
    	  for(int i=0;i<50;i++)
            {
                for(int k=0;k<40;k++)
                    do
                    {
                        a[i][k]=(int)Math.abs(ran.nextInt()%10);
                    }while(a[i][k]==0);
            }
            for(int i=0;i<50;i++)
                {
                    for(int k=0;k<40;k++)
                        System.out.print(a[i][k]%10+" ");
                    Thread.sleep(100);
                    System.out.println();
                }
                System.out.println();System.out.println();System.out.println();System.out.println();
    	for(int j=0;j<50;j++,t=0)
                            {
                            	
                                //shift down
                                for(int y=0;y<40;y++)
                                {
                                    if(y%2==0)
                                    {
                                        if(y+1<40)
                                        {       
                                            t=a[j][y+1];
                                            a[j][y+1]=a[j][y];
                                        }
                                    }
                                    else
                                    {
                                        if(y+1<40)
                                        {
                                            t1=a[j][y+1];
                                            a[j][y+1]=a[j][y];
                                        }
                                        else
                                        {
                                         	a[j][0]=a[j][39];
                                         	a[j][39]=t1;
                                        }
                                    }
                                    if(y%2==0)
                                    {
                                        if(y!=0)
                                            a[j][y]=t;
                                    }
                                    else
                                        a[j][y]=t1;
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