class triplets
{
    public static void main(String args[])
    {
        for(int j=1,i=1,b=1,h=1,s=1;i<=500;i++,b*=i)
        {
            for(int k=1;k<=500;k++)
                {
                    s=k*k;
                    h=b+s;
                }
            j=(int)Math.sqrt(h);
            if(j*j==h)
            {
                b=(int)Math.sqrt(b);
                s=(int)Math.sqrt(s);
                System.out.print("("+b+","+s+","+j+")");
            }}}}
                    
                    
