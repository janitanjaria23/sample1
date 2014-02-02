import java.io.*;
class stringPalindrome
{
    public static void main(String args[])throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        String os="",ds="";
        int ctr=1;
        char c=' ';
        for(;;os="",ds="")//accept & validate
        {
            System.out.print("Enter the sentence: ");
            os=dis.readLine().trim();
            for(int i=0;i<os.length();i++)
            {
                c=os.charAt(i);
                if(c==' ')//crunch spaces
                {
                    if(ctr==1)
                    {
                        ds+=" ";
                        ctr++;
                    }
                }
                //add normal char
                else if((c>='a' &&c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9'))
                {
                    ds+=String.valueOf(c);
                    ctr=1;
                }
                else //add special char
                {
                    if(os.charAt(i-1)==' ')
                        ds=ds.trim();
                    ds+=String.valueOf(c);
                    ctr=1;
                }
            }
            if(ds.charAt(ds.length()-1)!='.')
                ds+=".";
            ctr=0;
            for(int i=0;i<ds.length();i++)
            {
                c=ds.charAt(i);
                if(c==' ')
                    ctr++;
            }
            if(ctr>=2)
                break;
        }
        ctr=0;
        os=ds;ds="";
        String p="";
        int a=0;
        System.out.println(os);
        
        
            for(int i=0;i<os.length();i++)
            {
            	             
                  
                if(os.charAt(i)==' ' || os.charAt(i)=='.')
                {
                   
                    p=os.substring(ctr,i);
                    ctr=i+1;
                    System.out.println(p);
                    if(i==os.length()-1)
                    	break;
                    if(p.length()%2==1)
                        for(int j=0,k=p.length()-1;k>(p.length()/2);j++,k--)
                            if(p.charAt(j)!=p.charAt(k))
                            {
                                a++;break;
                            }
                    else
                    	a++;        
                }
            }
        int x=1;
        for(int g=0;g<os.length();g++)
        	if(os.charAt(g)==' ')
        		x++;
		
        if(a>=0)
            System.out.println((x-a) +" words are palindrome.");
        
    }                  
}
