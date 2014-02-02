import java.util.*;
class profitLoss
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double sp=0, cp=0, p=0, l=0, pp=0, lp=0;
		System.out.println("Wherever the values are not given enter zero");
		System.out.print("Enter the Selling Price: ");
		sp=sc.nextDouble();
		System.out.print("Enter the Cost Price: ");
		cp=sc.nextDouble();
		System.out.print("Enter the Profit: ");
		p=sc.nextDouble();
		System.out.print("Enter the Loss: ");
		l=sc.nextDouble();
		System.out.print("Enter the Profit Percent: ");
		pp=sc.nextDouble();
		System.out.print("Enter the Loss Percent: ");
		lp=sc.nextDouble();
		if(p!=0)
			if(cp!=0)
			{
				sp=cp+p;
				System.out.println("Selling Price= Rs."+sp);
				pp=p*100/cp;
				System.out.println("Profit Percent= "+pp+"%");
			}
			else if(pp!=0)
			{
				cp=p*100/pp;
				System.out.println("Cost Price= Rs."+cp);
				sp=cp+p;
				System.out.println("Selling Price= Rs."+sp);				
			}
				else 
				{
					cp=sp-p;
					System.out.println("Cost Price= Rs."+cp);
					pp=p*100/cp;
					System.out.println("Profit Percent= "+pp+"%");
				}	
		else if(pp!=0)
			if(cp!=0)	
			{
				p=pp*cp/100;
				System.out.println("Profit= Rs."+p);
				sp=p+cp;
				System.out.println("Selling Price= Rs."+sp);
			}
			else if(p!=0)
				{
					cp=p*100/pp;
				System.out.println("Cost Price= Rs."+cp);
				sp=cp+p;
				System.out.println("Selling Price= Rs."+sp);	
				}
				else
				{
					cp=(sp*100)/(100+pp);
					System.out.println("Cost Price= Rs."+cp);
					p=sp-cp;
					System.out.println("Profit= Rs."+p);
				}
			else if(l!=0)
				if(cp!=0)
			{
				sp=cp-l;
				System.out.println("Selling Price= Rs."+sp);
				lp=l*100/cp;
				System.out.println("Loss Percent= "+lp+"%");
			}
				else if(lp!=0)
			{
				cp=l*100/lp;
				System.out.println("Cost Price= Rs."+cp);
				sp=cp-l;
				System.out.println("Selling Price= Rs."+sp);				
			}
					else 
					{
						cp=sp+l;
						System.out.println("Cost Price= Rs."+cp);
						lp=l*100/cp;
						System.out.println("Loss Percent= "+lp+"%");
					}	
				else if(lp!=0)
					if(cp!=0)	
					{
						l=lp*cp/100;
						System.out.println("Loss= Rs."+l);
						sp=cp-l;
						System.out.println("Selling Price= Rs."+sp);
					}
					else if(l!=0)
					{
						cp=l*100/lp;
						System.out.println("Cost Price= Rs."+cp);
						sp=cp-l;
						System.out.println("Selling Price= Rs."+sp);	
					}
						else
						{
							cp=(sp*100)/(100+lp);
							System.out.println("Cost Price= Rs."+cp);
							l=cp-sp;
							System.out.println("Loss= Rs."+l);
						}
					else if(sp>cp)
					{	
						p=sp-cp;
						System.out.println("Profit= Rs."+p);	
						pp=p*100/cp;
						System.out.println("Profit Percent= "+pp+"%");
					}
						else if(cp>sp)
						{
							l=cp-sp;
							System.out.println("Loss= Rs."+l);
							lp=l*100/cp;
							System.out.println("Loss Percent= "+lp+"%");	
						}
							else
								System.out.println("No Profit, No Loss");		
	}
}
