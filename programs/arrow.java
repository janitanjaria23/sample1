import java.util.*;
class arrow
{
        public static void main(String args[])
        {       int p=0;
                Scanner sc= new Scanner(System.in);
                int r=0;
                do{
                System.out.print("Enter row:");
                r=sc.nextInt();
                }while(r<5 || r>12);
                for(int f=0,i=1;i<=r;++i)
                {   
                    for(int k=1;k<=i;){
                    ++p;
                    for(int y=1;y<=p;y++){ 
                    if(p%y==0)
                    f++;                   
                    }
                    if(f==2){
                         if(p>99)
                         System.out.print(p+" ");
                         else if(p>9)
                         System.out.print(p+"  ");
                         else
                         System.out.print(p+"   ");
                         ++k;
                      }
             
                 f=0;
                 }
                    System.out.println();
                 

                 }
                for(int f=0,i=r-1;i>0;--i)
                {   
                    for(int k=1;k<=i;){
                    ++p;
                    for(int y=1;y<=p;y++){ 
                    if(p%y==0)
                    f++;                   
                    }
                    if(f==2){
                         if(p>99)
                         System.out.print(p+" ");
                         else if(p>9)
                         System.out.print(p+"  ");
                         else
                         System.out.print(p+"   ");
                         ++k;
                      }
             
                 f=0;
                 }
                    System.out.println();
                 

                 }
}               }

