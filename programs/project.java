import java.io.*;
class project
{
        public static void main(String args[])throws Exception
        {
                BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
                int n=0,n1=0,n2=0;
				String wo="",wo1="";
                for(int i=0; i<24; i++)
                        System.out.println();
                do
                {
                        System.out.print("Enter no. of elements(n>6):");
                        n=Integer.parseInt(br.readLine());
                }while(n<6 || n>99);

                int a[]=new int[n];
                
                for(int i=0; i<n; i++)
                {
                        do
                        {
                                System.out.print("Array["+i+"]: ");
                                a[i]=Integer.parseInt(br.readLine());
                        }while(a[i]>99);
                }

                for(int i=0; i<n; i++)
                        for(int j=0; j<n-1; j++)
                                if(a[i]<a[j])
                                {
                                        a[i]+=a[j];
                                        a[j]=a[i]-a[j];
                                        a[i]-=a[j];
                                }

                                
                for(int i=0; i<24; i++)
                        System.out.println();

                String c="";
                while(true)
                {
                        try
                        {
                                System.out.print("Enter any key to continue: ");
                                c=br.readLine();
                        }catch(NumberFormatException e)
                        {
                                break;
                        }
                        break;
                }

                for(int i=0; i<n; i++)
                        System.out.print(a[i]+" ");


                String w[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
				String w1[]={"Ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
                String w2[]={"eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
                int ctr=0;

                for(int i=0; i<24; i++)
                        System.out.println();

                for(int i=0; i<n; i+=ctr,ctr=0)
                {
                        for(int j=i; j<n; j++)
                                if(a[i]==a[j])
                                        ctr++;

                        System.out.println(a[i]+"*"+ctr);
                        n2=a[i];
                        if(n2<10 && ctr<10)
                        	System.out.println(w[n2]+" occurs "+w[ctr]+" times");
                        else if(n2>9 && ctr<10)
                        {
                        	/*if(n2%10==0)
                        		System.out.println(w1[n2/10-1]+" occurs "+w[ctr]+" times");
                        	else if(n2<20)
                        	{
                        		wo=w2[(n2%10)-1];
                        		System.out.println(wo+" occurs "+w[ctr]+" times");
                        	}
                        	else
                        	{
                        		wo=w1[n2/10-1]+" "+w[n2%10];
                        		System.out.println(wo+" occurs "+w[ctr]+" times");
                        	}*/
                        	if(n2%10==0)
                        		System.out.println(w1[n2/10-1]+" occurs "+w[ctr]+" times");
                        	else if(n2<20)
                        	{
                        		wo=w2[(n2%10)-1];
                        		System.out.println(wo+" occurs "+w[ctr]+" times");
                        	}
                        	else if(n2>20 && ctr<10)
                        	{
                        		wo=w1[n2/10-1]+" "+w[n2%10];
                        		System.out.println(wo+" occurs "+w[ctr]+" times");
                        	}
                        }
                        else if(n2>9 && ctr>9)
                        {
                        	if(n2%10==0 && ctr%10==0)
                        		System.out.println(w1[n2/10-1]+" occurs "+w1[ctr/10-1]+" times");
                        	else if(n2%10==0 &&ctr<20)
                        	{
                        		wo1=w2[(ctr%10)-1];
                        		System.out.println(w1[n2/10-1]+" occurs "+wo1+" times");
                        	}
                        	else if(n2%10==0 && ctr>20)
                        	{
                        		wo1=w1[ctr/10-1]+" "+w[ctr%10];
                        		System.out.println(w1[n2/10-1]+" occurs "+wo1+" times");
                        	}
                        	else if(n2<20 && ctr<10)
                        	{
                        		wo=w2[(n2%10)-1];
                        		System.out.println(wo+" occurs "+w[ctr]+" times");
                        	}
                        	else if(n2<20 && ctr<20)
                        	{
                        		wo=w2[(n2%10)-1];
                        		wo1=w2[(ctr%10)-1];
                        		System.out.println(wo+" occurs "+wo1+" times");
                        	}
                        	else if(n2<20 && ctr>20)
                        	{
                        		wo=w2[(n2%10)-1];
                        		wo1=w1[ctr/10-1]+" "+w[ctr%10];
                        		System.out.println(wo+" occurs "+wo1+" times");
                        	}
                        	
                        	else if(n2>20 && ctr%10==0)
                        	{
                        		wo=w1[n2/10-1]+" "+w[n2%10];
                        		System.out.println(wo+" occurs "+w1[ctr/10-1]+" times");
                        	}
                        	else if(n2>20 && ctr<10)
                        	{
                        		wo=w1[n2/10-1]+" "+w[n2%10];
                        		System.out.println(wo+" occurs "+w[ctr]+" times");
                        	}
                        	else if(n2>20 && ctr<20)
                        	{
                        		wo=w2[(n2%10)-1];
                        		wo1=w2[(ctr%10)-1];
                        		System.out.println(wo+" occurs "+wo1+" times");
                        	}
                        	else
                        	{
                        		wo=w1[n2/10-1]+" "+w[n2%10];
                        		wo1=w1[ctr/10-1]+" "+w[ctr%10];
                        		System.out.println(wo+" occurs "+wo1+" times");
                        	}
                        }
                        else if(n2<10 && ctr>9)
                        {
                        	/*
                        	 if(ctr%10==0)
                        		System.out.println(w[n2]+" occurs "+w1[ctr/10-1]+" times");
                        	else if(ctr<20)
                        	{
                        		wo1=w2[(ctr%10)-1];
                        		System.out.println(w[n2]+" occurs "+wo1+" times");
                        	}
                        	else
                        	{
                        		wo1=w1[ctr/10-1]+" "+w[ctr%10];
                        		System.out.println(w[n2]+" occurs "+wo1+" times");
                        	}
                        	*/
                        	if(ctr%10==0)
                        		System.out.println(w[n2]+" occurs "+w1[ctr/10-1]+" times");
                        	else if(ctr<20)
                        	{
                        		wo1=w2[(ctr%10)-1];
                        		System.out.println(w[n2]+" occurs "+wo1+" times");
                        	}
                        	else if(ctr>20)
                        	{
                        		wo1=w1[ctr/10-1]+" "+w[ctr%10];
                        		System.out.println(w[n2]+" occurs "+wo1+" times");
                        	}
                          	
                        }
                }
                
        }
}
