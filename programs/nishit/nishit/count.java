import java.io.*;
import java.util.*;
class count
{
	int ct()throws IOException
	{
		FileReader fr=new FileReader("mf.dat");
		StreamTokenizer st=new StreamTokenizer(fr);
		st.eolIsSignificant(true);
		int tok=st.nextToken();
		int ctr=0;
		while(tok!=-1)
		{
			switch(tok)
			{
				case -3:{
					
					break;
				}
				case -2:{
					
					break;
				}
				case 10:{ctr++;
					break;
				}
			}
			tok=st.nextToken();
		}
		return ctr;
	}
}