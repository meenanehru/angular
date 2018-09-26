import java.io.*;
import java.util.*;
class e73
{
	public static void main(String args[])
	{
		 int n,l,r;
		 Scanner ob =new Scanner(System.in);
		 System.out.println("Enter the N value :");
		 n=ob.nextInt();
		 System.out.println("Enter the L value :");
		 l=ob.nextInt();
		 System.out.println("Enter the R value :");
		 r=ob.nextInt();
		 if((l<n) && (n<r))
		 {
			 System.out.println("Yes");
		 }
		 else
		 {
			  System.out.println("No");
		 }
	}
}	
				  
