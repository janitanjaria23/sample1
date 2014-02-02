import java.util.Scanner;
class spcp
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float sp=0, cp=0, p=0;
        System.out.print("Enter Cost Price: ");
        cp=sc.nextFloat();
        System.out.print("Enter Selling Price: ");
        sp=sc.nextFloat();
        if(sp>cp)
        {
            p=(sp-cp)*100/cp;
            System.out.println("Profit: "+(sp-cp));
            System.out.println("Profit Percent: "+p+"%");
        }
        else
        {
            p=(cp-sp)*100/cp;
            System.out.println("Loss: "+(cp-sp));
            System.out.println("Loss Percent: "+p+"%");
        }
    }
}
