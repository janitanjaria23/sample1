import java.util.*;
class tictactoe
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);		
		Random ran=new Random();
		int r=0, p=0;
		for(byte a=1, b=2, c=3, d=4, e=5, f=6, g=7, h=8, i=9; a==1 || b==2 || c==3 || d==4 || e==5 || f==6 || g==7 || h==8 || i==9; )
		{		
			for(byte x=0; x<=10; x++)
				System.out.println();
			System.out.println("|"+a+"|"+b+"|"+c+"|");
			System.out.println("_______");
			System.out.println("|"+d+"|"+e+"|"+f+"|");
			System.out.println("_______");
			System.out.println("|"+g+"|"+h+"|"+i+"|");			
			do
			{
				do
				{
					System.out.println();
					System.out.print("Enter the nuber: ");
					p=sc.nextByte();
				}while(p<1 || p>9);
			}while(p==a && p==b && p==c && p==d && p==e && p==f && p==g && p==h && p==i);
			
			if(p==a)
				a=88;
				if(p==b)
					b=88;
					if(p==c)
						c=88;
						if(p==d)
							d=88;
							if(p==e)
								e=88;
								if(p==f)
									f=88;
									if(p==g)
										g=88;
										if(p==h)
											h=88;
											if(p==i)
												i=88;									
			for(byte x=0; x<=10; x++)
				System.out.println();
			System.out.println("|"+a+"|"+b+"|"+c+"|");
			System.out.println("_______");
			System.out.println("|"+d+"|"+e+"|"+f+"|");
			System.out.println("_______");
			System.out.println("|"+g+"|"+h+"|"+i+"|");
			System.out.println();
			if(a==b && b==c)
			{	
				if(a==88)
					System.out.println("You win");
				else
					System.out.println("Computer won");
				break;	
			}
			else if(d==e && e==f)
			{	
				if(d==88)
					System.out.println("You win");
				else
					System.out.println("Computer won");
				break;	
			}		
				else if(g==h && h==i)
				{	
					if(g==88)
						System.out.println("You win");
					else
						System.out.println("Computer won");
					break;	
				}
					else if(a==d && d==g)
					{	
						if(a==88)
							System.out.println("You win");
						else
							System.out.println("Computer won");
						break;	
					}
						else if(b==e && e==h)
						{	
							if(b==88)
								System.out.println("You win");
							else
								System.out.println("Computer won");
							break;
						}
							else if(c==f && f==i)
							{	
								if(c==88)
									System.out.println("You win");
								else
									System.out.println("Computer won");
								break;	
							}
								else if(a==e && e==i)
								{	
									if(a==88)
										System.out.println("You win");
									else
										System.out.println("Computer won");
									break;	
								}
									else if(c==e && e==g)
									{	
										if(c==88)
											System.out.println("You win");
										else
											System.out.println("Computer won");
										break;	
									}
			if(a==1 || b==2 || c==3 || d==4 || e==5 || f==6 || g==7 || h==8 || i==9)
				do	
				{	
					do
					{
						r=ran.nextInt();
						r=(r%9)+1;
					}while(r<1 || r>9);
				}while(r==a && r==b && r==c && r==d && r==e && r==f && r==g && r==h && r==i);		
			if(r==a)
				a=0;
				if(r==b)
					b=0;
					if(r==c)
						c=0;
						if(r==d)
							d=0;
							if(r==e)
								e=0;
								if(r==f)
									f=0;
									if(r==g)
										g=0;
										if(r==h)
											h=0;
											if(r==i)
												i=0;
			Thread.sleep(2000);									
			for(byte x=0; x<=10; x++)
				System.out.println();
			System.out.println("|"+a+"|"+b+"|"+c+"|");
			System.out.println("_______");
			System.out.println("|"+d+"|"+e+"|"+f+"|");
			System.out.println("_______");
			System.out.println("|"+g+"|"+h+"|"+i+"|");
			System.out.println();
			if(a==b && b==c)
			{	
				if(a==88)
					System.out.println("You win");
				else
					System.out.println("Computer won");
				break;	
			}
			else if(d==e && e==f)
			{	
				if(d==88)
					System.out.println("You win");
				else
					System.out.println("Computer won");
				break;	
			}		
				else if(g==h && h==i)
				{	
					if(g==88)
						System.out.println("You win");
					else
						System.out.println("Computer won");
					break;	
				}
					else if(a==d && d==g)
					{	
						if(a==88)
							System.out.println("You win");
						else
							System.out.println("Computer won");
						break;	
					}
						else if(b==e && e==h)
						{	
							if(b==88)
								System.out.println("You win");
							else
								System.out.println("Computer won");
							break;
						}
							else if(c==f && f==i)
							{	
								if(c==88)
									System.out.println("You win");
								else
									System.out.println("Computer won");
								break;	
							}
								else if(a==e && e==i)
								{	
									if(a==88)
										System.out.println("You win");
									else
										System.out.println("Computer won");
									break;	
								}
									else if(c==e && e==g)
									{	
										if(c==88)
											System.out.println("You win");
										else
											System.out.println("Computer won");
										break;	
									}																							
		}
	}
}