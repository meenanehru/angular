import java.io.*;
import java.util.*;
class sstr
{
     public static void main(String args[])
	 {
	                    int len,i,j,k,n=1,k1,n1,n2,temp=0;
						boolean s;
						int  l1[] = new int[50];
						int  l2[] = new int[50];
						int  m[] = new int[50];
                        int  m1[] = new int[50];
						int  m2[] = new int[50];
                        char b[] = new char[100];
		                String a;
		                Scanner ob = new Scanner(System.in);
		                System.out.println("Enter the String :\t");
		                a=ob.next();
                        len = a.length();
                                         for(i=1;i<=len;i++)
                                         {
                    	                    b[i]=a.charAt(i-1);
                                            for(j=i+1;j<len;j++)
                                            {         
                                                    b[j]=a.charAt(j);										
			                                            if(b[i]==b[j])
                                                        {
                                                              m[n]=(j+1)-i;
															  l1[n]=i;l2[n]=j;
															  n++;
                                                        }
														else
														{
															m[n]=len;
														}
                                              }   
                                         }
										n1= n-1;
										 n2=n-1;
										while(n-1!=0)
									    {
										  if((l1[n-1]<=l1[n]) && (l2[n-1]>=l2[n]))
										  {
											m[n-1]=0;
											if(n==0)
											{
												break;	
											}
										  }
										  n--;
									    }
									 	lab1:	 
                                         for(n1=n1;n1>0;n1--)
                                         { 
                                              if(l2[n1]!=len)
                                              {		
                                                     for(k=l2[n1]+1;k<=len;k++)
													 {
                                                              for(k1=l1[n1]+1;k1<=l2[n1];k1++)
                                                               {
             									                   if(b[k]==b[k1])
															       {
																	   continue lab1;
															       }
																   else if(k1==l2[n1])
																   { 
																	   m1[n1]=m1[n1]+1;
																   }
															   }
													 }
											  }
										 }
										 	lab:	 
                                         for(n1=n2;n1>0;n1--)
                                         { 
                                              if(l1[n1]!=1)
                                              {		
                                                     for(k=l1[n1]-1;k>0;k--)
													 {
                                                              for(k1=k+1;k1<=l2[n1];k1++)
                                                               {
             									                   if(b[k]==b[k1])
															       {
																	   continue lab;
															       }
																   else if(k1==l2[n1])
																   {
																	   m2[n1]=m2[n1]+1;
																   }
															   }
													 }
											  }
										 }
									
									 	 for(i=1;i<=n2;i++)
										 {
											 m2[i]=m[i]+m2[i];
											 m1[i]=(m[i]-1)+m1[i];
											 if(m1[i]<=m2[i])
											 {
												 m[i] = m2[i];
											 }
											 else
											 {
												  m[i] = m1[i];
											 }
										 }
										temp = m[1];
										for(i=1;i<=n2;i++)
                                         {  
									          if(temp<m[i])
											  {
									            temp =m[i];
											  }
										 }
										 	 System.out.println(temp);
                                                  																	 
     }
}
                 
