class triplets
{
	public static void main(String args[])
	{
		int s=1;
		for(int a=1; a<50; a++)
			for(int b=1; b<=50; b++)
				for(int c=1; c<=50; c++)
				{
					if(a*a==b*b+c*c)
					{	
						System.out.print(a+" "+b+" "+c+"	");
						s++;
					}	
					else if(b*b==a*a+c*c)
					{	
						System.out.print(a+" "+b+" "+c+"	");
						s++;
					}	
					else if(c*c==b*b+a*a)
					{	
						System.out.print(a+" "+b+" "+c+"	");
						s++;
					}
					if(s==5)
					{	
						System.out.println();	
						s=1;
					}		
				}	
	}
}