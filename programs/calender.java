import java.util.*;
class calender
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int d=0, m=0, x=0;
        System.out.print("enter date: ");
        d=sc.nextInt();
        System.out.print("enter month in numbers: ");
        m=sc.nextInt();
        if(m==1 && d<=31)
            {
                x=d%7;
                
                if(x==0)
                System.out.println("The day is Monday!!");
                else if(x==1)
                     System.out.println("The day is Tuesday!!");
                     else if(x==2)
                          System.out.println("The day is wedensday!!");
                          else if(x==3)
                               System.out.println("The day is thursday!!");
                               else if(x==4)
                                    System.out.println("The day is friday!!");
                                    else if(x==5)
                                         System.out.println("The day is saturday!!");
                                         else if(x==6)
                                              System.out.println("The day is sunday enjoy!!");
                       }
                       else if(m==2 && d<=29)
            {
                x=d%7;
                if(x==4)
                System.out.println("The day is Monday!!");
                else if(x==5)
                     System.out.println("The day is Tuesday!!");
                     else if(x==6)
                          System.out.println("The day is wedensday!!");
                          else if(x==0)
                               System.out.println("The day is thursday!!");
                               else if(x==1)
                                    System.out.println("The day is friday!!");
                                    else if(x==2)
                                         System.out.println("The day is saturday!!");
                                         else if(x==3)
                                              System.out.println("The day is sunday enjoy!!");
                       }
                       else if(m==3 && d<=31)
            {
                x=d%7;
                if(x==3)
                System.out.println("The day is Monday!!");
                else if(x==4)
                     System.out.println("The day is Tuesday!!");
                     else if(x==5)
                          System.out.println("The day is wedensday!!");
                          else if(x==6)
                               System.out.println("The day is thursday!!");
                               else if(x==0)
                                    System.out.println("The day is friday!!");
                                    else if(x==1)
                                         System.out.println("The day is saturday!!");
                                         else if(x==2)
                                              System.out.println("The day is sunday enjoy!!");
                       }
                            
                       else if(m==4 && d<=30)
            {
                x=d%7;
                if(x==0)
                System.out.println("The day is Monday!!");
                else if(x==1)
                     System.out.println("The day is Tuesday!!");
                     else if(x==2)
                          System.out.println("The day is wedensday!!");
                          else if(x==3)
                               System.out.println("The day is thursday!!");
                               else if(x==4)
                                    System.out.println("The day is friday!!");
                                    else if(x==5)
                                         System.out.println("The day is saturday!!");
                                         else if(x==6)
                                              System.out.println("The day is sunday enjoy!!");
                       }



                       else if(m==5 && d<=31)
            {
                x=d%7;
                if(x==5)
                System.out.println("The day is Monday!!");
                else if(x==6)
                     System.out.println("The day is Tuesday!!");
                     else if(x==0)
                          System.out.println("The day is wedensday!!");
                          else if(x==1)
                               System.out.println("The day is thursday!!");
                               else if(x==2)
                                    System.out.println("The day is friday!!");
                                    else if(x==3)
                                         System.out.println("The day is saturday!!");
                                         else if(x==4)
                                              System.out.println("The day is sunday enjoy!!");
                       }
                       else if(m==6 && d<=30)
            {
                x=d%7;
                if(x==2)
                System.out.println("The day is Monday!!");
                else if(x==3)
                     System.out.println("The day is Tuesday!!");
                     else if(x==4)
                          System.out.println("The day is wedensday!!");
                          else if(x==5)
                               System.out.println("The day is thursday!!");
                               else if(x==6)
                                    System.out.println("The day is friday!!");
                                    else if(x==0)
                                         System.out.println("The day is saturday!!");
                                         else if(x==1)
                                              System.out.println("The day is sunday enjoy!!");
                       }

                       else if(m==7 && d<=31)
            {
                x=d%7;
                if(x==0)
                System.out.println("The day is Monday!!");
                else if(x==1)
                     System.out.println("The day is Tuesday!!");
                     else if(x==2)
                          System.out.println("The day is wedensday!!");
                          else if(x==3)
                               System.out.println("The day is thursday!!");
                               else if(x==4)
                                    System.out.println("The day is friday!!");
                                    else if(x==5)
                                         System.out.println("The day is saturday!!");
                                         else if(x==6)
                                              System.out.println("The day is sunday enjoy!!");
                       }

                       else if(m==8 && d<=31)
            {
                x=d%7;
                if(x==4)
                System.out.println("The day is Monday!!");
                else if(x==5)
                     System.out.println("The day is Tuesday!!");
                     else if(x==6)
                          System.out.println("The day is wedensday!!");
                          else if(x==0)
                               System.out.println("The day is thursday!!");
                               else if(x==1)
                                    System.out.println("The day is friday!!");
                                    else if(x==2)
                                         System.out.println("The day is saturday!!");
                                         else if(x==3)
                                              System.out.println("The day is sunday enjoy!!");
                       }

                       else if(m==9 && d<=30)
            {
                x=d%7;
                if(x==1)
                System.out.println("The day is Monday!!");
                else if(x==2)
                     System.out.println("The day is Tuesday!!");
                     else if(x==3)
                          System.out.println("The day is wedensday!!");
                          else if(x==4)
                               System.out.println("The day is thursday!!");
                               else if(x==5)
                                    System.out.println("The day is friday!!");
                                    else if(x==6)
                                         System.out.println("The day is saturday!!");
                                         else if(x==0)
                                              System.out.println("The day is sunday enjoy!!");
                       }

                       else if(m==10 && d<=31)
            {
                x=d%7;
                if(x==6)
                System.out.println("The day is Monday!!");
                else if(x==0)
                     System.out.println("The day is Tuesday!!");
                     else if(x==1)
                          System.out.println("The day is wedensday!!");
                          else if(x==2)
                               System.out.println("The day is thursday!!");
                               else if(x==3)
                                    System.out.println("The day is friday!!");
                                    else if(x==4)
                                         System.out.println("The day is saturday!!");
                                         else if(x==5)
                                              System.out.println("The day is sunday enjoy!!");
                       }
                       else if(m==11 && d<=30)
            {
                x=d%7;
                if(x==3)
                System.out.println("The day is Monday!!");
                else if(x==4)
                     System.out.println("The day is Tuesday!!");
                     else if(x==5)
                          System.out.println("The day is wedensday!!");
                          else if(x==6)
                               System.out.println("The day is thursday!!");
                               else if(x==0)
                                    System.out.println("The day is friday!!");
                                    else if(x==1)
                                         System.out.println("The day is saturday!!");
                                         else if(x==2)
                                              System.out.println("The day is sunday enjoy!!");
                       }

                       else if(m==12 && d<=31)
            {
                x=d%7;
                if(x==1)
                System.out.println("The day is Monday!!");
                else if(x==2)
                     System.out.println("The day is Tuesday!!");
                     else if(x==3)
                          System.out.println("The day is wedensday!!");
                          else if(x==4)
                               System.out.println("The day is thursday!!");
                               else if(x==5)
                                    System.out.println("The day is friday!!");
                                    else if(x==6)
                                         System.out.println("The day is saturday!!");
                                         else if(x==0)
                                              System.out.println("The day is sunday enjoy!!");
                       }

                        else
                        System.out.println("Invalid date");




    }
}
