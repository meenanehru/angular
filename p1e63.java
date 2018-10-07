import java.io.*;
import java.util.*;
class pe63
{
     public static void main(String args[])
	 {
	                    int len,i,j,k,n=1,k1,n1,temp=0;
					          	int  l1[] = new int[50];
				          		int  l2[] = new int[50];
                      int  l[] = new int[50];
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
                                     l[n]=(j+1)-i;
															       l1[n]=i;l2[n]=j;
															       n++;
                                  }
                                  else
                                  {
                                     l[n]=len;
                                  }
                            }       
                      }
										lab:	 
                      for(n1=n-1;n1>0;n1--)
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
																	                         l[n1]=l[n1]+1;
																                     }
															                 }
													              }
											            }
										       }
										temp = l[1];
										for(i=1;i<=n-1;i++)
                     {  
									          if(temp<l[i])
											      {
									               temp =l[i];
											      }
										 }
										  System.out.println(temp);
                                                  																	 
     }
}
  
