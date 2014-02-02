class ali
{
	public static void main(String args[])throws Exception
	{
		String[] b=new String[5];
        b[0]="Pooja Rana";
		b[1]="asd kljk";
        char c=' ';
        String temp="";
        for(int i=0;b[i]!=null;i++)
		{
			for(int j=0;j<b[i].length();j++)
			{
				c=b[i].charAt(j);
				if(c==' ')
				{
                    System.out.println(c+b[i]);
                    for(int k=j+1;c!=' ';k++)
					{
						c=b[i].charAt(k);
						j=k;	
					}
					continue;
				}

			temp+=String.valueOf(c);
			}
            System.out.println(temp);
		}
	}
}
