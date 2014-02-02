import java.io.*;
import java.util.*;
class check
{
	String[] chk()throws IOException
	{
		FileReader fr=new FileReader("mf.dat");
		StreamTokenizer st=new StreamTokenizer(fr);
		st.eolIsSignificant(true);
		int tok=st.nextToken();
		count cnt=new count();
		int n=cnt.ct();int ctr=1,l=0;
		String eno[]=new String[n];
		while(tok!=-1)
		{
			switch(tok)
			{
				case -3:{	if(ctr==1)
							{
								eno[l]=st.sval;
								ctr=2;
							}
							else if(ctr==2)
								ctr=3;
							else if(ctr==3)
								ctr=1;
					break;
				}
				case -2:{
					
					break;
				}
				case 10:{	l++;
					break;
				}
			}
			tok=st.nextToken();
		}
		return eno;
	}
}