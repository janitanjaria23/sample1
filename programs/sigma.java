class sigma
{
        public static void main(String args[])
        {
        int c1=0,c2=0,c3=0,v1=0,v2=0,v3=0,sum=0;
        for(int i=100;i<1000;i++,c1=0,c2=0,c3=0)
           {
           v1=i/100;
           v2=i/10;
           v2=v2%10;
           v3=i%10;
           if((v1%2==0) || (v2%2==0) || (v3%2==0))
             {
             c1++;
             }
           if((v1%2==1) || (v2%2==1) || (v3%2==1))
             {
             c2++;
             }
           if(c1!=0 && c2!=0)
             {
             sum+=i;
             System.out.print(" ,"+i);
             }
           }
        System.out.println();
        System.out.println(sum);
        }
}
