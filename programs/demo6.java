class demo6
{
    public static void main(String args[])
    {
        int r=7;
        int a=1;
        for(int i=0,sp=3*(r-1),n=r;i<r;i++,sp-=3,a+=2)
        {
            for(int j=1;j<=sp;j++)
                System.out.print(" ");
            for(int j=1,x=n-i;j<=a;j++,x++)
            {
                if(i==0)
                    System.out.print(n);
                else
                    System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
