import java.io.*;
import java.util.*;
class magic
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("r1= ");
        int r1=sc.nextInt();
        System.out.print("c1= ");
        int c1=sc.nextInt();
        int r2=c1;
        System.out.print("c2= ");
        int c2=sc.nextInt();
        int[][] a=new int[r1][c1];
        int[][] b=new int[r2][c2];        
        int[][] c=new int[r1][c2];

        for(int i=0;i<r1;i++)
            for(int j=0;j<c1;j++)
            {
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=sc.nextInt();
            }

        System.out.println();
        for(int i=0;i<r2;i++)
            for(int j=0;j<c2;j++)
            {
                System.out.print("b["+i+"]["+j+"]= ");
                b[i][j]=sc.nextInt();
            }

        for(int i=0;i<r1;i++)

            for(int j=0;j<c2;j++)

                for(int k=0;k<c1;k++)

                    c[i][j]+=a[i][k]*b[k][j];

        System.out.println();

        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c2;j++)
                System.out.print("c["+i+"]["+j+"]= "+c[i][j]);
            System.out.println();
        }
    }
}
