import java.util.*;

class graphic
{
	public static void main(String abc[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		byte r=0;
		do
		{
			System.out.print("enter row no: ");
			r=sc.nextByte();
			
		}while(r<6 || r>24);
		
		for(int z=0;z<=20000;z++)
		{
		
		  for(int i=1,c=0,sp=2*(r+2);i<=r;i++,sp-=2)

         {
                for(int k=0;k<=sp;k++)
                
                   
                 System.out.print(" ");
                 
                 for(int k=i;;k--)
                 {
                 	System.out.print(k+" ");
                 	if(k==1)
                 	break;
                 }
             
                 for(int k=2;k<=i;k++)
                 {
                 	System.out.print(k+" ");
                 	if(k==i)
                 	break;
                 }
                 
                 System.out.println();
                   System.out.println();
                     System.out.println();
                       System.out.println();
                 }
                 
                   for(int i=1;i<=r;i++)
       {
           
            if(i==1 || i==r)
            {
            	 for(int k=1;k<=r;k++)
            System.out.print("*   ");
            	
            }
            else
            {
              
              for(int k=1;k<=r;k++)
              {
              	if(k==1 || k==r)
              	System.out.print("*   ");
              	else
              	System.out.print("    ");
              }	
            }
            System.out.println();
             System.out.println();
               System.out.println();

 System.out.println();


      }
      
       for(int i=1,sp=r-1;i<=r;i++,sp--)
        {
            for(int k=0;k<=sp;k++)
                System.out.print(" ");
                
                 if(i==r)
              {
                for(int k=1;k<=r;k++)
                System.out.print("* ");
              }
              else
              {
              
              
                if(i==1)
                {
                
                System.out.print("*");
                
                }
                else
                {
                

            for(int k=1;k<=i+2;k++)
            {
        
               if(k==1)
               System.out.print("*");
               else if(k==i)
               System.out.print(" *");

               else
               System.out.print("  ");
             }

             }
              }
              System.out.println();
              }
              
              
             
                 
                 Thread.sleep(1/10);
                 System.out.println();
                 
                 
           }      
                
	}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          