import java.util.*;
class tictactoe2
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int p=0;
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
			if(a==0 && b==0)
				if(c==3)
					c=0;
			
			else if(b==0 && c==0)
				if(a==1)
					a=0;
				
				else if(a==0 && c==0)
					if(b==2)
						b=0;
					
					else if(d==0 && e==0)
						if(f==6)
							f=0;
						
						else if(e==0 && f==0)
							if(d==4)
								d=0;
							
							else if(d==0 && f==0)
								if(e==5)
									e=0;
								
								else if(g==0 && h==0)
									if(i==9)
										i=0;
									
									else if(h==0 && i==0)
										if(g==7)
											g=0;
									
										else if(g==0 && i==0)
											if(h==8)
												h=0;
									
											else if(a==0 && d==0)
												if(g==7)
													g=0;
									
												else if(d==0 && g==0)
													if(a==1)
														a=0;
									
													else if(a==0 && g==0)
														if(d==4)
															d=0;
									
														else if(b==0 && e==0)
															if(h==8)
																h=0;
															
															else if(e==0 && h==0)
																if(b==2)
																	b=0;
																	
																else if(b==0 && h==0)
																	if(e==5)
																		e=0;
																	
																	else if(c==0 && f==0)
																		if(i==9)
																			i=0;
																			
																		else if(f==0 && i==0)
																			if(c==3)
																				c=0;
																				
																			else if(c==0 && i==0)
																				if(f==6)
																					f=0;
																					
																				else if(a==0 && e==0)
																					if(i==9)
																						i=0;
																					
																					else if(e==0 && i==0)
																						if(a==1)
																							a=0;
																					
																						else if(a==0 && i==0)
																							if(e==5)
																								e=0;
																								
																							else if(c==0 && e==0)
																								if(i==9)
																									i=0;
																								
																								else if(e==0 && i==0)
																									if(c==3)
																										c=0;
																								
																									else if(c==0 && i==0)
																										if(e==5)
																											e=0;
																											
																										else if(a==88 && b==88)
																											if(c==3)
																												c=0;
																										
																										else if(b==88 && c==88)
																											if(a==1)
																												a=0;
																											
																											else if(a==88 && c==88)
																												if(b==2)
																													b=0;
																												
																												else if(d==88 && e==88)
																													if(f==6)
																														f=0;
																													
																													else if(e==88 && f==88)
																														if(d==4)
																															d=0;
																														
																														else if(d==88 && f==88)
																															if(e==5)
																																e=0;
																															
																															else if(g==88 && h==88)
																																if(i==9)
																																	i=0;
																																
																																else if(h==88 && i==88)
																																	if(g==7)
																																		g=0;
																																
																																	else if(g==88 && i==88)
																																		if(h==8)
																																			h=0;
																																
																																		else if(a==88 && d==88)
																																			if(g==7)
																																				g=0;
																																
																																			else if(d==88 && g==88)
																																				if(a==1)
																																					a=0;
																																
																																				else if(a==88 && g==88)
																																					if(d==4)
																																						d=0;
																																
																																					else if(b==88 && e==88)
																																						if(h==8)
																																							h=0;
																																						
																																						else if(e==88 && h==88)
																																							if(b==2)
																																								b=0;
																																								
																																							else if(b==88 && h==88)
																																								if(e==5)
																																									e=0;
																																								
																																								else if(c==88 && f==88)
																																									if(i==9)
																																										i=0;
																																										
																																									else if(f==88 && i==88)
																																										if(c==3)
																																											c=0;
																																											
																																										else if(c==88 && i==88)
																																											if(f==6)
																																												f=0;
																																												
																																											else if(a==88 && e==88)
																																												if(i==9)
																																													i=0;
																																												
																																												else if(e==88 && i==88)
																																													if(a==1)
																																														a=0;
																																												
																																													else if(a==88 && i==88)
																																														if(e==5)
																																															e=0;
																																															
																																														else if(c==88 && e==88)
																																															if(i==9)
																																																i=0;
																																															
																																															else if(e==88 && i==88)
																																																if(c==3)
																																																	c=0;
																																															
																																																else if(c==88 && i==88)
																																																	if(e==5)
																																																		e=0;
																																																		
																																																	else if(i==88)
																																																		if(h==8)
																																																			h=0;
																																																		else if(f==6)
																																																			f=0;
																																																			else if(e==5)
																																																				e=0;
																																																				
																																																			else if(g==88)
																																																				if(h==8)
																																																					h=0;
																																																				else if(d==4)
																																																					d=0;
																																																					else if(e==5)
																																																						e=0;
																																																						
																																																				else if(c==88)
																																																					if(f==6)
																																																						f=0;
																																																					else if(b==2)
																																																						b=0;
																																																						else if(e==5)
																																																							e=0;
																																																							
																																																					else if(a==88)
																																																						if(d==4)
																																																							d=0;
																																																						else if(b==2)
																																																							b=0;
																																																							else if(e==5)
																																																								e=0;
																																																							
																																																							else if(e==5)
																																																								e=0;
																																																								else
																																																									a=0;			
								
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