22import java.util.*;
class bubblesort
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    int n=0;
    do
    {
    System.out.print("Enter no of numbers(2-12): ");
    n=sc.nextInt();
    }while(n<2 || n>12);
    int a[]=new int[n];
    // Inputing the numbers
    for(int i=0;i<a.length;i++)
       {
       System.out.println();
       System.out.print("Enter the number: ");
       a[i]=sc.nextInt();
       }
    // arranging in ascending order
    for(int i=0;i<n;i++)
       {
       for(int k=0,m=0,j=n-1;k<n-1;k++,j--)
          {
          if(a[j]>a[j-1])
            {
            m=a[j];
            a[j]=a[j-1];
            a[j-1]=m;
            }
          }
       }
    // printing
    for(int i=0;i<a.length;i++)
       {
       System.out.println();
       System.out.print(a[i]);
       }
    }
}


