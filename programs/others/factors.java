import java.util.*;
class factors
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		for(int d=1; d<=n; d++)
			if(n%d==0)
				System.out.println(d);
	}
}
/*
import java.util.*;
class factors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int f=0;
        System.out.print("Enter the no: ");
        int x=sc.nextInt();
        for(int ctr=1; ctr<=x; ctr++)
        {
            if(x%ctr==0)
                System.out.print(ctr+"  ");
        }
    }
}*/