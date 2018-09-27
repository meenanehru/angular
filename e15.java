import java.io.*;
import java.util.*;
class e15
{
	public static void main(String args[])
	{
		 int n,q;
		 Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the N value :");
		 n=ob.nextInt();
		 System.out.println("Enter the Q value :");
		 q=ob.nextInt();
		 while(n<q)
		 {
		    n++;
			//System.out.println("n="+n);
		    if(n%2==0) 
			{
		       if(q==n)
			   {
				  System.exit(0);
			   }
			   else
			   { 
				     System.out.print(n+" ");
			   }
			}
			
		}
	}
}
