import java.io.*;

class roller
{
	int r,k,n;
	int[] gr=new int[10];
	
	public static void main(String args[])throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int tcases = 0,sum=0;
		String inp1 = "", inp2 = "";
		tcases=Integer.parseInt(br.readLine().trim());
		roller obj=new roller();
		for(int i = 1;i <= tcases; i++)
		{
			inp1=br.readLine().trim();
			obj.st2int(inp1,false);
			inp2=br.readLine().trim();
			obj.st2int(inp2,true);
			for(int j=1;j<=obj.r;j++)
			{
				sum+=obj.aahh();
			}
			System.out.println(sum);
			for(int j=0;j<obj.n;j++)
				obj.gr[j]=0;
			sum=0;
		}
	}
	
	void st2int(String s,boolean z)
	{
		if(!z)
		{
			r=Integer.parseInt(s.substring(0,(s.indexOf(' '))));
			k=Integer.parseInt(s.substring(s.indexOf(' ')+1,(s.lastIndexOf(' '))));
			n=Integer.parseInt(s.substring(s.lastIndexOf(' ')+1));
		}
		else
		{
			int temp=0;
			for(int i=0;;i++)
			{
				if(s.indexOf(' ',temp+1)==-1)
				{
					if(temp!=0)
						gr[i]=Integer.parseInt(s.substring(temp+1));
					else
						gr[i]=Integer.parseInt(s.substring(temp));
					break;
				}
				else
				{
					if(temp!=0)
						gr[i]=Integer.parseInt(s.substring(temp+1,(s.indexOf(' ',temp+1))));
					else
						gr[i]=Integer.parseInt(s.substring(temp,(s.indexOf(' ',temp+1))));
					temp=s.indexOf(' ',temp+1);
				}
			}
		}
	}
	
	int aahh()
	{
		int sum=0,i=0;
		while(((sum+gr[i])<=k))
		{
			sum+=gr[i];
			i++;
			if(i==n)
				break;
		}
		int[] gr2=new int[10];
		for(int j=0;j<n;j++)
		{
			if(i==n)
				i=0;
			gr2[j]=gr[i];
			i++;
		}
		for(i=0;i<n;i++)
			gr[i]=gr2[i];
		return sum;
	}
	
	
}
