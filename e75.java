import java.io.*;
import java.util.*;
class e75
{
	public static void main(String args[])
	{
		String n;
		char[] b =new char[1000];
		int len,a,i;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the String :");
		n=ob.next();     
		len =n.length();
			 for(i=0;i<len;i++)
			{
			    b[i] = n.charAt(i);
				if(len%2==0)
		        {
				     a = len/2;
					 if((a==i) || (a==i+1))
					{
					  System.out.print("*");
					}
					else
					{
			         System.out.print(b[i]);
					}
			    }
				else
		        {
				     a = len/2;
					 if(a==i)
					{
					  System.out.print("*");
					}
					else
					{
			         System.out.print(b[i]);
					}
			    }
			}
	}
			
}				
	
