import java.io.*;
class ut3
{
    public static void main(String args[])throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);
        String os="",ds="";
        int ctr=1,a=0;
        char c=' ';
        for(;;os="",ds="",a=0)
        //accept & validate
        {
            System.out.print("Enter the sentence: ");
            os=dis.readLine().trim().toLowerCase();
            for(int i=0;i<os.length();i++)
            {
                c=os.charAt(i);
                //crunch spaces
                if(c==' ')
                {
                    if(ctr==1)
                    {
                        ds+=" ";
                        ctr++;
                    }
                }
                
                //add normal char
                else if((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9'))
                {
                    ds+=String.valueOf(c);
                    ctr=1;
                }

                //add special char
                else if(c=='.' || c==',') 
                {
                    if(os.charAt(i-1)==' ')
                        ds=ds.trim();
                    ds+=String.valueOf(c);
                    ctr=1;
                }
                else
                {
                    ds=ds.trim();a++;
                    break;
                }
            }
            //adding fullstop
            if(ds.charAt(ds.length()-1)!='.')
                ds+=".";
            ctr=0;
            //counting no. of words
            for(int i=0;i<ds.length();i++)
            {
                c=ds.charAt(i);
                if(c=='.')
                    ctr++;
            }
            if(ctr>=3 && ctr<=5 && a!=1)
                break;
               
        }
        os=ds;ds="";       
        String s[]=new String[ctr];
        //extracting each sentence
        for(int i=0,j=0,k=0;i<os.length();i++)
        {   
            c=os.charAt(i);
            if(c=='.')
                if(k!=ctr-1)
                {
                    s[k]=os.substring(j,i+1).trim();
                    j=i+1;k++;
                }
                else
                s[k]=os.substring(j).trim();
        }
        ctr=0;
        //assigned task for odd sentences
        for(int i=0;i<s.length;i++)
            if(i%2==0)
            {
                for(int j=0;j<s[i].length();j++)
                {
                    c=s[i].charAt(j);
                    if((int)c%2==1 && c>='a' && c<='z')
                        ctr++;
                }
            }
        System.out.println("The no. of odd alphabets in odd sentences are: "+ctr);
        //assigned task for even sentences
        ctr=0;
        int l=0;
        //counting no. of words
        for(int i=0;i<s.length;i++)
        if(i%2==1)
        {
            if(i>1)//increase of word in case of another sentence
            {
                l=ctr+1;
                ctr++;
            }
            for(int j=0;j<s[i].length();j++)
            {
                c=s[i].charAt(j);
                if(c==' ')
                    ctr++;
            }
        }
        String w[]=new String[ctr+1];
        a=0;
        //extracting words in 2nd sentence
        for(int i=0,j=0,k=0;i<s[1].length();i++)
        {   
            c=s[1].charAt(i);
            if(c==' ')
                if(k!=ctr)
                {
                    w[k]=s[1].substring(j,i).trim();
                    j=i+1;k++;
                }
            if(i==s[1].length()-1)
            {
                w[k]=s[1].substring(j,s[1].length()-1).trim();
                a=k+1;
            }
        }              
           
        //bubble sort
        String temp="";
        for(int i=0;i<l-1;i++)
            for(int j=0;j<l-1;j++)
                if(w[j].compareTo(w[j+1])>0)
                {
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                }
        if(s.length>3)
        {
        //extracting words in 4nd sentence
        for(int i=0,j=0,k=a;i<s[3].length();i++)
        {   
            c=s[3].charAt(i);
            if(c==' ')
                if(k!=ctr)
                {
                    w[k]=s[3].substring(j,i).trim();
                    j=i+1;k++;
                }
            if(i==s[3].length()-1)
                w[k]=s[3].substring(j,s[3].length()-1).trim();
                      
        }
        //bubble sort
        for(int i=l;i<w.length-1;i++)
           for(int j=l;j<w.length-1 ;j++)
               {
                if(w[j].compareTo(w[j+1])>0)
                {
                    
                    temp=w[j];
                    w[j]=w[j+1];
                    w[j+1]=temp;
                }
        }
        }
        s[1]="";
        for(int i=0;i<l;i++)
            s[1]+=w[i]+" ";
        if(s.length>3)
        {
        s[3]="";
        for(int i=l;i<w.length;i++)
            s[3]+=w[i]+" ";
       }
       for(int i=0;i<s.length;i++)
          s[i]=s[i].trim();
       for(int i=0;i<s.length;i++)
       {
       System.out.print(s[i]+" ");
           if(i%2==1)
               System.out.print(".");
        }
    }
} 

