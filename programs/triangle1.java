import java.util.Scanner;
import java.io.DataInputStream;
class triangle1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        DataInputStream dis=new DataInputStream(System.in);
        int a=0, b=0, ctr=0,d=40,c=1, sctr=0;
        char s=' ';
        System.out.print("Input no.of lines:");
        int n=sc.nextInt();
        while(n!=ctr)
        {
            while(sctr!=d)
            {
                System.out.print(s);
                sctr++;
            }
            while(a!=c)
            {
                a++;
                System.out.print("*");
            }
            a=0;
            ctr++;
            c++;c++;
            d--;
            sctr=0;
            System.out.println("  ");
        }
        
        while(ctr!=0){
         	d++;
         	while(sctr!=d){
         		sctr++;
         		System.out.print(s);
         	}
         	c--;c--;
         	while(a!=c){
         		++a;
         		System.out.print("*");
            }
            System.out.println("  ");
            a=0;
            ctr--;
            sctr=0;
            
        }
        
         
    }
}

