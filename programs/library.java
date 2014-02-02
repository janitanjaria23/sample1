import java.util.*;
class library
{
    void libTitle()
    {
        System.out.println("     L         IIIIIII   BBBBB     RRRRR     AAAAAAA   RRRRR     Y     Y");
        System.out.println("     L            I      B    B    R    R    A     A   R    R     Y   Y");
        System.out.println("     L            I      B     B   R     R   A     A   R     R     Y Y");
        System.out.println("     L            I      B    B    R    R    A     A   R    R       Y ");
        System.out.println("     L            I      BBBBB     RRRRR     AAAAAAA   RRRRR        Y");
        System.out.println("     L            I      B    B    RR        A     A   RR           Y");
        System.out.println("     L            I      B     B   R R       A     A   R R          Y");  
        System.out.println("     L            I      B    B    R  R      A     A   R  R         Y");
        System.out.println("     LLLLLLL   IIIIIII   BBBBB     R   R     A     A   R   R        Y");
    }
    void menu()
    {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        for(;;)
        {
            for(int i=0;i<39;i++)
                System.out.print((char)(30)+""+(char)(31));
            System.out.println((char)(30));
            System.out.println((char)(16)+"\t\t\t*   *\t****\t*   *\t*   *\t\t\t      "+(char)(16));
            System.out.println((char)(17)+"\t\t\t** **\t*   \t**  *\t*   *\t\t\t      "+(char)(17));
            System.out.println((char)(16)+"\t\t\t* * *\t****\t* * *\t*   *\t\t\t      "+(char)(16));
            System.out.println((char)(17)+"\t\t\t*   *\t*   \t*  **\t*   *\t\t\t      "+(char)(17));
            System.out.println((char)(16)+"\t\t\t*   *\t****\t*   *\t*****\t\t\t      "+(char)(16));
            System.out.println((char)(17)+"\t1.Book List\t\t\t\t\t\t\t      "+(char)(17));
            System.out.println((char)(16)+"\t2.Books Issued\t\t\t\t\t\t\t      "+(char)(16));
            System.out.println((char)(17)+"\t3.Books Reserved\t\t\t\t\t\t      "+(char)(17));
            System.out.println((char)(16)+"\t4.Fines To Be Collected\t\t\t\t\t\t      "+(char)(16));
            System.out.println((char)(17)+"\t5.Dates Of Return                                                     "+(char)(17));
            System.out.println((char)(16)+"\t6.Exit\t\t\t\t\t\t\t\t      "+(char)(17));
            do
            {
            System.out.print((char)(17)+"Enter your choice(1-6): ");
            ch=sc.nextInt();
            }while(ch<0 || ch>6);
            for(int i=0;i<39;i++)
                System.out.print((char)(30)+""+(char)(31));
            System.out.println((char)(30));
            if(ch==6)
                break;

        }
    }
    public static void main(String args[])throws Exception
    {
        library m=new library();
        m.libTitle();
        Thread.sleep(1500);
        m.menu();
    }
    
}
