class demo7
{
    public static void main(String args[])
    {
        int s=10;
        int a[]=new int[10];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<s;i++)
        {
            for(int p=0,q=i-1;p<=q;p++,q--)
            {
                if(p%2==0)
                {
                    a[i]+=2*(a[p]*a[q]);
                }
                else 
                    a[i]+=(a[p]*a[q]);
            }
        }
        for(int i=0;i<s;i++)
            System.out.print(a[i]+" ");
        
    }
}
