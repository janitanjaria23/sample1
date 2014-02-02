import java.io.*;
class wordFreq
{
    public static void main(String args[])throws Exception
    {
        DataInputStream dis=new DataInputStream(System.in);


        String s="",p="";
        int ctr=1;
        int b=0;
        int x=0;
        System.out.print("Input sentence: ");
        s=dis.readLine().trim();

        //counting no.of spaces
        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==' ')
            ctr++;
        int a[]= new int[ctr];
        //System.out.print(a.length);
            for(int j=0,k=0;j<s.length();j++)
                if(s.charAt(j)==' '|| s.charAt(j)=='.')
                {
                    p=s.substring(b,j);
                    x=p.length();
                    a[k]=x;
                    k++;
                    b=j+1;
                }
        
        ctr=1;
        for(int i=0;i<a.length-2;i++,ctr=0)
        {    for(int k=i+1;k<=a.length-1;k++)
                if(a[i]==a[k])
                    ctr++;

             System.out.println(a[i]+"\t"+ctr);
        }
   }
}
