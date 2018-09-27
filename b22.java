import java.io.*;
import java.util.*;
class b22
{
	public static void main(String args[])
	{
		int n,i,a1,j=0;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the N value :");
		n=ob.nextInt();
		int a[] = new int[n];
		for(i=0;i<n;i++)
		{
		    a[i] = ob.nextInt();
		
		}
        for(i=0;i<n;i++)
        {			
	       for(j=i+1;j<n;j++)
		   {   
		     if(a[i]>a[j])
			 {
				 a1 =a[i];
			     a[i] = a[j];
				 a[j] = a1; 
			 }
		   }
			
		}
		
		System.out.println(a[j-1]);
	}
}	
