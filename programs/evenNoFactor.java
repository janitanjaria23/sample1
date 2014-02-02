class evenNoFactor
{
        public static void main(String args[])
        {
                for(int i=2;i!=30+2;++i,++i)
                {
                        System.out.print(i +  "=");

                        for(int y=1;y<=i;++y)
                           {     if(i%y==0)
                                System.out.print(" "+y);
                            }
                                System.out.println();

                            }}}
